package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbb extends fcyz implements fdat {
    final /* synthetic */ akbc a;
    final /* synthetic */ bojh b;
    final /* synthetic */ awjl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbb(fcxy fcxyVar, akbc akbcVar, bojh bojhVar, awjl awjlVar) {
        super(2, fcxyVar);
        this.a = akbcVar;
        this.b = bojhVar;
        this.c = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a.e.a()) {
            bojh bojhVar = this.b;
            if (bojhVar.B() != null) {
                ekrw ekrwVarJ = akbc.a.j();
                ekrwVarJ.X(eksq.a, "BugleCME");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.s, bojhVar.C());
                ekrdVar.X(cqnc.ag, bojhVar.B());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$updateConversationTableWithDestinationToken$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 218, "BugleDestinationConversationMatcher.kt")).q("Used address fallback for destination>conversation matching, but conversation already contains a different token.");
                return fctx.a;
            }
        }
        ConversationIdType conversationIdTypeC = this.b.C();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        awjl awjlVar = this.c;
        boteVar.p(awjlVar);
        if (boteVar.f(conversationIdTypeC)) {
            ekrw ekrwVarH = akbc.a.h();
            ekrwVarH.X(eksq.a, "BugleCME");
            ekrd ekrdVar2 = (ekrd) ekrwVarH;
            ekrdVar2.X(cqnc.s, conversationIdTypeC);
            ekrdVar2.X(cqnc.ag, awjlVar);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$updateConversationTableWithDestinationToken$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 239, "BugleDestinationConversationMatcher.kt")).q("Updated destination token in the conversation.");
        } else {
            ekrw ekrwVarJ2 = akbc.a.j();
            ekrwVarJ2.X(eksq.a, "BugleCME");
            ekrd ekrdVar3 = (ekrd) ekrwVarJ2;
            ekrdVar3.X(cqnc.s, conversationIdTypeC);
            ekrdVar3.X(cqnc.ag, awjlVar);
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$updateConversationTableWithDestinationToken$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 233, "BugleDestinationConversationMatcher.kt")).q("Tried updating destination token in conversation that does not exist.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akbb akbbVar = new akbb(fcxyVar, this.a, this.b, this.c);
        akbbVar.d = obj;
        return akbbVar;
    }
}
