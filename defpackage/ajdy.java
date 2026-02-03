package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajdy {
    public final ecjh a;
    public final fdjx b;
    public final eizx c;
    public final ajcd d;
    private final fcsu e;

    public ajdy(ecjh ecjhVar, fcsu fcsuVar, fdjx fdjxVar, eizx eizxVar, ajcd ajcdVar) {
        ecjhVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        eizxVar.getClass();
        this.a = ecjhVar;
        this.e = fcsuVar;
        this.b = fdjxVar;
        this.c = eizxVar;
        this.d = ajcdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ajda
            if (r0 == 0) goto L13
            r0 = r5
            ajda r0 = (defpackage.ajda) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajda r0 = new ajda
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.e
            java.lang.Object r5 = r5.b()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = r5.get()
            ajbu r5 = (defpackage.ajbu) r5
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L58
        L48:
            efwo r5 = (defpackage.efwo) r5
            if (r5 == 0) goto L56
            int r5 = r5.a()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        L56:
            r5 = 0
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdy.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ajdb
            if (r0 == 0) goto L13
            r0 = r6
            ajdb r0 = (defpackage.ajdb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajdb r0 = new ajdb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fdjx r6 = r5.b
            fcyh r6 = r6.hE()
            ajdc r2 = new ajdc
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.eicj.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdy.b(fcxy):java.lang.Object");
    }

    public final Object c(fcxy fcxyVar) {
        return eicj.a(this.b.hE(), new ajdd(this, null), fcxyVar);
    }

    public final Object d(final int i, final boolean z, fcxy fcxyVar) {
        final int iA = this.d.a();
        Object objB = crrj.b(this.a, new fdap() { // from class: ajcv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ajcq ajcqVar = (ajcq) obj;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajct) ajcqVar.instance).c));
                int i2 = i;
                ajcn ajcnVar = (ajcn) Map.EL.getOrDefault(mapUnmodifiableMap, Integer.valueOf(i2), ajcn.a);
                java.util.Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(ajcnVar.c);
                int i3 = iA;
                ajcp ajcpVar = (ajcp) Map.EL.getOrDefault(mapUnmodifiableMap2, Integer.valueOf(i3), ajcp.a);
                int i4 = ajcpVar.b & 4;
                boolean z2 = z;
                if (i4 != 0) {
                    if (ajcpVar.e || !z2) {
                        return fctx.a;
                    }
                    z2 = true;
                }
                ajcl ajclVar = (ajcl) ajcnVar.toBuilder();
                ajco ajcoVar = (ajco) ajcpVar.toBuilder();
                ajcoVar.copyOnWrite();
                ajcp ajcpVar2 = (ajcp) ajcoVar.instance;
                ajcpVar2.b |= 4;
                ajcpVar2.e = z2;
                ajclVar.a(i3, (ajcp) ajcoVar.build());
                ajcqVar.a(i2, (ajcn) ajclVar.build());
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    public final void e(int i, int i2) {
        ejaa.a(fdjy.b(eicg.a(this.b.hE())), this.c, new ajcw(null, this, i2, i));
    }

    public final void f(Instant instant) {
        instant.getClass();
        int iB = ajcd.b(instant);
        ejaa.a(fdjy.b(eicg.a(this.b.hE())), this.c, new ajdk(null, this, iB));
    }

    public final void g(Instant instant) {
        instant.getClass();
        int iB = ajcd.b(instant);
        ejaa.a(fdjy.b(eicg.a(this.b.hE())), this.c, new ajdm(null, this, iB));
    }

    public final void h(Instant instant) {
        instant.getClass();
        int iB = ajcd.b(instant);
        ejaa.a(fdjy.b(eicg.a(this.b.hE())), this.c, new ajdo(null, this, iB));
    }
}
