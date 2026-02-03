package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suu extends fcyz implements fdat {
    final /* synthetic */ sux a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suu(fcxy fcxyVar, sux suxVar) {
        super(2, fcxyVar);
        this.a = suxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #2 {all -> 0x00de, blocks: (B:3:0x000d, B:5:0x0016, B:8:0x001c, B:10:0x002d, B:11:0x0034, B:15:0x003f, B:17:0x0043, B:22:0x004e, B:25:0x0064, B:27:0x006e, B:29:0x0076, B:31:0x0088, B:33:0x00a3, B:35:0x00ab, B:37:0x00bd, B:39:0x00d8), top: B:51:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[Catch: all -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:3:0x000d, B:5:0x0016, B:8:0x001c, B:10:0x002d, B:11:0x0034, B:15:0x003f, B:17:0x0043, B:22:0x004e, B:25:0x0064, B:27:0x006e, B:29:0x0076, B:31:0x0088, B:33:0x00a3, B:35:0x00ab, B:37:0x00bd, B:39:0x00d8), top: B:51:0x000d }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.b
            fdjx r8 = (defpackage.fdjx) r8
            java.lang.String r8 = "SodaAvailability#isSodaHostAppUpToDate"
            eieu r8 = defpackage.eiiy.h(r8)
            sux r0 = r7.a     // Catch: java.lang.Throwable -> Lde
            boolean r1 = r0.a()     // Catch: java.lang.Throwable -> Lde
            r2 = 0
            if (r1 == 0) goto L1c
            aonq r0 = defpackage.aonq.a     // Catch: java.lang.Throwable -> Lde
            defpackage.fczl.a(r8, r2)
            return r0
        L1c:
            fcsu r1 = r0.b     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lde
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r1 = r1.orElse(r2)     // Catch: java.lang.Throwable -> Lde
            android.content.ComponentName r1 = (android.content.ComponentName) r1     // Catch: java.lang.Throwable -> Lde
            r3 = 1
            if (r1 == 0) goto L47
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Lde
            r1.getClass()     // Catch: java.lang.Throwable -> Lde
            android.content.pm.PackageManager r0 = r0.j     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3c java.lang.Throwable -> Lde
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3c java.lang.Throwable -> Lde
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L47
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto L47
            boolean r1 = r1.enabled     // Catch: java.lang.Throwable -> Lde
            if (r1 == r3) goto L48
        L47:
            r0 = r2
        L48:
            java.lang.String r1 = "com.google.android.tts"
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            if (r0 != 0) goto L6e
            eksp r0 = defpackage.sux.a     // Catch: java.lang.Throwable -> Lde
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> Lde
            eksl r0 = (defpackage.eksl) r0     // Catch: java.lang.Throwable -> Lde
            java.lang.String r5 = "SODA unavailable, no RecognitionService component found."
            r0.q(r5)     // Catch: java.lang.Throwable -> Lde
            aonu r0 = new aonu     // Catch: java.lang.Throwable -> Lde
            aons r5 = new aons     // Catch: java.lang.Throwable -> Lde
            boolean r6 = defpackage.craf.e     // Catch: java.lang.Throwable -> Lde
            if (r3 == r6) goto L64
            r1 = r4
        L64:
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lde
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lde
            defpackage.fczl.a(r8, r2)
            goto Ldd
        L6e:
            java.lang.String r3 = r0.packageName     // Catch: java.lang.Throwable -> Lde
            boolean r3 = defpackage.fdbq.f(r3, r4)     // Catch: java.lang.Throwable -> Lde
            if (r3 == 0) goto La3
            int r3 = r0.versionCode     // Catch: java.lang.Throwable -> Lde
            cczi r5 = defpackage.stt.a     // Catch: java.lang.Throwable -> Lde
            cczi r5 = defpackage.stt.h     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r5 = r5.e()     // Catch: java.lang.Throwable -> Lde
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> Lde
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Lde
            if (r3 >= r5) goto La3
            eksp r0 = defpackage.sux.a     // Catch: java.lang.Throwable -> Lde
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> Lde
            eksl r0 = (defpackage.eksl) r0     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "SODA unavailable, AGSA below minimum required version."
            r0.q(r1)     // Catch: java.lang.Throwable -> Lde
            aonu r0 = new aonu     // Catch: java.lang.Throwable -> Lde
            aonr r1 = new aonr     // Catch: java.lang.Throwable -> Lde
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lde
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lde
            defpackage.fczl.a(r8, r2)
            goto Ldd
        La3:
            java.lang.String r3 = r0.packageName     // Catch: java.lang.Throwable -> Lde
            boolean r3 = defpackage.fdbq.f(r3, r1)     // Catch: java.lang.Throwable -> Lde
            if (r3 == 0) goto Ld8
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> Lde
            cczi r3 = defpackage.stt.a     // Catch: java.lang.Throwable -> Lde
            cczi r3 = defpackage.stt.i     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r3 = r3.e()     // Catch: java.lang.Throwable -> Lde
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> Lde
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lde
            if (r0 >= r3) goto Ld8
            eksp r0 = defpackage.sux.a     // Catch: java.lang.Throwable -> Lde
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> Lde
            eksl r0 = (defpackage.eksl) r0     // Catch: java.lang.Throwable -> Lde
            java.lang.String r3 = "SODA unavailable, SSBG below minimum required version."
            r0.q(r3)     // Catch: java.lang.Throwable -> Lde
            aonu r0 = new aonu     // Catch: java.lang.Throwable -> Lde
            aonr r3 = new aonr     // Catch: java.lang.Throwable -> Lde
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lde
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lde
            defpackage.fczl.a(r8, r2)
            goto Ldd
        Ld8:
            aonq r0 = defpackage.aonq.a     // Catch: java.lang.Throwable -> Lde
            defpackage.fczl.a(r8, r2)
        Ldd:
            return r0
        Lde:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Le0
        Le0:
            r1 = move-exception
            defpackage.fczl.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        suu suuVar = new suu(fcxyVar, this.a);
        suuVar.b = obj;
        return suuVar;
    }
}
