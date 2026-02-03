package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbk extends fcyz implements fdat {
    final /* synthetic */ crif a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbk(fcxy fcxyVar, crif crifVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = crifVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessageIdType messageIdTypeC = this.b.C();
        messageIdTypeC.getClass();
        return this.a.a(messageIdTypeC);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbk crbkVar = new crbk(fcxyVar, this.a, this.b);
        crbkVar.c = obj;
        return crbkVar;
    }
}
