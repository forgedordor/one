package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmak extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmak(dmao dmaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r1.f.fO(r2, r10) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x0019, B:13:0x0026, B:15:0x002c, B:17:0x0030, B:20:0x0043, B:22:0x0049, B:23:0x0066, B:8:0x001d), top: B:31:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x0019, B:13:0x0026, B:15:0x002c, B:17:0x0030, B:20:0x0043, B:22:0x0049, B:23:0x0066, B:8:0x001d), top: B:31:0x000e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006c -> B:13:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/audio/source/FileAudioSource$launchInputCoroutine$1"
            java.lang.String r4 = "HugoAudio"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "FileAudioSource.kt"
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1d
            if (r1 == r5) goto L19
            defpackage.fctl.b(r11)
            goto La3
        L19:
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L21
            goto L26
        L1d:
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L21
            goto L43
        L21:
            r11 = move-exception
            goto L6f
        L23:
            defpackage.fctl.b(r11)
        L26:
            dmao r11 = r10.b     // Catch: java.lang.Throwable -> L21
            boolean r1 = r11.c     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto La3
            boolean r1 = r11.d     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto La3
            dlwu r11 = r11.b     // Catch: java.lang.Throwable -> L21
            r10.a = r6     // Catch: java.lang.Throwable -> L21
            fcyh r1 = r11.b     // Catch: java.lang.Throwable -> L21
            dlws r8 = new dlws     // Catch: java.lang.Throwable -> L21
            r9 = 0
            r8.<init>(r11, r9)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r11 = defpackage.fdin.a(r1, r8, r10)     // Catch: java.lang.Throwable -> L21
            if (r11 != r0) goto L43
            goto La2
        L43:
            dlwx r11 = (defpackage.dlwx) r11     // Catch: java.lang.Throwable -> L21
            dlwx r1 = defpackage.dlwx.c     // Catch: java.lang.Throwable -> L21
            if (r11 != r1) goto L66
            ekrg r11 = defpackage.dmao.a     // Catch: java.lang.Throwable -> L21
            ekrw r11 = r11.e()     // Catch: java.lang.Throwable -> L21
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L21
            r11.X(r1, r4)     // Catch: java.lang.Throwable -> L21
            r1 = 93
            ekrw r11 = r11.h(r3, r2, r1, r7)     // Catch: java.lang.Throwable -> L21
            ekrd r11 = (defpackage.ekrd) r11     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "Reached end of input file, stopping input coroutine."
            r11.q(r1)     // Catch: java.lang.Throwable -> L21
            dmao r11 = r10.b     // Catch: java.lang.Throwable -> L21
            r11.d = r6     // Catch: java.lang.Throwable -> L21
            goto La3
        L66:
            r10.a = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Object r11 = defpackage.fdnh.a(r10)     // Catch: java.lang.Throwable -> L21
            if (r11 == r0) goto La2
            goto L26
        L6f:
            ekrg r1 = defpackage.dmao.a
            ekrw r1 = r1.j()
            ekrz r5 = defpackage.eksq.a
            r1.X(r5, r4)
            ekrd r1 = (defpackage.ekrd) r1
            ekrw r1 = r1.g(r11)
            r4 = 100
            ekrw r1 = r1.h(r3, r2, r4, r7)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "Error in decoding input coroutine."
            r1.q(r2)
            dmao r1 = r10.b
            defpackage.dmao.f(r1)
            dlyn r2 = new dlyn
            r2.<init>(r11)
            r11 = 3
            r10.a = r11
            fdue r11 = r1.f
            java.lang.Object r11 = r11.fO(r2, r10)
            if (r11 != r0) goto La3
        La2:
            return r0
        La3:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmak.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmak(this.b, fcxyVar);
    }
}
