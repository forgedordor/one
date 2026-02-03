package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drsb extends drrx {
    static final int a = 3092317;

    public drsb(int i, int i2) {
        super(c(a, i, i2));
    }

    @Override // defpackage.drrx
    public final int a() {
        return a;
    }

    @Override // defpackage.drrx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drsb) {
            return super.equals(obj) && this.h == ((drsb) obj).h;
        }
        return false;
    }

    @Override // defpackage.drrx
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode())});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("id", this.h);
        return ejwfVarB.toString();
    }
}
