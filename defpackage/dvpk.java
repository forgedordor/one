package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvpk implements dviw, dvpz {
    public final dwxd a;
    public final dvyx b;
    public final List c;
    public dviq e;
    public dvio h;
    public final Map k;
    public final cdpp m;
    public final cdpr n;
    public final dwds o;
    public final Object f = new Object();
    public final Object g = new Object();
    final Map i = new HashMap();
    final Map j = new HashMap();
    public final eosc l = dvie.b().a;
    private final Map p = new HashMap();
    public final Random d = new Random();

    public dvpk(Map map, dwds dwdsVar, dwxd dwxdVar, cdpp cdppVar, cdpr cdprVar, dvyx dvyxVar, cdps cdpsVar) {
        this.k = map;
        this.o = dwdsVar;
        this.a = dwxdVar;
        this.m = cdppVar;
        this.n = cdprVar;
        this.b = dvyxVar;
        this.c = ekjz.c(cdpsVar);
    }

    public static final boolean g(dwju dwjuVar) {
        dvhn.a();
        return dwjuVar.e().compareTo(Instant.ofEpochMilli(System.currentTimeMillis()).minusMillis(fbfd.a.get().a())) <= 0;
    }

    @Override // defpackage.dviw
    public final ListenableFuture a() {
        return this.l.submit(new Callable() { // from class: dvov
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekfw ekfwVar = new ekfw();
                dvpk dvpkVar = this.a;
                ekgb ekgbVarH = dvpkVar.a.h();
                ekfwVar.j(ekgbVarH);
                int size = ekgbVarH.size();
                for (int i = 0; i < size; i++) {
                    dwje dwjeVar = (dwje) ekgbVarH.get(i);
                    if (dwjeVar.b() == dwjd.INVALID) {
                        dvpkVar.e(dwjeVar.c().f());
                    }
                }
                return ekfwVar.g();
            }
        });
    }

    public final ListenableFuture b(final dwje dwjeVar, final dwju dwjuVar, final int i) {
        ListenableFuture listenableFuture;
        final ListenableFuture listenableFutureF;
        ListenableFuture listenableFutureA;
        final dwje dwjeVar2 = dwjeVar;
        synchronized (this.g) {
            listenableFuture = (ListenableFuture) this.j.get(dwjeVar2);
            if (listenableFuture == null || listenableFuture.isDone()) {
                dvyx dvyxVar = this.b;
                dwhp dwhpVarR = dwhq.r();
                dwhpVarR.g(12);
                dwhpVarR.f(i);
                dwhpVarR.n(dwjeVar2.c().f());
                dwhpVarR.o(dwjeVar2.d().E());
                dvyxVar.b(dwhpVarR.a());
                if (dwjuVar.g() == 1) {
                    dvhv.a("TyRegController", "User has no key.");
                    dwhp dwhpVarR2 = dwhq.r();
                    dwhpVarR2.g(14);
                    dwhpVarR2.f(i);
                    dwhpVarR2.n(dwjeVar2.c().f());
                    dwhpVarR2.o(dwjeVar2.d().E());
                    dvyxVar.b(dwhpVarR2.a());
                    dwhp dwhpVarR3 = dwhq.r();
                    dwhpVarR3.g(10016);
                    dwhpVarR3.n(dwjeVar2.c().f());
                    dwhpVarR3.o(dwjeVar2.d().E());
                    dvyxVar.b(dwhpVarR3.a());
                    d(dwjeVar2.c().f());
                    synchronized (this.f) {
                        this.i.remove(Long.valueOf(dwjeVar2.a()));
                    }
                    dvqv dvqvVarE = dvqw.e();
                    ((dvqi) dvqvVarE).d = 3;
                    listenableFutureA = eork.i(dvqvVarE.a());
                } else {
                    dvxe dvxeVarC = dvxf.c();
                    ((dvxa) dvxeVarC).a = "register refresh";
                    dvxeVarC.b(dvxj.g);
                    final dvxf dvxfVarA = dvxeVarC.a();
                    final dwds dwdsVar = this.o;
                    final cdpp cdppVar = this.m;
                    dvhn.a();
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                    dwpk dwpkVarF = dwjeVar2.c().f();
                    if (dwjuVar.g() != 2) {
                        dvqv dvqvVarE2 = dvqw.e();
                        ((dvqi) dvqvVarE2).d = 3;
                        listenableFutureF = eork.i(dvqvVarE2.a());
                    } else {
                        dwcm dwcmVar = dwdsVar.b;
                        final ListenableFuture listenableFutureH = dwcmVar.h(UUID.randomUUID(), new dwfx(dwjeVar2, dwdsVar.c, cdppVar, dwdsVar.a.getPackageName(), dwjuVar.f(), instantOfEpochMilli), dwcmVar.d.d(), dwjeVar, dwjuVar, dvxfVarA);
                        dwjeVar2 = dwjeVar;
                        listenableFutureF = dwcmVar.f(eork.d(listenableFutureH).b(new eooy() { // from class: dwdq
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                ListenableFuture listenableFuture2 = listenableFutureH;
                                dvqw dvqwVar = (dvqw) eork.q(listenableFuture2);
                                if (dvqwVar.d() != 4) {
                                    return listenableFuture2;
                                }
                                dvxf dvxfVar = dvxfVarA;
                                dwju dwjuVar2 = dwjuVar;
                                cdpp cdppVar2 = cdppVar;
                                dwje dwjeVar3 = dwjeVar;
                                dwds dwdsVar2 = dwdsVar;
                                UUID uuidRandomUUID = UUID.randomUUID();
                                dwfx dwfxVar = new dwfx(dwjeVar3, dwdsVar2.c, cdppVar2, dwdsVar2.a.getPackageName(), dwjuVar2.f(), eonw.b(((Long) dvqwVar.c().c()).longValue()));
                                dwcm dwcmVar2 = dwdsVar2.b;
                                final ListenableFuture listenableFutureH2 = dwcmVar2.h(uuidRandomUUID, dwfxVar, dwcmVar2.d.d(), dwjeVar3, dwjuVar2, dvxfVar);
                                return eork.d(listenableFutureH2).b(new eooy() { // from class: dwdp
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        ListenableFuture listenableFuture3 = listenableFutureH2;
                                        if (((dvqw) eork.q(listenableFuture3)).d() != 4) {
                                            return listenableFuture3;
                                        }
                                        dvqv dvqvVarE3 = dvqw.e();
                                        ((dvqi) dvqvVarE3).d = 3;
                                        return eork.i(dvqvVarE3.a());
                                    }
                                }, eoqg.a);
                            }
                        }, eoqg.a), dwpkVarF, felx.REGISTRATION_UNAUTHENTICATED);
                    }
                    ejvr ejvrVar = new ejvr() { // from class: dvpg
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            dvqw dvqwVar = (dvqw) obj;
                            if (dvqwVar.d() != 2 || !dvqwVar.a().g() || !dvqwVar.b().g()) {
                                return null;
                            }
                            dwje dwjeVar3 = dwjeVar2;
                            int i2 = i;
                            dvpk dvpkVar = this.a;
                            dvpkVar.f((dwje) dvqwVar.a().c(), (dwju) dvqwVar.b().c());
                            dwhp dwhpVarR4 = dwhq.r();
                            dwhpVarR4.g(13);
                            dwhpVarR4.f(i2);
                            dwhpVarR4.n(dwjeVar3.c().f());
                            dwhpVarR4.o(dwjeVar3.d().E());
                            dvpkVar.b.b(dwhpVarR4.a());
                            return null;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    final ListenableFuture listenableFutureF2 = eooq.f(listenableFutureF, ejvrVar, eoqgVar);
                    final dwje dwjeVar3 = dwjeVar2;
                    dwjeVar2 = dwjeVar3;
                    listenableFutureA = eork.b(listenableFutureF2).a(new Callable() { // from class: dvph
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ListenableFuture listenableFuture2 = listenableFutureF2;
                            dwje dwjeVar4 = dwjeVar3;
                            int i2 = i;
                            ListenableFuture listenableFuture3 = listenableFutureF;
                            dvpk dvpkVar = this.a;
                            try {
                                eork.q(listenableFuture3);
                                try {
                                    eork.q(listenableFuture2);
                                    return (dvqw) eork.q(listenableFuture3);
                                } catch (ExecutionException e) {
                                    dvhv.g("TyRegController", "Failed to store registration into registration store", e);
                                    dvyx dvyxVar2 = dvpkVar.b;
                                    dwhp dwhpVarR4 = dwhq.r();
                                    dwhpVarR4.g(14);
                                    dwhpVarR4.f(i2);
                                    dwhpVarR4.n(dwjeVar4.c().f());
                                    dwhpVarR4.o(dwjeVar4.d().E());
                                    dvyxVar2.b(dwhpVarR4.a());
                                    dvqv dvqvVarE3 = dvqw.e();
                                    ((dvqi) dvqvVarE3).d = 3;
                                    return dvqvVarE3.a();
                                }
                            } catch (ExecutionException e2) {
                                dvhv.g("TyRegController", "Failed to register refresh", e2);
                                dvyx dvyxVar3 = dvpkVar.b;
                                dwhp dwhpVarR5 = dwhq.r();
                                dwhpVarR5.g(14);
                                dwhpVarR5.f(i2);
                                dwhpVarR5.n(dwjeVar4.c().f());
                                dwhpVarR5.o(dwjeVar4.d().E());
                                dvyxVar3.b(dwhpVarR5.a());
                                dvqv dvqvVarE4 = dvqw.e();
                                ((dvqi) dvqvVarE4).d = 3;
                                return dvqvVarE4.a();
                            }
                        }
                    }, eoqgVar);
                }
                listenableFuture = listenableFutureA;
                this.j.put(dwjeVar2, listenableFuture);
            } else {
                dvhv.a("TyRegController", "RegisterRefresh already pending");
            }
        }
        return listenableFuture;
    }

    @Override // defpackage.dvpz
    public final ListenableFuture c(final dwje dwjeVar, boolean z) {
        ejwi ejwiVarG;
        synchronized (this.f) {
            Map map = this.i;
            ejwiVarG = (ejwi) map.get(Long.valueOf(dwjeVar.a()));
            if (ejwiVarG == null || !ejwiVarG.g()) {
                ejwiVarG = this.a.g(dwjeVar);
                map.put(Long.valueOf(dwjeVar.a()), ejwiVarG);
            }
        }
        if (!ejwiVarG.g()) {
            return eork.h(new RuntimeException("Missing Auth Token"));
        }
        final dwju dwjuVar = (dwju) ejwiVarG.c();
        if (!z) {
            dvhn.a();
            Instant instantPlusMillis = Instant.ofEpochMilli(System.currentTimeMillis()).plusMillis(fbfd.a.get().b());
            if (dwjuVar.g() != 1 && dwjuVar.d().compareTo(instantPlusMillis) > 0) {
                if (!g(dwjuVar)) {
                    return eork.i(dwjuVar);
                }
                eork.n(new eooy() { // from class: dvpf
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return this.a.b(dwjeVar, dwjuVar, 109);
                    }
                }, this.l);
                return eork.i(dwjuVar);
            }
        }
        return eooq.f(b(dwjeVar, dwjuVar, 110), new ejvr() { // from class: dvpe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvqw dvqwVar = (dvqw) obj;
                int iD = dvqwVar.d();
                dwje dwjeVar2 = dwjeVar;
                if (iD == 2 && dvqwVar.b().g()) {
                    return dvqwVar.b().c();
                }
                dvpk dvpkVar = this.a;
                synchronized (dvpkVar.g) {
                    dvpkVar.j.remove(dwjeVar2);
                }
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.dvpz
    public final void d(final dwpk dwpkVar) {
        this.l.submit(new Runnable() { // from class: dvou
            @Override // java.lang.Runnable
            public final void run() {
                ContentValues contentValues = new ContentValues();
                contentValues.put("server_registration_status", Integer.valueOf(dwjd.INVALID.c));
                dvpk dvpkVar = this.a;
                dvtk dvtkVar = (dvtk) dvpkVar.a;
                dwpk dwpkVar2 = dwpkVar;
                if (dvtkVar.k(dwpkVar2, contentValues)) {
                    dvpkVar.e(dwpkVar2);
                }
            }
        });
    }

    public final void e(dwpk dwpkVar) {
        Map map = this.p;
        if (!map.containsKey(dwpkVar)) {
            eost eostVar = new eost(new eosl());
            ejwl.b(true, "rate must be positive");
            synchronized (eostVar.b()) {
                eostVar.f(eostVar.a.a());
                double d = 0.01d;
                eostVar.d = TimeUnit.SECONDS.toMicros(1L) / 0.01d;
                double d2 = eostVar.c;
                eostVar.c = 0.01d;
                if (d2 != Double.POSITIVE_INFINITY) {
                    d = d2 == 0.0d ? 0.0d : (eostVar.b * 0.01d) / d2;
                }
                eostVar.b = d;
            }
            map.put(dwpkVar, eostVar);
        }
        eosn eosnVar = (eosn) this.p.get(dwpkVar);
        long jMax = Math.max(TimeUnit.MICROSECONDS.toMicros(0L), 0L);
        ejwl.d(true, "Requested permits (%s) must be positive", 1);
        synchronized (eosnVar.b()) {
            long jA = eosnVar.a.a();
            if (eosnVar.c() - jMax <= jA) {
                long jMax2 = Math.max(eosnVar.d(jA) - jA, 0L);
                if (jMax2 > 0) {
                    eote.c(jMax2, TimeUnit.MICROSECONDS);
                }
                for (cdps cdpsVar : this.c) {
                    if (((Boolean) cdpsVar.a.b()).booleanValue()) {
                        cqce cqceVar = cdpt.a;
                        cqceVar.m("Lighter registration invalided");
                        Optional optional = cdpsVar.b;
                        if (optional.isPresent()) {
                            cqceVar.m("Attempting to re-register invalided Lighter account");
                            auvh.h(((cdpy) optional.get()).c(dwpkVar));
                        } else {
                            cqceVar.r("unable to access LighterAccounts to re-register invalidated account");
                        }
                    }
                }
            }
        }
    }

    public final void f(final dwje dwjeVar, final dwju dwjuVar) {
        final dvtk dvtkVar = (dvtk) this.a;
        Long l = (Long) dvtq.a(dvtkVar.a, new Callable() { // from class: dvtj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long jC;
                dwje dwjeVar2 = dwjeVar;
                dvtk dvtkVar2 = dvtkVar;
                dwjh dwjhVar = ((dwim) dwjeVar2).b;
                Cursor cursorB = dvtkVar2.b(dwjhVar);
                try {
                    boolean zMoveToFirst = cursorB.moveToFirst();
                    dwju dwjuVar2 = dwjuVar;
                    if (zMoveToFirst) {
                        jC = cursorB.getInt(dvwy.a(1));
                        dvtm dvtmVar = dvtkVar2.a;
                        ejwl.l(dvtmVar.g());
                        dvtmVar.b(dvtkVar2.d("registration"), dvux.a(dwjeVar2, dwjuVar2), "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(jC), dwjeVar2.f()});
                        dvtkVar2.i(jC, dwjhVar);
                    } else {
                        dvtm dvtmVar2 = dvtkVar2.a;
                        ejwl.l(dvtmVar2.g());
                        jC = dvtmVar2.c(dvtkVar2.d("registration"), dvux.a(dwjeVar2, dwjuVar2), 0);
                        dvtkVar2.i(jC, dwjhVar);
                    }
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    return Long.valueOf(jC);
                } catch (Throwable th) {
                    if (cursorB != null) {
                        try {
                            cursorB.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        });
        l.longValue();
        synchronized (this.f) {
            this.i.put(l, ejwi.j(dwjuVar));
        }
    }
}
