package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cscn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cscs b;
    final /* synthetic */ MessageCoreData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscn(fcxy fcxyVar, cscs cscsVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.b = cscsVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cscn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        crtw crtwVar = (crtw) this.b.a.b();
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        Object objC = crtwVar.c(messageCoreData, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cscn cscnVar = new cscn(fcxyVar, this.b, this.c);
        cscnVar.d = obj;
        return cscnVar;
    }
}
