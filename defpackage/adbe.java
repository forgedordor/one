package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adbe implements fdat {
    final /* synthetic */ hsf a;
    final /* synthetic */ adbm b;

    public adbe(hsf hsfVar, adbm adbmVar) {
        this.a = hsfVar;
        this.b = adbmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hsf hsfVar = this.a;
            cwem cwemVarB = adbg.b(hsfVar);
            cwen cwenVar = cwemVarB != null ? cwemVarB.c : null;
            hmlVar.v(-1633490746);
            boolean zD = hmlVar.D(hsfVar);
            adbm adbmVar = this.b;
            boolean zF = zD | hmlVar.F(adbmVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new adbd(adbmVar, hsfVar, null);
                hmlVar.y(objF);
            }
            hmlVar.o();
            hob.g(cwenVar, (fdat) objF, hmlVar);
            cweb.a(adbg.b(hsfVar), hmlVar, 0);
        }
        return fctx.a;
    }
}
