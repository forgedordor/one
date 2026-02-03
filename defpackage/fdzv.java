package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzv {
    public static final Object a(fdze fdzeVar, Object obj, fdat fdatVar) {
        return b(fdzeVar, true, obj, fdatVar);
    }

    public static final Object b(fdze fdzeVar, boolean z, Object obj, fdat fdatVar) throws Throwable {
        Object fdjgVar;
        Object objF;
        try {
            if (fdatVar instanceof fcyt) {
                fdcm.e(fdatVar, 2);
                fdjgVar = fdatVar.a(obj, fdzeVar);
            } else {
                fdjgVar = fcym.a(fdatVar, obj, fdzeVar);
            }
        } catch (fdkl e) {
            Throwable th = e.a;
            fdzeVar.R(new fdjg(th));
            fcxy fcxyVar = fdzeVar.e;
            if (fdkb.b && (fcxyVar instanceof fcyw)) {
                throw fdzh.a(th, (fcyw) fcxyVar);
            }
            throw th;
        } catch (Throwable th2) {
            fdjgVar = new fdjg(th2);
        }
        fcyl fcylVar = fcyl.a;
        if (fdjgVar == fcylVar || (objF = fdzeVar.F(fdjgVar)) == fdmf.b) {
            return fcylVar;
        }
        fdzeVar.d();
        if (!(objF instanceof fdjg)) {
            return fdmf.b(objF);
        }
        if (!z) {
            Throwable th3 = ((fdjg) objF).b;
            if ((th3 instanceof fdmx) && ((fdmx) th3).a == fdzeVar) {
                if (!(fdjgVar instanceof fdjg)) {
                    return fdjgVar;
                }
                Throwable th4 = ((fdjg) fdjgVar).b;
                fcxy fcxyVar2 = fdzeVar.e;
                if (fdkb.b && (fcxyVar2 instanceof fcyw)) {
                    throw fdzh.a(th4, (fcyw) fcxyVar2);
                }
                throw th4;
            }
        }
        Throwable th5 = ((fdjg) objF).b;
        fcxy fcxyVar3 = fdzeVar.e;
        if (fdkb.b && (fcxyVar3 instanceof fcyw)) {
            throw fdzh.a(th5, (fcyw) fcxyVar3);
        }
        throw th5;
    }
}
