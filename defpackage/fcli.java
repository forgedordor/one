package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcli extends fcbf {
    final /* synthetic */ fcll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcli(fcll fcllVar) {
        super(fcllVar.a);
        this.a = fcllVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        try {
            int i = fcsr.a;
            this.a.c().b();
        } catch (Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
