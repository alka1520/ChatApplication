package com.chat.services;

import java.util.List;
import java.util.Set;

import com.chat.exceptions.ChannelException;
import com.chat.exceptions.CommunityException;
import com.chat.models.Channel;
import com.chat.models.Community;

public interface CommuntiyService {

	public Community createCommunity(Community community);
	public List<Community> getAllCommunities() throws CommunityException;
	
}
