package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agil implements fdae {
    final /* synthetic */ boolean a;
    final /* synthetic */ agiu b;

    public agil(boolean z, agiu agiuVar) {
        this.a = z;
        this.b = agiuVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.a) {
            agiu agiuVar = this.b;
            auvw.k(agiuVar.c, null, null, new agim(agiuVar, null), 3);
        } else {
            this.b.d();
        }
        return fctx.a;
    }
}
