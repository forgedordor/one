package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crfd implements eora {
    final /* synthetic */ crff a;

    public crfd(crff crffVar) {
        this.a = crffVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        crff crffVar = this.a;
        if (crffVar.h()) {
            ekqh it = ((ekgb) crffVar.j()).iterator();
            while (it.hasNext()) {
                ((defn) ((eunz) it.next()).a.get()).a(new defh() { // from class: eunv
                    @Override // defpackage.defh
                    public final void e(Object obj2) {
                        defn defnVarB = ((ddjd) obj2).b();
                        defnVarB.a(new defh() { // from class: eunt
                            @Override // defpackage.defh
                            public final void e(Object obj3) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training schedule succeeded.");
                                }
                            }
                        });
                        defnVarB.t(new defe() { // from class: eunu
                            @Override // defpackage.defe
                            public final void d(Exception exc) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training schedule failed.");
                                }
                            }
                        });
                    }
                }).t(new defe() { // from class: eunw
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        if (Log.isLoggable("BrellaInAppTraining", 4)) {
                            Log.i("BrellaInAppTraining", "Cannot schedule in-app training because trainer failed to initialize.");
                        }
                    }
                });
            }
        } else {
            ekqh it2 = ((ekgb) crffVar.j()).iterator();
            while (it2.hasNext()) {
                ((defn) ((eunz) it2.next()).a.get()).a(new defh() { // from class: eunr
                    @Override // defpackage.defh
                    public final void e(Object obj2) {
                        defn defnVarA = ((ddjd) obj2).a();
                        defnVarA.a(new defh() { // from class: euno
                            @Override // defpackage.defh
                            public final void e(Object obj3) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training cancel succeeded.");
                                }
                            }
                        });
                        defnVarA.t(new defe() { // from class: eunq
                            @Override // defpackage.defe
                            public final void d(Exception exc) {
                                if (Log.isLoggable("BrellaInAppTraining", 4)) {
                                    Log.i("BrellaInAppTraining", "In-app training cancel failed.");
                                }
                            }
                        });
                    }
                }).t(new defe() { // from class: euns
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        if (Log.isLoggable("BrellaInAppTraining", 4)) {
                            Log.i("BrellaInAppTraining", "Cannot cancel in-app training because trainer failed to initialize.");
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        crff.b.n("Could not start or stop Brella training, Brella GMSCore likely not available");
    }
}
