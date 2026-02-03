package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzm {
    public static final fdau a = new dyl(null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ire r6, boolean r7, defpackage.iru r8, defpackage.fcxy r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dym
            if (r0 == 0) goto L13
            r0 = r9
            dym r0 = (defpackage.dym) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dym r0 = new dym
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.b
            iru r7 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.fctl.b(r9)
        L3c:
            r0.a = r6
            r0.e = r8
            r0.b = r7
            r0.d = r3
            java.lang.Object r9 = r6.r(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            irs r9 = (defpackage.irs) r9
            r2 = 0
            boolean r4 = m(r9, r7, r2)
            if (r4 != 0) goto L55
            goto L3c
        L55:
            java.util.List r6 = r9.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzm.a(ire, boolean, iru, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ire r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dyp
            if (r0 == 0) goto L13
            r0 = r8
            dyp r0 = (defpackage.dyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dyp r0 = new dyp
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
        L34:
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.ird.a(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            irs r8 = (defpackage.irs) r8
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L49:
            if (r5 >= r2) goto L57
            java.lang.Object r6 = r8.get(r5)
            ise r6 = (defpackage.ise) r6
            r6.b()
            int r5 = r5 + 1
            goto L49
        L57:
            int r2 = r8.size()
        L5b:
            if (r4 >= r2) goto L6b
            java.lang.Object r5 = r8.get(r4)
            ise r5 = (defpackage.ise) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L68
            goto L34
        L68:
            int r4 = r4 + 1
            goto L5b
        L6b:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzm.b(ire, fcxy):java.lang.Object");
    }

    public static final Object c(isn isnVar, fdau fdauVar, fdap fdapVar, fcxy fcxyVar) {
        Object objA = fdjy.a(new dyv(isnVar, fdauVar, fdapVar, new dwr(isnVar), null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public static final Object d(isn isnVar, fdap fdapVar, fdap fdapVar2, fdau fdauVar, fdap fdapVar3, fcxy fcxyVar) {
        Object objA = fdjy.a(new dzh(isnVar, fdauVar, fdapVar2, fdapVar, fdapVar3, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.ire r7, defpackage.iru r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.dzj
            if (r0 == 0) goto L13
            r0 = r9
            dzj r0 = (defpackage.dzj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dzj r0 = new dzj
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fdci r7 = r0.c
            defpackage.fctl.b(r9)     // Catch: defpackage.irv -> L5a
            goto L56
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r9)
            fdci r9 = new fdci
            r9.<init>()
            dvp r2 = defpackage.dvp.a
            r9.a = r2
            jou r2 = r7.q()     // Catch: defpackage.irv -> L5a
            long r4 = r2.f()     // Catch: defpackage.irv -> L5a
            dzk r2 = new dzk     // Catch: defpackage.irv -> L5a
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: defpackage.irv -> L5a
            r0.c = r9     // Catch: defpackage.irv -> L5a
            r0.b = r3     // Catch: defpackage.irv -> L5a
            java.lang.Object r7 = r7.s(r4, r2, r0)     // Catch: defpackage.irv -> L5a
            if (r7 == r1) goto L59
            r7 = r9
        L56:
            java.lang.Object r7 = r7.a
            return r7
        L59:
            return r1
        L5a:
            dvr r7 = defpackage.dvr.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzm.e(ire, iru, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b1 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.ire r17, defpackage.iru r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzm.f(ire, iru, fcxy):java.lang.Object");
    }

    public static /* synthetic */ Object g(ire ireVar, iru iruVar, fcxy fcxyVar, int i) {
        if ((i & 2) != 0) {
            iruVar = iru.b;
        }
        return a(ireVar, 1 == (i & 1), iruVar, fcxyVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.ire r6, defpackage.iru r7, defpackage.fcxy r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dyn
            if (r0 == 0) goto L13
            r0 = r8
            dyn r0 = (defpackage.dyn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dyn r0 = new dyn
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            iru r6 = r0.d
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.fctl.b(r8)
        L39:
            r0.a = r6
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r6.r(r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            irs r8 = (defpackage.irs) r8
            r2 = 0
            boolean r4 = m(r8, r2, r3)
            if (r4 != 0) goto L50
            goto L39
        L50:
            java.util.List r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzm.h(ire, iru, fcxy):java.lang.Object");
    }

    public static /* synthetic */ Object i(isn isnVar, fdap fdapVar, fdap fdapVar2, fdau fdauVar, fdap fdapVar3, fcxy fcxyVar, int i) {
        if ((i & 4) != 0) {
            fdauVar = a;
        }
        fdau fdauVar2 = fdauVar;
        int i2 = i & 2;
        int i3 = i & 1;
        return d(isnVar, 1 != i3 ? fdapVar : null, i2 != 0 ? null : fdapVar2, fdauVar2, fdapVar3, fcxyVar);
    }

    private static final boolean m(irs irsVar, boolean z, boolean z2) {
        if (z2) {
            List list = irsVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!ita.b(((ise) list.get(i)).i, 2)) {
                        break;
                    }
                    i++;
                } else if (!irx.a(irsVar.d)) {
                    return false;
                }
            }
        }
        List list2 = irsVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ise iseVar = (ise) list2.get(i2);
            if (!(z ? irt.c(iseVar) : irt.d(iseVar))) {
                return false;
            }
        }
        return true;
    }
}
