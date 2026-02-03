package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cscj extends fcyz implements fdap {
    int a;
    final /* synthetic */ cscs b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscj(cscs cscsVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cscsVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cscs cscsVar = this.b;
        ConversationIdType conversationIdTypeA = this.c.A();
        conversationIdTypeA.getClass();
        this.a = 1;
        Object objB = cscsVar.h.b();
        objB.getClass();
        Object objA = fdin.a(eicg.a((fcyh) objB), new cscr(null, cscsVar, conversationIdTypeA), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cscj(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
