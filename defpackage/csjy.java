package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjy extends fcyz implements fdat {
    int a;
    final /* synthetic */ csjz b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjy(csjz csjzVar, MessageIdType messageIdType, ConversationIdType conversationIdType, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csjzVar;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csjz csjzVar = this.b;
        MessageIdType messageIdType = this.c;
        ConversationIdType conversationIdType = this.d;
        String str = this.e;
        this.a = 1;
        Object objA = fdin.a(eicg.a(csjzVar.b), new csjx(null, csjzVar, conversationIdType, str, messageIdType), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csjy(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
