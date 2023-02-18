package yihuu.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetFriendsTest extends GetFriends {

	@Test
	public void testGetFriendsListLength() {
		GetFriends getFriends = new GetFriends();
		
		String[] friendslist = getFriends.getFriendsList();
		
		assertNotNull(friendslist);
		
		assertEquals(true, friendslist.length >= 0);
		
	}
	@Test
	public void testPerformance() {
		
		long start = System.nanoTime();
		
		GetFriends getFriends = new GetFriends();
		String[] friendslist = getFriends.getFriendsList();
		
		long end = System.nanoTime();
		
		long actual = end - start;
		
		assert actual < 1000;
	}
	@Test
	public void testURL() {
		
		//make sure the url is valid
		
	}
	
	@Test
	public void testFriendsList() {
		
		//check the names in the list to make sure they are A-Ok. unicode / extra whitespace etc.
		
	}

}
