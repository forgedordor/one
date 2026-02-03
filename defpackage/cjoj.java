package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoj {
    private static final cqce a = cqce.g("BugleDataModel", "ParticipantOfflineDetector");
    private final cogw b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cjoj(cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = cogwVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    public final void a(ConversationIdType conversationIdType) {
        bojh bojhVarR = ((bakt) this.d.b()).r(conversationIdType);
        if (bojhVarR == null || bojhVarR.Q().isPresent() || bojhVarR.an() || bojhVarR.k() != 0 || bojhVarR.r() != 0 || !((chwq) this.e.b()).w(conversationIdType)) {
            return;
        }
        baxe baxeVar = (baxe) this.c.b();
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestOutgoingRcsMessage");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(1, 25);
            brecVar.J(3);
            brecVar.A(false);
            Optional optionalOfNullable = Optional.ofNullable(baxeVar.n(new brdv(brecVar)));
            eieuVarK.close();
            if (optionalOfNullable.isPresent() && baui.o(((MessageCoreData) optionalOfNullable.get()).k())) {
                cqbd cqbdVarA = a.a();
                cqbdVarA.c(conversationIdType);
                cqbdVarA.I("Set participant offline timestamp");
                cqbdVarA.r();
                bakt baktVar = (bakt) this.d.b();
                String[] strArr2 = botm.a;
                bote boteVar = new bote();
                boteVar.ap("markRecipientOfflineIfXmsReceivedInRcsChat");
                boteVar.U(Optional.of(this.b.f()));
                baktVar.aj(conversationIdType, boteVar);
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
