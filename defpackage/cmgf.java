package defpackage;

import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgf implements cmfo {
    public static final /* synthetic */ int d = 0;
    private static final eksp e = eksp.c("Bugle");
    public final String a;
    public final AtomicBoolean b;
    public final ConcurrentHashMap c;
    private final cmfo f;
    private final cmfn g;

    public cmgf(cmfo cmfoVar, cmgh cmghVar, cmgn cmgnVar) {
        this.f = cmfoVar;
        cmfm cmfmVar = (cmfm) cmghVar;
        this.g = cmfmVar.a;
        this.a = (String) cmfmVar.b.orElse("");
        this.b = cmgnVar.a;
        this.c = cmgnVar.b;
    }

    @Override // defpackage.cmfo
    public final evuh a(fdap fdapVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        evuh evuhVarA = this.f.a(fdapVar);
        concurrentHashMap.put(str, evuhVarA);
        return evuhVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cmfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cmgc
            if (r0 == 0) goto L13
            r0 = r5
            cmgc r0 = (defpackage.cmgc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmgc r0 = new cmgc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            cmfo r5 = r4.f
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            j$.util.concurrent.ConcurrentHashMap r5 = r4.c
            java.lang.String r0 = r4.a
            r5.remove(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgf.b(fcxy):java.lang.Object");
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
            boolean r0 = r5 instanceof defpackage.cmgd
            if (r0 == 0) goto L13
            r0 = r5
            cmgd r0 = (defpackage.cmgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmgd r0 = new cmgd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            j$.util.concurrent.ConcurrentHashMap r5 = r4.c
            java.lang.String r2 = r4.a
            java.lang.Object r5 = r5.get(r2)
            evuh r5 = (defpackage.evuh) r5
            if (r5 == 0) goto L50
            eksp r0 = defpackage.cmgf.e
            ekrw r0 = r0.n()
            cmfn r1 = r4.g
            java.lang.String r2 = defpackage.cqcv.e(r2)
            java.lang.String r3 = "Reading from cache. key = %s, subkey = %s"
            r0.D(r3, r1, r2)
            return r5
        L50:
            cmfo r5 = r4.f
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            j$.util.concurrent.ConcurrentHashMap r0 = r4.c
            java.lang.String r1 = r4.a
            r2 = r5
            evuh r2 = (defpackage.evuh) r2
            r0.put(r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgf.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cmfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmge
            if (r0 == 0) goto L13
            r0 = r6
            cmge r0 = (defpackage.cmge) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmge r0 = new cmge
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r4.f
            r0.c = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            j$.util.concurrent.ConcurrentHashMap r5 = r4.c
            java.lang.String r0 = r4.a
            r1 = r6
            evuh r1 = (defpackage.evuh) r1
            r5.put(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgf.d(fdap, fcxy):java.lang.Object");
    }

    @Override // defpackage.cmfo
    public final fdpl e() {
        return this.f.e();
    }

    @Override // defpackage.cmip
    public final eiju f() {
        eiju eijuVarF = this.f.f();
        final fdap fdapVar = new fdap() { // from class: cmfp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cmgf cmgfVar = this.a;
                Void r3 = (Void) obj;
                cmgfVar.c.remove(cmgfVar.a);
                return r3;
            }
        };
        return eijuVarF.h(new ejvr() { // from class: cmft
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cmgf.d;
                return fdapVar.invoke(obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cmip
    public final eiju g() {
        if (!this.b.get()) {
            eiju eijuVarG = this.f.g();
            final fdap fdapVar = new fdap() { // from class: cmfr
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cmgf cmgfVar = this.a;
                    ekgp ekgpVar = (ekgp) obj;
                    cmgfVar.c.putAll(ekgpVar);
                    cmgfVar.b.set(true);
                    return ekgpVar;
                }
            };
            return eijuVarG.h(new ejvr() { // from class: cmfs
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = cmgf.d;
                    return fdapVar.invoke(obj);
                }
            }, eoqg.a);
        }
        e.n().D("Reading all data from cache. key = %s, subkey = %s", this.g, cqcv.e(this.a));
        eiju eijuVarE = eijx.e(ekfv.e(this.c));
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cmip
    public final eiju h() {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        evuh evuhVar = (evuh) concurrentHashMap.get(str);
        if (evuhVar == null) {
            eiju eijuVarH = this.f.h();
            final fdap fdapVar = new fdap() { // from class: cmfu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cmgf cmgfVar = this.a;
                    evuh evuhVar2 = (evuh) obj;
                    cmgfVar.c.put(cmgfVar.a, evuhVar2);
                    return evuhVar2;
                }
            };
            return eijuVarH.h(new ejvr() { // from class: cmfv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = cmgf.d;
                    return fdapVar.invoke(obj);
                }
            }, eoqg.a);
        }
        e.n().D("Reading from cache. key = %s, subkey = %s", this.g, cqcv.e(str));
        eiju eijuVarE = eijx.e(evuhVar);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cmip
    public final eiju i(final String str) {
        eiju eijuVarI = this.f.i(str);
        final fdap fdapVar = new fdap() { // from class: cmgb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Optional optional = (Optional) obj;
                final cmgf cmgfVar = this.a;
                final fdap fdapVar2 = new fdap() { // from class: cmfy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        cmgf cmgfVar2 = cmgfVar;
                        cmgfVar2.c.put(cmgfVar2.a, (evuh) obj2);
                        return fctx.a;
                    }
                };
                optional.ifPresentOrElse(new Consumer() { // from class: cmfz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        int i = cmgf.d;
                        fdapVar2.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: cmga
                    @Override // java.lang.Runnable
                    public final void run() {
                        cmgf cmgfVar2 = cmgfVar;
                        cmgfVar2.c.remove(cmgfVar2.a);
                    }
                });
                Object objOrElse = optional.orElse(null);
                ConcurrentHashMap concurrentHashMap = cmgfVar.c;
                fdcm.g(concurrentHashMap);
                Map.EL.remove(concurrentHashMap, str, objOrElse);
                return optional;
            }
        };
        return eijuVarI.h(new ejvr() { // from class: cmfq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cmgf.d;
                return fdapVar.invoke(obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cmip
    public final eiju j(ejvr ejvrVar) {
        eiju eijuVarJ = this.f.j(ejvrVar);
        final fdap fdapVar = new fdap() { // from class: cmfw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cmgf cmgfVar = this.a;
                evuh evuhVar = (evuh) obj;
                cmgfVar.c.put(cmgfVar.a, evuhVar);
                return evuhVar;
            }
        };
        return eijuVarJ.h(new ejvr() { // from class: cmfx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cmgf.d;
                return fdapVar.invoke(obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cmip
    public final ekgp k() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            e.n().D("Reading all data from cache. key = %s, subkey = %s", this.g, cqcv.e(this.a));
            return ekfv.e(this.c);
        }
        cmfo cmfoVar = this.f;
        ConcurrentHashMap concurrentHashMap = this.c;
        ekgp ekgpVarK = cmfoVar.k();
        concurrentHashMap.putAll(ekgpVarK);
        atomicBoolean.set(true);
        return ekgpVarK;
    }

    @Override // defpackage.cmip
    public final evuh l() {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        evuh evuhVar = (evuh) concurrentHashMap.get(str);
        if (evuhVar != null) {
            e.n().D("Reading from cache. key = %s, subkey = %s", this.g, cqcv.e(str));
            return evuhVar;
        }
        evuh evuhVarL = this.f.l();
        concurrentHashMap.put(str, evuhVarL);
        return evuhVarL;
    }

    @Override // defpackage.cmip
    public final evuh m(ejvr ejvrVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        evuh evuhVarM = this.f.m(ejvrVar);
        concurrentHashMap.put(str, evuhVarM);
        return evuhVarM;
    }

    @Override // defpackage.cmip
    public final void n() {
        this.f.n();
        this.c.remove(this.a);
    }
}
