package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcsh extends fcsg {
    final /* synthetic */ fcsi a;

    protected fcsh(fcsi fcsiVar) {
        this.a = fcsiVar;
    }

    @Override // defpackage.fcsg, defpackage.fbqa
    public void f(fbnv fbnvVar, fbqg fbqgVar) {
        fcsi fcsiVar = this.a;
        if (fcsiVar.c == fbnv.SHUTDOWN) {
            return;
        }
        fcsiVar.c = fbnvVar;
        fcsiVar.d = fbqgVar;
        fcsk fcskVar = fcsiVar.e;
        if (fcskVar.i) {
            return;
        }
        fcskVar.f();
    }

    @Override // defpackage.fcsg
    protected final fbqa g() {
        return this.a.e.h;
    }
}
