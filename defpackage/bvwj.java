package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvwj extends cayv {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/identitykeycontactsync/ContactKeysLoaderHandler");
    private final fdjx b;
    private final bwaj c;
    private final aqvd d;
    private final aqvc e;

    public bvwj(fdjx fdjxVar, bwaj bwajVar, aqvd aqvdVar, aqvc aqvcVar) {
        fdjxVar.getClass();
        bwajVar.getClass();
        aqvcVar.getClass();
        this.b = fdjxVar;
        this.c = bwajVar;
        this.d = aqvdVar;
        this.e = aqvcVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("IdentityKeyParameters");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = bvxd.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bvxd bvxdVar = (bvxd) evuhVar;
        bvxdVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new bvwi(this, bvxdVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(final java.lang.String r9, java.util.List r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bvwf
            if (r0 == 0) goto L13
            r0 = r11
            bvwf r0 = (defpackage.bvwf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bvwf r0 = new bvwf
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r10 = r0.a
            java.lang.String r9 = r0.e
            defpackage.fctl.b(r11)
            goto Lb1
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.fctl.b(r11)
            r0.e = r9
            r0.a = r10
            r0.d = r3
            bkwz r11 = defpackage.bkxc.a()
            java.lang.String r0 = "IdentityKeyContactSync#getIdentityKeyFromPhoneNumber"
            r11.A(r0)
            bvwq r0 = new bvwq
            r0.<init>()
            bkwv r2 = defpackage.bkxc.c
            java.lang.Object r0 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r0, r2)
            bkww[] r0 = (defpackage.bkww[]) r0
            java.lang.Integer r2 = defpackage.bkxc.c()
            int r2 = r2.intValue()
            int r3 = r0.length
            r4 = 0
        L5d:
            if (r4 >= r3) goto L80
            r5 = r0[r4]
            ekgp r6 = defpackage.bkxc.b
            java.lang.String r5 = r5.toString()
            r7 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r5 = r6.getOrDefault(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 <= r2) goto L7d
            java.lang.String r5 = "columnReference.toString()"
            defpackage.dqru.x(r5, r2)
        L7d:
            int r4 = r4 + 1
            goto L5d
        L80:
            r11.m(r0)
            bvwr r0 = new bvwr
            r0.<init>()
            r11.c(r0)
            bvws r0 = new bvws
            r0.<init>()
            r11.c(r0)
            bkwy r11 = r11.b()
            dqqj r11 = r11.p()
            r0 = r11
            bkwx r0 = (defpackage.bkwx) r0     // Catch: java.lang.Throwable -> Lc8
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lc8
            r3 = 0
            if (r2 == 0) goto Laa
            byte[] r0 = r0.c()     // Catch: java.lang.Throwable -> Lc8
            goto Lab
        Laa:
            r0 = r3
        Lab:
            defpackage.fczl.a(r11, r3)
            if (r0 == r1) goto Lc7
            r11 = r0
        Lb1:
            byte[] r11 = (byte[]) r11
            if (r11 != 0) goto Lbd
            bvwe r11 = new bvwe
            fcvo r0 = defpackage.fcvo.a
            r11.<init>(r10, r0, r9)
            return r11
        Lbd:
            bvwe r0 = new bvwe
            java.util.List r11 = defpackage.fcva.b(r11)
            r0.<init>(r10, r11, r9)
            return r0
        Lc7:
            return r1
        Lc8:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> Lca
        Lca:
            r10 = move-exception
            defpackage.fczl.a(r11, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvwj.k(java.lang.String, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(final java.lang.String r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bvwg
            if (r0 == 0) goto L13
            r0 = r10
            bvwg r0 = (defpackage.bvwg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvwg r0 = new bvwg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r10)
            goto Lab
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.fctl.b(r10)
            r0.d = r9
            r0.c = r4
            java.lang.String r10 = "IdentityKeyContactSync#getIdentityKeyFromPhoneNumber"
            bvzt r10 = defpackage.bvzw.a(r10)
            bvwn r0 = new bvwn
            r0.<init>()
            r10.c(r0)
            bvwo r0 = new bvwo
            r0.<init>()
            r10.c(r0)
            bvzs r10 = r10.b()
            ekgb r10 = r10.z()
            r10.getClass()
            int r0 = defpackage.fcva.p(r10, r3)
            int r0 = defpackage.fcwa.a(r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r4 = 16
            int r0 = defpackage.fddu.f(r0, r4)
            r2.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L73:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r10.next()
            bvxg r0 = (defpackage.bvxg) r0
            bwaa r4 = new bwaa
            java.lang.String r5 = r0.g()
            r5.getClass()
            java.lang.String r6 = r0.f()
            r6.getClass()
            java.lang.String r7 = "google_messages_v1"
            r4.<init>(r5, r6, r7)
            byte[] r0 = r0.h()
            r0.getClass()
            fcti r5 = new fcti
            r5.<init>(r4, r0)
            java.lang.Object r0 = r5.a
            java.lang.Object r4 = r5.b
            r2.put(r0, r4)
            goto L73
        La8:
            if (r2 == r1) goto Lde
            r10 = r2
        Lab:
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r0 = r10.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.fcva.p(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lbe:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            bwaa r2 = (defpackage.bwaa) r2
            java.lang.String r2 = r2.b
            r1.add(r2)
            goto Lbe
        Ld0:
            java.util.Collection r10 = r10.values()
            java.util.List r10 = defpackage.fcva.ao(r10)
            bvwe r0 = new bvwe
            r0.<init>(r1, r10, r9)
            return r0
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvwj.l(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        if (r13 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        if (r13 != r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [bvwj] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0164 -> B:29:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0168 -> B:58:0x0177). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.bvxd r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvwj.m(bvxd, fcxy):java.lang.Object");
    }
}
