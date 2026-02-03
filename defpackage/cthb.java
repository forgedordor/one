package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthb {
    public static final Set a = fcur.O(le.b);
    public static final Set b = fcur.O(le.a);
    public static final List c = fcva.g("address", "datetime", "email", "phone", "url");
    public static final List d = fcva.g("flight", "other", "");
    private static final Map e = fcwa.g(new fcti("datetime", ctht.a), new fcti("url", ctht.b), new fcti("phone", ctht.c), new fcti("email", ctht.d), new fcti("address", ctht.e));
    private final fdjx f;
    private final cugg g;

    public cthb(fdjx fdjxVar, fcsu fcsuVar, cugg cuggVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        cuggVar.getClass();
        this.f = fdjxVar;
        this.g = cuggVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ctgz
            if (r0 == 0) goto L13
            r0 = r9
            ctgz r0 = (defpackage.ctgz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctgz r0 = new ctgz
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r8 = r0.d
            defpackage.fctl.b(r9)
            goto L52
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r9)
            fdjx r9 = r7.f
            fcyi r2 = defpackage.fcyi.a
            fdjz r5 = defpackage.fdjz.a
            fcyh r2 = defpackage.eicg.a(r2)
            ctgy r6 = new ctgy
            r6.<init>(r3, r7, r8)
            fdkf r9 = defpackage.fdin.b(r9, r2, r5, r6)
            r0.d = r8
            r0.c = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto Ld6
        L52:
            j$.util.Optional r9 = (j$.util.Optional) r9
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lcf
            fcww r0 = new fcww
            r0.<init>(r3)
            java.lang.Object r9 = r9.get()
            eult r9 = (defpackage.eult) r9
            java.util.List r9 = r9.d
            java.util.Iterator r9 = r9.iterator()
        L6b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r9.next()
            r1.getClass()
            eulq r1 = (defpackage.eulq) r1
            int r2 = r1.a()
            if (r2 <= 0) goto L6b
            java.util.Map r2 = defpackage.cthb.e
            r3 = 0
            java.lang.String r4 = r1.b(r3)
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L6b
            java.lang.String r3 = r1.b(r3)
            r3.getClass()
            java.lang.String r4 = "url"
            boolean r4 = defpackage.fdbq.f(r3, r4)
            if (r4 == 0) goto Lb4
            int r4 = r1.b
            int r1 = r1.c
            java.lang.CharSequence r1 = r8.subSequence(r4, r1)
            java.lang.String r1 = r1.toString()
            boolean r1 = defpackage.csss.c(r1)
            if (r1 == 0) goto Lb4
            ctht r1 = defpackage.ctht.f
            r0.add(r1)
            goto L6b
        Lb4:
            java.lang.Object r1 = r2.get(r3)
            r1.getClass()
            r0.add(r1)
            goto L6b
        Lbf:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto Lca
            ctht r8 = defpackage.ctht.i
            r0.add(r8)
        Lca:
            java.util.List r8 = defpackage.fcva.a(r0)
            return r8
        Lcf:
            ctht r8 = defpackage.ctht.i
            java.util.List r8 = defpackage.fcva.b(r8)
            return r8
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cthb.a(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ctha
            if (r0 == 0) goto L13
            r0 = r6
            ctha r0 = (defpackage.ctha) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctha r0 = new ctha
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cugg r6 = r4.g
            eiju r6 = r6.a()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            j$.util.Optional r6 = (j$.util.Optional) r6
            ctgw r0 = new ctgw
            r0.<init>()
            ctgx r5 = new ctgx
            r5.<init>()
            j$.util.Optional r5 = r6.map(r5)
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cthb.b(java.lang.String, fcxy):java.lang.Object");
    }
}
