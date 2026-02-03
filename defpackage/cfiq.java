package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfiq implements cfho {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindSessionStateListener");
    public final ceov a;
    public final Object b;
    private final efwo d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cfiq(efwo efwoVar, ceov ceovVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar3.getClass();
        this.d = efwoVar;
        this.a = ceovVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.b = new Object();
    }

    @Override // defpackage.cfho
    public final void a() {
        ceov ceovVar = this.a;
        ceovVar.b(this.b);
        ceovVar.d();
    }

    @Override // defpackage.cfho
    public final void b() {
        Object objB = this.g.b();
        objB.getClass();
        auvh.i(auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cfip(this, null)), new Consumer() { // from class: cfin
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    cfiq cfiqVar = this.a;
                    ceov ceovVar = cfiqVar.a;
                    ceovVar.g(null);
                    ceovVar.f(cfiqVar.b);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, eoqg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfio
            if (r0 == 0) goto L13
            r0 = r6
            cfio r0 = (defpackage.cfio) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfio r0 = new cfio
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L4c
        L28:
            r6 = move-exception
            goto L87
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.e     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L28
            egbf r6 = (defpackage.egbf) r6     // Catch: java.lang.Throwable -> L28
            efwo r2 = r5.d     // Catch: java.lang.Throwable -> L28
            com.google.common.util.concurrent.ListenableFuture r6 = r6.c(r2)     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L4c
            return r1
        L4c:
            egbe r6 = (defpackage.egbe) r6     // Catch: java.lang.Throwable -> L28
            egbs r0 = r6.b()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.k     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "pseudonymous"
            boolean r0 = defpackage.fdbq.f(r0, r1)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L5e
            r6 = 0
            goto L64
        L5e:
            egbs r6 = r6.b()     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r6.g     // Catch: java.lang.Throwable -> L28
        L64:
            if (r6 == 0) goto L82
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L6d
            goto L82
        L6d:
            fcsu r0 = r5.f     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L28
            bvkr r0 = (defpackage.bvkr) r0     // Catch: java.lang.Throwable -> L28
            j$.util.Optional r6 = j$.util.Optional.of(r6)     // Catch: java.lang.Throwable -> L28
            boolean r6 = r0.p(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L28
            return r6
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            return r6
        L87:
            ekrg r0 = defpackage.cfiq.c
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleGDitto"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r6 = r0.g(r6)
            r0 = 83
            java.lang.String r1 = "GaiaDittoBindSessionStateListener.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindSessionStateListener"
            java.lang.String r4 = "checkIfGaiaPairingExists"
            ekrw r6 = r6.h(r2, r4, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Not able to check if any active Gaia paired device"
            r6.q(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfiq.c(fcxy):java.lang.Object");
    }
}
