package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izu extends jaa {
    public jae a;

    public izu(jae jaeVar) {
        this.a = jaeVar;
    }

    @Override // defpackage.jaa
    public final Object a(izw izwVar) {
        if (izwVar != this.a.m()) {
            itw.d("Check failed.");
        }
        return this.a.n();
    }

    @Override // defpackage.jaa
    public final void b(izw izwVar, Object obj) {
        throw null;
    }

    @Override // defpackage.jaa
    public final boolean c(izw izwVar) {
        return izwVar == this.a.m();
    }
}
