package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnv extends ebog implements Cloneable {
    protected eboe a;

    public ebnv() {
        super(ffho.a);
    }

    @Override // defpackage.ebob
    public final String a() {
        eboe eboeVar = this.a;
        if (eboeVar == null) {
            throw new IllegalStateException("Media range is null.");
        }
        String strC = eboeVar.c();
        if (!m()) {
            return strC;
        }
        return strC + ";" + this.e.c();
    }

    public final String b() {
        eboe eboeVar = this.a;
        if (eboeVar == null) {
            return null;
        }
        return eboeVar.b;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        if (this.a == null) {
            throw new IllegalStateException("MediaRange is null.");
        }
        ebnv ebnvVar = new ebnv();
        ebnvVar.e = (ebmk) this.e.clone();
        ebnvVar.a = (eboe) this.a.clone();
        return ebnvVar;
    }

    public final String e() {
        eboe eboeVar = this.a;
        if (eboeVar == null) {
            return null;
        }
        return eboeVar.a;
    }

    public final void f(String str) {
        if (this.a == null) {
            this.a = new eboe();
        }
        this.a.b = str;
    }

    public final void g(String str) {
        if (this.a == null) {
            this.a = new eboe();
        }
        if (str.indexOf(47) < 0) {
            this.a.a = str;
            return;
        }
        String[] strArrSplit = str.split("/");
        eboe eboeVar = this.a;
        eboeVar.a = strArrSplit[0];
        eboeVar.b = strArrSplit[1];
    }
}
