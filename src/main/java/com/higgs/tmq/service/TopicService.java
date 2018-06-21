package com.higgs.tmq.service;

import com.higgs.tmq.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by quytm on 21/06/18.
 */
@Service
public class TopicService {

    private List<Topic> mockTopics = new ArrayList<>(
            Arrays.asList(
                    new Topic("spring", "Spring Framework", "this this description of Spring framework"),
                    new Topic("java", "Core Java", "this this description of Core Java"),
                    new Topic("javascript", "Javascript", "this this description of Javascript")
            )
    );

    public List<Topic> getAllTopics() {
        return this.mockTopics;
    }

    public Topic getTopic(String id) {
        return mockTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic newTopic) {
        mockTopics.add(newTopic);
    }
}
