package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdw implements eheh {
    private final eygg a;
    private final ehhy b;
    private final Context c;

    /* compiled from: PG */
    public interface a {
        ehkw gn();
    }

    public ehdw(eygg eyggVar, ehhy ehhyVar, Context context) {
        eyggVar.getClass();
        context.getClass();
        this.a = eyggVar;
        this.b = ehhyVar;
        this.c = context;
    }

    public final ListenableFuture a(final String str, efwo efwoVar, egbs egbsVar, boolean z) throws IOException {
        final ehkw ehkwVarGn = ((a) ehlh.a(this.c, a.class, efwoVar)).gn();
        String strA = this.b.a(egbsVar);
        eiez eiezVar = eiey.a;
        eieu eieuVarJ = eiiy.j("Fetching experiments for account", eiezVar);
        try {
            eieuVarJ = eiiy.j("PhenotypeApi.getConfigurationSnapshot", eiezVar);
            try {
                ListenableFuture listenableFutureC = ehkwVarGn.c.c(str, strA);
                if (z) {
                    listenableFutureC = eiip.a(listenableFutureC, 25L, TimeUnit.SECONDS, ehkwVarGn.a);
                }
                eieuVarJ.b(listenableFutureC);
                fczl.a(eieuVarJ, null);
                final ListenableFuture listenableFutureK = eika.k(listenableFutureC, eiid.d(new eooz() { // from class: ehko
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) throws IOException {
                        ListenableFuture listenableFutureF;
                        dzzu dzzuVar = (dzzu) obj;
                        eieu eieuVarJ2 = eiiy.j("ConsistencyTierState.setNewValues", eiey.a);
                        String str2 = str;
                        final ehkw ehkwVar = ehkwVarGn;
                        try {
                            ehde ehdeVar = (ehde) ehkwVar.b.get(str2);
                            if (ehdeVar != null) {
                                int iOrdinal = ehdeVar.ordinal();
                                if (iOrdinal == 1) {
                                    ehey eheyVar = ehkwVar.f;
                                    dzzuVar.getClass();
                                    listenableFutureF = eooq.f(eheyVar.b(str2, dzzuVar), eiid.a(new ejvr() { // from class: ehkq
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            ehef ehefVar = (ehef) obj2;
                                            ehefVar.getClass();
                                            if (!ehefVar.a) {
                                                ehkw ehkwVar2 = ehkwVar;
                                                ejwi ejwiVar = ehkwVar2.d;
                                                if (ejwiVar.g()) {
                                                    ehkwVar2.g.a();
                                                    ((eaep) ejwiVar.c()).a();
                                                }
                                            }
                                            return ehefVar;
                                        }
                                    }), eoqg.a);
                                } else if (iOrdinal == 3) {
                                    ehey eheyVar2 = ehkwVar.e;
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
                fczl.a(eieuVarJ, null);
                ListenableFuture listenableFutureB = ehkwVarGn.h.f.b();
                final fdap fdapVar = new fdap() { // from class: ehkm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dcgc dcgcVar = (dcgc) obj;
                        dcgcVar.getClass();
                        return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot", dcgcVar));
                    }
                };
                ejvr ejvrVar = new ejvr() { // from class: ehkn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return fdapVar.invoke(obj);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eooq.f(ehge.a(fcva.g(eika.e(listenableFutureB, dcgc.class, ejvrVar, eoqgVar), listenableFutureK)), eiid.a(new ejvr() { // from class: ehkp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((List) obj).getClass();
                        return (ehef) eork.q(listenableFutureK);
                    }
                }), eoqgVar);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.eheh
    public final ListenableFuture b(final String str, final boolean z) {
        str.getClass();
        return eooq.g(((egbf) this.a.b()).f(), eiid.d(new eooz() { // from class: ehdv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                List<egbe> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                for (egbe egbeVar : list) {
                    boolean z2 = z;
                    String str2 = str;
                    ehdw ehdwVar = this.a;
                    arrayList.add(ehdwVar.a(str2, egbeVar.a(), egbeVar.b(), z2));
                }
                return ehge.a(arrayList);
            }
        }), eoqg.a);
    }

    @Override // defpackage.eheh
    public final ListenableFuture c(final String str, final efwo efwoVar) {
        return eooq.g(((egbf) this.a.b()).c(efwoVar), eiid.d(new eooz() { // from class: ehdu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                egbe egbeVar = (egbe) obj;
                egbeVar.getClass();
                return this.a.a(str, efwoVar, egbeVar.b(), true);
            }
        }), eoqg.a);
    }
}
