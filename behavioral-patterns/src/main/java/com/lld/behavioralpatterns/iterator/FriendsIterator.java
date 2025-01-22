package com.lld.behavioralpatterns.iterator;

import java.util.List;

import static com.lld.behavioralpatterns.iterator.Relation.FRIEND;

public class FriendsIterator implements ProfileIterator {

    private final List<Profile> collection;
    private int currentPosition = -1;

    public FriendsIterator(Facebook facebook) {
        this.collection = facebook.getFriends()
                .stream().filter(profile -> FRIEND.equals(profile.getRelation()))
                .toList();
    }

    @Override
    public Profile getNext() throws ArrayIndexOutOfBoundsException {
        if (this.currentPosition == -1 || this.hasMore()) {
            this.currentPosition++;
            return this.collection.get(this.currentPosition);
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public boolean hasMore() {
        return this.currentPosition < collection.size()-1;
    }
}
