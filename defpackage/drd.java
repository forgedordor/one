package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drd {
    public static final ddz a = dea.c(0, 0, null, 7);
    public static final fdap b = new fdap() { // from class: drc
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            float fFloatValue = ((Float) obj).floatValue();
            ddz ddzVar = drd.a;
            return Float.valueOf(fFloatValue / 2.0f);
        }
    };
    public static final int c;

    static {
        deq.a();
        c = 8;
    }
}
