package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzem implements bzce {
    public static final evrw a;
    public static final eqmi b;
    public final cpmc c;
    public final fcyh d;
    public final fcyh e;

    static {
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.getClass();
        evrx.b(evrvVar);
        evrvVar.a("conversation_id");
        evrx.b(evrvVar);
        evrvVar.a("message_content.from_address");
        evrx.b(evrvVar);
        evrvVar.a("message_content.to_addresses");
        evrx.b(evrvVar);
        evrvVar.a("labels");
        a = evrx.a(evrvVar);
        eqmh eqmhVar = (eqmh) eqmi.a.createBuilder();
        eqmhVar.getClass();
        eqmj.b(eqmhVar);
        eqmj.c(eqmhVar);
        b = eqmj.a(eqmhVar);
    }

    public bzem(cpmc cpmcVar, fcyh fcyhVar, fcyh fcyhVar2) {
        cpmcVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        this.c = cpmcVar;
        this.d = fcyhVar;
        this.e = fcyhVar2;
    }

    @Override // defpackage.bzce
    public final Object a(Map map, bzbz bzbzVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new bzdy(null, map, this, bzbzVar), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bzce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.bzbz r7, defpackage.fcxy r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.bzea
            if (r0 == 0) goto L13
            r0 = r8
            bzea r0 = (defpackage.bzea) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzea r0 = new bzea
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.d
            fcyh r8 = defpackage.eicg.a(r8)
            bzeb r2 = new bzeb
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            fctk r8 = (defpackage.fctk) r8
            java.lang.Object r6 = r8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzem.b(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    @Override // defpackage.bzce
    public final /* bridge */ /* synthetic */ Object c(Object obj, bzbz bzbzVar, EnumSet enumSet, fcxy fcxyVar) {
        return e((eqnd) obj, bzbzVar, fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Map r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bzec
            if (r0 == 0) goto L13
            r0 = r6
            bzec r0 = (defpackage.bzec) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzec r0 = new bzec
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cpmc r6 = r4.c
            java.util.Collection r2 = r5.values()
            ekgb r2 = defpackage.ekfv.a(r2)
            eiju r6 = r6.d(r2)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto Lc2
        L4c:
            eqis r6 = (defpackage.eqis) r6
            evtg r0 = r6.b
            r0.getClass()
            evtg r6 = r6.c
            r6.getClass()
            java.util.List r6 = defpackage.fcva.ar(r0, r6)
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r0 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r6 = defpackage.fcva.p(r6, r3)
            int r5 = defpackage.fcva.p(r5, r3)
            int r5 = java.lang.Math.min(r6, r5)
            r2.<init>(r5)
        L7b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbd
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lbd
            java.lang.Object r5 = r0.next()
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            fcti r5 = (defpackage.fcti) r5
            java.lang.Object r3 = r5.a
            eqnd r3 = (defpackage.eqnd) r3
            java.lang.Object r5 = r5.b
            exmy r5 = (defpackage.exmy) r5
            int r5 = r5.b
            if (r5 != 0) goto La2
            java.lang.String r5 = r3.c
            goto Laf
        La2:
            fbtf r3 = new fbtf
            io.grpc.Status r5 = io.grpc.Status.fromCodeValue(r5)
            r3.<init>(r5)
            java.lang.Object r5 = defpackage.fctl.a(r3)
        Laf:
            fctk r3 = new fctk
            r3.<init>(r5)
            fcti r5 = new fcti
            r5.<init>(r6, r3)
            r2.add(r5)
            goto L7b
        Lbd:
            java.util.Map r5 = defpackage.fcwa.k(r2)
            return r5
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzem.d(java.util.Map, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eqnd r6, defpackage.bzbz r7, defpackage.fcxy r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.bzek
            if (r0 == 0) goto L13
            r0 = r8
            bzek r0 = (defpackage.bzek) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzek r0 = new bzek
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.d
            fcyh r8 = defpackage.eicg.a(r8)
            bzel r2 = new bzel
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            fctk r8 = (defpackage.fctk) r8
            java.lang.Object r6 = r8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzem.e(eqnd, bzbz, fcxy):java.lang.Object");
    }
}
