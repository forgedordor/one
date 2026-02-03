package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evn {
    public static final evm a = a(50);

    public static final evm a(int i) {
        evf evfVarA = evh.a(i);
        return new evm(evfVarA, evfVarA, evfVarA, evfVarA);
    }

    public static final evm b(float f) {
        evi eviVar = new evi(f);
        return new evm(eviVar, eviVar, eviVar, eviVar);
    }

    public static final evm c(float f, float f2, float f3, float f4) {
        return new evm(new evi(f), new evi(f2), new evi(f3), new evi(f4));
    }

    public static /* synthetic */ evm d(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return c(f, f2, f3, f4);
    }
}
