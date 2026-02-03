package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbhh {
    public static final /* synthetic */ int b = 0;
    private static final eksp c = eksp.c("BugleNotifications");
    public final bbhe a;
    private final fcsu d;

    public bbhh(bbhe bbheVar, fcsu fcsuVar) {
        this.a = bbheVar;
        this.d = fcsuVar;
    }

    public final void a(final MessageIdType messageIdType) {
        ((eksl) c.n().h("com/google/android/apps/messaging/shared/datamodel/data/util/RequestLinkPreviewScheduler", "requestLinkPreview", 35, "RequestLinkPreviewScheduler.java")).q("running requestLinkPreview after commit in silo execution");
        dqsn dqsnVar = (dqsn) this.d.b();
        dqsm dqsmVar = new dqsm() { // from class: bbhf
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = bbhh.b;
                return eiiy.k("UsageStatisticsImpl::logMessageSentOrReceivedInSiloExecution");
            }
        };
        String strValueOf = String.valueOf(messageIdType.toString());
        dqsnVar.h(dqsmVar, strValueOf.concat("logMessageSentOrReceived"), new Runnable() { // from class: bbhg
            @Override // java.lang.Runnable
            public final void run() {
                cawb cawbVar = (cawb) cawc.a.createBuilder();
                String strB = messageIdType.b();
                cawbVar.copyOnWrite();
                cawc cawcVar = (cawc) cawbVar.instance;
                strB.getClass();
                cawcVar.b |= 1;
                cawcVar.c = strB;
                cawbVar.copyOnWrite();
                cawc cawcVar2 = (cawc) cawbVar.instance;
                cawcVar2.d = 1;
                cawcVar2.b |= 2;
                ((cazj) this.a.a.a.b()).a(cbcu.f("request_link_preview", (cawc) cawbVar.build()));
            }
        }, dqss.TXN_1);
    }
}
