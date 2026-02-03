package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bakq {
    public final fcsu a;
    public final fdjx b;
    private final fcsu c;

    public bakq(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.b = fdjxVar;
    }

    public final void a(final ConversationIdType conversationIdType, final ajsm ajsmVar) {
        conversationIdType.getClass();
        ajsmVar.getClass();
        ((dqsn) this.c.b()).h(new dqsm() { // from class: bakn
            @Override // defpackage.dqsm
            public final eieu a() {
                return eiiy.a("ConversationCreationNotifier::runAfterCommit");
            }
        }, null, new Runnable() { // from class: bako
            @Override // java.lang.Runnable
            public final void run() {
                bakq bakqVar = this.a;
                auvw.k(bakqVar.b, null, null, new bakp(bakqVar, conversationIdType, ajsmVar, null), 3);
            }
        }, dqss.NO_TXN_EXCLUDING_SCOPE);
    }
}
