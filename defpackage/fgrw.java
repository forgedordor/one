package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fgrw extends fgry {
    Object a;

    private final void h() {
        if (G()) {
            return;
        }
        Object obj = this.a;
        fgrh fgrhVar = new fgrh();
        this.a = fgrhVar;
        if (obj != null) {
            fgrhVar.p(a(), (String) obj);
        }
    }

    @Override // defpackage.fgry
    protected final boolean G() {
        return this.a instanceof fgrh;
    }

    @Override // defpackage.fgry
    public void g() {
        throw null;
    }

    @Override // defpackage.fgry
    public int hP() {
        throw null;
    }

    @Override // defpackage.fgry
    public String hR(String str) {
        h();
        return super.hR(str);
    }

    @Override // defpackage.fgry
    public String hS(String str) {
        return !G() ? a().equals(str) ? (String) this.a : "" : super.hS(str);
    }

    @Override // defpackage.fgry
    public String l() {
        return X() ? A().l() : "";
    }

    final String m() {
        return hS(a());
    }

    public final void o(String str, String str2) {
        if (!G() && str.equals(a())) {
            this.a = str2;
            return;
        }
        h();
        fgsj fgsjVar = fgrz.b(this).c;
        String strTrim = str.trim();
        if (!fgsjVar.d) {
            strTrim = fgrb.a(strTrim);
        }
        fgrh fgrhVarV = v();
        int iB = fgrhVarV.b(strTrim);
        if (iB == -1) {
            fgrhVarV.i(strTrim, str2);
            return;
        }
        fgrhVarV.c[iB] = str2;
        if (fgrhVarV.b[iB].equals(strTrim)) {
            return;
        }
        fgrhVarV.b[iB] = strTrim;
    }

    @Override // defpackage.fgry
    public final List u() {
        return j;
    }

    @Override // defpackage.fgry
    public final fgrh v() {
        h();
        return (fgrh) this.a;
    }

    @Override // defpackage.fgry
    protected final /* bridge */ /* synthetic */ fgry z(fgry fgryVar) {
        fgrw fgrwVar = (fgrw) super.z(fgryVar);
        if (G()) {
            fgrwVar.a = ((fgrh) this.a).clone();
        }
        return fgrwVar;
    }

    @Override // defpackage.fgry
    protected final void F(String str) {
    }
}
