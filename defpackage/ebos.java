package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebos extends ebnk {
    public ebos() {
        super("To");
    }

    @Override // defpackage.ebnk, defpackage.ebob
    public final String a() {
        eblv eblvVar = this.a;
        int i = eblvVar.c;
        String strC = eblvVar.c();
        int i2 = this.a.c;
        String strConcat = (i != 1 ? "<" : "").concat(strC);
        if (i2 != 1) {
            strConcat = strConcat.concat(">");
        }
        if (this.e.h()) {
            return strConcat;
        }
        return strConcat + ";" + this.e.c();
    }

    public final void e() {
        this.e.i("tag");
    }

    @Override // defpackage.ebnk, defpackage.ebog, defpackage.ebob
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return super.equals(obj);
        }
        return false;
    }

    public final void f(String str) {
        k("tag", str);
    }

    @Override // defpackage.ebnk, defpackage.ebog, defpackage.ebob
    public final int hashCode() {
        return 89076;
    }
}
