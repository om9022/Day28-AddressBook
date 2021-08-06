package com.bridgelabz.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.bridgelabz.addressbook.AddressBookService;
import com.bridgelabz.addressbook.Contact;


public class AddressBookTesting 
{
	@Test
	public void givenReadFromDB_ShouldReturnListOfContacts() 
	{
		AddressBookService addressBookService = new AddressBookService();
		List<Contact> contactList  = addressBookService.readFromDataBase();
		assertEquals(4, contactList.size());
	}
	
	@Test
	public void givenUpadteEmployeeData_WhenUpdated_shouldSyncWithDatabase()
	{
		AddressBookService addressBookService = new AddressBookService();
		addressBookService.readFromDataBase();
		addressBookService.updateContactInDataBase("virat",4321);
		assertTrue(addressBookService.checkSyncWithDB("virat"));
	}
	
	@Test
	public void givenAddressbookDB_WhenBetweenDates_ShouldReturnListOfContacts()
	{		
		AddressBookService addressBookService = new AddressBookService();
		List<Contact> contactList  = addressBookService.getContatctsAddedAfterdate("2020-1-1");
		assertEquals(3, contactList.size());
	}
	
	@Test
	public void givenAddressbookDB_WhenInSameCity_ShouldReturnNumberOfContacts() 
	{
		AddressBookService addressBookService = new AddressBookService();
		HashMap<String, Integer> sameCity = addressBookService.getContactHaveSameCity();
		assertEquals(2, sameCity.size());
	}
	
	@Test
	public void givenInsertEmployeeData_WhenInserted_shouldSyncWithDatabase() 
	{
		AddressBookService addressBookService = new AddressBookService();
		addressBookService.readFromDataBase();
		List<String> groups = new ArrayList<String>();
		groups.add("family");
		groups.add("friend");		
		addressBookService.insertContactInDataBase("rohit","sharma","andheri","mumbai","maharashtra","123001",12390021,"rohit@sharma",groups);
		assertTrue(addressBookService.checkSyncWithDB("rohit"));
	}

}
