package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class khp {
    public static khs a(final khs khsVar, khs khsVar2) {
        boolean z = khsVar2 instanceof kgx;
        if (!z || !(khsVar instanceof kgx)) {
            return (!z || (khsVar instanceof kgx)) ? (z || !(khsVar instanceof kgx)) ? khsVar2.e(new fdae() { // from class: kho
                @Override // defpackage.fdae
                public final Object invoke() {
                    return khsVar;
                }
            }) : khsVar : khsVar2;
        }
        kgx kgxVar = (kgx) khsVar2;
        ikm ikmVar = kgxVar.a;
        float fFloatValue = kgxVar.b;
        fdae fdaeVar = new fdae() { // from class: khn
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(((kgx) khsVar).b);
            }
        };
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) fdaeVar.invoke()).floatValue();
        }
        return new kgx(ikmVar, fFloatValue);
    }

    public static khs b(khs khsVar, fdae fdaeVar) {
        return !fdbq.f(khsVar, khr.a) ? khsVar : (khs) fdaeVar.invoke();
    }
}
