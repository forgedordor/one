package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblv extends ebmd {
    public String a;
    public ebma b;
    public int c = 1;

    public final int a() {
        ebma ebmaVar = this.b;
        if (!(ebmaVar instanceof eblx)) {
            throw new IllegalArgumentException("address is not a SipURI");
        }
        ebmg ebmgVarA = ((eblx) ebmaVar).a();
        if (ebmgVarA != null) {
            return ebmgVarA.b;
        }
        throw new IllegalArgumentException("SipURI does not have host port.");
    }

    @Override // defpackage.ebmd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eblv clone() {
        eblv eblvVar = new eblv();
        eblvVar.c = this.c;
        String str = this.a;
        if (str != null) {
            eblvVar.a = str;
        }
        ebma ebmaVar = this.b;
        if (ebmaVar != null) {
            eblvVar.b = (ebma) ebmaVar.clone();
        }
        return eblvVar;
    }

    @Override // defpackage.ebmd
    public final String c() {
        if (this.c == 3) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != null) {
            stringBuffer.append("\"");
            stringBuffer.append(this.a);
            stringBuffer.append("\" ");
        }
        if (this.b != null) {
            if (this.c == 1 || this.a != null) {
                stringBuffer.append("<");
            }
            stringBuffer.append(this.b.c());
            if (this.c == 1 || this.a != null) {
                stringBuffer.append(">");
            }
        }
        return stringBuffer.toString();
    }

    public final void d(String str) {
        this.a = str;
        this.c = 1;
    }

    public final void e(String str) {
        this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eblv)) {
            return false;
        }
        eblv eblvVar = (eblv) obj;
        if (this.c != eblvVar.c) {
            return false;
        }
        ebma ebmaVar = this.b;
        if (ebmaVar != null || eblvVar.b == null) {
            return ebmaVar == null || ebmaVar.equals(eblvVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ebma ebmaVar = this.b;
        return ebmaVar != null ? (i2 * 37) + ebmaVar.hashCode() : i2;
    }
}
