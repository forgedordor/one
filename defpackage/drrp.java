package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drrp extends drrx {
    static final int a = 3092300;
    static final drrp b = new drrp(-1, -1, "");
    final String c;

    public drrp(int i, int i2, String str) {
        super(c(a, i, i2));
        this.c = str;
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
        if (!(obj instanceof drrp)) {
            return false;
        }
        drrp drrpVar = (drrp) obj;
        return super.equals(obj) && this.h == drrpVar.h && this.c.equals(drrpVar.c);
    }

    @Override // defpackage.drrx
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("id", this.h);
        ejwfVarB.b("description", this.c);
        return ejwfVarB.toString();
    }
}
