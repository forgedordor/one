package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chnp implements chng {
    public static final evrw b;
    public static final exvs c;
    public final dvdf d;
    private final eucy g;
    private final eygg h;
    private static final chnh e = new chnh();
    private static final eksp f = eksp.c("BugleProfiles");
    public static final String a = new String();

    static {
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.getClass();
        evrx.b(evrvVar);
        evrvVar.a("person.name");
        evrx.b(evrvVar);
        evrvVar.a("person.photo");
        evrx.b(evrvVar);
        evrvVar.a("person.metadata");
        evrx.b(evrvVar);
        evrvVar.a("person.metadata.best_display_name");
        b = evrx.a(evrvVar);
        exvr exvrVar = (exvr) exvs.a.createBuilder();
        exvrVar.getClass();
        exvrVar.copyOnWrite();
        ((exvs) exvrVar.instance).b = 2;
        evsn evsnVarBuild = exvrVar.build();
        evsnVarBuild.getClass();
        c = (exvs) evsnVarBuild;
    }

    public chnp(dvdf dvdfVar, eucy eucyVar, eygg eyggVar) {
        dvdfVar.getClass();
        eucyVar.getClass();
        eyggVar.getClass();
        this.d = dvdfVar;
        this.g = eucyVar;
        this.h = eyggVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
    
        if (r12 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
    
        if (r12 != r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [chnp] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ca -> B:24:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x010d -> B:33:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0150 -> B:41:0x0152). Please report as a decompilation issue!!! */
    @Override // defpackage.chng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.a(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.chnn
            if (r0 == 0) goto L13
            r0 = r9
            chnn r0 = (defpackage.chnn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chnn r0 = new chnn
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            goto L70
        L28:
            r7 = move-exception
            goto L93
        L2a:
            r7 = move-exception
            goto L9f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r9)
            eucy r9 = r6.g     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            euck r2 = defpackage.euck.a     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            evsf r2 = r2.createBuilder()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            eucj r2 = (defpackage.eucj) r2     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r2.getClass()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r7.getClass()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r2.copyOnWrite()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            MessageType extends evsn<MessageType, BuilderType> r5 = r2.instance     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            euck r5 = (defpackage.euck) r5     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r5.b = r7     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r2.copyOnWrite()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            MessageType extends evsn<MessageType, BuilderType> r7 = r2.instance     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            euck r7 = (defpackage.euck) r7     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r7.c = r8     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            evsn r7 = r2.build()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r7.getClass()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            euck r7 = (defpackage.euck) r7     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r0.c = r4     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            fbrg r8 = new fbrg     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            r8.<init>()     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            java.lang.Object r9 = r9.b(r7, r8, r0)     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            if (r9 != r1) goto L70
            return r1
        L70:
            eucq r9 = (defpackage.eucq) r9     // Catch: java.lang.Exception -> L28 defpackage.ehun -> L2a
            int r7 = r9.b
            r8 = 2
            if (r7 == r8) goto L83
            if (r7 != r4) goto L7e
            java.lang.Object r7 = r9.c
            eucp r7 = (defpackage.eucp) r7
            goto L80
        L7e:
            eucp r7 = defpackage.eucp.a
        L80:
            java.lang.String r7 = r7.b
            return r7
        L83:
            eksp r7 = defpackage.chnp.f
            ekrw r7 = r7.j()
            eksl r7 = (defpackage.eksl) r7
            java.lang.String r8 = "current Gaia account is not eligible for profile sharing"
            r7.q(r8)
            java.lang.String r7 = defpackage.chnp.a
            return r7
        L93:
            eksp r8 = defpackage.chnp.f
            ekrw r8 = r8.j()
            java.lang.String r9 = "getSelfProfileAccessToken encountered a generic exception. Returning null."
            defpackage.a.N(r8, r9, r7)
            return r3
        L9f:
            eksp r8 = defpackage.chnp.f
            ekrw r8 = r8.j()
            java.lang.String r9 = "getSelfProfileAccessToken encountered a grpc exception. Returning null."
            defpackage.a.N(r8, r9, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.b(java.lang.String, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chnj
            if (r0 == 0) goto L13
            r0 = r6
            chnj r0 = (defpackage.chnj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chnj r0 = new chnj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r6)     // Catch: io.grpc.StatusException -> L27 defpackage.ehun -> L29
            goto L54
        L27:
            r5 = move-exception
            goto L58
        L29:
            r5 = move-exception
            goto L66
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r6)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3f
            fcvo r5 = defpackage.fcvo.a
            return r5
        L3f:
            eksp r6 = defpackage.chnp.f
            ekrw r6 = r6.h()
            eksl r6 = (defpackage.eksl) r6
            java.lang.String r2 = "getProfileFromApiAndUpdateCache: starting"
            r6.q(r2)
            r0.c = r3     // Catch: io.grpc.StatusException -> L27 defpackage.ehun -> L29
            java.lang.Object r6 = r4.e(r5, r0)     // Catch: io.grpc.StatusException -> L27 defpackage.ehun -> L29
            if (r6 == r1) goto L57
        L54:
            java.util.List r6 = (java.util.List) r6     // Catch: io.grpc.StatusException -> L27 defpackage.ehun -> L29
            return r6
        L57:
            return r1
        L58:
            eksp r6 = defpackage.chnp.f
            ekrw r6 = r6.j()
            java.lang.String r0 = "getProfileFromApiAndUpdateCache encountered a status exception. Returning emptyList."
            defpackage.a.N(r6, r0, r5)
            fcvo r5 = defpackage.fcvo.a
            return r5
        L66:
            eksp r6 = defpackage.chnp.f
            ekrw r6 = r6.j()
            java.lang.String r0 = "getProfileFromApiAndUpdateCache encountered a grpc exception. Returning emptyList."
            defpackage.a.N(r6, r0, r5)
            fcvo r5 = defpackage.fcvo.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.c(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.chnk
            if (r0 == 0) goto L13
            r0 = r9
            chnk r0 = (defpackage.chnk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            chnk r0 = new chnk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.fctl.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.fctl.b(r9)
            return r9
        L3a:
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)     // Catch: io.grpc.StatusException -> L40 defpackage.ehun -> L42
            goto L68
        L40:
            r9 = move-exception
            goto L6b
        L42:
            r9 = move-exception
            goto L82
        L44:
            defpackage.fctl.b(r9)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L50
            fcvo r8 = defpackage.fcvo.a
            return r8
        L50:
            eksp r9 = defpackage.chnp.f
            ekrw r9 = r9.h()
            eksl r9 = (defpackage.eksl) r9
            java.lang.String r2 = "getProfileFromApiWithCacheFallback: starting"
            r9.q(r2)
            r0.a = r8     // Catch: io.grpc.StatusException -> L40 defpackage.ehun -> L42
            r0.d = r6     // Catch: io.grpc.StatusException -> L40 defpackage.ehun -> L42
            java.lang.Object r9 = r7.e(r8, r0)     // Catch: io.grpc.StatusException -> L40 defpackage.ehun -> L42
            if (r9 != r1) goto L68
            goto L97
        L68:
            java.util.List r9 = (java.util.List) r9     // Catch: io.grpc.StatusException -> L40 defpackage.ehun -> L42
            return r9
        L6b:
            eksp r2 = defpackage.chnp.f
            ekrw r2 = r2.j()
            java.lang.String r5 = "getProfileFromApiWithCacheFallback encountered a status exception. Falling back to cache."
            defpackage.a.N(r2, r5, r9)
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r7.f(r8, r0)
            if (r8 != r1) goto L81
            goto L97
        L81:
            return r8
        L82:
            eksp r2 = defpackage.chnp.f
            ekrw r2 = r2.j()
            java.lang.String r4 = "getProfileFromApiWithCacheFallback encountered a grpc exception. Falling back to cache."
            defpackage.a.N(r2, r4, r9)
            r0.a = r3
            r0.d = r5
            java.lang.Object r8 = r7.f(r8, r0)
            if (r8 != r1) goto L98
        L97:
            return r1
        L98:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.d(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.e(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0067 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.chnm
            if (r0 == 0) goto L13
            r0 = r7
            chnm r0 = (defpackage.chnm) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            chnm r0 = new chnm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L6a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L3f
            fcvo r6 = defpackage.fcvo.a
            return r6
        L3f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r2 = r7
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r6.next()
            chpo r7 = (defpackage.chpo) r7
            eygg r4 = r5.h
            java.lang.Object r4 = r4.b()
            chnt r4 = (defpackage.chnt) r4
            r0.a = r2
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r4.a(r7, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            egnd r7 = (defpackage.egnd) r7
            if (r7 == 0) goto L73
            java.lang.Object r7 = r7.a
            chpk r7 = (defpackage.chpk) r7
            goto L74
        L73:
            r7 = 0
        L74:
            if (r7 == 0) goto L49
            r2.add(r7)
            goto L49
        L7a:
            eksp r6 = defpackage.chnp.f
            ekrw r6 = r6.h()
            eksl r6 = (defpackage.eksl) r6
            int r7 = r2.size()
            java.lang.String r0 = "getProfilesFromCache: fetching %s profiles from cache"
            r6.r(r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.f(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:23:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.chno
            if (r0 == 0) goto L13
            r0 = r8
            chno r0 = (defpackage.chno) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            chno r0 = new chno
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.fctl.b(r8)
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r7, r2)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r8
        L49:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r2.next()
            chpk r8 = (defpackage.chpk) r8
            eygg r4 = r6.h
            java.lang.Object r4 = r4.b()
            chnt r4 = (defpackage.chnt) r4
            chpo r5 = r8.f
            if (r5 != 0) goto L63
            chpo r5 = defpackage.chpo.a
        L63:
            r5.getClass()
            r0.a = r7
            r0.b = r2
            r0.c = r7
            r0.f = r3
            java.lang.Object r8 = r4.e(r5, r8, r0)
            if (r8 == r1) goto L7c
            r4 = r7
        L75:
            fctx r8 = defpackage.fctx.a
            r7.add(r8)
            r7 = r4
            goto L49
        L7c:
            return r1
        L7d:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chnp.g(java.util.List, fcxy):java.lang.Object");
    }
}
