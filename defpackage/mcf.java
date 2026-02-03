package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcf {
    public final Object a;
    public final int b;
    public final mbo c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
    }

    public mcf(Object obj, int i, mbo mboVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = mboVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mcf mcfVar = (mcf) obj;
            if (this.b == mcfVar.b && this.e == mcfVar.e && this.f == mcfVar.f && this.g == mcfVar.g && this.h == mcfVar.h && this.i == mcfVar.i && Objects.equals(this.c, mcfVar.c) && Objects.equals(this.a, mcfVar.a) && Objects.equals(this.d, mcfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }
}
