package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.bxtl;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ParticipantV2 implements bxtl {
    public final String a;
    public final String b;
    public final G3AttributionInfo c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;

    public ParticipantV2(String str, String str2, G3AttributionInfo g3AttributionInfo, String str3, long j, String str4, String str5, String str6) {
        str2.getClass();
        g3AttributionInfo.getClass();
        str3.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = g3AttributionInfo;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // defpackage.bxtl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantV2)) {
            return false;
        }
        ParticipantV2 participantV2 = (ParticipantV2) obj;
        return fdbq.f(this.a, participantV2.a) && fdbq.f(this.b, participantV2.b) && fdbq.f(this.c, participantV2.c) && fdbq.f(this.d, participantV2.d) && this.e == participantV2.e && fdbq.f(this.f, participantV2.f) && fdbq.f(this.g, participantV2.g) && fdbq.f(this.h, participantV2.h);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.f;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.e;
        int i = ((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31;
        String str2 = this.g;
        return ((i + (str2 != null ? str2.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ParticipantV2(namespace=" + this.a + ", id=" + this.b + ", g3AttributionInfo=" + this.c + ", name=" + this.d + ", subId=" + this.e + ", displayDestination=" + this.f + ", normalizedDestination=" + this.g + ", rawDestination=" + this.h + ")";
    }
}
