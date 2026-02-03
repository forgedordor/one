package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daqz implements daqo {
    public static final eksp a = eksp.c("BugleWearable");
    public final fcsu b;
    public final fcsu c;
    public final fcyh d;
    public final fdjx e;
    public final fcsu f;
    public final fcsu g;

    public daqz(fcsu fcsuVar, fcsu fcsuVar2, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcyhVar;
        this.e = fdjxVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
    }

    @Override // defpackage.daqo
    public final eiju a(ctay ctayVar, String str) {
        ctayVar.getClass();
        str.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new daqw(this, ctayVar, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.daqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ctay r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.daqp
            if (r0 == 0) goto L13
            r0 = r6
            daqp r0 = (defpackage.daqp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            daqp r0 = new daqp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            evwn r5 = r0.f
            ctat r1 = r0.e
            ctat r0 = r0.d
            defpackage.fctl.b(r6)
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            ctav r6 = defpackage.ctav.a
            evsf r6 = r6.createBuilder()
            ctau r6 = (defpackage.ctau) r6
            ctat r6 = defpackage.ctas.a(r6)
            evwn r2 = r6.b()
            r0.d = r6
            r0.e = r6
            r0.f = r2
            r0.c = r3
            java.lang.Object r5 = r4.d(r5, r0)
            if (r5 == r1) goto L64
            r0 = r6
            r1 = r0
            r6 = r5
            r5 = r2
        L5a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r1.c(r5, r6)
            ctav r5 = r0.a()
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daqz.b(ctay, fcxy):java.lang.Object");
    }

    @Override // defpackage.daqo
    public final eiju c(List list) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new daqx(this, list, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ctay r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daqz.d(ctay, fcxy):java.lang.Object");
    }
}
