package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzj {
    public static final pzj a = new pzj(false, 15);
    public final qlh b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public pzj(pzj pzjVar) {
        pzjVar.getClass();
        this.c = pzjVar.c;
        this.d = pzjVar.d;
        this.b = pzjVar.b;
        this.j = pzjVar.j;
        this.e = pzjVar.e;
        this.f = pzjVar.f;
        this.i = pzjVar.i;
        this.g = pzjVar.g;
        this.h = pzjVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fdbq.f(getClass(), obj.getClass())) {
            return false;
        }
        pzj pzjVar = (pzj) obj;
        if (this.c == pzjVar.c && this.d == pzjVar.d && this.e == pzjVar.e && this.f == pzjVar.f && this.g == pzjVar.g && this.h == pzjVar.h && fdbq.f(a(), pzjVar.a()) && this.j == pzjVar.j) {
            return fdbq.f(this.i, pzjVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        long j = this.h;
        Set set = this.i;
        long j2 = this.g;
        int iHashCode = (((((((((((((i * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + set.hashCode();
        NetworkRequest networkRequestA = a();
        return (iHashCode * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) qat.a(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public /* synthetic */ pzj(boolean z, int i) {
        if ((i & 1) == 0) {
            throw null;
        }
        boolean z2 = z & ((i & 2) == 0);
        fcvq fcvqVar = fcvq.a;
        this.b = new qlh((byte[]) null);
        this.j = 1;
        this.c = z2;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = fcvqVar;
    }

    public pzj(qlh qlhVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        qlhVar.getClass();
        if (i == 0) {
            throw null;
        }
        set.getClass();
        this.b = qlhVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
