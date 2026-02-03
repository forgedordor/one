package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzfj extends fcyz implements fdat {
    int a;
    final /* synthetic */ fcuq b;
    final /* synthetic */ fdau c;
    final /* synthetic */ Map d;
    Object e;
    Object f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfj(fcxy fcxyVar, fcuq fcuqVar, fdau fdauVar, Map map) {
        super(2, fcxyVar);
        this.b = fcuqVar;
        this.c = fdauVar;
        this.d = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzfj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:15:0x0042). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            if (r1 == 0) goto L12
            java.lang.Object r1 = r5.f
            java.lang.Object r2 = r5.e
            java.lang.Object r3 = r5.g
            java.util.Map r3 = (java.util.Map) r3
            defpackage.fctl.b(r6)     // Catch: java.util.NoSuchElementException -> L4c
            goto L42
        L12:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.g
            fdjx r6 = (defpackage.fdjx) r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r1 = r6
        L1f:
            fcuq r6 = r5.b     // Catch: java.util.NoSuchElementException -> L4b
            monitor-enter(r6)     // Catch: java.util.NoSuchElementException -> L4b
            java.lang.Object r2 = r6.removeFirst()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)     // Catch: java.util.NoSuchElementException -> L4b
            fdau r6 = r5.c     // Catch: java.util.NoSuchElementException -> L4b
            java.util.Map r3 = r5.d     // Catch: java.util.NoSuchElementException -> L4b
            java.lang.Object r3 = r3.get(r2)     // Catch: java.util.NoSuchElementException -> L4b
            r3.getClass()     // Catch: java.util.NoSuchElementException -> L4b
            r5.g = r1     // Catch: java.util.NoSuchElementException -> L4b
            r5.e = r2     // Catch: java.util.NoSuchElementException -> L4b
            r5.f = r1     // Catch: java.util.NoSuchElementException -> L4b
            r4 = 1
            r5.a = r4     // Catch: java.util.NoSuchElementException -> L4b
            java.lang.Object r6 = r6.a(r2, r3, r5)     // Catch: java.util.NoSuchElementException -> L4b
            if (r6 == r0) goto L47
            r3 = r1
        L42:
            r1.put(r2, r6)     // Catch: java.util.NoSuchElementException -> L4c
            r1 = r3
            goto L1f
        L47:
            return r0
        L48:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.util.NoSuchElementException -> L4b
            throw r0     // Catch: java.util.NoSuchElementException -> L4b
        L4b:
            r3 = r1
        L4c:
            java.util.Map r6 = defpackage.fcwa.l(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzfj bzfjVar = new bzfj(fcxyVar, this.b, this.c, this.d);
        bzfjVar.g = obj;
        return bzfjVar;
    }
}
