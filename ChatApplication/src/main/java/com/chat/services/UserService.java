package com.chat.services;

import java.util.List;

import com.chat.exceptions.ChannelException;
import com.chat.exceptions.UserException;
import com.chat.models.Channel;
import com.chat.models.User;

public interface UserService {

	public User createUser(User user) throws UserException;
	public List<User> getAllUser(String key) throws UserException;

}
