package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayo extends fcyz implements fdat {
    final /* synthetic */ bayk a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bayo(fcxy fcxyVar, bayk baykVar, MessageCoreData messageCoreData, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.a = baykVar;
        this.b = messageCoreData;
        this.c = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bayo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bayo bayoVar = new bayo(fcxyVar, this.a, this.b, this.c);
        bayoVar.d = obj;
        return bayoVar;
    }
}
