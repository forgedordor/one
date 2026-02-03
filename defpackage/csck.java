package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csck extends fcyz implements fdat {
    int a;
    final /* synthetic */ cscs b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csck(cscs cscsVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cscsVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csck) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        MessageCoreData messageCoreData = this.c;
        this.a = 1;
        String strAB = messageCoreData.aB();
        Object objC = null;
        if (strAB != null && !fdgn.H(strAB)) {
            objC = ((csqi) cscsVar.b.b()).c(new cspo(strAB), this);
        }
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csck(this.b, this.c, fcxyVar);
    }
}
