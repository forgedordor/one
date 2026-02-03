package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1;

import defpackage.bxtl;
import defpackage.fdbq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class Conversation implements bxtl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public Conversation(String str, String str2, String str3, String str4, List list) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    @Override // defpackage.bxtl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        return fdbq.f(this.a, conversation.a) && fdbq.f(this.b, conversation.b) && fdbq.f(this.c, conversation.c) && fdbq.f(this.d, conversation.d) && fdbq.f(this.e, conversation.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Conversation(namespace=" + this.a + ", id=" + this.b + ", conversationId=" + this.c + ", name=" + this.d + ", keywords=" + this.e + ")";
    }
}
