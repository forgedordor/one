package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclj extends fcbf {
    final /* synthetic */ fcmo a;
    final /* synthetic */ fcll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fclj(fcll fcllVar, fcmo fcmoVar) {
        super(fcllVar.a);
        this.a = fcmoVar;
        this.b = fcllVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        try {
            int i = fcsr.a;
            this.b.c().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
