package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjw {
    public static final ics a(ics icsVar, fic ficVar, fbh fbhVar) {
        return itf.c(icsVar, ficVar, fbhVar, new fjs(ficVar, fbhVar));
    }

    public static final ics b(ics icsVar, fdap fdapVar) {
        return itf.a(icsVar, 8675309, new fjv(fdapVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.ire r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.fjp
            if (r0 == 0) goto L13
            r0 = r8
            fjp r0 = (defpackage.fjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fjp r0 = new fjp
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
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
        L34:
            iru r8 = defpackage.iru.b
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            irs r8 = (defpackage.irs) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            ise r6 = (defpackage.ise) r6
            boolean r6 = defpackage.irt.d(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjw.c(ire, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r0v5, types: [fic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ire, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ire r16, defpackage.fic r17, defpackage.fhy r18, defpackage.irs r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjw.d(ire, fic, fhy, irs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.ire r8, defpackage.fbh r9, defpackage.irs r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.fjt
            if (r0 == 0) goto L13
            r0 = r11
            fjt r0 = (defpackage.fjt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fjt r0 = new fjt
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.b
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            goto L8b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ise r8 = r0.e
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L43:
            r8 = move-exception
            goto Lbe
        L46:
            defpackage.fctl.b(r11)
            java.util.List r10 = r10.a     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r10 = defpackage.fcva.N(r10)     // Catch: java.util.concurrent.CancellationException -> L43
            ise r10 = (defpackage.ise) r10     // Catch: java.util.concurrent.CancellationException -> L43
            long r5 = r10.a     // Catch: java.util.concurrent.CancellationException -> L43
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L43
            r0.e = r10     // Catch: java.util.concurrent.CancellationException -> L43
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r11 = defpackage.duh.f(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 != r1) goto L62
            goto Lba
        L62:
            ise r11 = (defpackage.ise) r11     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 == 0) goto Lbb
            jou r2 = r8.q()     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r10 = f(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r10 == 0) goto Lbb
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L43
            r9.c(r4)     // Catch: java.util.concurrent.CancellationException -> L43
            long r10 = r11.a     // Catch: java.util.concurrent.CancellationException -> L43
            fjn r2 = new fjn     // Catch: java.util.concurrent.CancellationException -> L43
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L43
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L43
            r4 = 0
            r0.e = r4     // Catch: java.util.concurrent.CancellationException -> L43
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r11 = defpackage.duh.j(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 == r1) goto Lba
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L43
            if (r10 == 0) goto Lb6
            irs r8 = r8.p()     // Catch: java.util.concurrent.CancellationException -> L43
            java.util.List r8 = r8.a     // Catch: java.util.concurrent.CancellationException -> L43
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L43
            r11 = 0
        L9e:
            if (r11 >= r10) goto Lb2
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            ise r0 = (defpackage.ise) r0     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r1 = defpackage.irt.e(r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r1 == 0) goto Laf
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L43
        Laf:
            int r11 = r11 + 1
            goto L9e
        Lb2:
            r9.d()     // Catch: java.util.concurrent.CancellationException -> L43
            goto Lbb
        Lb6:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L43
            goto Lbb
        Lba:
            return r1
        Lbb:
            fctx r8 = defpackage.fctx.a
            return r8
        Lbe:
            r9.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjw.e(ire, fbh, irs, fcxy):java.lang.Object");
    }

    public static final boolean f(jou jouVar, ise iseVar, ise iseVar2) {
        return ihs.a(ihs.d(iseVar.c, iseVar2.c)) < duh.a(jouVar, iseVar.i);
    }

    public static final boolean g(irs irsVar) {
        List list = irsVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!ita.b(((ise) list.get(i)).i, 2)) {
                return false;
            }
        }
        return true;
    }
}
