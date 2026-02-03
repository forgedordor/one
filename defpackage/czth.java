package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czth extends abs {
    final /* synthetic */ czte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czth(czte czteVar) {
        super(true);
        this.a = czteVar;
    }

    @Override // defpackage.abs
    public final void b() {
        czte czteVar = this.a;
        czteVar.k(emfc.RCS_PROVISIONING_BACK_BUTTON_CLICKED);
        czteVar.s(5);
        czsw czswVar = czteVar.d;
        czswVar.fg().setResult(7337);
        czswVar.fg().finish();
    }
}
