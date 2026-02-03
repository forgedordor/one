package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cljf extends fcyz implements fdat {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ cljg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cljf(BugleConversation bugleConversation, cljg cljgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bugleConversation;
        this.c = cljgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cljf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((DefaultConversation) this.b).f.b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aoer aoerVarH = ((ajlk) obj).h();
        if (aoerVarH == null) {
            ekrw ekrwVarE = cljg.a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/DunestarOpenConversationListener$onConversationOpened$1", "invokeSuspend", 63, "DunestarOpenConversationListener.kt")).q("Conversation opened but active self identity is null");
        } else {
            ekrw ekrwVarH = cljg.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/DunestarOpenConversationListener$onConversationOpened$1", "invokeSuspend", 67, "DunestarOpenConversationListener.kt");
            BugleConversation bugleConversation = this.b;
            ekrdVar.t("Conversation %s opened: updating connection type tombstone", ((DefaultConversation) bugleConversation).a);
            anny annyVar = this.c.b;
            fdlr fdlrVar = annyVar.b;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            annyVar.b = auvw.k(annyVar.a, null, null, new annx(aoerVarH, bugleConversation, null), 3);
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cljf(this.b, this.c, fcxyVar);
    }
}
