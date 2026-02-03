package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebqq {
    public final ebpc a;
    public String b;
    private List c;

    public ebqq(ebpc ebpcVar) {
        this.a = ebpcVar;
    }

    public final int a() {
        ebnn ebnnVar = this.a.g;
        if (ebnnVar == null) {
            return -1;
        }
        return ebnnVar.b();
    }

    public final ebnr b() {
        return (ebnr) this.a.d("Contact");
    }

    public final ebqo c(String str) {
        List<ebqo> listO = o();
        if (listO != null && !listO.isEmpty()) {
            for (ebqo ebqoVar : listO) {
                if (ebqoVar.b.equals(str)) {
                    return ebqoVar;
                }
            }
        }
        return null;
    }

    public final String d() {
        return this.a.h();
    }

    public final String e() {
        ebnr ebnrVarB = b();
        if (ebnrVarB != null) {
            return ebnrVarB.a();
        }
        return null;
    }

    public final String f() {
        ebnr ebnrVarB = b();
        if (ebnrVarB != null) {
            return ebnrVarB.a.b.toString();
        }
        return null;
    }

    public final String g() {
        byte[] bArr = this.a.k;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    public final String h() {
        ebob ebobVarD = this.a.d(ffho.a);
        if (ebobVarD != null) {
            return ebobVarD.a();
        }
        return null;
    }

    public final String i() {
        eboa eboaVar = this.a.e;
        if (eboaVar == null) {
            return null;
        }
        return eboaVar.a();
    }

    public final String j(String str) {
        ebpc ebpcVar = this.a;
        if (ebpcVar.q(str)) {
            return ebpcVar.e(str).a();
        }
        return null;
    }

    public final String k(String str, String str2) {
        ebmk ebmkVarD;
        ebob ebobVarD = this.a.d(str);
        if (ebobVarD == null || (ebmkVarD = ebobVarD.d()) == null) {
            return null;
        }
        return ebmkVarD.d(str2);
    }

    public final String l() {
        ebos ebosVar = this.a.f;
        if (ebosVar == null) {
            return null;
        }
        return ebosVar.a();
    }

    public final String m() {
        ebos ebosVar = this.a.f;
        if (ebosVar == null) {
            return null;
        }
        return ebosVar.a.b.toString();
    }

    public final String n() {
        StringBuilder sb = new StringBuilder();
        if (x()) {
            sb.append(((ebpe) this.a).a.a());
        } else {
            ebpd ebpdVar = (ebpd) this.a;
            sb.append(ebpdVar.i());
            sb.append(" ");
            if (((Boolean) dfbu.g.a()).booleanValue()) {
                sb.append(ebpdVar.w());
            } else {
                sb.append("(redacted)");
            }
            sb.append(" SIP/2.0\n");
        }
        ebpc ebpcVar = this.a;
        for (ebob ebobVar : ebpcVar.d) {
            sb.append(ebobVar.c);
            sb.append(": ");
            if (!ejwk.c(ebobVar.c) && ((ejuf.e(ebobVar.c, "To") || ejuf.e(ebobVar.c, "From") || ejuf.e(ebobVar.c, "Via") || ejuf.e(ebobVar.c, "Call-Id") || ejuf.e(ebobVar.c, "Subject") || ejuf.e(ebobVar.c, "Contact") || ejuf.e(ebobVar.c, "Authorization") || ejuf.e(ebobVar.c, "Reason") || ejuf.e(ebobVar.c, "Refer-To") || ejuf.e(ebobVar.c, "Referred-By") || ejuf.e(ebobVar.c, "Refer-Sub") || ejuf.e(ebobVar.c, "Security-Verify") || ejuf.e(ebobVar.c, "P-Preferred-Identity") || ejuf.e(ebobVar.c, "P-Asserted-Identity") || ejuf.e(ebobVar.c, "P-Called-Party-ID") || ejuf.e(ebobVar.c, "P-Associated-Uri") || ejuf.e(ebobVar.c, "P-Associated-To") || ejuf.e(ebobVar.c, "P-Access-Network-Info") || ejuf.e(ebobVar.c, "P-Last-Access-Network-Info")) && !((Boolean) dfbu.g.a()).booleanValue())) {
                sb.append("(redacted)");
            } else {
                sb.append(ebobVar.a());
            }
            sb.append("\n");
        }
        byte[] bArr = ebpcVar.k;
        if (bArr != null && bArr.length > 0) {
            sb.append("\n");
            if (((Boolean) dfbu.g.a()).booleanValue()) {
                sb.append(g());
                sb.append("\n");
            } else {
                String str = this.b;
                if (str != null) {
                    sb.append(str);
                } else {
                    List listO = o();
                    for (int i = 0; i < listO.size(); i++) {
                        if (listO.get(i) != null) {
                            sb.append(((ebqo) listO.get(i)).c());
                        }
                        if (i != listO.size() - 1) {
                            sb.append("\n");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public final List o() {
        ArrayList arrayList;
        if (this.c == null) {
            try {
                byte[] bArr = this.a.k;
                if ("0".equals(j("Content-Length"))) {
                    arrayList = new ArrayList();
                } else {
                    ebqo[] ebqoVarArrE = ebqo.e(bArr, h());
                    ArrayList arrayList2 = new ArrayList();
                    for (ebqo ebqoVar : ebqoVarArrE) {
                        arrayList2.add(ebqoVar);
                    }
                    arrayList = arrayList2;
                }
                this.c = arrayList;
            } catch (Exception unused) {
                this.c = new ArrayList();
            }
        }
        return this.c;
    }

    public final List p() {
        return this.a.g().a;
    }

    public final void q(ebob ebobVar) {
        this.a.k(ebobVar);
    }

    public final void r(String str) {
        ebqm.b(this.a, str);
    }

    public final void s(String str, String str2) {
        this.a.k(ebql.g(str, str2));
    }

    public final void t(String str) {
        this.a.m(str);
    }

    public final void u(ebob ebobVar) {
        this.a.p(ebobVar);
    }

    public final boolean v(String str) {
        return this.a.q(str);
    }

    public final boolean w() {
        String strJ = j("Contact");
        if (strJ == null) {
            return false;
        }
        return strJ.contains("automata");
    }

    public abstract boolean x();
}
