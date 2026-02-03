package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblw extends ebmd {
    public ebmg a;
    public ebmb b;

    public final Optional a() {
        return Optional.ofNullable(this.b);
    }

    public final String b() {
        ebmb ebmbVar = this.b;
        if (ebmbVar == null) {
            return null;
        }
        return ebmbVar.a;
    }

    @Override // defpackage.ebmd
    public final String c() {
        String string;
        ebmb ebmbVar = this.b;
        if (ebmbVar == null) {
            String strA = this.a.a();
            return strA == null ? "" : strA;
        }
        if (ebmbVar.b == null) {
            string = ebmbVar.a;
        } else {
            StringBuffer stringBuffer = new StringBuffer(ebmbVar.a);
            stringBuffer.append(":");
            stringBuffer.append(ebmbVar.b);
            string = stringBuffer.toString();
        }
        return string + "@" + this.a.a();
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        eblw eblwVar = new eblw();
        String strB = b();
        if (strB != null) {
            eblwVar.d(strB);
        }
        eblwVar.a = this.a;
        return eblwVar;
    }

    public final void d(String str) {
        if (str == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ebmb();
        }
        this.b.a(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eblw)) {
            return false;
        }
        eblw eblwVar = (eblw) obj;
        ebmg ebmgVar = this.a;
        if (ebmgVar == null && eblwVar.a != null) {
            return false;
        }
        if (ebmgVar != null && !ebmgVar.equals(eblwVar.a)) {
            return false;
        }
        ebmb ebmbVar = this.b;
        if (ebmbVar != null || eblwVar.b == null) {
            return ebmbVar == null || ebmbVar.equals(eblwVar.b);
        }
        return false;
    }

    public final int hashCode() {
        ebmg ebmgVar = this.a;
        int iHashCode = ebmgVar != null ? ebmgVar.hashCode() : 0;
        ebmb ebmbVar = this.b;
        return ebmbVar != null ? (iHashCode * 37) + ebmbVar.hashCode() : iHashCode;
    }
}
