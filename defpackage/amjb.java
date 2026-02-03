package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amjb extends fcyz implements fdat {
    int a;
    final /* synthetic */ amjc b;
    final /* synthetic */ MessageId c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amjb(fcxy fcxyVar, amjc amjcVar, MessageId messageId) {
        super(2, fcxyVar);
        this.b = amjcVar;
        this.c = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amjb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            amjc amjcVar = this.b;
            MessageId messageId = this.c;
            this.a = 1;
            obj = amjcVar.b.a(messageId, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        amjc amjcVar2 = this.b;
        PartsTable.BindData bindData = (PartsTable.BindData) obj;
        ConversationIdType conversationIdTypeU = bindData.u();
        conversationIdTypeU.getClass();
        MessageIdType messageIdTypeV = bindData.v();
        messageIdTypeV.getClass();
        String strK = bindData.K();
        strK.getClass();
        Uri uriT = bindData.t();
        uriT.getClass();
        aoog aoogVar = new aoog(conversationIdTypeU, messageIdTypeV, strK, uriT, true);
        this.a = 2;
        Object objB = amjcVar2.c.b(aoogVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        amjb amjbVar = new amjb(fcxyVar, this.b, this.c);
        amjbVar.d = obj;
        return amjbVar;
    }
}
