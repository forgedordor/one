package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcim implements fbqh {
    final /* synthetic */ fbqf a;
    final /* synthetic */ fcir b;

    public fcim(fcir fcirVar, fbqf fbqfVar) {
        this.a = fbqfVar;
        this.b = fcirVar;
    }

    @Override // defpackage.fbqh
    public final void a(fbnw fbnwVar) {
        fbqg fcioVar;
        fbnv fbnvVar = fbnwVar.a;
        if (fbnvVar == fbnv.SHUTDOWN) {
            return;
        }
        fcir fcirVar = this.b;
        fbnv fbnvVar2 = fbnv.TRANSIENT_FAILURE;
        if (fbnvVar == fbnvVar2 || fbnvVar == fbnv.IDLE) {
            fcirVar.f.e();
        }
        if (fcirVar.g == fbnvVar2) {
            if (fbnvVar == fbnv.CONNECTING) {
                return;
            }
            if (fbnvVar == fbnv.IDLE) {
                fcirVar.c();
                return;
            }
        }
        fbqf fbqfVar = this.a;
        int iOrdinal = fbnvVar.ordinal();
        if (iOrdinal == 0) {
            fcioVar = new fcio(fbqc.a);
        } else if (iOrdinal == 1) {
            fcioVar = new fcio(fbqc.c(fbqfVar));
        } else if (iOrdinal == 2) {
            fcioVar = new fcio(fbqc.b(fbnwVar.b));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(fbnvVar.toString()));
            }
            fcioVar = new fciq(fcirVar, fbqfVar);
        }
        fcirVar.e(fbnvVar, fcioVar);
    }
}
