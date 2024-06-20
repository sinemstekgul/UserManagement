package org.example.usermanagement.service;

import org.example.usermanagement.model.Yorum;

import java.util.List;

public interface YorumService {

    List<Yorum> getYorumlarByGonderi(Long gonderiId);

    void saveYorumForGonderi(Long gonderiId, String icerik);
}
