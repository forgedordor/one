package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfkl extends fcyz implements fdat {
    int a;
    final /* synthetic */ eozq b;
    final /* synthetic */ cfkp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkl(fcxy fcxyVar, eozq eozqVar, cfkp cfkpVar) {
        super(2, fcxyVar);
        this.b = eozqVar;
        this.c = cfkpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eozq eozqVar = this.b;
        ConversationIdType conversationIdTypeB = barn.b(eozqVar.b);
        cfkp cfkpVar = this.c;
        cqle cqleVar = (cqle) cfkpVar.c.b();
        epes epesVar = eozqVar.c;
        if (epesVar == null) {
            epesVar = epes.a;
        }
        epesVar.getClass();
        Integer num = (Integer) fdct.b(cqleVar.a(epesVar));
        if (num != null) {
            int iIntValue = num.intValue();
            this.a = 1;
            Object objB = cfkpVar.b(iIntValue, conversationIdTypeB, this);
            if (objB != fcylVar) {
                return objB;
            }
        } else {
            ekrw ekrwVarJ = cfkp.a.j();
            ekrwVarJ.X(eksq.a, "BugleDitto");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/net/handler/ditto/DittoConversationLeaverImpl$getSelfChatEndpoint$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 90, "DittoConversationLeaverImpl.kt")).q("SubId is not set in leaveRcsGroupRequest, performing leave operation with current active SelfIdentity");
            this.a = 2;
            Object objC = cfkpVar.c(conversationIdTypeB, this);
            if (objC != fcylVar) {
                return objC;
            }
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfkl cfklVar = new cfkl(fcxyVar, this.b, this.c);
        cfklVar.d = obj;
        return cfklVar;
    }
}
