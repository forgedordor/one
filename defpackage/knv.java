package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knv extends fdbr implements fdap {
    final /* synthetic */ knx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knv(knx knxVar) {
        super(1);
        this.a = knxVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        knx knxVar = this.a;
        final fdae fdaeVar = (fdae) obj;
        Handler handler = knxVar.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            fdaeVar.invoke();
        } else {
            Handler handler2 = knxVar.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: knu
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdaeVar.invoke();
                    }
                });
            }
        }
        return fctx.a;
    }
}
