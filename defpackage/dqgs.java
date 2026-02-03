package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgs extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqhd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgs(dqhd dqhdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqhdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqgs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnhb dnhbVarE = this.b.e();
            List listB = fcva.b(dngy.g);
            this.a = 1;
            obj = dnhbVarE.b(listB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.bh();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqgs(this.b, fcxyVar);
    }
}
