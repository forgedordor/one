package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oou extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdjx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oou(fcxy fcxyVar, fdjx fdjxVar) {
        super(3, fcxyVar);
        this.c = fdjxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        oou oouVar = new oou((fcxy) obj3, this.c);
        oouVar.d = (fdpm) obj;
        oouVar.b = obj2;
        return oouVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            orv orvVar = new orv(this.c, (oux) this.b);
            this.a = 1;
            if (r5.fO(orvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
