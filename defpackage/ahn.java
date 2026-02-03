package defpackage;

import androidx.appsearch.builtintypes.Organization;
import androidx.appsearch.builtintypes.SportsTeam;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahn extends ahi {
    public final String f;
    public Organization g;
    public long h;
    public String i;
    public String j;
    public String k;
    public final SportsTeam l;
    public String m;
    public String n;
    public double o;
    public final SportsTeam p;
    public String q;
    public String r;

    public ahn(String str, String str2, Instant instant, String str3, SportsTeam sportsTeam, SportsTeam sportsTeam2) {
        super(str, str2, instant);
        this.h = 0L;
        this.o = 0.0d;
        lcg.i(str3);
        this.f = str3;
        lcg.i(sportsTeam);
        this.l = sportsTeam;
        lcg.i(sportsTeam2);
        this.p = sportsTeam2;
    }
}
