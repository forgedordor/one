package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyva extends abs {
    final /* synthetic */ cyvb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyva(cyvb cyvbVar) {
        super(true);
        this.a = cyvbVar;
    }

    @Override // defpackage.abs
    public final void b() {
        cyvb cyvbVar = this.a;
        cyvbVar.ae(emsh.BACK_BUTTON);
        h(false);
        cyvbVar.c().d();
    }
}
