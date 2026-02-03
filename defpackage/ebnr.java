package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnr extends ebnk {
    public boolean b;

    public ebnr() {
        super("Contact");
        this.b = false;
    }

    private static eblv f(eblx eblxVar, String str, int i) throws ebml {
        eblxVar.j(str);
        eblxVar.i(i);
        eblv eblvVar = new eblv();
        eblvVar.b = eblxVar;
        return eblvVar;
    }

    @Override // defpackage.ebnk, defpackage.ebob
    public final String a() {
        if (this.b) {
            return "*";
        }
        eblv eblvVar = this.a;
        String strConcat = "";
        if (eblvVar != null) {
            if (eblvVar.c == 1) {
                strConcat = "".concat(eblvVar.c());
            } else {
                strConcat = "<" + eblvVar.c() + ">";
            }
        }
        ebmk ebmkVar = this.e;
        if (ebmkVar == null || ebmkVar.h()) {
            return strConcat;
        }
        return strConcat + ";" + this.e.c();
    }

    @Override // defpackage.ebnk
    public final void b(eblv eblvVar) {
        this.a = eblvVar;
    }

    @Override // defpackage.ebnk, defpackage.ebob, defpackage.ebmd
    public final /* bridge */ /* synthetic */ Object clone() {
        ebnr ebnrVar = new ebnr();
        ebnrVar.b = this.b;
        ebmk ebmkVar = this.e;
        if (ebmkVar != null) {
            ebnrVar.e = (ebmk) ebmkVar.clone();
        }
        eblv eblvVar = this.a;
        if (eblvVar != null) {
            ebnrVar.a = eblvVar.clone();
        }
        return ebnrVar;
    }

    public final String e() {
        return i("expires");
    }

    public ebnr(eblx eblxVar, String str, int i, Optional optional, ebmk ebmkVar) {
        super("Contact");
        this.b = false;
        this.a = f(eblxVar, str, i);
        optional.isPresent();
        ebmj ebmjVarA = ebmkVar.a("+sip.instance");
        if (ebmjVarA != null) {
            ebmjVarA.e = "<" + ((String) optional.get()) + ">";
            ebmjVarA.b();
        } else {
            ebmj ebmjVar = new ebmj("+sip.instance", "<" + ((String) optional.get()) + ">");
            ebmjVar.b();
            ebmkVar.g(ebmjVar);
        }
        this.e = ebmkVar;
    }

    public ebnr(eblx eblxVar, String str, int i, Optional optional, String[] strArr) {
        super("Contact");
        this.b = false;
        this.a = f(eblxVar, str, i);
        if (optional.isPresent()) {
            ebmj ebmjVar = new ebmj("+sip.instance", "<" + ((String) optional.get()) + ">");
            ebmjVar.b();
            j(ebmjVar);
        }
        for (String str2 : strArr) {
            j(new ebmj(str2, null));
        }
    }
}
