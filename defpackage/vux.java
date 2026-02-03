package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vux implements dpxq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationLogger");
    public final aisc b;

    public vux(aisc aiscVar) {
        aiscVar.getClass();
        this.b = aiscVar;
    }

    @Override // defpackage.dpxq
    public final void a(dpxe dpxeVar, int i, Duration duration) {
        emsp emspVar;
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationLogger", "onScreenClosed", 84, "ComposeRowNavigationLogger.kt");
        Integer numValueOf = Integer.valueOf(i);
        ekrdVar.I("ComposeRowNavigationLogger.onScreenClosed %s, %s, %s", dpxeVar, numValueOf, duration);
        switch (dpxeVar.ordinal()) {
            case 0:
                emspVar = emsp.CAMERA_GALLERY;
                break;
            case 1:
                emspVar = emsp.EMOJI;
                break;
            case 2:
                emspVar = emsp.GIF;
                break;
            case 3:
            case 7:
                emspVar = emsp.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
                break;
            case 4:
                emspVar = emsp.ALL;
                break;
            case 5:
                emspVar = emsp.STICKER;
                break;
            case 6:
                emspVar = emsp.VOICE;
                break;
            case 8:
                emspVar = emsp.EMOTIFY;
                break;
            default:
                throw new fctg();
        }
        this.b.c(emspVar, emsr.COLLAPSED, emsh.UNKNOWN_CLOSING_SOURCE, numValueOf, duration);
    }

    @Override // defpackage.dpxq
    public final void b(dpxe dpxeVar, int i, Duration duration) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationLogger", "onScreenOpened", 68, "ComposeRowNavigationLogger.kt")).I("ComposeRowNavigationLogger.onScreenOpened %s, %s, %s", dpxeVar, Integer.valueOf(i), duration);
    }
}
