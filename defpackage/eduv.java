package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eduv extends abs {
    final /* synthetic */ ea a;
    final /* synthetic */ eduw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eduv(eduw eduwVar, ea eaVar) {
        super(true);
        this.a = eaVar;
        this.d = eduwVar;
    }

    @Override // defpackage.abs
    public final void b() {
        eduw eduwVar = this.d;
        eduwVar.c.a(dsvg.a(), this.a.Q);
        fr frVar = eduwVar.a;
        if (frVar.b() == 0) {
            eduwVar.b.finish();
        } else {
            frVar.ah();
        }
    }
}
