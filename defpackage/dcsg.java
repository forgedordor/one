package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import com.google.android.gms.droidguard.internal.IDroidGuardService;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcsg implements dcri {
    public final dcrv a;
    public final Executor b;
    public final dcrz c;

    public dcsg(dcrv dcrvVar, Executor executor, dcrz dcrzVar) {
        this.a = dcrvVar;
        this.b = executor;
        this.c = dcrzVar;
    }

    static dcsf b(dcko dckoVar, String str, dcrk dcrkVar, int i, dcrf dcrfVar) throws dcff {
        dcqw dcqwVarA;
        dcrfVar.c(3, dcre.FINE);
        try {
            IDroidGuardHandle iDroidGuardHandleCreateDroidGuardHandle = ((IDroidGuardService) dckoVar.w()).createDroidGuardHandle();
            dcrfVar.c(4, dcre.FINE);
            DroidGuardResultsRequest droidGuardResultsRequest = new DroidGuardResultsRequest();
            Bundle bundle = droidGuardResultsRequest.a;
            int i2 = bundle.getInt("clientVersion");
            bundle.putInt("clientVersion", (i2 - (i2 % 10)) + 2);
            bundle.putAll(((dcrh) dcrkVar).d);
            droidGuardResultsRequest.b(i);
            try {
                DroidGuardInitReply droidGuardInitReplyInitWithExtras = iDroidGuardHandleCreateDroidGuardHandle.initWithExtras(str, droidGuardResultsRequest);
                if (droidGuardInitReplyInitWithExtras == null) {
                    try {
                        iDroidGuardHandleCreateDroidGuardHandle.init(str);
                    } catch (RemoteException e) {
                        throw dcrn.b(e, "Failed on init() call");
                    }
                }
                dcrfVar.c(5, dcre.FINE);
                if (droidGuardInitReplyInitWithExtras != null) {
                    try {
                        dcqwVarA = dcqj.a(dckoVar.c, dcrfVar, droidGuardInitReplyInitWithExtras);
                    } catch (dcqt | dcqx | IOException e2) {
                        throw dcrn.a(e2, 8, "Failed to start the app-side VM process");
                    }
                } else {
                    dcqwVarA = null;
                }
                dcrfVar.c(13, dcre.COARSE);
                return new dcro(iDroidGuardHandleCreateDroidGuardHandle, dcqwVarA);
            } catch (RemoteException e3) {
                throw dcrn.b(e3, "Failed on initWithExtras() call");
            }
        } catch (RemoteException e4) {
            throw dcrn.b(e4, "Failed to create DroidGuard handle");
        }
    }

    @Override // defpackage.dcri
    public final defn a(final String str, final Map map, final dcrk dcrkVar) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        final dcrf dcrfVar = new dcrf(Arrays.asList(fbaw.b().split(",", -1)).contains(str) ? dcre.FINE : dcre.COARSE, dcmy.a);
        dcrfVar.c(2, dcre.COARSE);
        defn defnVarD = this.a.d(1, 1, new dcru() { // from class: dcsd
            @Override // defpackage.dcru
            public final Object a(dcko dckoVar) throws dcff {
                dcsg dcsgVar = this.a;
                dcrv dcrvVar = dcsgVar.a;
                String str2 = str;
                dcrk dcrkVar2 = dcrkVar;
                int iA = dcrvVar.a();
                dcrf dcrfVar2 = dcrfVar;
                dcsf dcsfVarB = dcsg.b(dckoVar, str2, dcrkVar2, iA, dcrfVar2);
                Executor executor = dcsgVar.b;
                if (executor == null) {
                    throw new NullPointerException("Null executor");
                }
                dcrz dcrzVar = dcsgVar.c;
                if (str2 != null) {
                    return new dcsl(dcrvVar, executor, dcrzVar, str2, dcrkVar2, dcrfVar2, ((dcro) dcsfVarB).a);
                }
                throw new NullPointerException("Null flowName");
            }
        });
        Executor executor = this.b;
        defn defnVarA = dcsn.a(executor, defnVarD, ((dcrh) dcrkVar).a);
        defnVarA.o(executor, new defb() { // from class: dcse
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                this.a.c.a(35502, defnVar, jCurrentTimeMillis2, System.currentTimeMillis(), SystemClock.elapsedRealtime() - jElapsedRealtime2);
            }
        });
        defn defnVarG = defnVarA.g(executor, new defm() { // from class: dcsb
            @Override // defpackage.defm
            public final defn a(Object obj) {
                final dcrl dcrlVar = (dcrl) obj;
                defn defnVarA2 = dcrlVar.a(map);
                defnVarA2.o(this.a.b, new defb() { // from class: dcsa
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        dcrlVar.close();
                    }
                });
                return defnVarA2;
            }
        });
        defnVarG.o(executor, new defb() { // from class: dcsc
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                this.a.c.a(35501, defnVar, jCurrentTimeMillis, System.currentTimeMillis(), SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        });
        return defnVarG;
    }
}
