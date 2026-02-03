package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfz {
    public final ejwi a;
    public final ehey b;
    public final ehey c;
    public final Map d;
    public final ehig e;
    private final ScheduledExecutorService f;
    private final eaaa g;
    private final dzyn h;

    public ehfz(ejwi ejwiVar, ScheduledExecutorService scheduledExecutorService, ehey eheyVar, ehey eheyVar2, Map map, eaaa eaaaVar, ehig ehigVar, dzyn dzynVar) {
        scheduledExecutorService.getClass();
        eheyVar.getClass();
        eheyVar2.getClass();
        map.getClass();
        eaaaVar.getClass();
        dzynVar.getClass();
        this.a = ejwiVar;
        this.f = scheduledExecutorService;
        this.b = eheyVar;
        this.c = eheyVar2;
        this.d = map;
        this.g = eaaaVar;
        this.e = ehigVar;
        this.h = dzynVar;
    }

    public final ListenableFuture a(final String str, boolean z) throws IOException {
        str.getClass();
        eiez eiezVar = eiey.a;
        eieu eieuVarJ = eiiy.j("Fetching experiments for device", eiezVar);
        try {
            eieuVarJ = eiiy.j("PhenotypeApi.getConfigurationSnapshot", eiezVar);
            try {
                ListenableFuture listenableFutureC = this.g.c(str, "");
                if (z) {
                    listenableFutureC = eiip.a(listenableFutureC, 25L, TimeUnit.SECONDS, this.f);
                }
                eieuVarJ.b(listenableFutureC);
                fczl.a(eieuVarJ, null);
                final ListenableFuture listenableFutureG = eooq.g(listenableFutureC, eiid.d(new eooz() { // from class: ehfr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) throws IOException {
                        ListenableFuture listenableFutureF;
                        dzzu dzzuVar = (dzzu) obj;
                        eieu eieuVarJ2 = eiiy.j("ConsistencyTierState.setNewValues", eiey.a);
                        String str2 = str;
                        final ehfz ehfzVar = this.a;
                        try {
                            ehde ehdeVar = (ehde) ehfzVar.d.get(str2);
                            if (ehdeVar != null) {
                                int iOrdinal = ehdeVar.ordinal();
                                if (iOrdinal == 0) {
                                    ehey eheyVar = ehfzVar.c;
                                    dzzuVar.getClass();
                                    listenableFutureF = eooq.f(eheyVar.b(str2, dzzuVar), eiid.a(new ejvr() { // from class: ehfs
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            ehef ehefVar = (ehef) obj2;
                                            ehefVar.getClass();
                                            if (!ehefVar.a) {
                                                ehfz ehfzVar2 = ehfzVar;
                                                ejwi ejwiVar = ehfzVar2.a;
                                                if (ejwiVar.g()) {
                                                    ehfzVar2.e.a();
                                                    ((eaep) ejwiVar.c()).a();
                                                }
                                            }
                                            return ehefVar;
                                        }
                                    }), eoqg.a);
                                } else if (iOrdinal == 2) {
                                    ehey eheyVar2 = ehfzVar.b;
                                    dzzuVar.getClass();
                                    listenableFutureF = eheyVar2.b(str2, dzzuVar);
                                }
                                eieuVarJ2.b(listenableFutureF);
                                fczl.a(eieuVarJ2, null);
                                return listenableFutureF;
                            }
                            throw new UnsupportedOperationException();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                fczl.a(eieuVarJ2, th);
                                throw th2;
                            }
                        }
                    }
                }), eoqg.a);
                eieuVarJ.b(listenableFutureG);
                fczl.a(eieuVarJ, null);
                ListenableFuture listenableFutureB = this.h.f.b();
                final fdap fdapVar = new fdap() { // from class: ehfp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dcgc dcgcVar = (dcgc) obj;
                        dcgcVar.getClass();
                        return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot. GMS Core version too old.", dcgcVar));
                    }
                };
                ejvr ejvrVar = new ejvr() { // from class: ehfq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return fdapVar.invoke(obj);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eooq.f(ehge.a(fcva.g(eika.e(listenableFutureB, dcgc.class, ejvrVar, eoqgVar), listenableFutureG)), eiid.a(new ejvr() { // from class: ehfo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((List) obj).getClass();
                        return (ehef) eork.q(listenableFutureG);
                    }
                }), eoqgVar);
            } finally {
            }
        } finally {
        }
    }
}
