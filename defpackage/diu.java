package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diu {
    public static final dib a = new dib(new fdap() { // from class: dic
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new ded(((Float) obj).floatValue());
        }
    }, new fdap() { // from class: dit
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return Float.valueOf(((ded) obj).a);
        }
    });
    public static final dib b = new dib(new fdap() { // from class: did
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new ded(((Integer) obj).intValue());
        }
    }, new fdap() { // from class: die
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return Integer.valueOf((int) ((ded) obj).a);
        }
    });
    public static final dib c = new dib(new fdap() { // from class: dif
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new ded(((kir) obj).a);
        }
    }, new fdap() { // from class: dig
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new kir(((ded) obj).a);
        }
    });
    public static final dib d = new dib(new fdap() { // from class: dih
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((kiu) obj).a;
            return new dee(kiu.a(j), kiu.b(j));
        }
    }, new fdap() { // from class: dii
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            dee deeVar = (dee) obj;
            float f2 = deeVar.a;
            float f3 = deeVar.b;
            return new kiu((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        }
    });
    public static final dib e = new dib(new fdap() { // from class: dij
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((ihz) obj).a;
            return new dee(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new fdap() { // from class: dik
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            dee deeVar = (dee) obj;
            float f2 = deeVar.a;
            float f3 = deeVar.b;
            return new ihz((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        }
    });
    public static final dib f = new dib(new fdap() { // from class: dil
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((ihs) obj).a;
            return new dee(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }, new fdap() { // from class: dim
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            dee deeVar = (dee) obj;
            float f2 = deeVar.a;
            float f3 = deeVar.b;
            return new ihs((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        }
    });
    public static final dib g = new dib(new fdap() { // from class: din
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((kjb) obj).a;
            return new dee(kjb.a(j), kjb.b(j));
        }
    }, new fdap() { // from class: dio
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            dee deeVar = (dee) obj;
            return new kjb((Math.round(deeVar.a) << 32) | (Math.round(deeVar.b) & 4294967295L));
        }
    });
    public static final dib h = new dib(new fdap() { // from class: dip
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((kjg) obj).a;
            return new dee((int) (j >> 32), (int) (j & 4294967295L));
        }
    }, new fdap() { // from class: diq
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            dee deeVar = (dee) obj;
            int iRound = Math.round(deeVar.a);
            if (iRound < 0) {
                iRound = 0;
            }
            return new kjg((Math.round(deeVar.b) >= 0 ? r5 : 0) | (iRound << 32));
        }
    });
    public static final dib i = new dib(new fdap() { // from class: dir
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ihu ihuVar = (ihu) obj;
            return new deg(ihuVar.b, ihuVar.c, ihuVar.d, ihuVar.e);
        }
    }, new fdap() { // from class: dis
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            deg degVar = (deg) obj;
            return new ihu(degVar.a, degVar.b, degVar.c, degVar.d);
        }
    });
}
