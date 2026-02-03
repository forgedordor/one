package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class drb {
    public static /* synthetic */ void a(dsc dscVar, float f) {
        dsd dsdVar = dscVar.d;
        float fA = dsdVar.a();
        dsdVar.e.h(f);
        dsdVar.f.h(0.0f);
        if (Float.isNaN(fA)) {
            return;
        }
        boolean z = f >= fA;
        if (dsdVar.a() == dsdVar.k().a(dsdVar.d())) {
            Object objC = dsdVar.k().c(dsdVar.a() + (f >= fA ? 1.0f : -1.0f), z);
            if (objC == null) {
                objC = dsdVar.d();
            }
            if (z) {
                dscVar.a = dsdVar.d();
                dscVar.b = objC;
            } else {
                dscVar.a = objC;
                dscVar.b = dsdVar.d();
            }
        } else {
            Object objC2 = dsdVar.k().c(dsdVar.a(), false);
            if (objC2 == null) {
                objC2 = dsdVar.d();
            }
            Object objC3 = dsdVar.k().c(dsdVar.a(), true);
            if (objC3 == null) {
                objC3 = dsdVar.d();
            }
            dscVar.a = objC2;
            dscVar.b = objC3;
        }
        dst dstVarK = dsdVar.k();
        Object obj = dscVar.a;
        obj.getClass();
        float fA2 = dstVarK.a(obj);
        dst dstVarK2 = dsdVar.k();
        Object obj2 = dscVar.b;
        obj2.getClass();
        dscVar.c = Math.abs(fA2 - dstVarK2.a(obj2));
        if (Math.abs(dsdVar.a() - dsdVar.k().a(dsdVar.d())) >= dscVar.c / 2.0f) {
            Object objD = z ? dscVar.b : dscVar.a;
            if (objD == null) {
                objD = dsdVar.d();
            }
            ((Boolean) dsdVar.a.invoke(objD)).booleanValue();
            dsdVar.h(objD);
        }
    }
}
