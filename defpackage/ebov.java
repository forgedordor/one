package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebov extends ebog implements Cloneable {
    public eboh a;
    public ebmg b;
    public String f;
    public boolean g;

    public ebov() {
        super("Via");
        this.g = true;
        this.b = new ebmg();
        this.a = new eboh();
    }

    @Override // defpackage.ebob
    public final String a() {
        String strConcat = "" + this.a.c() + " " + this.b.a();
        if (this.g && this.b.b <= 0) {
            strConcat = strConcat.concat(":5060");
        }
        String str = this.f;
        if (str != null) {
            strConcat = strConcat + "(" + str + ")";
        }
        if (this.e.h()) {
            return strConcat;
        }
        return strConcat + ";" + this.e.c();
    }

    public final String b() {
        return super.i("branch");
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebov ebovVar = new ebov();
        String str = this.f;
        if (str != null) {
            ebovVar.f = str;
        }
        ebmk ebmkVar = this.e;
        if (ebmkVar != null) {
            ebovVar.e = (ebmk) ebmkVar.clone();
        }
        ebmg ebmgVar = this.b;
        if (ebmgVar != null) {
            ebovVar.b = new ebmg(ebmgVar);
        }
        eboh ebohVar = this.a;
        if (ebohVar != null) {
            ebovVar.a = (eboh) ebohVar.clone();
        }
        return ebovVar;
    }

    public final void e(String str) {
        super.k("branch", str);
    }

    @Override // defpackage.ebog, defpackage.ebob
    public final boolean equals(Object obj) {
        if (!(obj instanceof ebov)) {
            return false;
        }
        ebov ebovVar = (ebov) obj;
        return this.a.equals(ebovVar.a) && this.e.equals(ebovVar.e) && this.b.equals(ebovVar.b);
    }

    public final void f() {
        super.k("keep", null);
    }

    public final void g() {
        super.k("rport", null);
    }

    @Override // defpackage.ebog, defpackage.ebob
    public final int hashCode() {
        return 123987;
    }

    public final void o() {
        super.k("server-keep", null);
    }

    public final void p(String str) {
        if (this.a == null) {
            this.a = new eboh();
        }
        this.a.c = str;
    }
}
