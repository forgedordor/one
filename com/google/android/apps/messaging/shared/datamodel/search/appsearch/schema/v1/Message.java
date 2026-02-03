package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1;

import defpackage.bxtl;
import defpackage.fdbq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class Message implements bxtl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final List g;

    public Message(String str, String str2, String str3, String str4, long j, String str5, List list) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = list;
    }

    @Override // defpackage.bxtl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return fdbq.f(this.a, message.a) && fdbq.f(this.b, message.b) && fdbq.f(this.c, message.c) && fdbq.f(this.d, message.d) && this.e == message.e && fdbq.f(this.f, message.f) && fdbq.f(this.g, message.g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.f;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.e;
        return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Message(namespace=" + this.a + ", id=" + this.b + ", conversationId=" + this.c + ", participantId=" + this.d + ", receivedTimestamp=" + this.e + ", text=" + this.f + ", transcriptions=" + this.g + ")";
    }
}
