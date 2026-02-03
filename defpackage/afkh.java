package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afkh extends fcyz implements fdat {
    int a;
    final /* synthetic */ afki b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkh(afki afkiVar, ConversationIdType conversationIdType, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afkiVar;
        this.c = conversationIdType;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afkh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        afki afkiVar = this.b;
        ConversationIdType conversationIdType = this.c;
        List list = this.d;
        this.a = 1;
        Object objD = afkiVar.d(conversationIdType, list, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afkh(this.b, this.c, this.d, fcxyVar);
    }
}
