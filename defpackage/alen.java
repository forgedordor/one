package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alen implements cqto {
    final /* synthetic */ aleq a;

    public alen(aleq aleqVar) {
        this.a = aleqVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        aleq aleqVar = this.a;
        auvw.k(aleqVar.a, null, null, new alem(aleqVar, null), 3);
    }

    @Override // defpackage.cqto
    public final void fK() {
        aleq aleqVar = this.a;
        aleqVar.f.set(false);
        synchronized (aleqVar.e) {
            cquc cqucVar = aleqVar.c;
            if (cqucVar != null) {
                cqucVar.a();
            }
            aleqVar.c = null;
        }
    }
}
