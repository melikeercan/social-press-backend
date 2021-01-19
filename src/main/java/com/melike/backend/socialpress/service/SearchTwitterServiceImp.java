package com.melike.backend.socialpress.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchTwitterServiceImp extends BaseServiceImp implements SearchTwitterService {

    @Override
    public List<Object> search(String text){
        System.out.println("searching: " + text);
        return new ArrayList<>();
    }
}
