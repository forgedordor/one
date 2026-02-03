package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxix implements dxia {
    private static final eksp a = eksp.c("GnpSdk");
    private final dxrk b;
    private final dxlw c;

    public dxix(dxrk dxrkVar, dxlw dxlwVar) {
        dxrkVar.getClass();
        dxlwVar.getClass();
        this.b = dxrkVar;
        this.c = dxlwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r6.length() != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r6.b == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r0.length() != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r0.length() == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        r6 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r6 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        r6 = defpackage.evkh.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        r6 = defpackage.evjs.b(r6.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        r6 = defpackage.evjs.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        if (r6 != defpackage.evjs.IN_APP) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        return defpackage.dxiu.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        return defpackage.dxiu.b;
     */
    @Override // defpackage.dxia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dxiu a(defpackage.evih r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto Lae
        L4:
            int r0 = r6.b
            r1 = r0 & 4
            if (r1 == 0) goto L1d
            evjg r6 = r6.e
            if (r6 != 0) goto L10
            evjg r6 = defpackage.evjg.a
        L10:
            java.lang.String r6 = r6.e
            r6.getClass()
            int r6 = r6.length()
            if (r6 == 0) goto Lae
            goto Lab
        L1d:
            r0 = r0 & 8
            if (r0 == 0) goto Lae
            evkh r0 = r6.f
            if (r0 != 0) goto L27
            evkh r0 = defpackage.evkh.a
        L27:
            int r0 = r0.b
            evkg r0 = defpackage.evkg.b(r0)
            if (r0 != 0) goto L31
            evkg r0 = defpackage.evkg.UNKNOWN_INSTRUCTION
        L31:
            r0.getClass()
            r1 = 5
            evkg[] r1 = new defpackage.evkg[r1]
            r2 = 0
            evkg r3 = defpackage.evkg.SYNC
            r1[r2] = r3
            r2 = 1
            evkg r3 = defpackage.evkg.FULL_SYNC
            r1[r2] = r3
            evkg r2 = defpackage.evkg.STORE_ALL_ACCOUNTS
            r3 = 2
            r1[r3] = r2
            r3 = 3
            evkg r4 = defpackage.evkg.UPDATE_THREAD
            r1[r3] = r4
            evkg r3 = defpackage.evkg.UPDATE_BADGE_COUNT
            r4 = 4
            r1[r4] = r3
            java.util.List r1 = defpackage.fcva.g(r1)
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto Lae
            if (r0 != r3) goto L6b
            evju r6 = r6.g
            if (r6 != 0) goto L62
            evju r6 = defpackage.evju.a
        L62:
            long r0 = r6.b
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lab
            goto Lae
        L6b:
            if (r0 == r2) goto Lab
            boolean r0 = defpackage.fbdc.b()
            if (r0 == 0) goto L85
            evjx r0 = r6.d
            if (r0 != 0) goto L79
            evjx r0 = defpackage.evjx.a
        L79:
            java.lang.String r0 = r0.d
            r0.getClass()
            int r0 = r0.length()
            if (r0 == 0) goto Lae
            goto L91
        L85:
            java.lang.String r0 = r6.c
            r0.getClass()
            int r0 = r0.length()
            if (r0 != 0) goto L91
            goto Lae
        L91:
            evkh r6 = r6.f
            if (r6 != 0) goto L97
            evkh r6 = defpackage.evkh.a
        L97:
            int r6 = r6.c
            evjs r6 = defpackage.evjs.b(r6)
            if (r6 != 0) goto La1
            evjs r6 = defpackage.evjs.UNKNOWN
        La1:
            evjs r0 = defpackage.evjs.IN_APP
            if (r6 != r0) goto La8
            dxiu r6 = defpackage.dxiu.c
            return r6
        La8:
            dxiu r6 = defpackage.dxiu.b
            return r6
        Lab:
            dxiu r6 = defpackage.dxiu.b
            return r6
        Lae:
            dxiu r6 = defpackage.dxiu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxix.a(evih):dxiu");
    }

    @Override // defpackage.dxia
    public final Object b(evih evihVar, fcxy fcxyVar) {
        return fbdc.b() ? d(evihVar, fcxyVar) : c(evihVar, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e0, code lost:
    
        if (r13 == r1) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:52:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0097 -> B:52:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e8 -> B:52:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0112 -> B:48:0x0113). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.evih r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxix.c(evih, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.evih r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dxiw
            if (r0 == 0) goto L13
            r0 = r6
            dxiw r0 = (defpackage.dxiw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxiw r0 = new dxiw
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
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r5.b
            r6 = r6 & 2
            if (r6 == 0) goto L43
            evjx r5 = r5.d
            if (r5 != 0) goto L40
            evjx r5 = defpackage.evjx.a
        L40:
            java.lang.String r5 = r5.d
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 == 0) goto Laa
            int r6 = r5.length()
            if (r6 != 0) goto L4d
            goto Laa
        L4d:
            dxrk r6 = r4.b
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto La9
        L59:
            dxft r6 = (defpackage.dxft) r6
            boolean r0 = r6 instanceof defpackage.dxfx
            if (r0 == 0) goto L8d
            dxfx r6 = (defpackage.dxfx) r6
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r6.next()
            dxhe r0 = (defpackage.dxhe) r0
            java.lang.String r1 = r0.p()
            boolean r1 = defpackage.fdbq.f(r1, r5)
            if (r1 == 0) goto L69
            dxfx r5 = new dxfx
            r5.<init>(r0)
            return r5
        L85:
            dxfp r5 = new dxfp
            java.lang.String r6 = "An account with the requested RTID was not found in storage"
            r5.<init>(r6)
            return r5
        L8d:
            boolean r5 = r6 instanceof defpackage.dxfo
            if (r5 == 0) goto La3
            dxfo r6 = (defpackage.dxfo) r6
            eksp r5 = defpackage.dxix.a
            ekrw r5 = r5.j()
            java.lang.Throwable r0 = r6.a()
            java.lang.String r1 = "Failed to fetch accounts from storage."
            defpackage.a.N(r5, r1, r0)
            return r6
        La3:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        La9:
            return r1
        Laa:
            eksp r5 = defpackage.dxix.a
            ekrw r5 = r5.i()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r6 = "Representative target id in payload is empty, can't find account"
            r5.q(r6)
            dxfp r5 = new dxfp
            java.lang.String r6 = "Payload does not contain an RTID"
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxix.d(evih, fcxy):java.lang.Object");
    }
}
