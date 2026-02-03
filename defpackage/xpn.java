package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpn implements xpi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl");
    private final fdjx b;
    private final ConversationId c;
    private final fdpl d;
    private final fdpl e;
    private final fdpl f;
    private final fcsu g;
    private final fcsu h;

    public xpn(fdjx fdjxVar, ConversationId conversationId, fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdplVar3.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fdjxVar;
        this.c = conversationId;
        this.d = fdplVar;
        this.e = fdplVar2;
        this.f = fdplVar3;
        this.g = fcsuVar;
        this.h = fcsuVar2;
    }

    @Override // defpackage.xpi
    public final fdvc a() {
        if (!((Boolean) ((cczi) crbf.by.get()).e()).booleanValue()) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 62, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because flag is disabled.");
            return new auxs(new fdae() { // from class: xpj
                @Override // defpackage.fdae
                public final Object invoke() {
                    return false;
                }
            });
        }
        if (!crxi.a() ? ((csel) this.g.b()).e() : ((csei) this.h.b()).f()) {
            ekrw ekrwVarG2 = a.g();
            ekrwVarG2.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarG2.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 73, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because spam protection is disabled.");
            return new auxs(new fdae() { // from class: xpk
                @Override // defpackage.fdae
                public final Object invoke() {
                    return false;
                }
            });
        }
        if (this.c instanceof BugleConversationId) {
            return fdtg.b(fdud.a(this.e, this.d, this.f, new xpm(this, null)), this.b, fdur.b, false);
        }
        ekrw ekrwVarG3 = a.g();
        ekrwVarG3.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarG3.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardEligibilityCheckerImpl", "isScamAlertCardEligible", 78, "PenpalScamAlertCardEligibilityCheckerImpl.kt")).q("Penpal alert card not displayable because conversation is not a bugle conversation.");
        return new auxs(new fdae() { // from class: xpl
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        });
    }
}
