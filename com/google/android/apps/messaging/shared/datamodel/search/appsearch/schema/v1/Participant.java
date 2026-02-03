package com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1;

import defpackage.bxtl;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class Participant implements bxtl {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;

    public Participant(String str, String str2, String str3, long j, String str4, String str5, String str6) {
        str3.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.bxtl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) obj;
        return fdbq.f(this.a, participant.a) && fdbq.f(this.b, participant.b) && fdbq.f(this.c, participant.c) && this.d == participant.d && fdbq.f(this.e, participant.e) && fdbq.f(this.f, participant.f) && fdbq.f(this.g, participant.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.e;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = ((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31;
        String str2 = this.f;
        return ((i + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Participant(namespace=" + this.a + ", id=" + this.b + ", name=" + this.c + ", subId=" + this.d + ", displayDestination=" + this.e + ", normalizedDestination=" + this.f + ", rawDestination=" + this.g + ")";
    }
}
