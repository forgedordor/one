package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmps extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmpv b;
    final /* synthetic */ MessageCoreData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmps(fcxy fcxyVar, cmpv cmpvVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.b = cmpvVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmpv cmpvVar = this.b;
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        Object objA = cmpvVar.a(messageCoreData, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cmps cmpsVar = new cmps(fcxyVar, this.b, this.c);
        cmpsVar.d = obj;
        return cmpsVar;
    }
}
