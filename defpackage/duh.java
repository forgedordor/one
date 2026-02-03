package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duh {
    public static final float a(jou jouVar, int i) {
        return ita.b(i, 2) ? jouVar.d() * 0.0069444445f : jouVar.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:32:0x00c8, B:38:0x00e4], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:23:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ire r17, defpackage.ise r18, defpackage.iru r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.b(ire, ise, iru, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (defpackage.irt.i(r6) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.ire r12, long r13, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.dtp
            if (r0 == 0) goto L13
            r0 = r15
            dtp r0 = (defpackage.dtp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtp r0 = new dtp
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            fdch r12 = r0.d
            java.lang.Object r13 = r0.a
            defpackage.fctl.b(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.fctl.b(r15)
            irs r15 = r12.p()
            boolean r15 = m(r15, r13)
            if (r15 == 0) goto L45
            return r4
        L45:
            fdch r15 = new fdch
            r15.<init>()
            r15.a = r13
        L4c:
            r0.a = r12
            r0.d = r15
            r0.c = r3
            java.lang.Object r13 = defpackage.ird.a(r12, r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            r11 = r15
            r15 = r13
            r13 = r11
        L5c:
            irs r15 = (defpackage.irs) r15
            java.util.List r14 = r15.a
            int r15 = r14.size()
            r2 = 0
            r5 = r2
        L66:
            if (r5 >= r15) goto L7d
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            ise r7 = (defpackage.ise) r7
            long r7 = r7.a
            long r9 = r13.a
            boolean r7 = defpackage.isd.b(r7, r9)
            if (r7 == 0) goto L7a
            goto L7e
        L7a:
            int r5 = r5 + 1
            goto L66
        L7d:
            r6 = r4
        L7e:
            ise r6 = (defpackage.ise) r6
            if (r6 != 0) goto L84
            r6 = r4
            goto Lb0
        L84:
            boolean r15 = defpackage.irt.f(r6)
            if (r15 == 0) goto Laa
            int r15 = r14.size()
        L8e:
            if (r2 >= r15) goto L9f
            java.lang.Object r5 = r14.get(r2)
            r7 = r5
            ise r7 = (defpackage.ise) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L8e
        L9f:
            r5 = r4
        La0:
            ise r5 = (defpackage.ise) r5
            if (r5 != 0) goto La5
            goto Lb0
        La5:
            long r14 = r5.a
            r13.a = r14
            goto Lba
        Laa:
            boolean r14 = defpackage.irt.i(r6)
            if (r14 == 0) goto Lba
        Lb0:
            if (r6 == 0) goto Lb9
            boolean r12 = r6.c()
            if (r12 != 0) goto Lb9
            return r6
        Lb9:
            return r4
        Lba:
            r15 = r13
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.c(ire, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0158 -> B:60:0x015e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ire r20, long r21, int r23, defpackage.fdat r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.d(ire, long, int, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0150 -> B:60:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.ire r20, long r21, defpackage.fdat r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.e(ire, long, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [fdci] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.ire r9, long r10, defpackage.fcxy r12) {
        /*
            boolean r0 = r12 instanceof defpackage.dts
            if (r0 == 0) goto L13
            r0 = r12
            dts r0 = (defpackage.dts) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dts r0 = new dts
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            fdce r9 = r0.e
            fdci r10 = r0.d
            ise r11 = r0.c
            defpackage.fctl.b(r12)     // Catch: defpackage.irv -> La6
            goto L98
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.fctl.b(r12)
            irs r12 = r9.p()
            boolean r12 = m(r12, r10)
            if (r12 == 0) goto L44
            return r4
        L44:
            irs r12 = r9.p()
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            ise r7 = (defpackage.ise) r7
            long r7 = r7.a
            boolean r7 = defpackage.isd.b(r7, r10)
            if (r7 == 0) goto L61
            goto L65
        L61:
            int r5 = r5 + 1
            goto L4f
        L64:
            r6 = r4
        L65:
            r11 = r6
            ise r11 = (defpackage.ise) r11
            if (r11 != 0) goto L6b
            return r4
        L6b:
            fdci r10 = new fdci
            r10.<init>()
            fdci r12 = new fdci
            r12.<init>()
            r12.a = r11
            jou r2 = r9.q()
            long r5 = r2.f()
            fdce r2 = new fdce     // Catch: defpackage.irv -> La6
            r2.<init>()     // Catch: defpackage.irv -> La6
            dtt r7 = new dtt     // Catch: defpackage.irv -> La6
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.irv -> La6
            r0.c = r11     // Catch: defpackage.irv -> La6
            r0.d = r10     // Catch: defpackage.irv -> La6
            r0.e = r2     // Catch: defpackage.irv -> La6
            r0.b = r3     // Catch: defpackage.irv -> La6
            java.lang.Object r9 = r9.s(r5, r7, r0)     // Catch: defpackage.irv -> La6
            if (r9 == r1) goto La5
            r9 = r2
        L98:
            boolean r9 = r9.a     // Catch: defpackage.irv -> La6
            if (r9 == 0) goto La4
            java.lang.Object r9 = r10.a     // Catch: defpackage.irv -> La6
            ise r9 = (defpackage.ise) r9     // Catch: defpackage.irv -> La6
            if (r9 == 0) goto La3
            return r9
        La3:
            return r11
        La4:
            return r4
        La5:
            return r1
        La6:
            java.lang.Object r9 = r10.a
            ise r9 = (defpackage.ise) r9
            if (r9 == 0) goto Lad
            r11 = r9
        Lad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.f(ire, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x015b -> B:60:0x0161). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.ire r20, long r21, int r23, defpackage.fdat r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.g(ire, long, int, fdat, fcxy):java.lang.Object");
    }

    public static final Object h(isn isnVar, final fdap fdapVar, final fdae fdaeVar, fdae fdaeVar2, fdat fdatVar, fcxy fcxyVar) {
        Object objI = i(isnVar, new fdau() { // from class: dtk
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                fdapVar.invoke(new ihs(((ise) obj2).c));
                return fctx.a;
            }
        }, new fdap() { // from class: dtl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdaeVar.invoke();
                return fctx.a;
            }
        }, fdaeVar2, new fdae() { // from class: dtm
            @Override // defpackage.fdae
            public final Object invoke() {
                return true;
            }
        }, null, fdatVar, fcxyVar);
        return objI == fcyl.a ? objI : fctx.a;
    }

    public static final Object i(isn isnVar, fdau fdauVar, fdap fdapVar, fdae fdaeVar, fdae fdaeVar2, dwm dwmVar, fdat fdatVar, fcxy fcxyVar) {
        Object objB = dvn.b(isnVar, new dtv(fdaeVar2, new fdch(), dwmVar, fdauVar, fdatVar, fdaeVar, fdapVar, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.ire r4, long r5, defpackage.fdap r7, defpackage.fcxy r8) {
        /*
            boolean r0 = r8 instanceof defpackage.due
            if (r0 == 0) goto L13
            r0 = r8
            due r0 = (defpackage.due) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            due r0 = new due
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.fctl.b(r8)
        L38:
            r0.a = r4
            r0.b = r7
            r0.d = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            ise r8 = (defpackage.ise) r8
            if (r8 != 0) goto L4f
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L4f:
            boolean r5 = defpackage.irt.f(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5a:
            r7.invoke(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.j(ire, long, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r0 != 0.0f) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00ab, B:46:0x00cc], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.ire r18, long r19, defpackage.fdap r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.k(ire, long, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r0 != 0.0f) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00ae, B:46:0x00cf], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:23:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.ire r18, long r19, defpackage.fdap r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.l(ire, long, fdap, fcxy):java.lang.Object");
    }

    public static final boolean m(irs irsVar, long j) {
        Object obj;
        List list = irsVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (isd.b(((ise) obj).a, j)) {
                break;
            }
            i++;
        }
        ise iseVar = (ise) obj;
        return iseVar == null || !iseVar.d;
    }
}
