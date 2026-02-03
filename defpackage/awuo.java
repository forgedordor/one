package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awuo implements awzf, awzo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/BaseMyIdentityManager");
    public final fcsu b;
    public final awlc c;
    public final alrj d;
    public final fdjx e;
    public final arpg f;
    private final fcsu g;
    private final axfu h;
    private final fdjx i;

    public awuo(fcsu fcsuVar, fcsu fcsuVar2, awlc awlcVar, alrj alrjVar, axfu axfuVar, fdjx fdjxVar, fdjx fdjxVar2, arpg arpgVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        awlcVar.getClass();
        alrjVar.getClass();
        axfuVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.b = fcsuVar;
        this.g = fcsuVar2;
        this.c = awlcVar;
        this.d = alrjVar;
        this.h = axfuVar;
        this.i = fdjxVar;
        this.e = fdjxVar2;
        this.f = arpgVar;
    }

    @Override // defpackage.awzf
    public final axcm a(final String str) {
        SelfIdentityId selfIdentityIdA;
        ejwl.a(!str.isEmpty());
        Optional optionalFindFirst = Collection.EL.stream(this.h.j()).filter(new Predicate() { // from class: axfl
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                eksp ekspVar = axfu.a;
                return ((axft) obj).b().equals(str);
            }
        }).findFirst();
        if (optionalFindFirst.isEmpty()) {
            ((eksl) ((eksl) axfu.a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSelfIdentityIdForSelfRowId", 170, "SubscriptionsTracker.java")).t("missing a match in SubscriptionsTracker for %s", str);
            selfIdentityIdA = null;
        } else {
            selfIdentityIdA = aofa.a(str, ((axft) optionalFindFirst.get()).a());
        }
        return selfIdentityIdA != null ? selfIdentityIdA.a() : ((awvj) this.b.b()).b(str);
    }

    @Override // defpackage.awzf
    public final eiju b() {
        return auvw.c(this.i, fcyi.a, fdjz.a, new awtz(this, null));
    }

    @Override // defpackage.awzf
    public final eiju c(axcm axcmVar) {
        return auvw.c(this.i, fcyi.a, fdjz.a, new awuc(this, axcmVar, null));
    }

    @Override // defpackage.awzo
    @fcsv
    public final eiju d() {
        return auvw.c(this.i, fcyi.a, fdjz.a, new awuf(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.awty
            if (r0 == 0) goto L13
            r0 = r6
            awty r0 = (defpackage.awty) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awty r0 = new awty
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.k(r0)
            if (r6 == r1) goto L57
        L41:
            fcsu r2 = r5.b
            awxj r6 = (defpackage.awxj) r6
            java.lang.Object r2 = r2.b()
            awvj r2 = (defpackage.awvj) r2
            java.util.Set r6 = r6.a
            r0.c = r3
            java.lang.Object r6 = r2.d(r6, r0)
            if (r6 != r1) goto L56
            goto L57
        L56:
            return r6
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awuo.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.awua
            if (r0 == 0) goto L13
            r0 = r6
            awua r0 = (defpackage.awua) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awua r0 = new awua
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r0 = r0.d
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r6 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            java.lang.String r6 = "BaseMyIdentityManager::getAll"
            eieu r6 = defpackage.eiiy.a(r6)
            fcsu r2 = r5.b     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L57
            awvj r2 = (defpackage.awvj) r2     // Catch: java.lang.Throwable -> L57
            r0.d = r6     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r2.c(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 == r1) goto L56
            r4 = r0
            r0 = r6
            r6 = r4
        L51:
            r1 = 0
            defpackage.fczl.a(r0, r1)
            return r6
        L56:
            return r1
        L57:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L5b:
            throw r6     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            defpackage.fczl.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awuo.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.axcm r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.awub
            if (r0 == 0) goto L13
            r0 = r7
            awub r0 = (defpackage.awub) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awub r0 = new awub
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            java.lang.String r7 = "BaseMyIdentityManager::getMyIdentity"
            eieu r7 = defpackage.eiiy.a(r7)
            fcsu r2 = r5.b     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L57
            awvj r2 = (defpackage.awvj) r2     // Catch: java.lang.Throwable -> L57
            r0.d = r7     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r2.e(r6, r0)     // Catch: java.lang.Throwable -> L57
            if (r6 == r1) goto L56
            r4 = r7
            r7 = r6
            r6 = r4
        L51:
            r0 = 0
            defpackage.fczl.a(r6, r0)
            return r7
        L56:
            return r1
        L57:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5b:
            throw r7     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            defpackage.fczl.a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awuo.g(axcm, fcxy):java.lang.Object");
    }

    @Override // defpackage.awzf
    public final Object h(int i, fcxy fcxyVar) {
        throw new fcth("Not implemented as expected");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awud
            if (r0 == 0) goto L13
            r0 = r6
            awud r0 = (defpackage.awud) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awud r0 = new awud
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r4.e(r0)
            if (r6 == r1) goto L6f
        L3e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L50
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
        L4e:
            r3 = r1
            goto L6a
        L50:
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            awxn r0 = (defpackage.awxn) r0
            axcm r0 = r0.b()
            boolean r0 = defpackage.fdbq.f(r0, r5)
            if (r0 == 0) goto L54
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awuo.i(axcm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awzo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.awue
            if (r0 == 0) goto L13
            r0 = r5
            awue r0 = (defpackage.awue) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awue r0 = new awue
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.k(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            awxj r5 = (defpackage.awxj) r5
            awlc r5 = r4.c
            awtv r0 = new awtv
            r0.<init>()
            r5.d(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awuo.j(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.awuj
            if (r0 == 0) goto L13
            r0 = r7
            awuj r0 = (defpackage.awuj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awuj r0 = new awuj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r7 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.fctl.b(r7)
            java.lang.String r7 = "BaseMyIdentityManager::updateMyIdentities"
            eieu r7 = defpackage.eiiy.a(r7)
            fcsu r2 = r6.b     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L63
            awvj r2 = (defpackage.awvj) r2     // Catch: java.lang.Throwable -> L63
            fcsu r4 = r6.g     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L63
            crny r4 = (defpackage.crny) r4     // Catch: java.lang.Throwable -> L63
            java.util.List r4 = r4.m()     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r2.f(r4, r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == r1) goto L62
            r5 = r0
            r0 = r7
            r7 = r5
        L5d:
            r1 = 0
            defpackage.fczl.a(r0, r1)
            return r7
        L62:
            return r1
        L63:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L67:
            throw r7     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awuo.k(fcxy):java.lang.Object");
    }
}
