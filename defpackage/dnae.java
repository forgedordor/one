package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnae extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnau b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnae(dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnae) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnau dnauVar = this.b;
            dnhb dnhbVarQ = dnauVar.q();
            List listAW = dnauVar.aW();
            this.a = 1;
            obj = dnhbVarQ.b(listAW, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.be();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnae(this.b, fcxyVar);
    }
}
