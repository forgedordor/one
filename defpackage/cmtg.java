package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtg implements cmup {
    public static final /* synthetic */ int c = 0;
    private final fcsu e;
    private final fcsu f;
    private final SparseArray d = new SparseArray();
    public final Bundle b = new Bundle();

    static {
        cdag.h(cdag.b, "enable_experiment_carrier_config_override", false);
        dzzf dzzfVar = cdag.b;
        evzi evziVar = evzi.a;
        synchronized (cdag.d) {
            cdag.e.add(new cczg(dzzfVar.k("experiment_carrier_config_override", evziVar, new dzze() { // from class: cczz
                @Override // defpackage.dzze
                public final Object a(byte[] bArr) {
                    return (evzi) evsn.parseFrom(evzi.a, bArr);
                }
            }), evziVar));
        }
    }

    public cmtg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.f = fcsuVar2;
        this.e = fcsuVar;
        new eoss((Executor) fcsuVar3.b());
    }

    @Override // defpackage.kx
    @Deprecated
    public final Bundle a(int i) {
        Bundle bundle;
        int iA = ((crny) this.e.b()).h(i).a();
        SparseArray sparseArray = this.d;
        synchronized (sparseArray) {
            bundle = (Bundle) sparseArray.get(iA);
            if (bundle == null) {
                bundle = new Bundle();
                sparseArray.put(iA, bundle);
                cmub cmubVar = (cmub) this.f.b();
                Bundle bundle2 = new Bundle();
                ekqh it = cmubVar.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    cmuw cmuwVar = (cmuw) it.next();
                    try {
                        bundle2.putAll(cmuwVar.a(iA));
                    } catch (Exception e) {
                        ekrd ekrdVar = (ekrd) cmub.a.j();
                        ekrdVar.X(eksq.a, "Bugle");
                        ((ekrd) ekrdVar.g(e).h("com/google/android/apps/messaging/shared/sms/config/CarrierConfigRepository", "getConfigs", 64, "CarrierConfigRepository.kt")).t("Exception when getting configs from %s", cmuwVar);
                    }
                }
                cmuv cmuvVar = cmubVar.c;
                auvw.k(((cmvd) cmuvVar).c, null, null, new cmvc((cmvd) cmuvVar, iA, null), 3);
                bundle.putAll(bundle2);
            }
        }
        return bundle;
    }

    @Override // defpackage.cmup
    public final void b() {
        SparseArray sparseArray = this.d;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }
}
