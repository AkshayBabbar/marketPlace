package com.marketPlace.portal.service;

import com.marketPlace.portal.entity.uams.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Akshay Babbar
 * <p>
 * Member Management Service.
 */


public interface UmsMemberService {
    /**
     * Get members based on user name
     */
    UmsMember getByUsername(String username);

    /**
     * Obtain members according to the membership number
     */
    UmsMember getById(Long id);

    /**
     * User registration
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);

    /**
     * Generate verification code
     */
    String generateAuthCode(String telephone);

    /**
     * change Password
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * Get the currently logged-in member
     */
    UmsMember getCurrentMember();

    /**
     * Modify member points according to member id
     */
    void updateIntegration(Long id, Integer integration);


    /**
     * Get user information
     */
    UserDetails loadUserByUsername(String username);

    /**
     * Get token after login
     */
    String login(String username, String password);

    /**
     * Refresh token
     */
    String refreshToken(String token);

}
