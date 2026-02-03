package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctin implements fdat {
    final /* synthetic */ ctiu a;
    final /* synthetic */ aidm b;

    public ctin(ctiu ctiuVar, aidm aidmVar) {
        this.a = ctiuVar;
        this.b = aidmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ctiu ctiuVar = this.a;
            hpt hptVar = djrx.a;
            Object objB = ctiuVar.f.b();
            objB.getClass();
            aidm aidmVar = this.b;
            hpt hptVar2 = aidp.a;
            aidmVar.getClass();
            hnj.b(new hpu[]{auwg.a.c(((auwh) ctiuVar.a.b()).a), dpjg.a.c(ctiuVar.e.b()), hptVar.c(objB), hptVar2.c(aidmVar)}, hxe.d(1839299615, new ctim(ctiuVar), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
