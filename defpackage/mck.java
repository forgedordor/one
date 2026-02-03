package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mck {
    public static final Object a = new Object();
    private static final mbo q;

    @Deprecated
    public Object c;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public mbk j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object b = a;
    public mbo d = q;

    static {
        mbd mbdVar = new mbd();
        mbdVar.b("androidx.media3.common.Timeline");
        mbdVar.a = Uri.EMPTY;
        q = mbdVar.a();
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
        mgb.O(8);
        mgb.O(9);
        mgb.O(10);
        mgb.O(11);
        mgb.O(12);
        mgb.O(13);
    }

    public final long a() {
        return mgb.B(this.l);
    }

    public final long b() {
        return mgb.B(this.m);
    }

    public final boolean c() {
        return this.j != null;
    }

    public final void d(Object obj, mbo mboVar, boolean z, boolean z2, mbk mbkVar, long j) {
        this.b = obj;
        if (mboVar == null) {
            mboVar = q;
        }
        this.d = mboVar;
        this.c = null;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = mbkVar;
        this.l = 0L;
        this.m = j;
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            mck mckVar = (mck) obj;
            if (Objects.equals(this.b, mckVar.b) && Objects.equals(this.d, mckVar.d) && Objects.equals(null, null) && Objects.equals(this.j, mckVar.j) && this.e == mckVar.e && this.f == mckVar.f && this.g == mckVar.g && this.h == mckVar.h && this.i == mckVar.i && this.k == mckVar.k && this.l == mckVar.l && this.m == mckVar.m && this.n == mckVar.n && this.o == mckVar.o && this.p == mckVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() + 217) * 31) + this.d.hashCode();
        mbk mbkVar = this.j;
        int iHashCode2 = ((iHashCode * 961) + (mbkVar == null ? 0 : mbkVar.hashCode())) * 31;
        long j = this.e;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
