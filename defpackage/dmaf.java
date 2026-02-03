package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmaf implements dlzq {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/sink/FileAudioSink");
    public final fdjx b;
    public final dlxh c;
    public final dlwq d;
    public final Optional e;
    public final dmag f;
    public final fdjc g = new fdjd();
    public final fduj h;
    public dlwv i;
    public volatile boolean j;
    public boolean k;
    public fdlr l;
    private final fcyh m;
    private fdlr n;
    private fdlr o;

    public dmaf(fcyh fcyhVar, fdjx fdjxVar, dlxh dlxhVar, dlwq dlwqVar, Optional optional, dmag dmagVar) {
        this.m = fcyhVar;
        this.b = fdjxVar;
        this.c = dlxhVar;
        this.d = dlwqVar;
        this.e = optional;
        this.f = dmagVar;
        this.h = dmagVar.c;
        Instant.EPOCH.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (defpackage.fdlw.a(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dlzr
            if (r0 == 0) goto L13
            r0 = r6
            dlzr r0 = (defpackage.dlzr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlzr r0 = new dlzr
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
            r5.j = r6
            fdlr r6 = r5.n
            if (r6 == 0) goto L48
            r0.c = r4
            java.lang.Object r6 = defpackage.fdlw.a(r6, r0)
            if (r6 == r1) goto L54
        L48:
            fdlr r6 = r5.o
            if (r6 == 0) goto L55
            r0.c = r3
            java.lang.Object r6 = defpackage.fdlw.a(r6, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            r6 = 0
            r5.n = r6
            r5.o = r6
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmaf.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.dlym
    public final Object b(fcxy fcxyVar) {
        Object objA = fdin.a(this.m, new dmac(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dmad
            if (r0 == 0) goto L13
            r0 = r8
            dmad r0 = (defpackage.dmad) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmad r0 = new dmad
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L5e
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.fctl.b(r8)
            ekrg r8 = defpackage.dmaf.a
            ekrw r8 = r8.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "HugoAudio"
            r8.X(r2, r4)
            r2 = 193(0xc1, float:2.7E-43)
            java.lang.String r4 = "FileAudioSink.kt"
            java.lang.String r5 = "com/google/android/libraries/compose/audio/sink/FileAudioSink"
            java.lang.String r6 = "release"
            ekrw r8 = r8.h(r5, r6, r2, r4)
            ekrd r8 = (defpackage.ekrd) r8
            dmag r2 = r7.f
            java.lang.String r4 = "Releasing FileAudioSink for %s"
            android.net.Uri r2 = r2.a
            r8.t(r4, r2)
            r0.c = r3
            java.lang.Object r8 = r7.a(r0)
            if (r8 == r1) goto L68
        L5e:
            dlwv r8 = r7.i
            if (r8 == 0) goto L65
            r8.h()
        L65:
            fctx r8 = defpackage.fctx.a
            return r8
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmaf.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.dlym
    public final Object d(fcxy fcxyVar) throws Throwable {
        if (!h()) {
            throw new IllegalStateException("This instance needs to be prepared prior to starting");
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/sink/FileAudioSink", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 81, "FileAudioSink.kt")).t("Starting FileAudioSink for %s", this.f.a);
        Object objG = g(fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r7.j.a(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Exception r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dlzs
            if (r0 == 0) goto L13
            r0 = r7
            dlzs r0 = (defpackage.dlzs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlzs r0 = new dlzs
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 == r1) goto L60
        L45:
            fdjc r7 = r5.g
            r2 = r6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r7.a(r2)
            dmag r7 = r5.f
            r2 = 0
            r0.a = r2
            r0.d = r3
            fdat r7 = r7.j
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L5d
            goto L60
        L5d:
            fctx r6 = defpackage.fctx.a
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmaf.e(java.lang.Exception, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dlzt
            if (r0 == 0) goto L13
            r0 = r8
            dlzt r0 = (defpackage.dlzt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlzt r0 = new dlzt
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r8)
            return r0
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.fctl.b(r8)
            fdjd r8 = new fdjd
            r8.<init>()
            fdjx r2 = r7.b
            dlzy r4 = new dlzy
            r5 = 0
            r4.<init>(r7, r8, r5)
            r6 = 3
            fdlr r2 = defpackage.fdil.d(r2, r5, r5, r4, r6)
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.hJ(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmaf.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dmae
            if (r0 == 0) goto L13
            r0 = r6
            dmae r0 = (defpackage.dmae) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmae r0 = new dmae
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            dmaf r0 = r0.d
            defpackage.fctl.b(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            fdlr r6 = r5.n
            if (r6 != 0) goto L6d
            fdlr r6 = r5.o
            if (r6 != 0) goto L6d
            dlwv r6 = r5.i
            if (r6 != 0) goto L47
            java.lang.String r6 = "encoder"
            defpackage.fdbq.c(r6)
            r6 = r4
        L47:
            r6.i()
            r5.j = r3
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r5.f(r0)
            if (r6 == r1) goto L6c
            r0 = r5
        L57:
            fdlr r6 = (defpackage.fdlr) r6
            r0.n = r6
            fdjx r6 = r5.b
            dmab r0 = new dmab
            r0.<init>(r5, r4)
            r1 = 3
            fdlr r6 = defpackage.fdil.d(r6, r4, r4, r0, r1)
            r5.o = r6
            fctx r6 = defpackage.fctx.a
            return r6
        L6c:
            return r1
        L6d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "FileAudioSink cannot start while previous jobs are active."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmaf.g(fcxy):java.lang.Object");
    }

    public final boolean h() {
        return this.i != null;
    }
}
