package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxhr implements dxhl {
    private static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final dxrk c;
    private final dxga d;
    private final dxtz e;
    private final dxkt f;
    private final dxtx g;
    private final Set h;
    private final dxkw i;

    public dxhr(Context context, dxrk dxrkVar, dxga dxgaVar, dxtz dxtzVar, dxkt dxktVar, dxtx dxtxVar, dxkw dxkwVar, Set set) {
        context.getClass();
        dxrkVar.getClass();
        dxtzVar.getClass();
        dxktVar.getClass();
        dxtxVar.getClass();
        dxkwVar.getClass();
        set.getClass();
        this.b = context;
        this.c = dxrkVar;
        this.d = dxgaVar;
        this.e = dxtzVar;
        this.f = dxktVar;
        this.g = dxtxVar;
        this.i = dxkwVar;
        this.h = set;
    }

    private final void g(boolean z) {
        ((ecoe) this.g.w.get()).a(this.b.getPackageName(), Boolean.valueOf(z));
    }

    @Override // defpackage.dxhl
    public final void a(Intent intent, dxfy dxfyVar, long j) {
        dxfyVar.getClass();
        fdim.a(fcyi.a, new dxho(this, intent, dxfyVar, j, null));
    }

    @Override // defpackage.dxhl
    public final boolean b(Intent intent) {
        return fdbq.f("android.accounts.LOGIN_ACCOUNTS_CHANGED", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dxhe r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dxhm
            if (r0 == 0) goto L13
            r0 = r7
            dxhm r0 = (defpackage.dxhm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxhm r0 = new dxhm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            dxga r7 = r5.d
            dxvi r6 = r6.s()
            r0.c = r3
            dxgc r2 = new dxgc
            dxge r7 = (defpackage.dxge) r7
            r4 = 0
            r2.<init>(r7, r6, r4)
            fcyh r6 = r7.c
            java.lang.Object r7 = defpackage.fdin.a(r6, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            dxtx r6 = r5.g
            android.content.Context r0 = r5.b
            dxft r7 = (defpackage.dxft) r7
            java.lang.String r0 = r0.getPackageName()
            boolean r7 = r7.g()
            ejxr r6 = r6.x
            java.lang.Object r6 = r6.get()
            ecoe r6 = (defpackage.ecoe) r6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r1[r3] = r7
            r6.a(r1)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxhr.c(dxhe, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dxhe r5, java.util.Set r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dxhn
            if (r0 == 0) goto L13
            r0 = r7
            dxhn r0 = (defpackage.dxhn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxhn r0 = new dxhn
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r0 = r0.c
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.fctl.b(r7)
            r5 = 0
            throw r5
        L2e:
            defpackage.fctl.b(r7)
            dxvi r7 = r5.s()
            boolean r0 = r7 instanceof defpackage.dxvp
            if (r0 == 0) goto L46
            dxvi r5 = r5.s()
            dxvp r5 = (defpackage.dxvp) r5
            java.lang.String r5 = r5.a
            boolean r1 = r6.contains(r5)
            goto L67
        L46:
            boolean r0 = r7 instanceof defpackage.dxvl
            if (r0 == 0) goto L53
            java.lang.String r5 = r5.k()
            boolean r1 = defpackage.fcva.az(r6, r5)
            goto L67
        L53:
            boolean r5 = r7 instanceof defpackage.dxvn
            if (r5 == 0) goto L58
            goto L67
        L58:
            boolean r5 = r7 instanceof defpackage.dxwh
            if (r5 != 0) goto L67
            boolean r5 = r7 instanceof defpackage.dxwf
            if (r5 == 0) goto L61
            goto L67
        L61:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxhr.d(dxhe, java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0137, code lost:
    
        if (r14 != r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:24:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0137 -> B:43:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dxhe r12, defpackage.dxhe r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxhr.e(dxhe, dxhe, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r20v0, types: [dxhr] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0102 -> B:38:0x0108). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxhr.f(fcxy):java.lang.Object");
    }
}
