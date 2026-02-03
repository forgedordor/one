package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class org extends fcyz implements fdat {
    int a;
    final /* synthetic */ orh b;
    final /* synthetic */ opp c;
    final /* synthetic */ ovx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public org(orh orhVar, opp oppVar, ovx ovxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = orhVar;
        this.c = oppVar;
        this.d = ovxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((org) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            orh orhVar = this.b;
            opp oppVar = this.c;
            this.a = 1;
            obj = orhVar.a.b(oppVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ovx ovxVar = this.d;
        opl oplVar = (opl) obj;
        List list = oplVar.a;
        return new owb(list, (list.isEmpty() && (ovxVar instanceof ovv)) ? null : oplVar.b, (list.isEmpty() && (ovxVar instanceof ovu)) ? null : oplVar.c, oplVar.d, oplVar.e);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new org(this.b, this.c, this.d, fcxyVar);
    }
}
