package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmao implements dmai {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/source/FileAudioSource");
    public final dlwu b;
    public volatile boolean c;
    public boolean d;
    public boolean e;
    public final fdue f;
    public final fduj g;
    public dlww h;
    private final fdjx i;
    private final dmap j;
    private fdlr k;
    private fdlr l;

    public dmao(fdjx fdjxVar, dlwu dlwuVar, dmap dmapVar) {
        fdjxVar.getClass();
        this.i = fdjxVar;
        this.b = dlwuVar;
        this.j = dmapVar;
        fdue fdueVarE = fdun.e(0, 0, 0, 7);
        this.f = fdueVarE;
        this.g = new fdug(fdueVarE);
    }

    @Override // defpackage.dmai
    public final Object a(fcxy fcxyVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.dmam
            if (r0 == 0) goto L13
            r0 = r9
            dmam r0 = (defpackage.dmam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmam r0 = new dmam
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dmao r0 = r0.d
            defpackage.fctl.b(r9)
            goto L94
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.fctl.b(r9)
            dmap r9 = r8.j
            ekrg r2 = defpackage.dmao.a
            ekrw r2 = r2.h()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "HugoAudio"
            r2.X(r4, r5)
            r4 = 52
            java.lang.String r5 = "FileAudioSource.kt"
            java.lang.String r6 = "com/google/android/libraries/compose/audio/source/FileAudioSource"
            java.lang.String r7 = "prepare"
            ekrw r2 = r2.h(r6, r7, r4, r5)
            ekrd r2 = (defpackage.ekrd) r2
            android.net.Uri r4 = r9.a
            java.util.Objects.toString(r4)
            java.lang.String r5 = r4.toString()
            java.lang.String r6 = "audioUri = "
            java.lang.String r5 = r6.concat(r5)
            ebsu r9 = r9.b
            java.util.Objects.toString(r9)
            java.lang.String r6 = r9.toString()
            java.lang.String r7 = "sourcePolicy = "
            java.lang.String r6 = r7.concat(r6)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r6 = 63
            r7 = 0
            java.lang.String r5 = defpackage.fcur.S(r5, r7, r7, r7, r6)
            java.lang.String r6 = "Preparing FileAudioSource with configuration %s"
            r2.t(r6, r5)
            dlwu r2 = r8.b
            r0.d = r8
            r0.c = r3
            dlwr r3 = new dlwr
            r3.<init>(r2, r4, r9, r7)
            fcyh r9 = r2.b
            java.lang.Object r9 = defpackage.fdin.a(r9, r3, r0)
            if (r9 != r1) goto L93
            return r1
        L93:
            r0 = r8
        L94:
            dlww r9 = (defpackage.dlww) r9
            r0.h = r9
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmao.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r10.fO(r2, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dman
            if (r0 == 0) goto L13
            r0 = r10
            dman r0 = (defpackage.dman) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dman r0 = new dman
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r10)
            goto L75
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            defpackage.fctl.b(r10)
            goto L66
        L37:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.dmao.a
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r6 = "HugoAudio"
            r10.X(r2, r6)
            r2 = 80
            java.lang.String r6 = "FileAudioSource.kt"
            java.lang.String r7 = "com/google/android/libraries/compose/audio/source/FileAudioSource"
            java.lang.String r8 = "release"
            ekrw r10 = r10.h(r7, r8, r2, r6)
            ekrd r10 = (defpackage.ekrd) r10
            dmap r2 = r9.j
            java.lang.String r6 = "Releasing FileAudioSource for %s"
            android.net.Uri r2 = r2.a
            r10.t(r6, r2)
            r0.c = r5
            java.lang.Object r10 = r9.e(r0)
            if (r10 == r1) goto L96
        L66:
            fdue r10 = r9.f
            dlyn r2 = new dlyn
            r2.<init>(r3)
            r0.c = r4
            java.lang.Object r10 = r10.fO(r2, r0)
            if (r10 == r1) goto L96
        L75:
            dlwu r10 = r9.b
            android.media.MediaCodec r0 = r10.d
            if (r0 == 0) goto L8c
            r0.stop()
            android.media.MediaCodec r0 = r10.d
            if (r0 != 0) goto L88
            java.lang.String r0 = "mediaCodec"
            defpackage.fdbq.c(r0)
            goto L89
        L88:
            r3 = r0
        L89:
            r3.release()
        L8c:
            android.media.MediaExtractor r10 = r10.c
            if (r10 == 0) goto L93
            r10.release()
        L93:
            fctx r10 = defpackage.fctx.a
            return r10
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmao.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.dlym
    public final Object d(fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/source/FileAudioSource", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 58, "FileAudioSource.kt")).t("Starting FileAudioSource for %s", this.j.a);
        if (this.k != null || this.l != null) {
            throw new IllegalStateException("FileAudioSource cannot resume while previous jobs are active.");
        }
        this.c = true;
        fdjx fdjxVar = this.i;
        this.k = fdil.d(fdjxVar, null, null, new dmak(this, null), 3);
        this.l = fdil.d(fdjxVar, null, null, new dmal(this, null), 3);
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r6.o(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dmaj
            if (r0 == 0) goto L13
            r0 = r6
            dmaj r0 = (defpackage.dmaj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmaj r0 = new dmaj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L48
        L36:
            defpackage.fctl.b(r6)
            r6 = 0
            r5.c = r6
            fdlr r6 = r5.k
            if (r6 == 0) goto L48
            r0.c = r4
            java.lang.Object r6 = r6.o(r0)
            if (r6 == r1) goto L54
        L48:
            fdlr r6 = r5.l
            if (r6 == 0) goto L55
            r0.c = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            r6 = 0
            r5.k = r6
            r5.l = r6
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmao.e(fcxy):java.lang.Object");
    }
}
