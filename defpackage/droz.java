package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class droz extends drrx {
    static final int a = 3092217;
    final String b;

    public droz(int i, int i2) {
        super(c(a, i, i2));
        this.b = "";
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
        if (!(obj instanceof droz)) {
            return false;
        }
        droz drozVar = (droz) obj;
        return super.equals(obj) && this.h == drozVar.h && this.b.equals(drozVar.b);
    }

    @Override // defpackage.drrx
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.b});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("id", this.h);
        ejwfVarB.b("categoryName", this.b);
        return ejwfVarB.toString();
    }
}
