package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckau extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckau(fcxy fcxyVar, ckbk ckbkVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckau) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ckbz ckbzVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            ckbk ckbkVar = this.b;
            this.a = 1;
            obj = ckbkVar.i(this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            ckbzVar = (ckbz) this.c;
            fctl.b(obj);
            return new ckcl(ckbzVar, (List) obj);
        }
        fctl.b(obj);
        ckbk ckbkVar2 = this.b;
        ckbz ckbzVar2 = (ckbz) obj;
        this.c = ckbzVar2;
        this.a = 2;
        Object objY = ckbkVar2.y(this);
        if (objY != fcylVar) {
            ckbzVar = ckbzVar2;
            obj = objY;
            return new ckcl(ckbzVar, (List) obj);
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckau ckauVar = new ckau(fcxyVar, this.b);
        ckauVar.c = obj;
        return ckauVar;
    }
}
