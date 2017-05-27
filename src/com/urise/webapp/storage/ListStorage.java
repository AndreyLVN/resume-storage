package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vp on 26.03.17.
 */
public class ListStorage extends AbstractStorage<Integer> {

    private List<Resume> list = new ArrayList<>();


    @Override
    public void clear() {

        list.clear();
    }

    @Override
    protected Integer getSearchKey(String uuid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUuid().equals(uuid)) {
                return (Integer) i;
            }
        }
        return null;
    }

    @Override
    protected boolean isExist(Integer searchKey) {
        return searchKey != null;
    }

    @Override
    protected void doDelete(Integer searchKey) {
        list.remove(((Integer) searchKey).intValue());

    }

    @Override
    protected void doSave(Resume r, Integer searchKey) {
        list.add(r);
    }

    @Override
    protected void doUpdate(Resume r, Integer searchKey) {
        list.set((Integer) searchKey, r);
    }

    @Override
    protected Resume doGet(Integer searchKey) {


        return list.get((Integer) searchKey);
    }


    @Override
    public List<Resume> doCopyAll() {
        return new ArrayList<>(list);
    }

    @Override
    public int size() {
        return list.size();
    }


}