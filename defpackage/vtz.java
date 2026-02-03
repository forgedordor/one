package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtz {
    public static final vtz a = new vtz();
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter");

    private vtz() {
    }

    public static final void b(emnc emncVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                d(emncVar, emsp.EMOJI, null);
                return;
            }
            if (i2 != 4) {
                empj empjVar = (empj) empl.a.createBuilder();
                empjVar.getClass();
                ensh.b(1, empjVar);
                emncVar.b(ensh.a(empjVar));
                return;
            }
            empj empjVar2 = (empj) empl.a.createBuilder();
            empjVar2.getClass();
            ensh.b(2, empjVar2);
            emncVar.b(ensh.a(empjVar2));
        }
    }

    public static final void c(emnc emncVar, dltc dltcVar, fddy fddyVar) {
        if (dltcVar instanceof dltm) {
            dltm dltmVar = (dltm) dltcVar;
            if (dltmVar instanceof dltl) {
                d(emncVar, emsp.FILE, null);
                return;
            }
            if (!(dltmVar instanceof dojs)) {
                ekrw ekrwVarI = b.i();
                ekrwVarI.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setLocalAttachmentOrigin", 139, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown LocalAttachment.Source %s", dltmVar);
                return;
            }
            dojs dojsVar = (dojs) dltmVar;
            if (dojsVar instanceof dmbs) {
                d(emncVar, emsp.CAMERA_GALLERY, null);
                return;
            }
            if (dojsVar instanceof dmca) {
                dmca dmcaVar = (dmca) dojsVar;
                if (dmcaVar instanceof dmbx) {
                    d(emncVar, emsp.CAMERA_GALLERY, ((dmbx) dmcaVar).a == dmbu.b ? emsr.EXPANDED : null);
                    return;
                } else {
                    if (!(dmcaVar instanceof dmbz)) {
                        throw new fctg();
                    }
                    d(emncVar, emsp.CAMERA_GALLERY, emsr.EXPANDED);
                    return;
                }
            }
            if (dojsVar instanceof dnvr) {
                d(emncVar, emsp.EMOTIFY, null);
                return;
            }
            if (dojsVar instanceof dqcb) {
                d(emncVar, emsp.VOICE, null);
                return;
            } else {
                if (dojsVar instanceof VideoTrimmerSource) {
                    d(emncVar, emsp.UNKNOWN_COMPOSE_SCREEN_CATEGORY, null);
                    return;
                }
                ekrw ekrwVarI2 = b.i();
                ekrwVarI2.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarI2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setLocalMediaOrigin", 154, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown LocalMedia.Source %s", dojsVar);
                return;
            }
        }
        if (!(dltcVar instanceof doas)) {
            if (!(dltcVar instanceof dlsx)) {
                if (dltcVar instanceof dlsz) {
                    d(emncVar, emsp.EXTERNAL, null);
                    return;
                } else {
                    if (dltcVar instanceof dltb) {
                        d(emncVar, emsp.UNKNOWN_COMPOSE_SCREEN_CATEGORY, null);
                        return;
                    }
                    return;
                }
            }
            dlsx dlsxVar = (dlsx) dltcVar;
            int i = dlsxVar.b - 1;
            if (i != 2 && i != 3) {
                d(emncVar, emsp.EXTERNAL, null);
                return;
            }
            empj empjVar = (empj) empl.a.createBuilder();
            empjVar.getClass();
            String str = dlsxVar.a;
            ensh.b((str == null || !fdgn.t(str, "com.google.android.inputmethod.latin")) ? 1 : 2, empjVar);
            emncVar.b(ensh.a(empjVar));
            return;
        }
        doas doasVar = (doas) dltcVar;
        if (!(doasVar instanceof doar)) {
            if (doasVar instanceof doys) {
                if (!fdbq.f((doys) doasVar, doys.a)) {
                    throw new fctg();
                }
                d(emncVar, emsp.STICKER, null);
                return;
            } else {
                ekrw ekrwVarI3 = b.i();
                ekrwVarI3.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarI3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setGifStickerMediaOrigin", 195, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown GifStickerMedia.Source %s", doasVar);
                return;
            }
        }
        int i2 = fdcj.a;
        if (fdbq.f(fddyVar, new fdbi(dnyz.class))) {
            d(emncVar, emsp.GIF, null);
            return;
        }
        if (fdbq.f(fddyVar, new fdbi(doyt.class))) {
            d(emncVar, emsp.STICKER, null);
        } else {
            if (fddyVar == null) {
                d(emncVar, emsp.EMOTIVE, null);
                return;
            }
            ekrw ekrwVarI4 = b.i();
            ekrwVarI4.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarI4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setGifStickerMediaOrigin", 185, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for GifStickerMedia.Source with attachment type", fddyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(emnc emncVar, emsp emspVar, emsr emsrVar) {
        emsn emsnVar = (emsn) emss.a.createBuilder();
        emsnVar.getClass();
        ennj.b(emspVar, emsnVar);
        if (emsrVar != null) {
            ennj.c(emsrVar, emsnVar);
        }
        emss emssVarA = ennj.a(emsnVar);
        emoo emooVar = emncVar.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.d = emssVarA;
        emopVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }
}
