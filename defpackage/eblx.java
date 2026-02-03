package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblx extends ebma {
    public eblw a;
    public ebmk b;
    public ebmk c;
    private eblz f;

    public eblx() {
        this.e = "sip";
        this.b = new ebmk(null);
        ebmk ebmkVar = new ebmk(null);
        this.c = ebmkVar;
        ebmkVar.b = "&";
    }

    public final ebmg a() {
        eblw eblwVar = this.a;
        if (eblwVar == null) {
            return null;
        }
        return eblwVar.a;
    }

    public final String b() {
        ebmg ebmgVar = this.a.a;
        ebme ebmeVar = ebmgVar == null ? null : ebmgVar.a;
        if (ebmeVar == null) {
            return null;
        }
        return ebmeVar.a;
    }

    @Override // defpackage.ebma, defpackage.ebmd
    public final String c() {
        StringBuffer stringBuffer = new StringBuffer(this.e);
        stringBuffer.append(":");
        eblw eblwVar = this.a;
        if (eblwVar != null) {
            stringBuffer.append(eblwVar.c());
        }
        if (!this.b.h()) {
            stringBuffer.append(";");
            stringBuffer.append(this.b.c());
        }
        if (!this.c.h()) {
            stringBuffer.append("?");
            stringBuffer.append(this.c.c());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.ebma, defpackage.ebmd
    public final Object clone() {
        eblx eblxVar = new eblx();
        eblxVar.e = this.e;
        eblxVar.a = (eblw) this.a.clone();
        eblxVar.b = (ebmk) this.b.clone();
        ebmk ebmkVar = this.c;
        if (ebmkVar != null) {
            eblxVar.c = (ebmk) ebmkVar.clone();
        }
        eblz eblzVar = this.f;
        if (eblzVar != null) {
            eblxVar.f = (eblz) eblzVar.clone();
        }
        return eblxVar;
    }

    @Override // defpackage.ebma
    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.a.b();
    }

    @Override // defpackage.ebma
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eblx)) {
            return false;
        }
        eblx eblxVar = (eblx) obj;
        eblw eblwVar = this.a;
        if (eblwVar == null && eblxVar.a != null) {
            return false;
        }
        if (eblwVar != null && !eblwVar.equals(eblxVar.a)) {
            return false;
        }
        ebmk ebmkVar = this.c;
        if (ebmkVar == null && eblxVar.c != null) {
            return false;
        }
        if (ebmkVar != null && !ebmkVar.equals(eblxVar.c)) {
            return false;
        }
        eblz eblzVar = this.f;
        if (eblzVar == null && eblxVar.f != null) {
            return false;
        }
        if (eblzVar != null && !eblzVar.equals(eblxVar.f)) {
            return false;
        }
        ebmk ebmkVar2 = this.b;
        if (ebmkVar2 == null && eblxVar.b != null) {
            return false;
        }
        if (ebmkVar2 == null || ebmkVar2.equals(eblxVar.b)) {
            return super.equals(obj);
        }
        return false;
    }

    public final void f() {
        this.b = new ebmk();
    }

    public final void g(ebmg ebmgVar) {
        if (this.a == null) {
            this.a = new eblw();
        }
        this.a.a = ebmgVar;
    }

    @Override // defpackage.ebma
    public final void h(String str) {
        this.b.f("method", str);
    }

    @Override // defpackage.ebma
    public final int hashCode() {
        int iHashCode = super.hashCode();
        eblw eblwVar = this.a;
        if (eblwVar != null) {
            iHashCode = (iHashCode * 37) + eblwVar.hashCode();
        }
        if (this.c != null) {
            iHashCode = (iHashCode * 37) + 187654;
        }
        eblz eblzVar = this.f;
        if (eblzVar != null) {
            iHashCode = (iHashCode * 37) + eblzVar.hashCode();
        }
        return this.b != null ? (iHashCode * 37) + 187654 : iHashCode;
    }

    public final void i(int i) {
        if (this.a == null) {
            this.a = new eblw();
        }
        eblw eblwVar = this.a;
        if (eblwVar.a == null) {
            eblwVar.a = new ebmg();
        }
        eblwVar.a.b = i;
    }

    public final void j(String str) throws ebml {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        if (!str.equalsIgnoreCase("UDP") && !str.equalsIgnoreCase("TCP") && !str.equalsIgnoreCase("TLS")) {
            throw new ebml("bad transport ".concat(str));
        }
        ebmj ebmjVar = new ebmj("transport", str.toLowerCase(Locale.US));
        this.b.i("transport");
        this.b.e(ebmjVar);
    }

    public final void k(String str) {
        if (this.a == null) {
            this.a = new eblw();
        }
        this.a.d(str);
    }

    @Override // defpackage.ebma
    public final boolean l() {
        return true;
    }

    public final String m() {
        Object objB = this.b.b("user");
        if (objB == null) {
            return null;
        }
        return objB instanceof ebmd ? ((ebmd) objB).c() : objB.toString();
    }

    @Override // defpackage.ebma
    public final String toString() {
        return c();
    }
}
