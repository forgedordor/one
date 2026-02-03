package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebnl extends ebog {
    public String a;

    public ebnl(String str) {
        super(str);
        this.e.b = ",";
        this.a = "Digest";
    }

    @Override // defpackage.ebob
    public final String a() {
        return this.a + " " + this.e.c();
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        try {
            ebnl ebnlVar = (ebnl) getClass().newInstance();
            String str = this.a;
            if (str != null) {
                ebnlVar.a = str;
            }
            ebmk ebmkVar = this.e;
            if (ebmkVar != null) {
                ebnlVar.e = (ebmk) ebmkVar.clone();
            }
            return ebnlVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.ebog, defpackage.ebob
    public final boolean equals(Object obj) {
        if (!(obj instanceof ebnl)) {
            return false;
        }
        ebnl ebnlVar = (ebnl) obj;
        return this.a.equalsIgnoreCase(ebnlVar.a) && this.e.equals(ebnlVar.e);
    }

    @Override // defpackage.ebog, defpackage.ebob
    public final int hashCode() {
        return 34765;
    }
}
