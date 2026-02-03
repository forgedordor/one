package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpuc implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ fdap g;
    final /* synthetic */ fdae h;
    final /* synthetic */ String i;
    final /* synthetic */ String j;

    public dpuc(boolean z, boolean z2, fdae fdaeVar, float f, boolean z3, boolean z4, fdap fdapVar, fdae fdaeVar2, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = fdaeVar;
        this.d = f;
        this.e = z3;
        this.f = z4;
        this.g = fdapVar;
        this.h = fdaeVar2;
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            boolean z = this.a;
            dia diaVar = dptr.a;
            dia diaVar2 = dptr.a;
            cye.b(z, null, dae.l(diaVar2, 2), dae.m(diaVar2, 2), null, hxe.d(-996300225, new dpub(edkVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j), hmlVar), hmlVar, 200064, 18);
        }
        return fctx.a;
    }
}
