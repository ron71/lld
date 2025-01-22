package com.lld.behavioralpatterns.iterator;

public interface SocialNetworkIterable {
    ProfileIterator createFriendsIterator();
    ProfileIterator createCoworkerIterator();
}
