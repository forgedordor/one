package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avfg extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ ehvv c;
    final /* synthetic */ avef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfg(avgc avgcVar, ehvv ehvvVar, avef avefVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = ehvvVar;
        this.d = avefVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avgc avgcVar = this.b;
            ehvv ehvvVar = this.c;
            avef avefVar = this.d;
            this.a = 1;
            obj = avgcVar.A(ehvvVar, avefVar, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        this.a = 2;
        Object objA = fdjy.a(new avfp(this.b, (List) obj, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avfg(this.b, this.c, this.d, fcxyVar);
    }
}
