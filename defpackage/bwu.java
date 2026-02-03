package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwu extends bxn {
    private final int j;
    private final int k;
    private final String l;
    private final List m;

    public bwu(int i, int i2, String str, List list) {
        this.j = i;
        this.k = i2;
        this.l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.m = list;
    }

    @Override // defpackage.bxn
    public final int a() {
        return this.k;
    }

    @Override // defpackage.bxn
    public final int b() {
        return this.j;
    }

    @Override // defpackage.bxn
    public final String c() {
        return this.l;
    }

    @Override // defpackage.bxn
    public final List d() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxn) {
            bxn bxnVar = (bxn) obj;
            if (this.j == bxnVar.b() && this.k == bxnVar.a() && this.l.equals(bxnVar.c()) && this.m.equals(bxnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.j ^ 1000003) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.j + ", highSpeedValue=" + this.k + ", name=" + this.l + ", typicalSizes=" + this.m + "}";
    }
}
