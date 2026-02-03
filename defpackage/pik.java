package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pik {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public pik(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pik)) {
            return false;
        }
        pik pikVar = (pik) obj;
        if (fdbq.f(this.a, pikVar.a) && fdbq.f(this.b, pikVar.b) && fdbq.f(this.c, pikVar.c) && fdbq.f(this.d, pikVar.d)) {
            return fdbq.f(this.e, pikVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        pip.d(fcva.ak(this.d));
        fctx fctxVar = fctx.a;
        sb.append(fctxVar);
        sb.append("\n            |   referenceColumnNames = {");
        pip.c(fcva.ak(this.e));
        sb.append(fctxVar);
        sb.append("\n            |}\n        ");
        return fdey.m(fdey.j(new fdhb(fdgn.c(sb.toString(), "|")), new fdap() { // from class: fdgp
            public final /* synthetic */ String a = "    ";

            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                boolean zH = fdgn.H(str);
                String str2 = this.a;
                return zH ? str.length() >= str2.length() ? str : str2 : str2.concat(str);
            }
        }), "\n", 62);
    }
}
