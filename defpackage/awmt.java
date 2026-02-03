package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmt extends awmv {
    public static final awmt a = new awmt(null, null, null, null, null, null, null, null, null, 511);
    public final awml b;
    public final awmu c;
    public final String d;
    public final Uri e;
    public final evqs f;
    public final cigb g;
    public final Instant h;
    public final Instant i;
    public final Uri j;
    public final boolean k;

    public awmt() {
        this(null, null, null, null, null, null, null, null, null, 511);
    }

    public static /* synthetic */ awmt a(awmt awmtVar, awml awmlVar, awmu awmuVar, String str, Uri uri, evqs evqsVar, cigb cigbVar, Instant instant, Instant instant2, Uri uri2, int i) {
        if ((i & 1) != 0) {
            awmlVar = awmtVar.b;
        }
        awml awmlVar2 = awmlVar;
        if ((i & 2) != 0) {
            awmuVar = awmtVar.c;
        }
        awmu awmuVar2 = awmuVar;
        if ((i & 4) != 0) {
            str = awmtVar.d;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            uri = awmtVar.e;
        }
        Uri uri3 = uri;
        if ((i & 16) != 0) {
            evqsVar = awmtVar.f;
        }
        evqs evqsVar2 = evqsVar;
        cigb cigbVar2 = (i & 32) != 0 ? awmtVar.g : cigbVar;
        Instant instant3 = (i & 64) != 0 ? awmtVar.h : instant;
        Instant instant4 = (i & 128) != 0 ? awmtVar.i : instant2;
        Uri uri4 = (i & 256) != 0 ? awmtVar.j : uri2;
        awmuVar2.getClass();
        cigbVar2.getClass();
        instant3.getClass();
        instant4.getClass();
        return new awmt(awmlVar2, awmuVar2, str2, uri3, evqsVar2, cigbVar2, instant3, instant4, uri4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awmt)) {
            return false;
        }
        awmt awmtVar = (awmt) obj;
        return fdbq.f(this.b, awmtVar.b) && this.c == awmtVar.c && fdbq.f(this.d, awmtVar.d) && fdbq.f(this.e, awmtVar.e) && fdbq.f(this.f, awmtVar.f) && fdbq.f(this.g, awmtVar.g) && fdbq.f(this.h, awmtVar.h) && fdbq.f(this.i, awmtVar.i) && fdbq.f(this.j, awmtVar.j);
    }

    public final int hashCode() {
        awml awmlVar = this.b;
        int iHashCode = ((awmlVar == null ? 0 : awmlVar.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.e;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        evqs evqsVar = this.f;
        int iHashCode4 = (((((((iHashCode3 + (evqsVar == null ? 0 : evqsVar.hashCode())) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        Uri uri2 = this.j;
        return iHashCode4 + (uri2 != null ? uri2.hashCode() : 0);
    }

    public final String toString() {
        return "RcsGroup(rcsConferenceUri=" + this.b + ", groupState=" + this.c + ", name=" + this.d + ", iconUrl=" + this.e + ", routingToken=" + this.f + ", groupCapabilities=" + this.g + ", lastSyncTimestamp=" + this.h + ", lastNameChangeTimestamp=" + this.i + ", joinLinkUrl=" + this.j + ")";
    }

    public awmt(awml awmlVar, awmu awmuVar, String str, Uri uri, evqs evqsVar, cigb cigbVar, Instant instant, Instant instant2, Uri uri2) {
        awmuVar.getClass();
        cigbVar.getClass();
        instant.getClass();
        instant2.getClass();
        this.b = awmlVar;
        this.c = awmuVar;
        this.d = str;
        this.e = uri;
        this.f = evqsVar;
        this.g = cigbVar;
        this.h = instant;
        this.i = instant2;
        this.j = uri2;
        this.k = awmuVar == awmu.a;
    }

    public /* synthetic */ awmt(awml awmlVar, awmu awmuVar, String str, Uri uri, evqs evqsVar, cigb cigbVar, Instant instant, Instant instant2, Uri uri2, int i) {
        this(1 == (i & 1) ? null : awmlVar, (i & 2) != 0 ? awmu.a : awmuVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? null : evqsVar, (i & 32) != 0 ? cigb.b() : cigbVar, (i & 64) != 0 ? Instant.EPOCH : instant, (i & 128) != 0 ? Instant.EPOCH : instant2, (i & 256) != 0 ? null : uri2);
    }
}
