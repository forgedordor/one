package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzrm {
    public final long a;
    public long b;
    long c;
    int d;
    int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    public int j;
    String k;
    fegz l;
    int m;
    feeg n;
    int o;
    int p;
    public int q;
    public int r;
    public int s;
    public ejwi t;
    int u;
    public int v;
    int w;

    public dzrm(String str) {
        this(null, str, false, SystemClock.elapsedRealtime());
    }

    public static dzrm a(String str, dzfh dzfhVar) {
        return new dzrm(str, dzfh.d(dzfhVar), true, SystemClock.elapsedRealtime());
    }

    public final void b(int i, int i2) {
        this.c = SystemClock.elapsedRealtime() - this.a;
        this.d = i;
        this.e = i2;
    }

    public final void c(String str) {
        if (ejwk.c(str)) {
            return;
        }
        this.k = str;
    }

    public dzrm(String str, String str2, boolean z, long j) {
        this.w = 1;
        this.s = -1;
        this.g = ejwk.a(str);
        this.f = ejwk.a(str2);
        this.h = z;
        this.a = j;
        this.t = ejud.a;
    }
}
