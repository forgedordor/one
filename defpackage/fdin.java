package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdin {
    public static final Object a(fcyh fcyhVar, fdat fdatVar, fcxy fcxyVar) {
        Object objB;
        fcyh fcyhVarU = fcxyVar.u();
        fcyh fcyhVarA = fdjn.a(fcyhVarU, fcyhVar);
        fdlw.f(fcyhVarA);
        if (fcyhVarA == fcyhVarU) {
            fdze fdzeVar = new fdze(fcyhVarA, fcxyVar);
            objB = fdzv.a(fdzeVar, fdzeVar, fdatVar);
        } else {
            fcxz fcxzVar = fcya.k;
            if (fdbq.f(fcyhVarA.get(fcxzVar), fcyhVarU.get(fcxzVar))) {
                fdnc fdncVar = new fdnc(fcyhVarA, fcxyVar);
                fcyh fcyhVar2 = ((fdic) fdncVar).a;
                Object objB2 = fdzp.b(fcyhVar2, null);
                try {
                    Object objA = fdzv.a(fdncVar, fdncVar, fdatVar);
                    fdzp.c(fcyhVar2, objB2);
                    objB = objA;
                } catch (Throwable th) {
                    fdzp.c(fcyhVar2, objB2);
                    throw th;
                }
            } else {
                fdkm fdkmVar = new fdkm(fcyhVarA, fcxyVar);
                fdzu.b(fdatVar, fdkmVar, fdkmVar);
                fdhx fdhxVar = fdkmVar.b;
                while (true) {
                    int i = fdhxVar.c;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = fdmf.b(fdkmVar.E());
                        if (objB instanceof fdjg) {
                            throw ((fdjg) objB).b;
                        }
                    } else if (fdhxVar.c(0, 1)) {
                        objB = fcyl.a;
                        break;
                    }
                }
            }
        }
        if (objB == fcyl.a) {
            fcxyVar.getClass();
        }
        return objB;
    }

    public static final fdkf b(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar) {
        fcyh fcyhVarB = fdjn.b(fdjxVar, fcyhVar);
        fdkg fdmgVar = fdjzVar.b() ? new fdmg(fcyhVarB, fdatVar) : new fdkg(fcyhVarB, true);
        fdjzVar.a(fdatVar, fdmgVar, fdmgVar);
        return fdmgVar;
    }

    public static final fdlr c(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar) {
        fcyh fcyhVarB = fdjn.b(fdjxVar, fcyhVar);
        fdic fdmhVar = fdjzVar.b() ? new fdmh(fcyhVarB, fdatVar) : new fdmr(fcyhVarB, true);
        fdjzVar.a(fdatVar, fdmhVar, fdmhVar);
        return fdmhVar;
    }
}
