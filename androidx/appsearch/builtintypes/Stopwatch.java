package androidx.appsearch.builtintypes;

import defpackage.lcg;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Stopwatch extends Thing {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    public Stopwatch(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, long j3, long j4, int i2, int i3, long j5, List list3) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        this.a = j3;
        this.b = j4;
        this.c = i2;
        this.d = i3;
        this.e = j5;
        lcg.i(list3);
        this.f = list3;
    }
}
