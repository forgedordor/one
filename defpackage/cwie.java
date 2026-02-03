package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwie implements fdat {
    final /* synthetic */ dbs a;
    final /* synthetic */ cwhs b;
    final /* synthetic */ cyg c;
    final /* synthetic */ float d;

    public cwie(dbs dbsVar, cwhs cwhsVar, cyg cygVar, float f) {
        this.a = dbsVar;
        this.b = cwhsVar;
        this.c = cygVar;
        this.d = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dbs dbsVar = this.a;
            cwhs cwhsVar = this.b;
            cwab.e(dbsVar, cwhsVar.a, this.c, this.d, hmlVar, 0);
        }
        return fctx.a;
    }
}
