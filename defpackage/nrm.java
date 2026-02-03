package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrm extends nrg {
    public final String a;
    public final String b;

    public nrm(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nrm nrmVar = (nrm) obj;
            if (this.f.equals(nrmVar.f) && Objects.equals(this.a, nrmVar.a) && Objects.equals(this.b, nrmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() + 527;
        String str = this.a;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.nrg
    public final String toString() {
        return this.f + ": url=" + this.b;
    }
}
