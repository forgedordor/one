package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fun {
    public static final /* synthetic */ hsf a(boolean z, ebk ebkVar, foz fozVar, float f, float f2, hml hmlVar, int i) {
        hml hmlVar2;
        hsf hsfVarA;
        hsf hsfVarA2;
        hsf hsfVarA3 = ebg.a(ebkVar, hmlVar, (i >> 6) & 14);
        hmlVar.v(998675979);
        long j = !z ? fozVar.c : ((Boolean) ebg.a(ebkVar, hmlVar, ((i & 8190) >> 6) & 14).a()).booleanValue() ? fozVar.a : fozVar.b;
        if (z) {
            hmlVar.v(318143956);
            hmlVar2 = hmlVar;
            hsfVarA = dcs.b(j, dea.c(150, 0, null, 6), hmlVar2, 48, 12);
            hmlVar2.o();
        } else {
            hmlVar2 = hmlVar;
            hmlVar2.v(318246814);
            hsfVarA = hsc.a(new ije(j), hmlVar2);
            hmlVar2.o();
        }
        hmlVar2.o();
        if (true != ((Boolean) hsfVarA3.a()).booleanValue()) {
            f = f2;
        }
        if (z) {
            hmlVar2.v(1361101422);
            hsfVarA2 = ddu.b(f, dea.c(150, 0, null, 6), hmlVar2, 48, 12);
            hmlVar2.o();
        } else {
            hmlVar2.v(1361205644);
            hsfVarA2 = hsc.a(new kir(f2), hmlVar2);
            hmlVar2.o();
        }
        return hsc.a(new dky(((kir) hsfVarA2.a()).a, new ikt(((ije) hsfVarA.a()).i)), hmlVar2);
    }
}
