package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebly extends ebma {
    public eblz a;

    public ebly() {
        this.e = "tel";
    }

    public final String a() {
        return this.a.b;
    }

    public final String b() {
        return this.a.c();
    }

    @Override // defpackage.ebma, defpackage.ebmd
    public final String c() {
        return this.e + ":" + this.a.c();
    }

    @Override // defpackage.ebma, defpackage.ebmd
    public final Object clone() {
        ebly eblyVar = new ebly();
        eblyVar.e = this.e;
        eblz eblzVar = this.a;
        if (eblzVar != null) {
            eblyVar.a = (eblz) eblzVar.clone();
        }
        return eblyVar;
    }

    @Override // defpackage.ebma
    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.a.a;
    }

    @Override // defpackage.ebma
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebly)) {
            return false;
        }
        ebly eblyVar = (ebly) obj;
        eblz eblzVar = this.a;
        if (eblzVar == null && eblyVar.a != null) {
            return false;
        }
        if (eblzVar == null || eblzVar.equals(eblyVar.a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ebma
    public final void h(String str) {
        eblz eblzVar = this.a;
        eblzVar.c.e(new ebmj("method", str));
    }

    @Override // defpackage.ebma
    public final int hashCode() {
        int iHashCode = super.hashCode();
        eblz eblzVar = this.a;
        return eblzVar != null ? (iHashCode * 37) + eblzVar.hashCode() : iHashCode;
    }

    @Override // defpackage.ebma
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ebma
    public final String toString() {
        return c();
    }
}
