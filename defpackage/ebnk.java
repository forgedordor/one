package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebnk extends ebog {
    public eblv a;

    public ebnk(String str) {
        super(str);
    }

    @Override // defpackage.ebob
    public String a() {
        if (this.a == null) {
            throw new RuntimeException("No body!");
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a.c != 1) {
            stringBuffer.append("<");
        }
        stringBuffer.append(this.a.c());
        if (this.a.c != 1) {
            stringBuffer.append(">");
        }
        if (!this.e.h()) {
            stringBuffer.append(";");
            stringBuffer.append(this.e.c());
        }
        return stringBuffer.toString();
    }

    public void b(eblv eblvVar) {
        this.a = eblvVar;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public Object clone() {
        ebnk ebnkVar = new ebnk(this.c);
        eblv eblvVar = this.a;
        if (eblvVar != null) {
            ebnkVar.a = eblvVar;
        }
        ebmk ebmkVar = this.e;
        if (ebmkVar != null) {
            ebnkVar.e = ebmkVar;
        }
        return ebnkVar;
    }

    @Override // defpackage.ebog, defpackage.ebob
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebnk)) {
            return false;
        }
        ebnk ebnkVar = (ebnk) obj;
        eblv eblvVar = this.a;
        if (eblvVar == null && ebnkVar.a != null) {
            return false;
        }
        if (eblvVar == null || eblvVar.equals(ebnkVar.a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ebog, defpackage.ebob
    public int hashCode() {
        int iHashCode = super.hashCode();
        eblv eblvVar = this.a;
        return eblvVar != null ? (iHashCode * 37) + eblvVar.hashCode() : iHashCode;
    }

    public ebnk(String str, eblv eblvVar) {
        super(str);
        this.a = eblvVar;
    }
}
