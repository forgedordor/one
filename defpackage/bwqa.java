package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqa {
    public final fcsu a;
    private final fcyh b;
    private final fcsu c;
    private final fcsu d;

    public bwqa(fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcyhVar;
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.d = fcsuVar3;
    }

    private static final List e(List list) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((btmj) it.next()).m());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aubq r10, defpackage.elyd r11, java.util.List r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqa.a(aubq, elyd, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bwpw
            if (r0 == 0) goto L13
            r0 = r7
            bwpw r0 = (defpackage.bwpw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwpw r0 = new bwpw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.b
            fcyh r7 = defpackage.eicg.a(r7)
            bwpv r2 = new bwpv
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqa.b(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bwpx
            if (r0 == 0) goto L13
            r0 = r8
            bwpx r0 = (defpackage.bwpx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bwpx r0 = new bwpx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L3e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 == r1) goto Ld0
        L3e:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = 10
            int r1 = defpackage.fcva.p(r8, r0)
            int r1 = defpackage.fcwa.a(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 16
            int r1 = defpackage.fddu.f(r1, r3)
            r2.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L5c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r8.next()
            r4 = r1
            bkvw r4 = (defpackage.bkvw) r4
            java.lang.String r4 = r4.g()
            r2.put(r4, r1)
            goto L5c
        L71:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r0 = defpackage.fcva.p(r7, r0)
            int r0 = defpackage.fcwa.a(r0)
            int r0 = defpackage.fddu.f(r0, r3)
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo r3 = new com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo
            java.lang.Object r1 = r2.get(r1)
            bkvw r1 = (defpackage.bkvw) r1
            fcww r4 = new fcww
            r5 = 0
            r4.<init>(r5)
            if (r1 == 0) goto Lb9
            boolean r5 = r1.j()
            if (r5 == 0) goto Lae
            bwus r5 = defpackage.bwus.b
            r4.add(r5)
        Lae:
            boolean r1 = r1.k()
            if (r1 == 0) goto Lb9
            bwus r1 = defpackage.bwus.c
            r4.add(r1)
        Lb9:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lc4
            bwus r1 = defpackage.bwus.a
            r4.add(r1)
        Lc4:
            java.util.List r1 = defpackage.fcva.a(r4)
            r3.<init>(r1)
            r8.put(r0, r3)
            goto L86
        Lcf:
            return r8
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqa.c(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bwpy
            if (r0 == 0) goto L13
            r0 = r9
            bwpy r0 = (defpackage.bwpy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwpy r0 = new bwpy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r8 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L55
        L2a:
            r9 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "E2eeInfoDataLoader#getRegistrations"
            eieu r9 = defpackage.eiiy.h(r9)
            fcyh r2 = r7.b     // Catch: java.lang.Throwable -> L5c
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L5c
            bwpz r5 = new bwpz     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L5c
            r0.d = r9     // Catch: java.lang.Throwable -> L5c
            r0.c = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r8 == r1) goto L5b
            r6 = r9
            r9 = r8
            r8 = r6
        L55:
            ekgb r9 = (defpackage.ekgb) r9     // Catch: java.lang.Throwable -> L2a
            defpackage.fczl.a(r8, r3)
            return r9
        L5b:
            return r1
        L5c:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L60:
            throw r9     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqa.d(java.util.List, fcxy):java.lang.Object");
    }
}
