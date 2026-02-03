package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhp {
    public final Object a;
    public final List b;
    public fdjc c;
    public fdkf d;
    private final fdjx e;
    private final feav f;

    public cbhp(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.e = fdjxVar;
        this.a = new Object();
        this.b = new ArrayList();
        this.f = new feaz();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdap r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cbhm
            if (r0 == 0) goto L13
            r0 = r6
            cbhm r0 = (defpackage.cbhm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbhm r0 = new cbhm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r5.invoke(r0)
            if (r6 == r1) goto L4f
        L3a:
            java.lang.Object r5 = r4.a
            monitor-enter(r5)
            monitor-exit(r5)
            fcyh r5 = r0.u()
            boolean r5 = defpackage.fdlw.h(r5)
            if (r5 == 0) goto L49
            return r6
        L49:
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            r5.<init>()
            throw r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhp.a(fdap, fcxy):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:65:0x0069
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x0080, B:38:0x0094], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:74:0x00b9, B:73:0x0069], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [fdap] */
    /* JADX WARN: Type inference failed for: r12v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [fdap] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:73:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cbkj r12, defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhp.b(fdap, fcxy):java.lang.Object");
    }
}
