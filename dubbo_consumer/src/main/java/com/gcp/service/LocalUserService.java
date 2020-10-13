package com.gcp.service;

import com.gcp.pojo.User;

/**
 * consumer子Module的本地Service
 */
public interface LocalUserService {
    void register(User user);
    User getById(Long id);
}
