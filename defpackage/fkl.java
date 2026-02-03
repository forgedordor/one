package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkl {
    public static final long b;
    public static final dgi c;
    public static final dee a = new dee(Float.NaN, Float.NaN);
    public static final dib d = new dib(new fdap() { // from class: fkd
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((ihs) obj).a;
            long j2 = 9223372034707292159L & j;
            dee deeVar = fkl.a;
            if (j2 == 9205357640488583168L) {
                return fkl.a;
            }
            return new dee(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new fdap() { // from class: fke
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            dee deeVar = (dee) obj;
            dee deeVar2 = fkl.a;
            float f = deeVar.a;
            float f2 = deeVar.b;
            return new ihs((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        }
    });

    static {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        b = jFloatToRawIntBits;
        c = new dgi(new ihs(jFloatToRawIntBits), 3);
    }

    public static final long a(hsf hsfVar) {
        return ((ihs) hsfVar.a()).a;
    }

    public static final ics b(ics icsVar, fdae fdaeVar, fdap fdapVar) {
        return icj.g(icsVar, new fkg(fdaeVar, fdapVar));
    }
}
