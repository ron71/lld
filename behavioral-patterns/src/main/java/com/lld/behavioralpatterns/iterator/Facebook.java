package com.lld.behavioralpatterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facebook implements SocialNetworkIterable {

    private String userId;
    private List<Profile> friends = new ArrayList<>();

    @Override
    public ProfileIterator createFriendsIterator() {
        return new FriendsIterator(this);
    }

    @Override
    public ProfileIterator createCoworkerIterator() {
        return new CoWorkersIterator(this);
    }
}
