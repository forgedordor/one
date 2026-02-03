package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccfx {
    public final List a;
    public final ccfw b;

    public ccfx(List list, ccfw ccfwVar) {
        this.a = list;
        this.b = ccfwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccfx)) {
            return false;
        }
        ccfx ccfxVar = (ccfx) obj;
        return fdbq.f(this.a, ccfxVar.a) && fdbq.f(this.b, ccfxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MlsKeyPackageList(claimableKeyPackages=" + this.a + ", lastResortKeyPackage=" + this.b + ")";
    }
}
