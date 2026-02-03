package defpackage;

import android.content.Context;
import android.telephony.ims.ProvisioningManager;
import android.telephony.ims.RcsClientConfiguration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggh implements dgfw {
    private final dgge a;
    private final String b;
    private final int c;
    private final dgfv d;
    private dggd e;
    private final dgrs f;

    public dggh(dgge dggeVar, dgfv dgfvVar, dgrs dgrsVar, String str, int i) {
        this.a = dggeVar;
        this.d = dgfvVar;
        this.f = dgrsVar;
        this.b = str;
        this.c = i;
    }

    private final synchronized boolean d(String str) {
        if (this.e != null) {
            dgiq dgiqVarF = this.f.f(str);
            if (dgiqVarF.m().C() && dgiqVarF.ab()) {
                dhja.k("[SR]: Callback is already registered and valid configuration exists for subId: %s", Integer.valueOf(this.c));
                return true;
            }
            dggd dggdVar = this.e;
            dggdVar.getClass();
            if (!dggdVar.d.get()) {
                dhja.k("[SR]: Callback is already registered, however the configuration was not received yet for subId: %s", Integer.valueOf(this.c));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dgfw
    public final synchronized void a() {
        dggd dggdVarC = c(null);
        if (dggdVarC == null) {
            dhja.k("[SR]: No active AOSP callback found for subId: %s", Integer.valueOf(this.c));
            return;
        }
        dgfv dgfvVar = this.d;
        int i = this.c;
        dgfvVar.a(i).unregisterRcsProvisioningCallback(dggdVarC);
        dhja.k("[SR]: Terminated AOSP callback for subId: %s", Integer.valueOf(i));
    }

    @Override // defpackage.dgfw
    public final synchronized void b(dfip dfipVar) {
        String str = this.b;
        if (d(str)) {
            return;
        }
        dgfv dgfvVar = this.d;
        int i = this.c;
        dgge dggeVar = this.a;
        fcsu fcsuVar = dggeVar.a;
        ProvisioningManager provisioningManagerA = dgfvVar.a(i);
        Context context = (Context) fcsuVar.b();
        dgrs dgrsVar = (dgrs) dggeVar.b.b();
        dgqw dgqwVar = (dgqw) dggeVar.c.b();
        dgkj dgkjVar = (dgkj) dggeVar.d.b();
        dggb dggbVar = (dggb) dggeVar.e.b();
        dggbVar.getClass();
        dggd dggdVarC = c(new dggd(context, dgrsVar, dgqwVar, dgkjVar, dfipVar, str, i, dggbVar));
        if (dggdVarC != null) {
            provisioningManagerA.unregisterRcsProvisioningCallback(dggdVarC);
        }
        Integer numValueOf = Integer.valueOf(i);
        dhja.k("[SR]: Initializing AOSP callback for subId: %s", numValueOf);
        String strT = dfog.t();
        String strS = dfog.s();
        String strQ = dfog.q();
        String strR = dfog.r();
        dhja.c("[SR]: RcsClientConfiguration: rcs_version[%s], rcs_profile[%s], client_vendor[%s], single_reg_client_version[%s]", strT, strS, strQ, strR);
        provisioningManagerA.setRcsClientConfiguration(new RcsClientConfiguration(strT, strS, strQ, strR));
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        dggd dggdVar = this.e;
        dggdVar.getClass();
        provisioningManagerA.registerRcsProvisioningCallback(executorServiceNewSingleThreadExecutor, dggdVar);
        dhja.k("[SR]: AOSP callback registered for subId: %s", numValueOf);
    }

    final synchronized dggd c(dggd dggdVar) {
        dggd dggdVar2;
        dggdVar2 = this.e;
        this.e = dggdVar;
        return dggdVar2;
    }
}
