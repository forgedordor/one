package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkx implements fdau {
    final /* synthetic */ dew a;
    final /* synthetic */ dew b;

    public hkx(dew dewVar, dew dewVar2) {
        this.a = dewVar;
        this.b = dewVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dhe dheVar = (dhe) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-984009111);
        hja hjaVar = hja.a;
        hja hjaVar2 = hja.b;
        dew dewVar = dheVar.d(hjaVar, hjaVar2) ? this.a : (dheVar.d(hjaVar2, hjaVar) || dheVar.d(hja.c, hjaVar2)) ? this.b : this.a;
        hmlVar.o();
        return dewVar;
    }
}
