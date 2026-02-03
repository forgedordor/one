package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajfl extends fcyz implements fdat {
    final /* synthetic */ ajfm a;
    final /* synthetic */ ajlt b;
    final /* synthetic */ ainn c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajfl(ajfm ajfmVar, ajlt ajltVar, int i, ainn ainnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ajfmVar;
        this.b = ajltVar;
        this.d = i;
        this.c = ainnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajfl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ellh ellhVarA;
        ellg ellgVar;
        fctl.b(obj);
        ajfm ajfmVar = this.a;
        int i = this.d;
        ajlt ajltVar = this.b;
        if (ajltVar.q() == null) {
            ((ekrd) ajfm.a.j().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusMapiEventLogger", "createBugleMessageEvent", 94, "MessageStatusMapiEventLogger.kt")).t("No analytics message ID found, skipping logging of %s event.", eloa.a(i));
            ellhVarA = null;
        } else {
            ellg ellgVar2 = (ellg) ellh.a.createBuilder();
            ellgVar2.getClass();
            elgr.g(ellf.BUGLE_MESSAGE, ellgVar2);
            elof elofVar = (elof) elpg.b.createBuilder();
            elofVar.getClass();
            Long lQ = ajltVar.q();
            lQ.getClass();
            elhf.d(lQ.longValue(), elofVar);
            elhf.h(i, elofVar);
            String strS = ajltVar.s();
            eksp ekspVar = MessageData.a;
            int i2 = 3;
            char c = "SMS".equalsIgnoreCase(strS) ? (char) 0 : "MMS".equalsIgnoreCase(strS) ? (char) 1 : "RCS".equalsIgnoreCase(strS) ? (char) 3 : "SATELLITE".equalsIgnoreCase(strS) ? (char) 7 : (char) 65535;
            if (c == 0) {
                i2 = 2;
            } else if (c != 1) {
                i2 = c != 3 ? 1 : 4;
            }
            elhf.i(i2, elofVar);
            elhf.b(((aika) ajfmVar.b.b()).c(ajltVar.f().b()), elofVar);
            elgr.d(elhf.a(elofVar), ellgVar2);
            ellhVarA = elgr.a(ellgVar2);
        }
        if (ellhVarA != null && (ellgVar = (ellg) ellhVarA.toBuilder()) != null) {
            ainn ainnVar = this.c;
            ailn ailnVarA = ((aimb) ajfmVar.c.b()).a();
            ailnVarA.f(ainnVar);
            ailnVarA.d(emxt.BUGLE_MESSAGE);
            ailnVarA.j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            elpg elpgVar = ((ellh) ellgVar.instance).l;
            if (elpgVar == null) {
                elpgVar = elpg.b;
            }
            long j = elpgVar.o;
            elpg elpgVar2 = ((ellh) ellgVar.instance).l;
            if (elpgVar2 == null) {
                elpgVar2 = elpg.b;
            }
            int iB = eloa.b(elpgVar2.i);
            ((ekrd) ajfm.a.e().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusMapiEventLogger$Companion", "debugLogMessageStatusTimestamp", 128, "MessageStatusMapiEventLogger.kt")).I("BugleMessage[eventTimeMs=%d, messageId=%d, messageStatus=%s]", Long.valueOf(ainnVar.a), Long.valueOf(j), eloa.a(iB != 0 ? iB : 1));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajfl(this.a, this.b, this.d, this.c, fcxyVar);
    }
}
