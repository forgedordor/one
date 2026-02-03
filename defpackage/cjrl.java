package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cjrl implements Predicate {
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
        int iA;
        int iA2;
        cjqu cjquVar = (cjqu) obj;
        cqce cqceVar = cjrp.a;
        int iA3 = cjqs.a(cjquVar.c);
        if (iA3 == 0) {
            iA3 = 1;
        }
        int i = cjquVar.e;
        int iA4 = cjqr.a(i);
        return iA3 == 3 && ((iA4 != 0 && iA4 == 4) || (((iA = cjqr.a(i)) != 0 && iA == 6) || ((iA2 = cjqr.a(i)) != 0 && iA2 == 5)));
    }
}
