package defpackage;

import com.android.vcard.VCardConfig;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajei {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/screen/ScreenImpressionLogger");
    private final fcsu b;

    public ajei(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar2;
    }

    public final void a(int i, Instant instant) {
        ellf ellfVar;
        if (i == 0) {
            throw null;
        }
        instant.getClass();
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/analytics/screen/ScreenImpressionLogger", "logFirstEntryToScreen", 37, "ScreenImpressionLogger.kt")).t("Logging first visit to screen type: %s", aiuk.a(i));
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ailnVarA.d(i == 3 ? emxt.CONVERSATION_SCREEN_FIRST_VISIT : emxt.HOME_SCREEN_FIRST_VISIT);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        if (i - 1 != 2) {
            ellfVar = ellf.HOME_SCREEN_FIRST_VISIT;
            ensd ensdVar = (ensd) ense.a.createBuilder();
            evvp evvpVarA = csst.a(instant);
            ensdVar.copyOnWrite();
            ense enseVar = (ense) ensdVar.instance;
            enseVar.c = evvpVarA;
            enseVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ense enseVar2 = (ense) ensdVar.build();
            enseVar2.getClass();
            ellhVar.bG = enseVar2;
            ellhVar.g |= 1048576;
        } else {
            ellfVar = ellf.CONVERSATION_SCREEN_FIRST_VISIT;
            ennx ennxVar = (ennx) enny.a.createBuilder();
            evvp evvpVarA2 = csst.a(instant);
            ennxVar.copyOnWrite();
            enny ennyVar = (enny) ennxVar.instance;
            ennyVar.c = evvpVarA2;
            ennyVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            enny ennyVar2 = (enny) ennxVar.build();
            ennyVar2.getClass();
            ellhVar2.cr = ennyVar2;
            ellhVar2.h |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        ellhVar3.j = ellfVar.f11do;
        ellhVar3.b |= 1;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_CONVERSATION_SCREEN_EVENTS);
    }
}
