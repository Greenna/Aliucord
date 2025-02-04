/*
 * This file is part of Aliucord, an Android Discord client mod.
 * Copyright (c) 2021 Juby210 & Vendicated
 * Licensed under the Open Software License version 3.0
 */

package com.aliucord.utils;

import android.content.Context;

import com.airbnb.lottie.parser.AnimatableValueParser;
import com.discord.api.channel.Channel;
import com.discord.models.user.User;

import java.util.List;

@SuppressWarnings("unused")
public final class ChannelUtils {
    public static List<User> getRecipients(Channel channel) {
        return AnimatableValueParser.G0(channel);
    }

    public static boolean isGuildTextyChannel(Channel channel) {
        return AnimatableValueParser.l1(channel);
    }

    public static User getDMRecipient(Channel channel) {
        return AnimatableValueParser.v0(channel);
    }

    public static boolean isTextChannel(Channel channel) {
        return AnimatableValueParser.z1(channel);
    }

    public static String getDisplayName(Channel channel) {
        return AnimatableValueParser.y0(channel);
    }

    public static String getDisplayNameOrDefault(Channel channel, Context context, boolean addPrefix) {
        return AnimatableValueParser.z0(channel, context, addPrefix);
    }
}
