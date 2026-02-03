package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svl implements suz {
    public static final eksp a = eksp.c("BugleVmt");
    public final Context b;
    public final ajmh c;
    private final fdjx d;
    private final sux e;
    private final ahax f;
    private final afzc g;
    private final aaft h;

    public svl(Context context, fdjx fdjxVar, sux suxVar, aaft aaftVar, ahax ahaxVar, afzc afzcVar, ajmh ajmhVar) {
        context.getClass();
        fdjxVar.getClass();
        aaftVar.getClass();
        ahaxVar.getClass();
        afzcVar.getClass();
        ajmhVar.getClass();
        this.b = context;
        this.d = fdjxVar;
        this.e = suxVar;
        this.h = aaftVar;
        this.f = ahaxVar;
        this.g = afzcVar;
        this.c = ajmhVar;
    }

    public static final int j(aooa aooaVar) {
        if (aooaVar instanceof aony) {
            aont aontVar = ((aony) aooaVar).a;
            if (aontVar instanceof aons) {
                return R.string.install_transcription_host_snackbar;
            }
            if (aontVar instanceof aonr) {
                return R.string.update_transcription_host_snackbar;
            }
            throw new fctg();
        }
        if (!(aooaVar instanceof aonz)) {
            throw new fctg();
        }
        aonz aonzVar = (aonz) aooaVar;
        int i = aonzVar.b - 1;
        if (i == 0) {
            return R.string.language_model_unsupported_snackbar;
        }
        if (i == 2 || i == 3) {
            return R.string.language_model_downloading_snackbar;
        }
        throw new IllegalStateException("Language pack for " + aonzVar.a.toLanguageTag() + " is available, an error should not have been returned.");
    }

    private final Object k(int i, int i2, int i3, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        this.f.d(true, new svc(this, i, i2, i3, fdiuVar));
        return fdiuVar.m();
    }

    @Override // defpackage.suz
    public final void a(MessageId messageId) {
        auvw.k(this.d, null, null, new svi(messageId, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.svd
            if (r0 == 0) goto L13
            r0 = r6
            svd r0 = (defpackage.svd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            svd r0 = new svd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            goto L4c
        L38:
            defpackage.fctl.b(r6)
            r0.d = r4
            r6 = 2132084994(0x7f150902, float:1.9810174E38)
            r2 = 2132084987(0x7f1508fb, float:1.981016E38)
            r4 = 2132084988(0x7f1508fc, float:1.9810162E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
            if (r6 == r1) goto L63
        L4c:
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L62
            r0.a = r6
            r0.d = r3
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            java.lang.Object r0 = r5.f(r2, r0)
            if (r0 != r1) goto L62
            goto L63
        L62:
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sve
            if (r0 == 0) goto L13
            r0 = r6
            sve r0 = (defpackage.sve) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sve r0 = new sve
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            goto L4c
        L38:
            defpackage.fctl.b(r6)
            r0.d = r4
            r6 = 2132088826(0x7f1517fa, float:1.9817946E38)
            r2 = 2132088811(0x7f1517eb, float:1.9817916E38)
            r4 = 2132088812(0x7f1517ec, float:1.9817918E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
            if (r6 == r1) goto L63
        L4c:
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L62
            r0.a = r6
            r0.d = r3
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            java.lang.Object r0 = r5.f(r2, r0)
            if (r0 != r1) goto L62
            goto L63
        L62:
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.svf
            if (r0 == 0) goto L13
            r0 = r6
            svf r0 = (defpackage.svf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            svf r0 = new svf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            goto L4c
        L38:
            defpackage.fctl.b(r6)
            r0.d = r4
            r6 = 2132084994(0x7f150902, float:1.9810174E38)
            r2 = 2132084992(0x7f150900, float:1.981017E38)
            r4 = 2132084993(0x7f150901, float:1.9810172E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
            if (r6 == r1) goto L63
        L4c:
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L62
            r0.a = r6
            r0.d = r3
            java.lang.String r2 = "com.google.android.tts"
            java.lang.Object r0 = r5.f(r2, r0)
            if (r0 != r1) goto L62
            goto L63
        L62:
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.svg
            if (r0 == 0) goto L13
            r0 = r6
            svg r0 = (defpackage.svg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            svg r0 = new svg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            goto L4c
        L38:
            defpackage.fctl.b(r6)
            r0.d = r4
            r6 = 2132088826(0x7f1517fa, float:1.9817946E38)
            r2 = 2132088814(0x7f1517ee, float:1.9817922E38)
            r4 = 2132088815(0x7f1517ef, float:1.9817924E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
            if (r6 == r1) goto L63
        L4c:
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L62
            r0.a = r6
            r0.d = r3
            java.lang.String r2 = "com.google.android.tts"
            java.lang.Object r0 = r5.f(r2, r0)
            if (r0 != r1) goto L62
            goto L63
        L62:
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r12 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r12 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.svh
            if (r0 == 0) goto L13
            r0 = r12
            svh r0 = (defpackage.svh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            svh r0 = new svh
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "android.intent.action.VIEW"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r12)
            goto La1
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            java.lang.String r11 = r0.d
            defpackage.fctl.b(r12)     // Catch: android.content.ActivityNotFoundException -> L74
            goto L71
        L3a:
            defpackage.fctl.b(r12)
            eksp r12 = defpackage.svl.a
            ekrw r12 = r12.h()
            eksl r12 = (defpackage.eksl) r12
            java.lang.String r2 = "Opening marketplace for package %s"
            r12.t(r2, r11)
            afzc r12 = r10.g     // Catch: android.content.ActivityNotFoundException -> L74
            agau r2 = new agau     // Catch: android.content.ActivityNotFoundException -> L74
            java.lang.String r6 = "App Marketplace"
            aeo r7 = new aeo     // Catch: android.content.ActivityNotFoundException -> L74
            r7.<init>()     // Catch: android.content.ActivityNotFoundException -> L74
            android.content.Intent r8 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L74
            java.lang.String r9 = "market://details?id="
            java.lang.String r9 = defpackage.a.v(r11, r9)     // Catch: android.content.ActivityNotFoundException -> L74
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: android.content.ActivityNotFoundException -> L74
            r8.<init>(r3, r9)     // Catch: android.content.ActivityNotFoundException -> L74
            r2.<init>(r6, r7, r8)     // Catch: android.content.ActivityNotFoundException -> L74
            r0.d = r11     // Catch: android.content.ActivityNotFoundException -> L74
            r0.c = r5     // Catch: android.content.ActivityNotFoundException -> L74
            java.lang.Object r12 = r12.f(r2, r0)     // Catch: android.content.ActivityNotFoundException -> L74
            if (r12 == r1) goto La0
        L71:
            adh r12 = (defpackage.adh) r12     // Catch: android.content.ActivityNotFoundException -> L74
            goto La3
        L74:
            afzc r12 = r10.g
            agau r2 = new agau
            aeo r5 = new aeo
            r5.<init>()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "https://play.google.com/store/apps/details?id="
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r7.concat(r11)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r6.<init>(r3, r11)
            java.lang.String r11 = "App Marketplace Web"
            r2.<init>(r11, r5, r6)
            r11 = 0
            r0.d = r11
            r0.c = r4
            java.lang.Object r12 = r12.f(r2, r0)
            if (r12 != r1) goto La1
        La0:
            return r1
        La1:
            adh r12 = (defpackage.adh) r12
        La3:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.f(java.lang.String, fcxy):java.lang.Object");
    }

    public final Object g(int i, fcxy fcxyVar) {
        String string = this.b.getString(i);
        string.getClass();
        Object objA = this.h.a(new aafw(string, null, true, 0, null, 117), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.Locale r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.svj
            if (r0 == 0) goto L13
            r0 = r9
            svj r0 = (defpackage.svj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            svj r0 = new svj
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r9)
            goto Lb6
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r9)
            goto L7e
        L37:
            defpackage.fctl.b(r9)
            cczi r9 = defpackage.stt.a
            android.content.Context r9 = r7.b
            boolean r9 = defpackage.stt.a(r9)
            if (r9 == 0) goto L81
            eksp r9 = defpackage.svl.a
            ekrw r9 = r9.h()
            eksl r9 = (defpackage.eksl) r9
            java.lang.String r2 = r8.toLanguageTag()
            java.lang.String r3 = "Triggering AiAi language model download for locale %s"
            r9.t(r3, r2)
            sux r9 = r7.e
            r0.c = r4
            fcsu r2 = r9.c
            java.lang.Object r2 = r2.b()
            j$.util.Optional r2 = (j$.util.Optional) r2
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L79
            fcyh r2 = r9.g
            fcyh r2 = defpackage.eicg.a(r2)
            suw r3 = new suw
            r4 = 0
            r3.<init>(r4, r9, r8)
            java.lang.Object r8 = defpackage.fdin.a(r2, r3, r0)
            if (r8 == r1) goto L7b
        L79:
            fctx r8 = defpackage.fctx.a
        L7b:
            if (r8 != r1) goto L7e
            goto Lbb
        L7e:
            fctx r8 = defpackage.fctx.a
            return r8
        L81:
            eksp r9 = defpackage.svl.a
            ekrw r9 = r9.h()
            eksl r9 = (defpackage.eksl) r9
            java.lang.String r2 = r8.toLanguageTag()
            java.lang.String r4 = "Triggering host app language model download for locale %s"
            r9.t(r4, r2)
            afzc r9 = r7.g
            agau r2 = new agau
            java.lang.String r4 = r8.toLanguageTag()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            sux r5 = r7.e
            sut r6 = new sut
            r6.<init>(r5)
            java.lang.String r5 = "soda_download_"
            java.lang.String r4 = r5.concat(r4)
            r2.<init>(r4, r6, r8)
            r0.c = r3
            java.lang.Object r9 = r9.f(r2, r0)
            if (r9 == r1) goto Lbb
        Lb6:
            spy r9 = (defpackage.spy) r9
            fctx r8 = defpackage.fctx.a
            return r8
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.h(java.util.Locale, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (g(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.aonz r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.svk
            if (r0 == 0) goto L13
            r0 = r7
            svk r0 = (defpackage.svk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            svk r0 = new svk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            aonz r6 = r0.d
            defpackage.fctl.b(r7)
            goto L4c
        L38:
            defpackage.fctl.b(r7)
            int r7 = r6.b
            r2 = 4
            if (r7 != r2) goto L4c
            java.util.Locale r7 = r6.a
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r5.h(r7, r0)
            if (r7 == r1) goto L5b
        L4c:
            int r6 = j(r6)
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r5.g(r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svl.i(aonz, fcxy):java.lang.Object");
    }
}
