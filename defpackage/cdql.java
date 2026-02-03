package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdql implements cdpy {
    public static final cqce a = cqce.g("Lighter", "LighterAccountsImpl");
    public final Context b;
    public final fcsu c;
    public final eosc d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cdql(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar) {
        this.b = context;
        this.e = fcsuVar;
        this.c = fcsuVar3;
        this.d = eoscVar;
        this.f = fcsuVar2;
        this.g = fcsuVar4;
    }

    public static Optional g(String str) {
        if (str == null || !cssc.a(str)) {
            a.m("This TikTok account doesn't have valid email address");
            return Optional.empty();
        }
        dwip dwipVar = new dwip();
        dwipVar.c(str);
        dwipVar.d("GMM");
        dwipVar.e(dwpj.EMAIL);
        return Optional.of(dwipVar.a());
    }

    @Override // defpackage.cdpy
    public final eiju a(final String str) {
        a.m("Attempting to get AccountContext by email");
        eiju eijuVarG = eiju.g(((egej) this.e.b()).c(str));
        final egbf egbfVar = (egbf) this.f.b();
        egbfVar.getClass();
        eooz eoozVar = new eooz() { // from class: cdpz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return egbfVar.h((efwo) obj);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarG.i(eoozVar, eoscVar).e(egdj.class, new ejvr() { // from class: cdqf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, eoqg.a).i(new eooz() { // from class: cdqb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(Optional.empty());
                }
                String str2 = str;
                final cdql cdqlVar = this.a;
                dviw dviwVarD = ((dvhb) cdqlVar.c.b()).d();
                final String strA = cqbk.a(cdqlVar.b, str2);
                final ejvr ejvrVar = new ejvr() { // from class: cdqg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return cqbk.a(cdqlVar.b, (String) obj2);
                    }
                };
                final dvpk dvpkVar = (dvpk) dviwVarD;
                return eiju.g(dvpkVar.l.submit(new Callable() { // from class: dvos
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dvpk dvpkVar2 = dvpkVar;
                        ekgb ekgbVarH = dvpkVar2.a.h();
                        int size = ekgbVarH.size();
                        int i = 0;
                        while (i < size) {
                            dwje dwjeVar = (dwje) ekgbVarH.get(i);
                            if (dwjeVar.b() == dwjd.INVALID) {
                                dvpkVar2.e(dwjeVar.c().f());
                            }
                            i++;
                            if (((String) ejvrVar.apply(((dwiq) dwjeVar.c().f()).a)).equals(strA)) {
                                dvpkVar2.h.a(dwjeVar);
                                return ejwi.j(dwjeVar);
                            }
                        }
                        return ejud.a;
                    }
                })).i(new eooz() { // from class: cdqh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ejwi ejwiVar = (ejwi) obj2;
                        if (!ejwiVar.g()) {
                            cdql.a.r("No account found");
                            return eijx.e(Optional.empty());
                        }
                        dwje dwjeVar = (dwje) ejwiVar.c();
                        if (dwjeVar.b() == dwjd.VALID) {
                            cdql.a.m("Found valid corresponding AccountContext");
                            return eijx.e(Optional.of(dwjeVar));
                        }
                        cdql.a.m("Corresponding AccountContext is invalid");
                        return eijx.e(Optional.empty());
                    }
                }, cdqlVar.d);
            }
        }, eoscVar);
    }

    @Override // defpackage.cdpy
    public final eiju b(efwo efwoVar) {
        return ((abzv) this.g.b()).a(efwoVar, etfw.a.a).h(new ejvr() { // from class: cdqa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((abzu) obj).equals(abzu.YES));
            }
        }, eoqg.a);
    }

    @Override // defpackage.cdpy
    public final eiju c(final dwpk dwpkVar) {
        final dvpk dvpkVar = (dvpk) ((dvhb) this.c.b()).d();
        return eiju.g(eork.n(new eooy() { // from class: dvoz
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final dvpk dvpkVar2 = dvpkVar;
                dwxd dwxdVar = dvpkVar2.a;
                final dwpk dwpkVar2 = dwpkVar;
                ejwi ejwiVarE = dwxdVar.e(dwpkVar2);
                if (ejwiVarE.g() && ((dwje) ejwiVarE.c()).b() == dwjd.VALID) {
                    dvis dvisVarB = dvit.b();
                    ((dvih) dvisVarB).a = 2;
                    return eork.i(dvisVarB.a());
                }
                dvyx dvyxVar = dvpkVar2.b;
                dwhp dwhpVarR = dwhq.r();
                dwhpVarR.g(7);
                dwhpVarR.n(dwpkVar2);
                dvyxVar.b(dwhpVarR.a());
                dvxe dvxeVarC = dvxf.c();
                ((dvxa) dvxeVarC).a = "register";
                dvxeVarC.b(dvxj.g);
                final dvxf dvxfVarA = dvxeVarC.a();
                final ListenableFuture listenableFutureN = eork.n(new eooy() { // from class: dvpa
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        dwpk dwpkVar3 = dwpkVar2;
                        dvxf dvxfVar = dvxfVarA;
                        dvpk dvpkVar3 = dvpkVar2;
                        cdpr cdprVar = dvpkVar3.n;
                        cdpp cdppVar = dvpkVar3.m;
                        dwds dwdsVar = dvpkVar3.o;
                        if (dwpkVar3.b() == dwpj.EMAIL) {
                            dwcm dwcmVar = dwdsVar.b;
                            return dwcmVar.d(UUID.randomUUID(), new dwgh(dwpkVar3, dwdsVar.c, cdppVar, dwdsVar.a.getPackageName(), cdprVar, dwds.a()), dwcmVar.d.d(), dwpkVar3, dvxfVar, true);
                        }
                        dwcm dwcmVar2 = dwdsVar.b;
                        return dwcmVar2.d(UUID.randomUUID(), new dwfz(dwpkVar3, dwdsVar.c, cdppVar, dwdsVar.a.getPackageName(), cdprVar, dwds.a()), dwcmVar2.d.d(), dwpkVar3, dvxfVar, false);
                    }
                }, dvpkVar2.l);
                ejvr ejvrVar = new ejvr() { // from class: dvpb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        dvqy dvqyVar = (dvqy) obj;
                        if (!dvqyVar.c().g() || !dvqyVar.b().g()) {
                            return null;
                        }
                        dvpk dvpkVar3 = dvpkVar2;
                        if (dvqyVar.a() != 0) {
                            if (dvqyVar.a() != 2) {
                                return null;
                            }
                            dvpkVar3.f((dwje) dvqyVar.c().c(), (dwju) dvqyVar.b().c());
                            return null;
                        }
                        Object objC = dvqyVar.c().c();
                        dvpkVar3.f((dwje) objC, (dwju) dvqyVar.b().c());
                        for (cdps cdpsVar : dvpkVar3.c) {
                        }
                        dvyx dvyxVar2 = dvpkVar3.b;
                        dwhp dwhpVarR2 = dwhq.r();
                        dwhpVarR2.g(1);
                        dwim dwimVar = (dwim) objC;
                        dwhpVarR2.n(dwimVar.b.f());
                        dwhpVarR2.o(dwimVar.c.E());
                        dvyxVar2.b(dwhpVarR2.a());
                        return null;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureF = eooq.f(listenableFutureN, ejvrVar, eoqgVar);
                return eork.b(listenableFutureF).a(new Callable() { // from class: dvpc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dvih dvihVar;
                        int i;
                        ListenableFuture listenableFuture = listenableFutureF;
                        dwpk dwpkVar3 = dwpkVar2;
                        ListenableFuture listenableFuture2 = listenableFutureN;
                        dvpk dvpkVar3 = dvpkVar2;
                        try {
                            eork.q(listenableFuture2);
                            try {
                                eork.q(listenableFuture);
                                dvqy dvqyVar = (dvqy) ((eooi) listenableFuture2).q();
                                dvis dvisVarB2 = dvit.b();
                                int iA = dvqyVar.a();
                                if (iA == 0) {
                                    dvihVar = (dvih) dvisVarB2;
                                    i = 2;
                                } else {
                                    if (iA == 1) {
                                        ((dvih) dvisVarB2).a = 3;
                                        return dvisVarB2.a();
                                    }
                                    dvihVar = (dvih) dvisVarB2;
                                    i = 4;
                                }
                                dvihVar.a = i;
                                return dvisVarB2.a();
                            } catch (ExecutionException e) {
                                dvhv.g("TyRegController", "Failed to store registration into registration store", e);
                                dvyx dvyxVar2 = dvpkVar3.b;
                                dwhp dwhpVarR2 = dwhq.r();
                                dwhpVarR2.g(8);
                                dwhpVarR2.n(dwpkVar3);
                                dvyxVar2.b(dwhpVarR2.a());
                                dvis dvisVarB3 = dvit.b();
                                ((dvih) dvisVarB3).a = 3;
                                return dvisVarB3.a();
                            }
                        } catch (ExecutionException e2) {
                            dvhv.g("TyRegController", "Failed to register", e2);
                            dvyx dvyxVar3 = dvpkVar3.b;
                            dwhp dwhpVarR3 = dwhq.r();
                            dwhpVarR3.g(8);
                            dwhpVarR3.n(dwpkVar3);
                            dvyxVar3.b(dwhpVarR3.a());
                            dvis dvisVarB4 = dvit.b();
                            ((dvih) dvisVarB4).a = 3;
                            return dvisVarB4.a();
                        }
                    }
                }, eoqgVar);
            }
        }, dvpkVar.l)).i(new eooz() { // from class: cdqi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((dvit) obj).a() == 2) {
                    return this.a.f(Optional.of(dwpkVar));
                }
                cdql.a.m("Unable to register user.");
                return eijx.e(Optional.empty());
            }
        }, this.d);
    }

    @Override // defpackage.cdpy
    public final eiju d(efwo efwoVar) {
        eiju eijuVarG = eiju.g(((egej) this.e.b()).b(efwoVar));
        ejvr ejvrVar = new ejvr() { // from class: cdqe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cdql.g((String) obj);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarG.h(ejvrVar, eoscVar).i(new eooz() { // from class: cdqc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                return optional.isPresent() ? this.a.c((dwpk) optional.get()) : eijx.e(Optional.empty());
            }
        }, eoscVar);
    }

    @Override // defpackage.cdpy
    public final eiju e(egbs egbsVar) {
        return f(g(((egej) this.e.b()).e(egbsVar))).i(new eooz() { // from class: cdqk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    cdql.a.m("This account can't be unregistered since it is not registered to Lighter.");
                    return eijx.e(false);
                }
                cdql cdqlVar = this.a;
                final dwje dwjeVar = (dwje) optional.get();
                dviw dviwVarD = ((dvhb) cdqlVar.c.b()).d();
                dvxe dvxeVarC = dvxf.c();
                ((dvxa) dvxeVarC).a = "unregister";
                dvxeVarC.b(dvxj.g);
                final dvxf dvxfVarA = dvxeVarC.a();
                final dvpk dvpkVar = (dvpk) dviwVarD;
                Iterator it = dvpkVar.k.values().iterator();
                while (it.hasNext()) {
                    ((dwdz) it.next()).e();
                }
                return eiju.g(eooq.f(dvpkVar.l.submit(new Callable() { // from class: dvpj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final dwje dwjeVar2 = dwjeVar;
                        dvpk dvpkVar2 = dvpkVar;
                        synchronized (dvpkVar2.f) {
                            dvpkVar2.i.put(Long.valueOf(dwjeVar2.a()), dvpkVar2.a.g(dwjeVar2));
                        }
                        if (!dvpkVar2.a.j(dwjeVar2)) {
                            return false;
                        }
                        final dvop dvopVar = (dvop) dvpkVar2.e;
                        dvopVar.c.submit(new Runnable() { // from class: dvof
                            @Override // java.lang.Runnable
                            public final void run() {
                                dvopVar.l(dwjeVar2).G();
                            }
                        });
                        for (cdps cdpsVar : dvpkVar2.c) {
                            ekgb ekgbVarG = dwjeVar2.c().g();
                            int i = ((ekoe) ekgbVarG).c;
                            for (int i2 = 0; i2 < i; i2++) {
                            }
                        }
                        return true;
                    }
                }), new ejvr() { // from class: dvot
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        if (!Boolean.TRUE.equals((Boolean) obj2)) {
                            dvij dvijVar = new dvij();
                            dvijVar.a = 2;
                            return dvijVar.a();
                        }
                        dvxf dvxfVar = dvxfVarA;
                        final dwje dwjeVar2 = dwjeVar;
                        final dvpk dvpkVar2 = dvpkVar;
                        UUID uuidRandomUUID = UUID.randomUUID();
                        dwgm dwgmVar = new dwgm(dwjeVar2);
                        dwcm dwcmVar = dvpkVar2.o.b;
                        dwcmVar.b(uuidRandomUUID, dwgmVar, dwcmVar.d.d(), dwjeVar2, dvxfVar, false).b(new Runnable() { // from class: dvow
                            @Override // java.lang.Runnable
                            public final void run() {
                                dvpk dvpkVar3 = dvpkVar2;
                                Object obj3 = dvpkVar3.f;
                                dwje dwjeVar3 = dwjeVar2;
                                synchronized (obj3) {
                                    dvpkVar3.i.remove(Long.valueOf(dwjeVar3.a()));
                                }
                            }
                        }, eoqg.a);
                        dvij dvijVar2 = new dvij();
                        dvijVar2.a = 1;
                        return dvijVar2.a();
                    }
                }, eoqg.a)).i(new eooz() { // from class: cdqd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        if (((dviv) obj2).a() != 2) {
                            return eijx.e(true);
                        }
                        cdql.a.m("Fail to unregister user");
                        return eijx.e(false);
                    }
                }, cdqlVar.d);
            }
        }, this.d);
    }

    public final eiju f(Optional optional) {
        if (optional.isEmpty()) {
            a.m("No contact Id is given. Return Optional.empty()");
            return eijx.e(Optional.empty());
        }
        dviw dviwVarD = ((dvhb) this.c.b()).d();
        final dwpk dwpkVar = (dwpk) optional.get();
        final dvpk dvpkVar = (dvpk) dviwVarD;
        return eiju.g(eork.n(new eooy() { // from class: dvpd
            /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[Catch: all -> 0x01e1, Exception -> 0x01e3, PHI: r9
              0x00f3: PHI (r9v7 ejud) = (r9v5 ejud), (r9v8 ejud) binds: [B:41:0x010b, B:33:0x00f1] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x01e3, blocks: (B:24:0x00a4, B:34:0x00f3, B:47:0x0119, B:58:0x0137, B:81:0x01e0, B:80:0x01dd), top: B:96:0x00a4, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01b2  */
            @Override // defpackage.eooy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 503
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dvpd.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, dvpkVar.l)).h(new ejvr() { // from class: cdqj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                return ejwiVar.g() ? Optional.of((dwje) ejwiVar.c()) : Optional.empty();
            }
        }, this.d);
    }
}
