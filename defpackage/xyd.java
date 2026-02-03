package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyd extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdvc b;
    final /* synthetic */ iaf c;
    final /* synthetic */ List d;
    final /* synthetic */ xye e;
    final /* synthetic */ fdjx f;
    final /* synthetic */ fdae g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyd(fdvc fdvcVar, iaf iafVar, List list, xye xyeVar, fdjx fdjxVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdvcVar;
        this.c = iafVar;
        this.d = list;
        this.e = xyeVar;
        this.f = fdjxVar;
        this.g = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xyd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdvc fdvcVar = this.b;
            xyc xycVar = new xyc(this.c, this.d, this.e, this.f, this.g);
            this.a = 1;
            if (fdvcVar.a(xycVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xyd(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
