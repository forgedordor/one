package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bse extends bsa {
    public bse(atv atvVar) {
        super(3, atvVar);
    }

    public final void d(bbm bbmVar) {
        bib bibVarA = bic.a(bbmVar.e());
        if (bibVarA != null && ((bibVarA.d() == bhx.LOCKED_FOCUSED || bibVarA.d() == bhx.PASSIVE_FOCUSED) && bibVarA.c() == bhw.CONVERGED && bibVarA.e() == bhy.CONVERGED)) {
            super.b(bbmVar);
        } else {
            atv.a(bbmVar);
        }
    }
}
