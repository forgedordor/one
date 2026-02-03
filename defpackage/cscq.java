package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cscq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cscs b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscq(fcxy fcxyVar, cscs cscsVar, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.b = cscsVar;
        this.c = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cscq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        MessageCoreData messageCoreDataW = ((baxe) cscsVar.f.b()).w(this.c);
        if (messageCoreDataW == null) {
            return null;
        }
        this.a = 1;
        Object objA = cscsVar.a(messageCoreDataW, null, null, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cscq cscqVar = new cscq(fcxyVar, this.b, this.c);
        cscqVar.d = obj;
        return cscqVar;
    }
}
