package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kax implements hsf {
    public final kci a;
    public boolean b = true;
    private final List c;
    private final kcr d;
    private final kbb e;
    private final fdap f;
    private final hox g;

    public kax(List list, Object obj, kcr kcrVar, kbb kbbVar, fdap fdapVar, kci kciVar) {
        this.c = list;
        this.d = kcrVar;
        this.e = kbbVar;
        this.f = fdapVar;
        this.a = kciVar;
        this.g = new hpl(obj, hsi.a);
    }

    @Override // defpackage.hsf
    public final Object a() {
        return this.g.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (defpackage.fdnh.a(r0) != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0084, B:33:0x00b0, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0084, B:33:0x00b0, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0084, B:33:0x00b0, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:39:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00be -> B:39:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kax.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kbh r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kav
            if (r0 == 0) goto L13
            r0 = r7
            kav r0 = (defpackage.kav) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kav r0 = new kav
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            return r7
        L2a:
            r7 = move-exception
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r7)
            kaw r7 = new kaw     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r6 = defpackage.fdna.c(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        L4a:
            fcyh r1 = r0.u()
            fdjr r2 = kotlinx.coroutines.CoroutineExceptionHandler.c
            fcyf r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 != 0) goto L59
            goto L7e
        L59:
            fcyh r0 = r0.u()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Unable to load font "
            java.lang.String r6 = r3.concat(r6)
            r2.<init>(r6, r7)
            r1.handleException(r0, r2)
            return r4
        L73:
            r6 = move-exception
            fcyh r7 = r0.u()
            boolean r7 = defpackage.fdlw.h(r7)
            if (r7 == 0) goto L7f
        L7e:
            return r4
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kax.c(kbh, fcxy):java.lang.Object");
    }
}
