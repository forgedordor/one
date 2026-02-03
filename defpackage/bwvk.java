package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwvk extends fcyz implements fdau {
    int a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ fcsu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwvk(fcsu fcsuVar, fcsu fcsuVar2, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwvk bwvkVar = new bwvk(this.b, this.c, (fcxy) obj3);
        bwvkVar.d = (bwvn) obj;
        return bwvkVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ConversationIdType conversationIdTypeB = barn.b(((bwvn) this.d).b);
            cqce cqceVar = bwvl.a;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("Running TombstoneManagerOnRcsGroupE2eeStatusChangeHandler");
            cqbdVarA.c(conversationIdTypeB);
            cqbdVarA.r();
            if (((bwwe) this.b.b()).f(conversationIdTypeB)) {
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("Skipping call to tombstone manager as conversation is already focused");
                cqbdVarA2.c(conversationIdTypeB);
                cqbdVarA2.r();
            } else {
                eiju eijuVarC = ((bydb) this.c.b()).c(conversationIdTypeB);
                this.a = 1;
                if (fdxs.c(eijuVarC, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return cbcw.i();
    }
}
