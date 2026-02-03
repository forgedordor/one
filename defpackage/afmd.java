package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afmd implements fdat {
    final /* synthetic */ afmk a;

    public afmd(afmk afmkVar) {
        this.a = afmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            afmk afmkVar = this.a;
            hpt hptVar = djrx.a;
            Object objB = afmkVar.e.b();
            objB.getClass();
            hnj.b(new hpu[]{auwg.a.c(((auwh) afmkVar.a.b()).a), dpjg.a.c(afmkVar.d.b()), hptVar.c(objB)}, hxe.d(-1608717051, new afmc(afmkVar), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
