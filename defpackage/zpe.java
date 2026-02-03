package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpe {
    public final ascy b;
    public final fduf c;
    public final fduf d;
    private final fcsu g;
    private final fdjx h;
    private Map i;
    private final fdlr j;
    private static final Map e = fcwa.g(new fcti("Screen_Effects_Olympics", "olympics_effect.binarypb"), new fcti("Screen_Effects_Pride", "pride_effect.binarypb"), new fcti("Screen_Effects_Fireworks", "fireworks_effect.binarypb"), new fcti("Screen_Effects_Fall", "fall_effect.binarypb"), new fcti("Screen_Effects_Winter", "winter_effect.binarypb"), new fcti("Screen_Effects_Spring", "spring_effect.binarypb"), new fcti("Screen_Effects_Summer", "summer_effect.binarypb"), new fcti("Screen_Effects_Celebrate", "celebrate_effect.binarypb"), new fcti("Screen_Effects_Goodmorning", "good_morning_effect.binarypb"), new fcti("Screen_Effects_Poop", "poop_effect.binarypb"), new fcti("Screen_Effects_Anger", "anger_effect.binarypb"), new fcti("Screen_Effects_Laugh", "laugh_effect.binarypb"), new fcti("Screen_Effects_Love", "love_effect.binarypb"), new fcti("Screen_Effects_Surprise", "surprise_effect.binarypb"), new fcti("Screen_Effects_Thumbsup", "thumbs_up_effect.binarypb"), new fcti("Screen_Effects_Thumbsdown", "thumbs_down_effect.binarypb"), new fcti("Screen_Effects_Sad", "sad_effect.binarypb"), new fcti("Screen_Effects_Drumroll", "drumroll_effect.binarypb"), new fcti("Screen_Effects_Applause", "applause_effect.binarypb"), new fcti("Screen_Effects_Halloween", "halloween_effect.binarypb"), new fcti("Screen_Effects_Diwali", "diwali_effect.binarypb"), new fcti("Screen_Effects_Goodnight", "good_night_effect.binarypb"), new fcti("Screen_Effects_Thanksgiving", "thanksgiving_effect.binarypb"), new fcti("Screen_Effects_Hannukah", "hannukah_effect.binarypb"), new fcti("Screen_Effects_Christmas", "christmas_effect.binarypb"), new fcti("Screen_Effects_Easter", "easter_effect.binarypb"), new fcti("Screen_Effects_Lunarnewyear", "lunar_new_year_effect.binarypb"), new fcti("Screen_Effects_Placeholderone", "placeholder_one_effect.binarypb"), new fcti("Screen_Effects_Placeholdertwo", "placeholder_two_effect.binarypb"), new fcti("Screen_Effects_Placeholderthree", "placeholder_three_effect.binarypb"));
    public static final Map a = fcwa.g(new fcti("Screen_Effects_Olympics", 1), new fcti("Screen_Effects_Pride", 2), new fcti("Screen_Effects_Fireworks", 3), new fcti("Screen_Effects_Fall", 4), new fcti("Screen_Effects_Winter", 5), new fcti("Screen_Effects_Spring", 6), new fcti("Screen_Effects_Summer", 7), new fcti("Screen_Effects_Celebrate", 8), new fcti("Screen_Effects_Goodmorning", 9), new fcti("Screen_Effects_Poop", 10), new fcti("Screen_Effects_Anger", 11), new fcti("Screen_Effects_Laugh", 12), new fcti("Screen_Effects_Love", 13), new fcti("Screen_Effects_Surprise", 14), new fcti("Screen_Effects_Thumbsup", 15), new fcti("Screen_Effects_Thumbsdown", 16), new fcti("Screen_Effects_Sad", 17), new fcti("Screen_Effects_Drumroll", 18), new fcti("Screen_Effects_Applause", 19), new fcti("Screen_Effects_Halloween", 20), new fcti("Screen_Effects_Diwali", 21), new fcti("Screen_Effects_Goodnight", 22), new fcti("Screen_Effects_Thanksgiving", 23), new fcti("Screen_Effects_Hannukah", 24), new fcti("Screen_Effects_Christmas", 25), new fcti("Screen_Effects_Easter", 26), new fcti("Screen_Effects_Lunarnewyear", 27), new fcti("Screen_Effects_Placeholderone", 97), new fcti("Screen_Effects_Placeholdertwo", 98), new fcti("Screen_Effects_Placeholderthree", 99));
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/screeneffects/ScreenEffectAnimationsRepository");

    public zpe(fcsu fcsuVar, fdjx fdjxVar, ascy ascyVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.g = fcsuVar;
        this.h = fdjxVar;
        this.b = ascyVar;
        this.c = fdvf.a(e);
        this.d = fdvf.a(a);
        this.j = auvw.k(fdjxVar, null, null, new zpb(this, null), 3);
    }

    public final int a(String str) {
        return ((Number) Map.EL.getOrDefault((java.util.Map) this.d.c(), str, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zpc
            if (r0 == 0) goto L13
            r0 = r8
            zpc r0 = (defpackage.zpc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zpc r0 = new zpc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.fctl.b(r8)
            fdlr r8 = r6.j
            java.lang.String r2 = "preloadJob"
            if (r8 != 0) goto L40
            defpackage.fdbq.c(r2)
            r5 = r4
            goto L41
        L40:
            r5 = r8
        L41:
            boolean r5 = r5.y()
            if (r5 != 0) goto L59
            if (r8 != 0) goto L4d
            defpackage.fdbq.c(r2)
            r8 = r4
        L4d:
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r8.o(r0)
            if (r8 == r1) goto L58
            goto L59
        L58:
            return r1
        L59:
            ascy r8 = r6.b
            boolean r8 = r8.a()
            if (r8 == 0) goto L6a
            fduf r8 = r6.c
            java.lang.Object r8 = r8.c()
            java.util.Map r8 = (java.util.Map) r8
            goto L6c
        L6a:
            java.util.Map r8 = defpackage.zpe.e
        L6c:
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L7d
            java.util.Map r8 = r6.i
            if (r8 == 0) goto L7d
            java.lang.Object r7 = r8.get(r7)
            evxw r7 = (defpackage.evxw) r7
            return r7
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.b(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zpd
            if (r0 == 0) goto L13
            r0 = r8
            zpd r0 = (defpackage.zpd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zpd r0 = new zpd
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L29
            goto L81
        L29:
            r8 = move-exception
            goto L90
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            fcsu r8 = r6.g     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L29
            ejly r8 = (defpackage.ejly) r8     // Catch: java.lang.Exception -> L29
            r7.getClass()     // Catch: java.lang.Exception -> L29
            ejha r2 = defpackage.ejha.a     // Catch: java.lang.Exception -> L29
            evsf r2 = r2.createBuilder()     // Catch: java.lang.Exception -> L29
            ejgz r2 = (defpackage.ejgz) r2     // Catch: java.lang.Exception -> L29
            r2.getClass()     // Catch: java.lang.Exception -> L29
            ejhc r4 = defpackage.ejhc.a     // Catch: java.lang.Exception -> L29
            evsf r4 = r4.createBuilder()     // Catch: java.lang.Exception -> L29
            ejhb r4 = (defpackage.ejhb) r4     // Catch: java.lang.Exception -> L29
            r4.getClass()     // Catch: java.lang.Exception -> L29
            defpackage.ejhd.c(r7, r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "screen_effect_suggestions"
            defpackage.ejhd.b(r5, r4)     // Catch: java.lang.Exception -> L29
            ejhc r4 = defpackage.ejhd.a(r4)     // Catch: java.lang.Exception -> L29
            defpackage.ejgy.b(r4, r2)     // Catch: java.lang.Exception -> L29
            ejha r2 = defpackage.ejgy.a(r2)     // Catch: java.lang.Exception -> L29
            eopy r8 = r8.c(r2)     // Catch: java.lang.Exception -> L29
            fdjx r2 = r6.h     // Catch: java.lang.Exception -> L29
            fdkf r8 = defpackage.auus.b(r8, r2)     // Catch: java.lang.Exception -> L29
            r0.d = r7     // Catch: java.lang.Exception -> L29
            r0.c = r3     // Catch: java.lang.Exception -> L29
            fdme r8 = (defpackage.fdme) r8     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = r8.hJ(r0)     // Catch: java.lang.Exception -> L29
            if (r8 != r1) goto L81
            return r1
        L81:
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch: java.lang.Exception -> L29
            evrr r0 = defpackage.evrr.a()     // Catch: java.lang.Exception -> L29
            evxw r1 = defpackage.evxw.a     // Catch: java.lang.Exception -> L29
            evsn r8 = defpackage.evsn.parseFrom(r1, r8, r0)     // Catch: java.lang.Exception -> L29
            evxw r8 = (defpackage.evxw) r8     // Catch: java.lang.Exception -> L29
            return r8
        L90:
            ekrg r0 = defpackage.zpe.f
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            ekrd r0 = r0.a(r1)
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleScreenEffects"
            r0.X(r1, r2)
            ekrw r8 = r0.g(r8)
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r1 = "ScreenEffectAnimationsRepository.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/screeneffects/ScreenEffectAnimationsRepository"
            java.lang.String r3 = "loadEffectAssetAsync"
            ekrw r8 = r8.h(r2, r3, r0, r1)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r0 = "Could not parse the screen effect %s from mdd"
            r8.t(r0, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.c(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.d(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009e -> B:24:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e8 -> B:31:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.e(fcxy):java.lang.Object");
    }
}
