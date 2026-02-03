package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcsl extends fcsh {
    final /* synthetic */ fcsm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcsl(fcsm fcsmVar) {
        super(fcsmVar);
        this.b = fcsmVar;
    }

    @Override // defpackage.fcsh, defpackage.fcsg, defpackage.fbqa
    public final void f(fbnv fbnvVar, fbqg fbqgVar) {
        super.f(fbnvVar, fbqgVar);
        fcsm fcsmVar = this.b;
        if (fcsmVar.f.i || fbnvVar != fbnv.IDLE) {
            return;
        }
        fcsmVar.b.c();
    }
}
