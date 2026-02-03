package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avfm extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfm(avgc avgcVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        avgc avgcVar = this.b;
        List list = this.c;
        this.a = 1;
        Object objV = avgcVar.v(list, this);
        return objV == fcylVar ? fcylVar : objV;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avfm(this.b, this.c, fcxyVar);
    }
}
