package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlo implements fdau {
    final /* synthetic */ dmoz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;

    public dmlo(dmoz dmozVar, boolean z, float f) {
        this.a = dmozVar;
        this.b = z;
        this.c = f;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dmoz dmozVar = this.a;
            if (dmozVar.a == 1 && this.b) {
                dmlr.o(this.c, dmozVar.i, dmozVar.f, dmozVar.c, null, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
