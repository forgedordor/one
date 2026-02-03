package defpackage;

import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwoz extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwpc b;
    final /* synthetic */ atys c;
    final /* synthetic */ MessageReceipt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwoz(bwpc bwpcVar, atys atysVar, MessageReceipt messageReceipt, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwpcVar;
        this.c = atysVar;
        this.d = messageReceipt;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwoz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bwpc bwpcVar = this.b;
        atys atysVar = this.c;
        MessageReceipt messageReceipt = this.d;
        this.a = 1;
        Object objB = bwpcVar.b(atysVar, messageReceipt, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwoz(this.b, this.c, this.d, fcxyVar);
    }
}
