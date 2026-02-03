package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crbt extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ ezgd e;
    final /* synthetic */ elpn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbt(crcm crcmVar, MessageIdType messageIdType, ConversationIdType conversationIdType, ezgd ezgdVar, elpn elpnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = ezgdVar;
        this.f = elpnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        crcm crcmVar = this.b;
        MessageIdType messageIdType = this.c;
        ConversationIdType conversationIdType = this.d;
        ezgd ezgdVar = this.e;
        elpn elpnVar = this.f;
        this.a = 1;
        if (crcmVar.g(messageIdType, conversationIdType, ezgdVar, elpnVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crbt(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
