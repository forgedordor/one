package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IClientApiService;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dctm extends dcfm {
    public final Context a;
    private final ejxr b;

    public dctm(Context context, ejxr ejxrVar) {
        super(context, dcsw.b, dcez.q, dcfl.a);
        this.a = context;
        int i = dctb.a;
        ejxx.a(new dcta(context));
        this.b = ejxrVar;
    }

    public static boolean b(epge epgeVar, epgc epgcVar) {
        return epgeVar != null && new evsz(epgeVar.c, epge.a).contains(epgcVar);
    }

    final defn a() {
        final defr defrVar = new defr();
        final dcsy dcsyVar = new dcsy("wrapper");
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dctj
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                IBinder iBinderB = ((dcih) obj).b();
                dclh.m(iBinderB);
                ((defr) obj2).b(IClientApiService.Stub.asInterface(iBinderB));
            }
        };
        dcizVar.c = 12301;
        defn defnVarE = degc.e(j(dcizVar.a()), 5L, TimeUnit.SECONDS);
        defnVarE.t(new defe() { // from class: dcth
            @Override // defpackage.defe
            public final void d(Exception exc) {
                dcsy dcsyVar2 = dcsyVar;
                dcsyVar2.initCause(exc);
                defrVar.a(dcsyVar2);
            }
        });
        defnVarE.q((Executor) this.b.get(), new defh() { // from class: dcti
            @Override // defpackage.defh
            public final void e(Object obj) {
                defn defnVarC;
                final defr defrVar2 = defrVar;
                final dcsy dcsyVar2 = dcsyVar;
                final IClientApiService iClientApiService = (IClientApiService) obj;
                try {
                    epge epgeVar = (epge) evsn.parseFrom(epge.b, iClientApiService.getSupportedApiFeatures(), evrr.a());
                    final boolean zB = dctm.b(epgeVar, epgc.DUO_KIT_REQUESTS);
                    final boolean zB2 = dctm.b(epgeVar, epgc.MEET_API_REQUESTS);
                    if (!dctm.b(epgeVar, epgc.SERVICE_API_GET_REGISTERED_ID_TYPE)) {
                        Account[] accountArrB = ddle.a(this.a.a).b();
                        int length = accountArrB.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                defnVarC = degc.c(false);
                                break;
                            }
                            Account account = accountArrB[i];
                            if ("Duo".equals(account.name) && "com.google.android.apps.tachyon".equals(account.type)) {
                                defnVarC = degc.c(true);
                                break;
                            }
                            i++;
                        }
                    } else {
                        defr defrVar3 = new defr();
                        try {
                            iClientApiService.getRegisteredIdType(new dctk(defrVar3));
                        } catch (RemoteException e) {
                            if (!defrVar3.c(e)) {
                                Log.e("DuoStateFetcher", "Error setting exception--task is already complete.", e);
                            }
                        }
                        defnVarC = defrVar3.a;
                    }
                    defn defnVarD = defnVarC.d(new deeq() { // from class: dcte
                        @Override // defpackage.deeq
                        public final Object a(defn defnVar) {
                            IClientApiService iClientApiService2 = iClientApiService;
                            if (!defnVar.m()) {
                                Exception excH = defnVar.h();
                                excH.getClass();
                                return degc.b(excH);
                            }
                            boolean z = defnVar.m() && ((Boolean) defnVar.i()).booleanValue();
                            if (!z || !zB2) {
                                return degc.c(new dctd(zB, z, false));
                            }
                            defr defrVar4 = new defr();
                            try {
                                iClientApiService2.getMeetApiAvailabilityInfo(new dctl(defrVar4));
                            } catch (RemoteException e2) {
                                Log.e("DuoStateFetcher", "Error getting Meet registered.", e2);
                                defrVar4.b(new dctd(true, true, false));
                            }
                            return defrVar4.a;
                        }
                    });
                    defnVarD.a(new defh() { // from class: dctf
                        @Override // defpackage.defh
                        public final void e(Object obj2) {
                            defrVar2.b((dctd) obj2);
                        }
                    });
                    defnVarD.t(new defe() { // from class: dctg
                        @Override // defpackage.defe
                        public final void d(Exception exc) {
                            Log.e("DuoStateFetcher", "Error getting duo registered.", exc);
                            dcsy dcsyVar3 = dcsyVar2;
                            dcsyVar3.initCause(exc);
                            defrVar2.a(dcsyVar3);
                        }
                    });
                } catch (RemoteException | evtj | NullPointerException e2) {
                    Log.e("DuoStateFetcher", "Error getting features.", e2);
                    dcsyVar2.initCause(e2);
                    defrVar2.a(dcsyVar2);
                }
            }
        });
        return defrVar.a;
    }
}
