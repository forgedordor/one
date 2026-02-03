package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcd implements fdau {
    final /* synthetic */ dhk a;

    public hcd(dhk dhkVar) {
        this.a = dhkVar;
    }

    private static final float b(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [dew, java.lang.Object] */
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-1498516085);
        dew dewVarB = gpg.b(2, hmlVar);
        dew dewVarB2 = gpg.b(5, hmlVar);
        hcc hccVar = new hcc(dewVarB);
        dhk dhkVar = this.a;
        dib dibVar = diu.a;
        boolean zBooleanValue = ((Boolean) dhkVar.e()).booleanValue();
        hmlVar.v(-1553362193);
        float f = true != zBooleanValue ? 0.8f : 1.0f;
        hmlVar.o();
        Float fValueOf = Float.valueOf(f);
        boolean zBooleanValue2 = ((Boolean) dhkVar.f()).booleanValue();
        hmlVar.v(-1553362193);
        float f2 = true == zBooleanValue2 ? 1.0f : 0.8f;
        hmlVar.o();
        hsf hsfVarF = dhy.f(dhkVar, fValueOf, Float.valueOf(f2), hccVar.a(dhkVar.d(), hmlVar, 0), dibVar, hmlVar, 196608);
        hcb hcbVar = new hcb(dewVarB2);
        boolean zBooleanValue3 = ((Boolean) dhkVar.e()).booleanValue();
        hmlVar.v(2073045083);
        float f3 = true != zBooleanValue3 ? 0.0f : 1.0f;
        hmlVar.o();
        Float fValueOf2 = Float.valueOf(f3);
        boolean zBooleanValue4 = ((Boolean) dhkVar.f()).booleanValue();
        hmlVar.v(2073045083);
        float f4 = true != zBooleanValue4 ? 0.0f : 1.0f;
        hmlVar.o();
        ics icsVarB = ijn.b(icsVar, b(hsfVarF), b(hsfVarF), ((Number) dhy.f(dhkVar, fValueOf2, Float.valueOf(f4), hcbVar.a(dhkVar.d(), hmlVar, 0), dibVar, hmlVar, 196608).a()).floatValue(), 0.0f, null, 131064);
        hmlVar.o();
        return icsVarB;
    }
}
