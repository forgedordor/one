package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zwq extends fdbo implements fdap {
    public zwq(Object obj) {
        super(1, obj, zww.class, "onZoomEvent", "onZoomEvent(Lcom/google/android/apps/messaging/conversation2/screen/pinchtozoom/PinchToZoomEvent;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        aadp aadpVar = (aadp) obj;
        aadpVar.getClass();
        zww zwwVar = (zww) this.g;
        if (fdbq.f(aadpVar, aado.a)) {
            zwwVar.f.b(true);
        } else if (aadpVar instanceof aadm) {
            zwwVar.e.d(((aadm) aadpVar).a);
        } else {
            if (!fdbq.f(aadpVar, aadn.a)) {
                throw new fctg();
            }
            zwwVar.f.b(false);
        }
        return fctx.a;
    }
}
