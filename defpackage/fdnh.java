package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdnh {
    public static final Object a(fcxy fcxyVar) {
        Object obj;
        fcyh fcyhVarU = fcxyVar.u();
        fdlw.f(fcyhVarU);
        fcxy fcxyVarC = fcym.c(fcxyVar);
        fdye fdyeVar = fcxyVarC instanceof fdye ? (fdye) fcxyVarC : null;
        if (fdyeVar == null) {
            obj = fctx.a;
        } else {
            if (fdyf.c(fdyeVar.a, fcyhVarU)) {
                fdyeVar.c(fcyhVarU, fctx.a);
            } else {
                fdng fdngVar = new fdng();
                fcyh fcyhVarPlus = fcyhVarU.plus(fdngVar);
                fctx fctxVar = fctx.a;
                fdyeVar.c(fcyhVarPlus, fctxVar);
                if (fdngVar.b) {
                    boolean z = fdkb.a;
                    ThreadLocal threadLocal = fdmw.a;
                    fdkw fdkwVarA = fdmw.a();
                    if (fdkwVarA.r()) {
                        obj = fctx.a;
                    } else {
                        if (fdkwVarA.q()) {
                            fdyeVar.c = fctxVar;
                            fdyeVar.e = 1;
                            fdkwVarA.o(fdyeVar);
                            obj = fcyl.a;
                        } else {
                            fdkwVarA.p(true);
                            try {
                                fdyeVar.run();
                                do {
                                } while (fdkwVarA.s());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = fctx.a;
                        }
                    }
                }
            }
            obj = fcyl.a;
        }
        fcyl fcylVar = fcyl.a;
        if (obj == fcylVar) {
            fcxyVar.getClass();
        }
        return obj == fcylVar ? obj : fctx.a;
    }
}
