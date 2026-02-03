package androidx.appsearch.builtintypes;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SportsEvent extends Event {
    public final String f;
    public final Organization g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final SportsTeam l;
    public final String m;
    public final String n;
    public final double o;
    public final SportsTeam p;
    public final String q;
    public final String r;
    public final double s;
    public final boolean t;
    public final long u;

    protected SportsEvent(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, Instant instant, Instant instant2, Duration duration, String str7, ImageObject imageObject, String str8, Organization organization, long j3, String str9, String str10, String str11, SportsTeam sportsTeam, String str12, String str13, double d, SportsTeam sportsTeam2, String str14, String str15, double d2, boolean z, long j4) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2, instant, instant2, duration, str7, imageObject);
        this.f = str8;
        this.g = organization;
        this.h = j3;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = sportsTeam;
        this.m = str12;
        this.n = str13;
        this.o = d;
        this.p = sportsTeam2;
        this.q = str14;
        this.r = str15;
        this.s = d2;
        this.t = z;
        this.u = j4;
    }
}
