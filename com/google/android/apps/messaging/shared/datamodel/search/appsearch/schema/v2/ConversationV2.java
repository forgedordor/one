package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.bxtl;
import defpackage.fdbq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ConversationV2 implements bxtl {
    public final String a;
    public final String b;
    public final G3AttributionInfo c;
    public final String d;
    public final String e;
    public final List f;

    public ConversationV2(String str, String str2, G3AttributionInfo g3AttributionInfo, String str3, String str4, List list) {
        str2.getClass();
        g3AttributionInfo.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = g3AttributionInfo;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    @Override // defpackage.bxtl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationV2)) {
            return false;
        }
        ConversationV2 conversationV2 = (ConversationV2) obj;
        return fdbq.f(this.a, conversationV2.a) && fdbq.f(this.b, conversationV2.b) && fdbq.f(this.c, conversationV2.c) && fdbq.f(this.d, conversationV2.d) && fdbq.f(this.e, conversationV2.e) && fdbq.f(this.f, conversationV2.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ConversationV2(namespace=" + this.a + ", id=" + this.b + ", g3AttributionInfo=" + this.c + ", conversationId=" + this.d + ", name=" + this.e + ", keywords=" + this.f + ")";
    }
}
