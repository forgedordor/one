package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbf {
    public static final mbf a = new mbf(new mbe());
    public final long b;
    public final long c;
    public final long d = Long.MIN_VALUE;
    public final boolean e = false;
    public final boolean f = false;
    public final boolean g = false;
    public final boolean h = false;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
    }

    public mbf(mbe mbeVar) {
        this.b = mgb.B(mbeVar.a);
        this.c = mbeVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbf)) {
            return false;
        }
        mbf mbfVar = (mbf) obj;
        if (this.c != mbfVar.c) {
            return false;
        }
        long j = mbfVar.d;
        boolean z = mbfVar.e;
        boolean z2 = mbfVar.f;
        boolean z3 = mbfVar.g;
        boolean z4 = mbfVar.h;
        return true;
    }

    public final int hashCode() {
        long j = this.c;
        return ((((int) (j ^ (j >>> 32))) * 31) + ((int) (-9223372034707292160L))) * 923521;
    }
}
