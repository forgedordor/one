package defpackage;

import j$.time.Duration;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atib implements athk {
    private final atha a;
    private final Queue b;
    private final boolean c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final feav f = new feaz();
    private final atjr g = atjr.l;

    public atib(atha athaVar, Queue queue, boolean z) {
        this.a = athaVar;
        this.b = queue;
        this.c = z;
    }

    private final void c(athk athkVar, int i, Duration duration) {
        if (this.c) {
            atha athaVar = this.a;
            athaVar.e.j.add(new atjq(athkVar.a(), i, duration));
        }
    }

    private final void d(int i) {
        if (this.c) {
            this.a.e.m = i;
        }
    }

    @Override // defpackage.athk
    public final atjr a() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:24:0x005d, B:26:0x0063, B:23:0x0057), top: B:34:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r4v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.athk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.athy
            if (r0 == 0) goto L13
            r0 = r7
            athy r0 = (defpackage.athy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            athy r0 = new athy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.a
            feaz r4 = r0.e
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L5d
        L2e:
            r7 = move-exception
            goto L7f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            feaz r2 = r0.e
            defpackage.fctl.b(r7)
            r4 = r2
            goto L57
        L3f:
            defpackage.fctl.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.e
            r7.set(r4)
            feav r7 = r6.f
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L83
            r4 = r7
        L57:
            java.util.Queue r7 = r6.b     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L2e
        L5d:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L79
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L2e
            athk r7 = (defpackage.athk) r7     // Catch: java.lang.Throwable -> L2e
            r5 = r4
            feaz r5 = (defpackage.feaz) r5     // Catch: java.lang.Throwable -> L2e
            r0.e = r5     // Catch: java.lang.Throwable -> L2e
            r0.a = r2     // Catch: java.lang.Throwable -> L2e
            r0.d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L5d
            goto L83
        L79:
            r4.d()
            fctx r7 = defpackage.fctx.a
            return r7
        L7f:
            r4.d()
            throw r7
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atib.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.athk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.athz
            if (r0 == 0) goto L13
            r0 = r5
            athz r0 = (defpackage.athz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            athz r0 = new athz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.d
            r5.set(r3)
            java.util.Queue r5 = r4.b
            java.util.Iterator r2 = r5.iterator()
        L3f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r2.next()
            athk r5 = (defpackage.athk) r5
            r0.a = r2
            r0.d = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3f
            return r1
        L56:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atib.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        if (r11.b(r0) != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0109, code lost:
    
        if (r11.b(r0) != r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:40:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0109 -> B:65:0x010b). Please report as a decompilation issue!!! */
    @Override // defpackage.athk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.atha r11, defpackage.atii r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atib.h(atha, atii, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final boolean k() {
        return this.e.get();
    }

    @Override // defpackage.athk
    public final boolean l() {
        return this.d.get();
    }
}
