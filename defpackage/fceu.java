package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fceu extends fcdk {
    final /* synthetic */ fcan a;
    final /* synthetic */ fcev b;

    public fceu(fcev fcevVar, fcan fcanVar) {
        this.a = fcanVar;
        this.b = fcevVar;
    }

    @Override // defpackage.fcdk, defpackage.fcan
    public final void m(fcap fcapVar) {
        this.b.a.b();
        this.a.m(new fcet(this, fcapVar));
    }

    @Override // defpackage.fcdk
    protected final fcan p() {
        return this.a;
    }
}
