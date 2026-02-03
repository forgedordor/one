package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajdy b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajcy(fcxy fcxyVar, ajdy ajdyVar, List list) {
        super(2, fcxyVar);
        this.b = ajdyVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajcy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ajdy ajdyVar = this.b;
        ajcz ajczVar = new ajcz(this.c);
        this.a = 1;
        Object objB = crrj.b(ajdyVar.a, ajczVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajcy ajcyVar = new ajcy(fcxyVar, this.b, this.c);
        ajcyVar.d = obj;
        return ajcyVar;
    }
}
