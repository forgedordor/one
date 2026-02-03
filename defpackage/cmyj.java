package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmyj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmyk b;
    final /* synthetic */ List c;
    final /* synthetic */ cmxw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmyj(cmyk cmykVar, List list, cmxw cmxwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmykVar;
        this.c = list;
        this.d = cmxwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmyj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmyk cmykVar = this.b;
        List list = this.c;
        cmxw cmxwVar = this.d;
        this.a = 1;
        Object objA = cmykVar.a(list, cmxwVar, 4, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmyj(this.b, this.c, this.d, fcxyVar);
    }
}
