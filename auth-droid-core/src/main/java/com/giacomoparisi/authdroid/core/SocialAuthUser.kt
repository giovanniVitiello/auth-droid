package com.giacomoparisi.authdroid.core

data class SocialAuthUser(
        val uId: String,
        val displayName: String?,
        val firstName: String?,
        val lastName: String?,
        val email: String?,
        val profileImage: String?
) {
    override fun toString(): String =
            "display name: ${displayName.orEmpty()}, " +
                    "first name: ${firstName.orEmpty()}, " +
                    "last name: ${lastName.orEmpty()}, " +
                    "email: ${email.orEmpty()}, " +
                    "profileImage: ${profileImage.orEmpty()}"
}