package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avno implements avnh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final eosc e;
    private final fcsu f;

    public avno(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.e = eoscVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = fcsuVar4;
    }

    @Override // defpackage.avnh
    public final eiju a(final avnl avnlVar) {
        return eijx.f(new Runnable() { // from class: avnn
            @Override // java.lang.Runnable
            public final void run() {
                final avno avnoVar = this.a;
                final avnl avnlVar2 = avnlVar;
                avng avngVar = (avng) avnlVar2;
                if (avngVar.e) {
                    ekrw ekrwVarG = avno.a.g();
                    ekrwVarG.X(eksq.a, "BugleConversation");
                    ekrd ekrdVar = (ekrd) ekrwVarG;
                    ekrdVar.X(cqnc.s, avngVar.a);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl", "deleteConversationExecution", 66, "ConversationDeleterPwqImpl.java")).q("Queuing conversation with DeleteConversationHandler to be deleted only if its empty (not using soft delete)");
                    avnoVar.c(avnlVar2);
                    return;
                }
                ekrw ekrwVarG2 = avno.a.g();
                ekrwVarG2.X(eksq.a, "BugleConversation");
                ekrd ekrdVar2 = (ekrd) ekrwVarG2;
                ekrdVar2.X(cqnc.s, avngVar.a);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl", "deleteConversationExecution", 74, "ConversationDeleterPwqImpl.java")).q("Soft deleting conversation and queuing with DeleteConversationHandler to be deleted");
                ((dqsn) avnoVar.c.b()).d("ConversationDeleterPwqImpl.deleteConversation", new Runnable() { // from class: avnm
                    @Override // java.lang.Runnable
                    public final void run() {
                        avno avnoVar2 = avnoVar;
                        avnl avnlVar3 = avnlVar2;
                        eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#softDeleteConversation");
                        avng avngVar2 = (avng) avnlVar3;
                        long j = avngVar2.b;
                        ConversationIdType conversationIdType = avngVar2.a;
                        try {
                            cqaz.h();
                            String[] strArr = botm.a;
                            bote boteVar = new bote();
                            boteVar.ap("softDeleteConversation");
                            boteVar.o(j);
                            boteVar.f(conversationIdType);
                            eieuVarK.close();
                            ((bxlc) avnoVar2.b.b()).d(conversationIdType);
                            avnoVar2.c(avnlVar3);
                        } catch (Throwable th) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
            }
        }, this.e);
    }

    @Override // defpackage.avnh
    public final void b(avnl avnlVar) {
        a(avnlVar);
    }

    public final void c(avnl avnlVar) {
        avng avngVar = (avng) avnlVar;
        boolean z = avngVar.e;
        long j = z ? 0L : avngVar.b;
        catv catvVar = (catv) this.f.b();
        catw catwVar = (catw) catx.a.createBuilder();
        String strA = avngVar.a.a();
        catwVar.copyOnWrite();
        catx catxVar = (catx) catwVar.instance;
        strA.getClass();
        catxVar.b = strA;
        elka elkaVar = avngVar.c;
        catwVar.copyOnWrite();
        ((catx) catwVar.instance).e = elkaVar.u;
        catwVar.copyOnWrite();
        ((catx) catwVar.instance).c = j;
        SuperSortLabel superSortLabel = avngVar.d;
        catwVar.copyOnWrite();
        ((catx) catwVar.instance).f = superSortLabel.i;
        catwVar.copyOnWrite();
        ((catx) catwVar.instance).d = z;
        ((cazj) catvVar.a.b()).a(cbcu.f("delete_conversation_handler", (catx) catwVar.build()));
    }
}
