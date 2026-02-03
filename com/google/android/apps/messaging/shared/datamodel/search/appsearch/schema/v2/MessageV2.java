package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.bxtl;
import defpackage.fdbq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessageV2 implements bxtl {
    public final String a;
    public final String b;
    public final G3AttributionInfo c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final List h;

    public MessageV2(String str, String str2, G3AttributionInfo g3AttributionInfo, String str3, String str4, long j, String str5, List list) {
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
        this.f = j;
        this.g = str5;
        this.h = list;
    }

    @Override // defpackage.bxtl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageV2)) {
            return false;
        }
        MessageV2 messageV2 = (MessageV2) obj;
        return fdbq.f(this.a, messageV2.a) && fdbq.f(this.b, messageV2.b) && fdbq.f(this.c, messageV2.c) && fdbq.f(this.d, messageV2.d) && fdbq.f(this.e, messageV2.e) && this.f == messageV2.f && fdbq.f(this.g, messageV2.g) && fdbq.f(this.h, messageV2.h);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        String str = this.g;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f;
        return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "MessageV2(namespace=" + this.a + ", id=" + this.b + ", g3AttributionInfo=" + this.c + ", conversationId=" + this.d + ", participantId=" + this.e + ", receivedTimestamp=" + this.f + ", text=" + this.g + ", transcriptions=" + this.h + ")";
    }
}
