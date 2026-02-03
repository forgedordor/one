package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcnw extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ fbsm d;
    final /* synthetic */ fdoa e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcnw(AtomicBoolean atomicBoolean, fbsm fbsmVar, fdoa fdoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = atomicBoolean;
        this.d = fbsmVar;
        this.e = fdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcnw) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:6:0x000f, B:23:0x0062, B:15:0x0039, B:18:0x0048, B:20:0x0050, B:9:0x001a, B:14:0x0033), top: B:34:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:7:0x0012). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L14
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.f
            fdpm r3 = (defpackage.fdpm) r3
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L68
        L12:
            r7 = r3
            goto L62
        L14:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.f
            fdpm r3 = (defpackage.fdpm) r3
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L68
            goto L48
        L1e:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.f
            fdpm r7 = (defpackage.fdpm) r7
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.c
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L7f
            fbsm r1 = r6.d
            r1.g(r2)
            fdoa r1 = r6.e     // Catch: java.lang.Exception -> L68
            fdoc r1 = r1.r()     // Catch: java.lang.Exception -> L68
        L39:
            r6.f = r7     // Catch: java.lang.Exception -> L68
            r6.a = r1     // Catch: java.lang.Exception -> L68
            r6.b = r2     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = r1.a(r6)     // Catch: java.lang.Exception -> L68
            if (r3 == r0) goto L6d
            r5 = r3
            r3 = r7
            r7 = r5
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L68
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L68
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r1.b()     // Catch: java.lang.Exception -> L68
            r6.f = r3     // Catch: java.lang.Exception -> L68
            r6.a = r1     // Catch: java.lang.Exception -> L68
            r4 = 2
            r6.b = r4     // Catch: java.lang.Exception -> L68
            java.lang.Object r7 = r3.fO(r7, r6)     // Catch: java.lang.Exception -> L68
            if (r7 != r0) goto L12
            goto L6d
        L62:
            fbsm r3 = r6.d     // Catch: java.lang.Exception -> L68
            r3.g(r2)     // Catch: java.lang.Exception -> L68
            goto L39
        L68:
            r7 = move-exception
            goto L6e
        L6a:
            fctx r7 = defpackage.fctx.a
            return r7
        L6d:
            return r0
        L6e:
            fdoa r0 = r6.e
            java.lang.String r1 = "Exception thrown while collecting requests"
            java.util.concurrent.CancellationException r1 = defpackage.fdle.a(r1, r7)
            r0.t(r1)
            fbsm r0 = r6.d
            r0.g(r2)
            throw r7
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "requests flow can only be collected once"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcnw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fcnw fcnwVar = new fcnw(this.c, this.d, this.e, fcxyVar);
        fcnwVar.f = obj;
        return fcnwVar;
    }
}
