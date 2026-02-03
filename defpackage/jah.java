package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jah extends jaa {
    private final izw a;
    private final hox b = new hpl(null, hsi.a);

    public jah(izw izwVar) {
        this.a = izwVar;
    }

    @Override // defpackage.jaa
    public final Object a(izw izwVar) {
        if (izwVar != this.a) {
            itw.d("Check failed.");
        }
        Object objA = this.b.a();
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // defpackage.jaa
    public final void b(izw izwVar, Object obj) {
        if (izwVar != this.a) {
            itw.d("Check failed.");
        }
        this.b.b(obj);
    }

    @Override // defpackage.jaa
    public final boolean c(izw izwVar) {
        return izwVar == this.a;
    }
}
