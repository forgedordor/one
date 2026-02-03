package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvve extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvve(bvvn bvvnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvve) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvvn bvvnVar = this.b;
            this.a = 1;
            obj = bvvnVar.i.c(bvvnVar.g, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        bacx bacxVar = (bacx) obj;
        if (bacxVar instanceof bacv) {
            bvvn bvvnVar2 = this.b;
            ekrw ekrwVarJ = bvvn.a.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) bvvnVar2.d((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl$areAllSessionsAvailable$1", "invokeSuspend", 132, "ConversationE2eeStatusImpl.kt")).q("Failure retrieving remote identities for the conversation.");
            return false;
        }
        if (bacxVar.a) {
            bvvn bvvnVar3 = this.b;
            ekrw ekrwVarJ2 = bvvn.a.j();
            ekrwVarJ2.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) bvvnVar3.d((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl$areAllSessionsAvailable$1", "invokeSuspend", 139, "ConversationE2eeStatusImpl.kt")).q("No remote identities retrieved for the conversation.");
            return false;
        }
        bvvn bvvnVar4 = this.b;
        ekib ekibVarC = bvvnVar4.c(bacxVar.b);
        if (ekibVarC == null) {
            ekrw ekrwVarJ3 = bvvn.a.j();
            ekrwVarJ3.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) bvvnVar4.d((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl$areAllSessionsAvailable$1", "invokeSuspend", 147, "ConversationE2eeStatusImpl.kt")).q("Failure retrieving chat endpoint devices for the remote identities in the conversation.");
            return false;
        }
        if (ekibVarC.A()) {
            ekrw ekrwVarJ4 = bvvn.a.j();
            ekrwVarJ4.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) bvvnVar4.d((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl$areAllSessionsAvailable$1", "invokeSuspend", 156, "ConversationE2eeStatusImpl.kt")).q("No chat endpoint devices retrieved for the remote identities in the conversation.");
            return false;
        }
        bagx bagxVar = bvvnVar4.h;
        this.a = 2;
        bwfq bwfqVar = (bwfq) bagxVar;
        Object objA = fdin.a(eicg.a(bwfqVar.i), new bwfh(null, bwfqVar, ekibVarC), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvve(this.b, fcxyVar);
    }
}
