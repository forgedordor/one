package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cjte implements Predicate {
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo538negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        cjsb cjsbVar = (cjsb) obj;
        int iB = cjrz.b(cjsbVar.c);
        if (iB == 0 || iB != 3) {
            return false;
        }
        if ((cjsbVar.b & 64) == 0) {
            int i = cjsbVar.d;
            int iB2 = cjrx.b(i);
            if (iB2 != 0 && iB2 == 5) {
                return true;
            }
            int iB3 = cjrx.b(i);
            if (iB3 != 0 && iB3 == 6) {
                return true;
            }
            int iB4 = cjrx.b(i);
            if (iB4 != 0 && iB4 == 7) {
                return true;
            }
            int iB5 = cjrx.b(i);
            return iB5 != 0 && iB5 == 8;
        }
        int iB6 = cjrx.b(cjsbVar.d);
        if (iB6 != 0 && iB6 == 9) {
            return true;
        }
        cjsa cjsaVar = cjsa.INPUT_BOTTOMSHEET;
        cjsa cjsaVarB = cjsa.b(cjsbVar.h);
        if (cjsaVarB == null) {
            cjsaVarB = cjsa.UNRECOGNIZED;
        }
        if (cjsaVar.equals(cjsaVarB)) {
            int iB7 = cjrx.b(cjsbVar.d);
            return iB7 != 0 && iB7 == 10;
        }
        cjsa cjsaVar2 = cjsa.INPUT_FULLSCREEN;
        cjsa cjsaVarB2 = cjsa.b(cjsbVar.h);
        if (cjsaVarB2 == null) {
            cjsaVarB2 = cjsa.UNRECOGNIZED;
        }
        if (!cjsaVar2.equals(cjsaVarB2)) {
            return false;
        }
        int i2 = cjsbVar.d;
        int iB8 = cjrx.b(i2);
        if (iB8 != 0 && iB8 == 5) {
            return true;
        }
        int iB9 = cjrx.b(i2);
        return iB9 != 0 && iB9 == 10;
    }
}
