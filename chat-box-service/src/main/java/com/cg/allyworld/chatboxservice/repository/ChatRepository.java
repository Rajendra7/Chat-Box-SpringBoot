package com.cg.allyworld.chatboxservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.allyworld.chatboxservice.entity.ChatMessage;



public interface ChatRepository extends MongoRepository<ChatMessage, Integer> {

}
