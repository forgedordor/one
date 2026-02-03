package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgkh {
    public static final ekhx a = ekhx.r(cjtq.OTP_TIMEOUT, cjtq.OTP_THROTTLED);
    public final dgrs b;
    public final diep c;

    public dgkh(dgrs dgrsVar, diep diepVar) {
        this.b = dgrsVar;
        this.c = diepVar;
    }

    public final boolean a(String str, String str2, int i) {
        Optional optionalI = this.b.i(str, ewpa.SIM);
        return optionalI.isPresent() && ((cjtu) optionalI.get()).c.equals(str2) && Collection.EL.stream(((cjtu) optionalI.get()).d).filter(new Predicate() { // from class: dgkf
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
                cjtt cjttVar = (cjtt) obj;
                ekhx ekhxVar = dgkh.a;
                if ((cjttVar.b & 2) == 0) {
                    return false;
                }
                ekhx ekhxVar2 = dgkh.a;
                cjtr cjtrVar = cjttVar.d;
                if (cjtrVar == null) {
                    cjtrVar = cjtr.a;
                }
                cjtq cjtqVarB = cjtq.b(cjtrVar.e);
                if (cjtqVarB == null) {
                    cjtqVarB = cjtq.UNRECOGNIZED;
                }
                return ekhxVar2.contains(cjtqVarB);
            }
        }).count() >= ((long) i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final java.lang.String r7, final defpackage.ewpa r8, java.lang.String r9, defpackage.cjtq r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgkh.b(java.lang.String, ewpa, java.lang.String, cjtq):void");
    }
}
