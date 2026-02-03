package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvt extends nwc {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private final long o;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, BasePaymentResult.ERROR_REQUEST_TIMEOUT, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, BasePaymentResult.ERROR_REQUEST_FAILED, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final mfr k = new mfr();
    private final ArrayList p = new ArrayList();
    private nvs q = new nvs(0, 4);
    private int z = 0;

    public nvt(String str, int i2) {
        mee.a(true);
        this.o = 16000000L;
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.n = 0;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.n = 0;
                } else {
                    if (i2 != 4) {
                        mff.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.n = 0;
                        this.m = 0;
                        n(0);
                        m();
                        this.A = true;
                        this.B = -9223372036854775807L;
                    }
                    this.n = 1;
                }
                this.m = 1;
                n(0);
                m();
                this.A = true;
                this.B = -9223372036854775807L;
            }
            this.n = 1;
        }
        this.m = 0;
        n(0);
        m();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char k(byte b) {
        return (char) f[b - 32];
    }

    private final List l() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            mdu mduVarB = ((nvs) arrayList.get(i2)).b(Integer.MIN_VALUE);
            arrayList2.add(mduVarB);
            if (mduVarB != null) {
                iMin = Math.min(iMin, mduVarB.C);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            mdu mduVarB2 = (mdu) arrayList2.get(i3);
            if (mduVarB2 != null) {
                if (mduVarB2.C != iMin) {
                    mduVarB2 = ((nvs) arrayList.get(i3)).b(iMin);
                    mee.f(mduVarB2);
                }
                arrayList3.add(mduVarB2);
            }
        }
        return arrayList3;
    }

    private final void m() {
        this.q.e(this.t);
        ArrayList arrayList = this.p;
        arrayList.clear();
        arrayList.add(this.q);
    }

    private final void n(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 != 3) {
            m();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.r = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.p;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((nvs) arrayList.get(i4)).g = 3;
            i4++;
        }
    }

    private final void o(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean p(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.nwc, defpackage.miu
    public final /* bridge */ /* synthetic */ Object b() {
        return b();
    }

    @Override // defpackage.nwc, defpackage.miu
    public final void c() {
        super.c();
        this.r = null;
        this.s = null;
        n(0);
        o(4);
        m();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.nwc
    protected final nva g() {
        List list = this.r;
        this.s = list;
        mee.f(list);
        return new nwd(list);
    }

    @Override // defpackage.nwc
    /* renamed from: h */
    public final nvh b() {
        nvh nvhVar;
        nvh nvhVarB = super.b();
        if (nvhVarB != null) {
            return nvhVarB;
        }
        long j2 = this.o;
        long j3 = this.B;
        if (j3 == -9223372036854775807L || this.c - j3 < j2 || (nvhVar = (nvh) this.b.pollFirst()) == null) {
            return null;
        }
        this.r = Collections.EMPTY_LIST;
        this.B = -9223372036854775807L;
        nvhVar.i(this.c, g(), Long.MAX_VALUE);
        return nvhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104 A[PHI: r13
      0x0104: PHI (r13v7 int) = (r13v6 int), (r13v9 int) binds: [B:72:0x00e2, B:80:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    @Override // defpackage.nwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void i(defpackage.nvg r17) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvt.i(nvg):void");
    }

    @Override // defpackage.nwc
    protected final boolean j() {
        return this.r != this.s;
    }

    @Override // defpackage.nwc, defpackage.miu
    public final void e() {
    }
}
