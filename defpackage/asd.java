package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asd implements bpu {
    final /* synthetic */ asf a;

    public asd(asf asfVar) {
        this.a = asfVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        bbs.d("ProcessingCaptureSession", "open session failed ", th);
        asf asfVar = this.a;
        asfVar.f();
        asfVar.p();
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
