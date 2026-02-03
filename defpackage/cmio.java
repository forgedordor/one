package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmio implements cmfo {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    public final eosc c;
    public final eosc d;
    public final cmfn e;
    public final String f;
    public final evuh g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final cmit i;
    public eiju j;
    private final Executor k;
    private final Optional l;
    private final cmir m;

    public cmio(fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, cmgh cmghVar) {
        this.b = fcsuVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.k = new eoss(eoscVar);
        cmfm cmfmVar = (cmfm) cmghVar;
        this.e = cmfmVar.a;
        this.f = (String) cmfmVar.b.orElse("");
        this.g = cmfmVar.c;
        this.l = cmfmVar.e;
        Optional optional = cmfmVar.d;
        optional.getClass();
        cmis cmisVar = (cmis) fdct.b(optional);
        if (cmisVar instanceof cmir) {
            this.m = (cmir) cmisVar;
            this.i = null;
        } else if (cmisVar instanceof cmit) {
            this.i = (cmit) cmisVar;
            this.m = new cmid(this);
        } else {
            this.m = null;
            this.i = null;
        }
    }

    private final bubz y() {
        String[] strArr = bucf.a;
        buca bucaVar = new buca(bucf.a);
        bucaVar.A("getReadRowQuery");
        bucaVar.c(new Function() { // from class: cmgz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buce buceVar = (buce) obj;
                cmio cmioVar = this.a;
                buceVar.b(cmioVar.e.a());
                buceVar.c(cmioVar.f);
                return buceVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bucaVar.b();
    }

    @Override // defpackage.cmfo
    public final evuh a(fdap fdapVar) {
        if (!((dqsn) this.b.b()).i()) {
            throw new IllegalStateException("Check failed.");
        }
        try {
            evuh evuhVar = (evuh) fdapVar.invoke(l());
            if (v(evuhVar)) {
                return evuhVar;
            }
        } catch (evtj e) {
            ((eksl) ((eksl) a.j()).g(e)).D("Failed to update data store due to invalid data. key = %s, subkey = %s", this.e, cqcv.e(this.f));
        }
        throw new IllegalStateException("Failed to update data in settings store");
    }

    @Override // defpackage.cmfo
    public final Object b(fcxy fcxyVar) {
        Object objC;
        eiju eijuVarF = f();
        return (eijuVarF == null || (objC = fdxs.c(eijuVarF, fcxyVar)) != fcyl.a) ? fctx.a : objC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cmfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cmik
            if (r0 == 0) goto L13
            r0 = r5
            cmik r0 = (defpackage.cmik) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmik r0 = new cmik
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fdpl r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmio.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cmfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmin
            if (r0 == 0) goto L13
            r0 = r6
            cmin r0 = (defpackage.cmin) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmin r0 = new cmin
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmht r6 = new cmht
            r6.<init>()
            eiju r5 = r4.j(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmio.d(fdap, fcxy):java.lang.Object");
    }

    @Override // defpackage.cmfo
    public final fdpl e() {
        return fdqc.a(new cmij(new cmig(dqwp.a(y()), this), this));
    }

    @Override // defpackage.cmip
    public final eiju f() {
        return eijx.g(new Callable() { // from class: cmha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.n();
                return null;
            }
        }, this.k);
    }

    @Override // defpackage.cmip
    public final eiju g() {
        eiju eijuVarG = eijx.g(new Callable() { // from class: cmhp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = bucf.a;
                buca bucaVar = new buca(bucf.a);
                bucaVar.A("getAllExistingDataAsync");
                final cmio cmioVar = this.a;
                bucaVar.c(new Function() { // from class: cmhc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buce buceVar = (buce) obj;
                        buceVar.b(cmioVar.e.a());
                        return buceVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bucaVar.b().z();
            }
        }, this.c);
        final fdap fdapVar = new fdap() { // from class: cmhq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List<buax> list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.getClass();
                cmio cmioVar = this.a;
                for (buax buaxVar : list) {
                    try {
                        byte[] bArrM = buaxVar.m();
                        if (bArrM != null) {
                            String strK = buaxVar.k();
                            if (strK == null) {
                                strK = "";
                            }
                            linkedHashMap.put(strK, cmioVar.p(bArrM));
                        }
                    } catch (evtj unused) {
                    }
                }
                return ekfv.e(linkedHashMap);
            }
        };
        return eijuVarG.h(new ejvr() { // from class: cmhr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cmio.a;
                return fdapVar.invoke(obj);
            }
        }, this.d);
    }

    @Override // defpackage.cmip
    public final eiju h() {
        a.n().D("Reading row. key = %s, subkey = %s", this.e, cqcv.e(this.f));
        eiju eijuVarG = eijx.g(new Callable() { // from class: cmhg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.s();
            }
        }, this.c);
        if (x()) {
            final fdap fdapVar = new fdap() { // from class: cmhh
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    Optional optional = (Optional) obj;
                    optional.getClass();
                    return this.a.o(optional);
                }
            };
            return eijuVarG.i(new eooz() { // from class: cmhi
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    eksp ekspVar = cmio.a;
                    return fdapVar.invoke(obj);
                }
            }, this.d);
        }
        final fdap fdapVar2 = new fdap() { // from class: cmhj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return (evuh) ((Optional) obj).orElse(this.a.g);
            }
        };
        return eijuVarG.h(new ejvr() { // from class: cmhk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cmio.a;
                return fdapVar2.invoke(obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cmip
    public final eiju i(final String str) {
        str.getClass();
        String str2 = this.f;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str2.equals(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        eiju eijuVarG = eijx.g(new Callable() { // from class: cmgy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cmio cmioVar = this.a;
                dqsn dqsnVar = (dqsn) cmioVar.b.b();
                final String str3 = str;
                dqsnVar.d("moveDataFromSync", new Runnable() { // from class: cmgu
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String[] strArr = bucf.a;
                        buce buceVar = new buce();
                        cmio cmioVar2 = cmioVar;
                        buceVar.b(cmioVar2.e.a());
                        buceVar.c(str3);
                        bucd bucdVar = new bucd(buceVar);
                        buca bucaVar = new buca(bucf.a);
                        bucaVar.A("moveDataFromSync#update");
                        bubm[] bubmVarArr = {bucf.c.d};
                        int iA = bucf.b().a();
                        Integer.valueOf(iA).getClass();
                        if (((Integer) bucf.b.getOrDefault(bubmVarArr[0].toString(), -1)).intValue() > iA) {
                            dqru.x("columnReference.toString()", iA);
                        }
                        bucaVar.m(bubmVarArr);
                        bucaVar.k(bucdVar);
                        ekgb ekgbVarZ = bucaVar.b().z();
                        byte[] bArrM = ekgbVarZ.size() == 1 ? ((buax) ekgbVarZ.get(0)).m() : null;
                        if (bArrM != null) {
                            cmioVar2.w(bArrM);
                            bubv bubvVar = new bubv();
                            bubvVar.f("moveDataFromSync#delete");
                            bubvVar.b = bucdVar;
                            bubvVar.d();
                        }
                    }
                });
                return cmioVar.s();
            }
        }, this.k);
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cmip
    public final eiju j(final ejvr ejvrVar) {
        if (x()) {
            eiju eijuVarH = h();
            final fdap fdapVar = new fdap() { // from class: cmhl
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return this.a.r(ejvrVar);
                }
            };
            return eijuVarH.h(new ejvr() { // from class: cmhn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = cmio.a;
                    return fdapVar.invoke(obj);
                }
            }, this.k);
        }
        eiju eijuVarG = eijx.g(new Callable() { // from class: cmho
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.r(ejvrVar);
            }
        }, this.k);
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.cmip
    public final ekgp k() {
        String[] strArr = bucf.a;
        buca bucaVar = new buca(bucf.a);
        bucaVar.A("getAllExistingDataSync");
        bucaVar.c(new Function() { // from class: cmgs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buce buceVar = (buce) obj;
                buceVar.b(this.a.e.a());
                return buceVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<buax> ekgbVarZ = bucaVar.b().z();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ekgbVarZ.getClass();
        for (buax buaxVar : ekgbVarZ) {
            try {
                byte[] bArrM = buaxVar.m();
                if (bArrM != null) {
                    String strK = buaxVar.k();
                    if (strK == null) {
                        strK = "";
                    }
                    linkedHashMap.put(strK, p(bArrM));
                }
            } catch (evtj unused) {
            }
        }
        return ekfv.e(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Type inference failed for: r0v8, types: [evuh, java.lang.Object] */
    @Override // defpackage.cmip
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.evuh l() {
        /*
            r4 = this;
            j$.util.Optional r0 = r4.s()
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r0.get()
            return r0
        Lf:
            cmit r1 = r4.i
            if (r1 == 0) goto L45
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.h
            boolean r2 = r1.get()
            if (r2 != 0) goto L45
            cmgw r0 = new cmgw
            r0.<init>()
            cmgx r2 = new cmgx
            r2.<init>()
            evuh r0 = r4.r(r2)
            r2 = 1
            r1.set(r2)
            r4.u(r0)     // Catch: java.lang.Throwable -> L31
            goto L3d
        L31:
            r1 = move-exception
            eksp r2 = defpackage.cmio.a
            ekrw r2 = r2.j()
            java.lang.String r3 = "Failed to clear previous data."
            defpackage.a.N(r2, r3, r1)
        L3d:
            r0.getClass()
            j$.util.Optional r0 = j$.util.Optional.of(r0)
            goto L5a
        L45:
            cmir r1 = r4.m
            if (r1 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.h
            boolean r1 = r1.get()
            if (r1 == 0) goto L52
            goto L5a
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Async migration is not done"
            r0.<init>(r1)
            throw r0
        L5a:
            evuh r1 = r4.g
            java.lang.Object r0 = r0.orElse(r1)
            r0.getClass()
            evuh r0 = (defpackage.evuh) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmio.l():evuh");
    }

    @Override // defpackage.cmip
    public final evuh m(final ejvr ejvrVar) {
        Object objC = ((dqsn) this.b.b()).c("SettingsStoreImpl#updateDataSync", new ejxr() { // from class: cmhs
            @Override // defpackage.ejxr
            public final Object get() {
                final ejvr ejvrVar2 = ejvrVar;
                return this.a.a(new fdap() { // from class: cmhd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        evuh evuhVar = (evuh) obj;
                        eksp ekspVar = cmio.a;
                        evuhVar.getClass();
                        Object objApply = ejvrVar2.apply(evuhVar);
                        objApply.getClass();
                        return (evuh) objApply;
                    }
                });
            }
        });
        objC.getClass();
        return (evuh) objC;
    }

    @Override // defpackage.cmip
    public final void n() {
        String[] strArr = bucf.a;
        bubv bubvVar = new bubv();
        bubvVar.f("clearSync");
        bubvVar.b = new bucd((buce) new Function() { // from class: cmhm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr2 = bucf.a;
                buce buceVar = new buce();
                cmio cmioVar = this.a;
                buceVar.b(cmioVar.e.a());
                buceVar.c(cmioVar.f);
                return buceVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new buce()));
        bubvVar.d();
    }

    public final eiju o(Optional optional) {
        if (optional.isPresent()) {
            a.n().q("Skip migration because settings store has value.");
            this.h.set(true);
            eiju eijuVarE = eijx.e(optional.get());
            eijuVarE.getClass();
            return eijuVarE;
        }
        final cmir cmirVar = this.m;
        if (cmirVar == null || this.h.get()) {
            ((eksl) a.j()).H("Migration cannot be run because it is not set or has already run. migration is null = %s, migration has run = %s", cmirVar == null, this.h.get());
            eiju eijuVarE2 = eijx.e(this.g);
            eijuVarE2.getClass();
            return eijuVarE2;
        }
        eiju eijuVar = this.j;
        if (eijuVar != null) {
            return eijuVar;
        }
        a.n().D("Run migration. key = %s, subkey = %s", this.e, cqcv.e(this.f));
        try {
            eiju eijuVarB = cmirVar.b();
            final fdap fdapVar = new fdap() { // from class: cmhu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((eksl) ((eksl) cmio.a.j()).g((evtj) obj)).q("Failed to get the previous data to migrate. The previous data is ignored.");
                    return this.a.g;
                }
            };
            ejvr ejvrVar = new ejvr() { // from class: cmhv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = cmio.a;
                    return fdapVar.invoke(obj);
                }
            };
            eosc eoscVar = this.d;
            eiju eijuVarE3 = eijuVarB.e(evtj.class, ejvrVar, eoscVar);
            final fdap fdapVar2 = new fdap() { // from class: cmhw
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    final evuh evuhVar = (evuh) obj;
                    final cmio cmioVar = this.a;
                    final cmir cmirVar2 = cmirVar;
                    final fdap fdapVar3 = new fdap() { // from class: cmhe
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            cmio cmioVar2 = cmioVar;
                            evuh evuhVar2 = (evuh) obj2;
                            if (cmioVar2.u(evuhVar2)) {
                                evuhVar2 = evuhVar;
                                if (cmioVar2.u(evuhVar2)) {
                                    return cmioVar2.g;
                                }
                                cmir cmirVar3 = cmirVar2;
                                cmio.a.n().t("Migrating data. key = %s", cmioVar2.e);
                                cmirVar3.c();
                            }
                            return evuhVar2;
                        }
                    };
                    return cmioVar.r(new ejvr() { // from class: cmhf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cmio.a;
                            return fdapVar3.invoke(obj2);
                        }
                    });
                }
            };
            eiju eijuVarH = eijuVarE3.h(new ejvr() { // from class: cmhx
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = cmio.a;
                    return fdapVar2.invoke(obj);
                }
            }, this.k);
            final fdap fdapVar3 = new fdap() { // from class: cmhy
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cmio cmioVar = this.a;
                    cmioVar.h.set(true);
                    if (cmioVar.u((evuh) obj)) {
                        return eijx.e(null);
                    }
                    cmir cmirVar2 = cmirVar;
                    ((eksl) cmio.a.h()).q("Removing previous data.");
                    eiju eijuVarA = cmirVar2.a();
                    final fdap fdapVar4 = new fdap() { // from class: cmgq
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            ((eksl) ((eksl) cmio.a.j()).g((Throwable) obj2)).q("Failed to clear previous data.");
                            return null;
                        }
                    };
                    return eijuVarA.e(Throwable.class, new ejvr() { // from class: cmhb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cmio.a;
                            fdapVar4.invoke(obj2);
                            return null;
                        }
                    }, cmioVar.d);
                }
            };
            eiju eijuVarI = eijuVarH.i(new eooz() { // from class: cmhz
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    eksp ekspVar = cmio.a;
                    return fdapVar3.invoke(obj);
                }
            }, eoscVar);
            final fdap fdapVar4 = new fdap() { // from class: cmia
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return eijx.e(this.a.q());
                }
            };
            eiju eijuVarI2 = eijuVarI.i(new eooz() { // from class: cmgr
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    eksp ekspVar = cmio.a;
                    return fdapVar4.invoke(obj);
                }
            }, this.c);
            this.j = eijuVarI2;
            eijuVarI2.k(new cmim(this), eoscVar);
            return eijuVarI2;
        } catch (Exception e) {
            ((eksl) ((eksl) a.j()).g(e)).q("Failed to call migration");
            this.j = null;
            eiju eijuVarD = eijx.d(e);
            eijuVarD.getClass();
            return eijuVarD;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r2v2, types: [evuh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [evuh, java.lang.Object] */
    public final evuh p(byte[] bArr) throws evtj {
        if (!this.l.isPresent()) {
            ?? H = this.g.getParserForType().h(bArr);
            H.getClass();
            return H;
        }
        try {
            ?? H2 = this.g.getParserForType().h(bArr);
            H2.getClass();
            return H2;
        } catch (evtj e) {
            evtj evtjVar = (evtj) this.l.get().get();
            evtjVar.getClass();
            fcsw.a(evtjVar, e);
            throw evtjVar;
        }
    }

    public final evuh q() {
        Object objOrElse = s().orElse(this.g);
        objOrElse.getClass();
        return (evuh) objOrElse;
    }

    public final evuh r(final ejvr ejvrVar) {
        return (evuh) ((dqsn) this.b.b()).c("SettingsStoreImpl#updateDataSyncInternal", new ejxr() { // from class: cmgv
            @Override // defpackage.ejxr
            public final Object get() {
                cmio cmioVar = this.a;
                try {
                    evuh evuhVar = (evuh) ejvrVar.apply(cmioVar.q());
                    evuhVar.getClass();
                    if (cmioVar.v(evuhVar)) {
                        return evuhVar;
                    }
                } catch (evtj e) {
                    ((eksl) ((eksl) cmio.a.j()).g(e)).D("Failed to update data store due to invalid data. key = %s, subkey = %s", cmioVar.e, cqcv.e(cmioVar.f));
                }
                throw new IllegalStateException("Failed to update data in settings store");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional s() {
        ekgb ekgbVarZ = y().z();
        if (ekgbVarZ == null || ekgbVarZ.isEmpty()) {
            return Optional.empty();
        }
        if (ekgbVarZ.size() > 1) {
            throw new IllegalStateException("Found more than one instance of data");
        }
        byte[] bArrM = ((buax) ekgbVarZ.get(0)).m();
        return Optional.of(bArrM != null ? p(bArrM) : this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.bubz r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmil
            if (r0 == 0) goto L13
            r0 = r6
            cmil r0 = (defpackage.cmil) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmil r0 = new cmil
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            eiju r5 = r5.x()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L83
        L41:
            ekgb r6 = (defpackage.ekgb) r6
            r5 = 0
            if (r6 == 0) goto L82
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4d
            goto L82
        L4d:
            int r0 = r6.size()
            if (r0 > r3) goto L65
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            buax r6 = (defpackage.buax) r6
            byte[] r6 = r6.m()
            if (r6 == 0) goto L64
            evuh r5 = r4.p(r6)
        L64:
            return r5
        L65:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r6.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected one entry, found "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L82:
            return r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmio.t(bubz, fcxy):java.lang.Object");
    }

    public final boolean u(evuh evuhVar) {
        return evuhVar == null || this.g.equals(evuhVar);
    }

    public final boolean v(evuh evuhVar) {
        byte[] byteArray = evuhVar.toByteArray();
        byteArray.getClass();
        return w(byteArray);
    }

    public final boolean w(byte[] bArr) {
        eksp ekspVar = a;
        ekrw ekrwVarN = ekspVar.n();
        cmfn cmfnVar = this.e;
        String str = this.f;
        ekrwVarN.D("Saving row. key = %s, subkey = %s", cmfnVar, cqcv.e(str));
        String[] strArr = bucf.a;
        bucc buccVar = new bucc();
        buccVar.ap("SettingsStoreImpl#saveRow");
        buccVar.af(new bucd((buce) new Function() { // from class: cmgt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buce buceVar = (buce) obj;
                cmio cmioVar = this.a;
                buceVar.b(cmioVar.e.a());
                buceVar.c(cmioVar.f);
                return buceVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new buce())));
        buccVar.a.put(GroupManagementRequest.DATA_TAG, bArr);
        if (buccVar.b().e() != 0) {
            ekspVar.n().q("Updated settings data");
            return true;
        }
        buba bubaVar = new buba();
        bubaVar.c(cmfnVar.a());
        bubaVar.d(str);
        bubaVar.b(bArr);
        final buax buaxVarA = bubaVar.a();
        final dqsy dqsyVarA = bucf.a();
        long jB = dqru.b(bucf.a(), "settings", buaxVarA, new Function() { // from class: buav
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.O("settings", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: buaw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    buax buaxVar = buaxVarA;
                    buaxVar.a = l.longValue();
                    buaxVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Long lValueOf = Long.valueOf(jB);
        ekrw ekrwVarN2 = ekspVar.n();
        lValueOf.getClass();
        ekrwVarN2.s("Inserted settings data, id = %d", jB);
        lValueOf.getClass();
        return jB >= 0;
    }

    public final boolean x() {
        return (this.m == null || this.h.get()) ? false : true;
    }
}
