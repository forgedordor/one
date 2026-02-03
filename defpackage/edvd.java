package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edvd extends abs {
    final /* synthetic */ ea a;
    final /* synthetic */ edve d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edvd(edve edveVar, ea eaVar) {
        super(true);
        this.a = eaVar;
        this.d = edveVar;
    }

    @Override // defpackage.abs
    public final void b() {
        edve edveVar = this.d;
        edveVar.c.a(dsvg.a(), this.a.Q);
        fr frVar = edveVar.a;
        if (frVar.b() == 0) {
            edveVar.b.finish();
        } else {
            frVar.ah();
        }
    }
}
