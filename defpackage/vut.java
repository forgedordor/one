package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vut implements vuq {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/cuj/interactions/InputButtonClickLogger");
    private final aisc b;

    public vut(aisc aiscVar) {
        aiscVar.getClass();
        this.b = aiscVar;
    }

    @Override // defpackage.vuq
    public final void a(vur vurVar) {
        emsj emsjVar;
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/cuj/interactions/InputButtonClickLogger", "logInteractionEnd", 33, "InputButtonClickLogger.kt")).t("InputButtonClickLogger.logInteractionEnd %s", vurVar);
        dpyw dpywVar = dpyw.a;
        vus vusVar = (vus) vurVar;
        dpzj dpzjVar = vusVar.b;
        boolean zF = fdbq.f(dpzjVar, dpywVar);
        djdi djdiVar = vusVar.a;
        emsp emspVar = null;
        if (!zF && !(dpzjVar instanceof dpzd)) {
            if (!(dpzjVar instanceof dpzb) && !(dpzjVar instanceof dpzf) && !(dpzjVar instanceof dpzh)) {
                throw new fctg();
            }
            int iOrdinal = djdiVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                emspVar = emsp.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
            } else if (iOrdinal == 2) {
                emspVar = emsp.CAMERA_GALLERY;
            } else if (iOrdinal == 3) {
                emspVar = emsp.EMOTIVE;
            } else if (iOrdinal == 4) {
                emspVar = emsp.ALL;
            } else {
                if (iOrdinal != 5) {
                    throw new fctg();
                }
                emspVar = emsp.VOICE;
            }
        }
        emsp emspVar2 = emspVar;
        if (emspVar2 == null) {
            return;
        }
        aisc aiscVar = this.b;
        emsr emsrVar = emsr.EXPANDED;
        int iOrdinal2 = djdiVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            emsjVar = emsj.UNKNOWN_OPENING_SOURCE;
        } else if (iOrdinal2 == 2) {
            emsjVar = emsj.CAMERA_GALLERY_BUTTON;
        } else if (iOrdinal2 == 3) {
            emsjVar = emsj.DRAFT_END_EMOJI_BUTTON;
        } else if (iOrdinal2 != 4) {
            if (iOrdinal2 != 5) {
                throw new fctg();
            }
            emsjVar = emsj.UNKNOWN_OPENING_SOURCE;
        } else {
            emsjVar = emsj.PLUS_BUTTON;
        }
        aiscVar.d(emspVar2, emsrVar, emsjVar, emsl.UNKNOWN_OPENING_STATE, null, vusVar.c);
    }
}
