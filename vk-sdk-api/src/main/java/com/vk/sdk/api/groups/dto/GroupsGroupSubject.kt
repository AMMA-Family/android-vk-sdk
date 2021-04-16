/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.groups.dto

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonParseException
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type
import kotlin.String

enum class GroupsGroupSubject(
    val value: String
) {
    AUTO("1"),

    ACTIVITY_HOLIDAYS("2"),

    BUSINESS("3"),

    PETS("4"),

    HEALTH("5"),

    DATING_AND_COMMUNICATION("6"),

    GAMES("7"),

    IT("8"),

    CINEMA("9"),

    BEAUTY_AND_FASHION("10"),

    COOKING("11"),

    ART_AND_CULTURE("12"),

    LITERATURE("13"),

    MOBILE_SERVICES_AND_INTERNET("14"),

    MUSIC("15"),

    SCIENCE_AND_TECHNOLOGY("16"),

    REAL_ESTATE("17"),

    NEWS_AND_MEDIA("18"),

    SECURITY("19"),

    EDUCATION("20"),

    HOME_AND_RENOVATIONS("21"),

    POLITICS("22"),

    FOOD("23"),

    INDUSTRY("24"),

    TRAVEL("25"),

    WORK("26"),

    ENTERTAINMENT("27"),

    RELIGION("28"),

    FAMILY("29"),

    SPORTS("30"),

    INSURANCE("31"),

    TELEVISION("32"),

    GOODS_AND_SERVICES("33"),

    HOBBIES("34"),

    FINANCE("35"),

    PHOTO("36"),

    ESOTERICS("37"),

    ELECTRONICS_AND_APPLIANCES("38"),

    EROTIC("39"),

    HUMOR("40"),

    SOCIETY_HUMANITIES("41"),

    DESIGN_AND_GRAPHICS("42");

    class Serializer : JsonSerializer<GroupsGroupSubject>, JsonDeserializer<GroupsGroupSubject> {
        override fun serialize(
            src: GroupsGroupSubject?,
            typeOfSrc: Type?,
            context: JsonSerializationContext?
        ): JsonElement = src?.let { JsonPrimitive(src.value) } ?: JsonNull.INSTANCE

        override fun deserialize(
            json: JsonElement?,
            typeOfT: Type?,
            context: JsonDeserializationContext?
        ): GroupsGroupSubject {
            val value = values().firstOrNull {
                it.value.toString() == json?.asJsonPrimitive?.asString
            }
            return value ?: throw JsonParseException(json.toString())
        }
    }
}