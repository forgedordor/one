package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctkh extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ ctku e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkh(ctku ctkuVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = ctkuVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ctkh ctkhVar = new ctkh(this.e, (fcxy) obj5);
        ctkhVar.a = (oux) obj;
        ctkhVar.b = (cudx) obj2;
        ctkhVar.c = (Map) obj3;
        ctkhVar.d = zBooleanValue;
        return ctkhVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        return ovr.a((oux) obj2, new ctkg(this.e, (cudx) obj3, this.c, this.d, null));
    }
}
