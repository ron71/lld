package com.lld.behavioralpatterns.iterator;

import java.util.List;

public class SocialSpammer {
    public static void main(String[] args) {
        final Facebook facebook = new Facebook("userId", getMockProfiles());
        sendSpam(facebook.createFriendsIterator(), "Hello I am spamming you");
        sendSpam(facebook.createCoworkerIterator(), "Hello I am spamming you");
    }

    private static List<Profile> getMockProfiles() {
        return List.of(new Profile("p1", Relation.FRIEND),
                new Profile("p2", Relation.COLLEAGUE));
    }

    public static void sendSpam(final ProfileIterator iterator, final String message) {
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext().toString() + "----" + message);
        }
    }
}
