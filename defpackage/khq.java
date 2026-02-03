package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khq {
    static final /* synthetic */ khq a = new khq();

    private khq() {
    }

    public static final khs a(long j) {
        return j != 16 ? new kgy(j) : khr.a;
    }

    public static final khs b(iiy iiyVar, float f) {
        if (iiyVar == null) {
            return khr.a;
        }
        if (!(iiyVar instanceof ikt)) {
            if (iiyVar instanceof ikm) {
                return new kgx((ikm) iiyVar, f);
            }
            throw new fctg();
        }
        long jF = ((ikt) iiyVar).a;
        if (!Float.isNaN(f) && f < 1.0f) {
            jF = ijg.f(ije.d(jF), ije.c(jF), ije.b(jF), ije.a(jF) * f, ije.f(jF));
        }
        return a(jF);
    }
}
