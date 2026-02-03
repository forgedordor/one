package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvkp implements dvin {
    public final dvtl b;
    public final dwdg d;
    private final dvrd e;
    final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final eosc a = dvie.b().a;

    public dvkp(dvrd dvrdVar, dwdg dwdgVar, dvtl dvtlVar) {
        this.e = dvrdVar;
        this.d = dwdgVar;
        this.b = dvtlVar;
    }

    @Override // defpackage.dvin
    public final void a(final dwje dwjeVar) {
        if (this.c.add(dwjeVar)) {
            final ListenableFuture listenableFutureF = eooq.f(d(dwjeVar, null), new ejvr() { // from class: dvkg
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dvim dvimVar = (dvim) obj;
                    if (dvimVar == null) {
                        return null;
                    }
                    dwje dwjeVar2 = dwjeVar;
                    dvkp dvkpVar = this.a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    dvkpVar.b(dwjeVar2).T(ekjz.g(dvimVar.a(), new ejvr() { // from class: dvkm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return dwxi.a((dwpx) obj2);
                        }
                    }));
                    dvkpVar.b.a(dwjeVar2).edit().putLong("BLOCK_LAST_SYNC_KEY", jCurrentTimeMillis).commit();
                    return null;
                }
            }, eoqg.a);
            this.a.submit(new Runnable() { // from class: dvkh
                @Override // java.lang.Runnable
                public final void run() {
                    final ListenableFuture listenableFuture = listenableFutureF;
                    try {
                        ((eooi) eork.b(listenableFuture).a(new Callable() { // from class: dvkn
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return (Void) ((eooi) listenableFuture).q();
                            }
                        }, eoqg.a)).q();
                    } catch (InterruptedException | ExecutionException e) {
                        dvhv.d("LitBlockController", "Failed to store block list", e);
                    }
                    this.a.c.remove(dwjeVar);
                }
            });
        }
    }

    public final dwws b(dwje dwjeVar) {
        return this.e.b(dwjeVar);
    }

    public final dwwy c(final dwje dwjeVar, dwpx dwpxVar, final ejwm ejwmVar) {
        return dwwr.d(b(dwjeVar).o(dwxi.a(dwpxVar)), new ejvr() { // from class: dvkk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dwov dwovVar = (dwov) obj;
                if (ejwmVar.a(dwovVar)) {
                    this.a.a(dwjeVar);
                }
                return Boolean.valueOf(dwovVar.a());
            }
        });
    }

    public final ListenableFuture d(final dwje dwjeVar, final String str) {
        dvxe dvxeVarC = dvxf.c();
        ((dvxa) dvxeVarC).a = "fetch blocked conversation";
        dvxeVarC.b(dvxj.g);
        final dvxf dvxfVarA = dvxeVarC.a();
        final int iA = (int) fbeo.a.get().a();
        eooy eooyVar = new eooy() { // from class: dvkl
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                UUID uuidRandomUUID = UUID.randomUUID();
                dwje dwjeVar2 = dwjeVar;
                dwfh dwfhVar = new dwfh(dwjeVar2, iA, str);
                dwcm dwcmVar = this.a.d.a;
                return dwcmVar.b(uuidRandomUUID, dwfhVar, eork.i(new dwcn((eymv) eymv.h(new eymu(), dwcmVar.d.c))), dwjeVar2, dvxfVarA, true);
            }
        };
        eosc eoscVar = this.a;
        return eooq.f(eork.n(eooyVar, eoscVar), new ejvr() { // from class: dvko
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvim dvimVar = (dvim) obj;
                String strB = dvimVar.b();
                boolean zC = ejwk.c(strB);
                dvkp dvkpVar = this.a;
                dwje dwjeVar2 = dwjeVar;
                if (zC) {
                    return dvimVar;
                }
                try {
                    dvim dvimVar2 = (dvim) ((eooi) dvkpVar.d(dwjeVar2, strB)).q();
                    dvif dvifVar = new dvif();
                    dvifVar.b(ekgb.j(ekeh.b(dvimVar.a(), dvimVar2.a())));
                    dvifVar.c(dvimVar2.b());
                    return dvifVar.a();
                } catch (InterruptedException | ExecutionException e) {
                    dvhv.d("LitBlockController", "Failed to sync block list", e);
                    return null;
                }
            }
        }, eoscVar);
    }
}
