package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctkp extends fcyz implements fday {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    final /* synthetic */ ctku g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkp(ctku ctkuVar, fcxy fcxyVar) {
        super(7, fcxyVar);
        this.g = ctkuVar;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        ?? r13 = this.f;
        ctku ctkuVar = this.g;
        ctkm ctkmVar = new ctkm(ctkuVar);
        ctkn ctknVar = new ctkn(ctkuVar);
        ctko ctkoVar = new ctko(ctkuVar.d);
        ctju ctjuVarC = ctkuVar.c();
        ctot ctotVar = (ctot) obj5;
        ctlz ctlzVar = (ctlz) obj4;
        fdpl fdplVar = ctkuVar.j;
        return new ctjw((ctrh) obj2, fdplVar, (ctno) obj3, ctlzVar, ctotVar, (ctoe) obj6, r13, ctkmVar, ctknVar, ctkoVar, ctjuVarC);
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        ctkp ctkpVar = new ctkp(this.g, (fcxy) obj7);
        ctkpVar.a = (ctrh) obj;
        ctkpVar.b = (ctno) obj2;
        ctkpVar.c = (ctlz) obj3;
        ctkpVar.d = (ctot) obj4;
        ctkpVar.e = (ctoe) obj5;
        ctkpVar.f = (List) obj6;
        return ctkpVar.b(fctx.a);
    }
}
