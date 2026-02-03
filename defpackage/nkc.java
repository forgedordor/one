package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkc extends ncn implements nlb {
    private static final int[] l = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean w;
    private static boolean x;
    private final nls A;
    private final int B;
    private final boolean C;
    private final nlc D;
    private final nla E;
    private final long F;
    private final PriorityQueue G;
    private nkb H;
    private boolean I;
    private boolean J;
    private nlx K;
    private boolean L;
    private int M;
    private List N;
    private nke O;
    private mft P;
    private boolean Q;
    private int R;
    private int S;
    private long T;
    private int U;
    private int V;
    private int W;
    private long X;
    private int Y;
    private long Z;
    private mde aa;
    private int ab;
    private int ac;
    private nkz ad;
    private long ae;
    private long af;
    private boolean ag;
    private boolean ah;
    private int ai;
    public Surface j;
    public mde k;
    private final Context y;
    private final boolean z;

    public nkc(nka nkaVar) {
        super(2, nkaVar.d, nkaVar.c, 30.0f);
        Context applicationContext = nkaVar.a.getApplicationContext();
        this.y = applicationContext;
        this.B = nkaVar.g;
        this.K = null;
        this.A = new nls(nkaVar.f, nkaVar.i);
        this.z = this.K == null;
        this.D = new nlc(applicationContext, this, nkaVar.e);
        this.E = new nla();
        this.C = "NVIDIA".equals(Build.MANUFACTURER);
        this.P = mft.a;
        this.R = 1;
        this.S = 0;
        this.k = mde.a;
        this.ac = 0;
        this.aa = null;
        this.ab = -1000;
        this.ae = -9223372036854775807L;
        this.af = -9223372036854775807L;
        this.G = new PriorityQueue();
        long j = nkaVar.h;
        this.F = j != -9223372036854775807L ? -j : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int aB(defpackage.nci r10, defpackage.mau r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkc.aB(nci, mau):int");
    }

    protected static int aC(nci nciVar, mau mauVar) {
        int i = mauVar.p;
        if (i == -1) {
            return aB(nciVar, mauVar);
        }
        List list = mauVar.r;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081 A[Catch: all -> 0x07aa, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001f, B:514:0x07a2, B:42:0x0081, B:44:0x0087, B:47:0x0092, B:80:0x00fd, B:82:0x0103, B:507:0x078c, B:515:0x07a6), top: B:521:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean aH(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkc.aH(java.lang.String):boolean");
    }

    protected static final boolean aK(nci nciVar) {
        return Build.VERSION.SDK_INT >= 35 && nciVar.h;
    }

    protected static final boolean aM(nci nciVar) {
        if (aH(nciVar.a)) {
            return false;
        }
        return !nciVar.f || nke.a();
    }

    private static int aN(int i, int i2) {
        return (i * 3) / (i2 + i2);
    }

    private final Surface aO(nci nciVar) {
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            return nlxVar.a();
        }
        Surface surface = this.j;
        if (surface != null) {
            return surface;
        }
        if (aK(nciVar)) {
            return null;
        }
        mee.c(aM(nciVar));
        nke nkeVar = this.O;
        if (nkeVar != null) {
            if (nkeVar.b != nciVar.f) {
                aT();
            }
        }
        if (this.O == null) {
            boolean z = nciVar.f;
            boolean z2 = false;
            mee.c(!z || nke.a());
            nkd nkdVar = new nkd();
            int i = z ? nke.a : 0;
            nkdVar.start();
            nkdVar.b = new Handler(nkdVar.getLooper(), nkdVar);
            nkdVar.a = new meq(nkdVar.b);
            synchronized (nkdVar) {
                nkdVar.b.obtainMessage(1, i, 0).sendToTarget();
                while (nkdVar.e == null && nkdVar.d == null && nkdVar.c == null) {
                    try {
                        nkdVar.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = nkdVar.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = nkdVar.c;
            if (error != null) {
                throw error;
            }
            nke nkeVar2 = nkdVar.e;
            mee.f(nkeVar2);
            this.O = nkeVar2;
        }
        return this.O;
    }

    private static List aP(Context context, ncp ncpVar, mau mauVar, boolean z, boolean z2) {
        String str = mauVar.o;
        if (str == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        if ("video/dolby-vision".equals(str) && !njz.a(context)) {
            List listF = ncy.f(mauVar, z, z2);
            if (!listF.isEmpty()) {
                return listF;
            }
        }
        return ncy.g(mauVar, z, z2);
    }

    private final void aQ() {
        if (this.U > 0) {
            eO();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.T;
            final nls nlsVar = this.A;
            final int i = this.U;
            Handler handler = nlsVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nlk
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str = mgb.a;
                        mwk mwkVar = (mwk) nlsVar.b.a.j;
                        mwkVar.J(mwkVar.H(), 1018, new mez() { // from class: muw
                            @Override // defpackage.mez
                            public final void a(Object obj) {
                            }
                        });
                    }
                });
            }
            this.U = 0;
            this.T = jElapsedRealtime;
        }
    }

    private final void aR() {
        mde mdeVar = this.aa;
        if (mdeVar != null) {
            this.A.c(mdeVar);
        }
    }

    private final void aS(long j, long j2, mau mauVar) {
        nkz nkzVar = this.ad;
        if (nkzVar != null) {
            nkzVar.c(j, j2, mauVar, ((ncn) this).o);
        }
    }

    private final void aT() {
        nke nkeVar = this.O;
        if (nkeVar != null) {
            nkeVar.release();
            this.O = null;
        }
    }

    private final void aU(Object obj) throws Throwable {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.j == surface) {
            if (surface != null) {
                aR();
                Surface surface2 = this.j;
                if (surface2 == null || !this.Q) {
                    return;
                }
                this.A.b(surface2);
                return;
            }
            return;
        }
        this.j = surface;
        if (this.K == null) {
            this.D.j(surface);
        }
        this.Q = false;
        int i = this.c;
        ncf ncfVar = ((ncn) this).n;
        if (ncfVar != null && this.K == null) {
            nci nciVar = ((ncn) this).p;
            mee.f(nciVar);
            if (!aV(nciVar) || this.I) {
                aq();
                ao();
            } else {
                Surface surfaceAO = aO(nciVar);
                if (surfaceAO != null) {
                    ncfVar.k(surfaceAO);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    ncfVar.g();
                }
            }
        }
        if (surface != null) {
            aR();
        } else {
            this.aa = null;
            nlx nlxVar = this.K;
            if (nlxVar != null) {
                nlxVar.c();
            }
        }
        if (i == 2) {
            nlx nlxVar2 = this.K;
            if (nlxVar2 != null) {
                nlxVar2.e(true);
            } else {
                this.D.c(true);
            }
        }
    }

    private final boolean aV(nci nciVar) {
        if (this.K != null) {
            return true;
        }
        Surface surface = this.j;
        return (surface != null && surface.isValid()) || aK(nciVar) || aM(nciVar);
    }

    @Override // defpackage.mpc
    protected final void A() {
        aQ();
        final int i = this.Y;
        if (i != 0) {
            final nls nlsVar = this.A;
            final long j = this.X;
            Handler handler = nlsVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nlm
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str = mgb.a;
                        mwk mwkVar = (mwk) nlsVar.b.a.j;
                        mwkVar.J(mwkVar.H(), 1021, new mez() { // from class: mvd
                            @Override // defpackage.mez
                            public final void a(Object obj) {
                            }
                        });
                    }
                });
            }
            this.X = 0L;
            this.Y = 0;
        }
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            nlxVar.r();
        } else {
            this.D.e();
        }
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void B(mau[] mauVarArr, long j, long j2, nen nenVar) {
        super.B(mauVarArr, j, j2, nenVar);
        mcl mclVar = this.h;
        if (mclVar.q()) {
            this.af = -9223372036854775807L;
        } else {
            this.af = mclVar.o(nenVar.a, new mcj()).d;
        }
    }

    @Override // defpackage.ncn, defpackage.mpc, defpackage.mth
    public final void I(float f, float f2) throws Throwable {
        super.I(f, f2);
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            nlxVar.m(f);
        } else {
            this.D.k(f);
        }
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.ncn, defpackage.mth
    public final void S(long j, long j2) throws Throwable {
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            try {
                nlxVar.h(j, j2);
            } catch (nlw e) {
                throw h(e, e.a, 7001);
            }
        }
        super.S(j, j2);
    }

    @Override // defpackage.ncn, defpackage.mth
    public final boolean T() {
        if (!((ncn) this).r) {
            return false;
        }
        nlx nlxVar = this.K;
        return nlxVar == null || nlxVar.t();
    }

    @Override // defpackage.ncn, defpackage.mth
    public final boolean U() {
        boolean zU = super.U();
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            return nlxVar.v(zU);
        }
        if (zU && ((ncn) this).n == null) {
            return true;
        }
        return this.D.l(zU);
    }

    @Override // defpackage.ncn
    protected final int W(ncp ncpVar, mau mauVar) {
        boolean z;
        String str = mauVar.o;
        int i = 0;
        if (!mbw.l(str)) {
            return mti.a(0);
        }
        Context context = this.y;
        boolean z2 = mauVar.s != null;
        List listAP = aP(context, ncpVar, mauVar, z2, false);
        if (z2 && listAP.isEmpty()) {
            listAP = aP(context, ncpVar, mauVar, false, false);
        }
        if (listAP.isEmpty()) {
            return mti.a(1);
        }
        if (!ax(mauVar)) {
            return mti.a(2);
        }
        nci nciVar = (nci) listAP.get(0);
        boolean zE = nciVar.e(mauVar);
        if (zE) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listAP.size(); i2++) {
                nci nciVar2 = (nci) listAP.get(i2);
                if (nciVar2.e(mauVar)) {
                    z = false;
                    zE = true;
                    nciVar = nciVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zE ? 3 : 4;
        int i4 = true != nciVar.g(mauVar) ? 8 : 16;
        int i5 = true != nciVar.g ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !njz.a(context)) {
            i6 = 256;
        }
        int i7 = i6;
        if (zE) {
            List listAP2 = aP(context, ncpVar, mauVar, z2, true);
            if (!listAP2.isEmpty()) {
                nci nciVar3 = (nci) ncy.d(listAP2, mauVar).get(0);
                if (nciVar3.e(mauVar) && nciVar3.g(mauVar)) {
                    i = 32;
                }
            }
        }
        return mti.c(i3, i4, i, i5, i7, 0);
    }

    @Override // defpackage.ncn
    protected final mpe X(nci nciVar, mau mauVar, mau mauVar2) throws NumberFormatException {
        int i;
        int i2;
        mpe mpeVarB = nciVar.b(mauVar, mauVar2);
        int i3 = mpeVarB.e;
        nkb nkbVar = this.H;
        mee.f(nkbVar);
        if (mauVar2.v > nkbVar.a || mauVar2.w > nkbVar.b) {
            i3 |= 256;
        }
        if (aC(nciVar, mauVar2) > nkbVar.c) {
            i3 |= 64;
        }
        String str = nciVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = mpeVarB.d;
        }
        return new mpe(str, mauVar, mauVar2, i2, i);
    }

    @Override // defpackage.ncn
    protected final mpe Y(msa msaVar) {
        final mpe mpeVarY = super.Y(msaVar);
        final mau mauVar = msaVar.b;
        mee.f(mauVar);
        final nls nlsVar = this.A;
        Handler handler = nlsVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nlp
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) nlsVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1017, new mez() { // from class: mvm
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        return mpeVarY;
    }

    @Override // defpackage.ncn
    protected final ncd Z(nci nciVar, mau mauVar, MediaCrypto mediaCrypto, float f) throws NumberFormatException {
        nkb nkbVar;
        Point pointA;
        int i;
        int i2;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        mau[] mauVarArr;
        char c;
        boolean z2;
        int i4;
        int iAB;
        mau[] mauVarArrO = O();
        int length = mauVarArrO.length;
        int iAC = aC(nciVar, mauVar);
        int i5 = mauVar.w;
        int i6 = mauVar.v;
        if (length == 1) {
            if (iAC != -1 && (iAB = aB(nciVar, mauVar)) != -1) {
                iAC = Math.min((int) (iAC * 1.5f), iAB);
            }
            nkbVar = new nkb(i6, i5, iAC);
        } else {
            int iMax = i5;
            int iMax2 = i6;
            int i7 = 0;
            boolean z3 = false;
            while (i7 < length) {
                mau mauVar2 = mauVarArrO[i7];
                mag magVar = mauVar.E;
                if (magVar != null && mauVar2.E == null) {
                    mat matVar = new mat(mauVar2);
                    matVar.C = magVar;
                    mauVar2 = new mau(matVar);
                }
                if (nciVar.b(mauVar, mauVar2).d != 0) {
                    int i8 = mauVar2.v;
                    c = 65535;
                    if (i8 != -1) {
                        mauVarArr = mauVarArrO;
                        if (mauVar2.w != -1) {
                            z2 = false;
                        }
                        z3 |= z2;
                        iMax2 = Math.max(iMax2, i8);
                        iMax = Math.max(iMax, mauVar2.w);
                        iAC = Math.max(iAC, aC(nciVar, mauVar2));
                    } else {
                        mauVarArr = mauVarArrO;
                    }
                    z2 = true;
                    z3 |= z2;
                    iMax2 = Math.max(iMax2, i8);
                    iMax = Math.max(iMax, mauVar2.w);
                    iAC = Math.max(iAC, aC(nciVar, mauVar2));
                } else {
                    mauVarArr = mauVarArrO;
                    c = 65535;
                }
                i7++;
                mauVarArrO = mauVarArr;
            }
            if (z3) {
                mff.f("MediaCodecVideoRenderer", a.s(iMax, iMax2, "Resolutions unknown. Codec max resolution: ", "x"));
                boolean z4 = i5 > i6;
                int i9 = z4 ? i5 : i6;
                int i10 = true != z4 ? i5 : i6;
                int[] iArr = l;
                int i11 = 0;
                while (i11 < 9) {
                    float f2 = i9;
                    float f3 = i10;
                    int i12 = iArr[i11];
                    int i13 = i11;
                    float f4 = i12;
                    if (i12 <= i9 || (i = (int) (f4 * (f3 / f2))) <= i10) {
                        break;
                    }
                    int i14 = i9;
                    if (true != z4) {
                        i2 = i10;
                        i3 = i12;
                    } else {
                        i2 = i10;
                        i3 = i;
                    }
                    if (true != z4) {
                        i12 = i;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = nciVar.d;
                    pointA = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : nci.a(videoCapabilities, i3, i12);
                    float f5 = mauVar.z;
                    if (pointA != null) {
                        z = z4;
                        if (nciVar.h(pointA.x, pointA.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i11 = i13 + 1;
                    i9 = i14;
                    i10 = i2;
                    z4 = z;
                }
                pointA = null;
                if (pointA != null) {
                    iMax2 = Math.max(iMax2, pointA.x);
                    iMax = Math.max(iMax, pointA.y);
                    mat matVar2 = new mat(mauVar);
                    matVar2.t = iMax2;
                    matVar2.u = iMax;
                    iAC = Math.max(iAC, aB(nciVar, new mau(matVar2)));
                    mff.f("MediaCodecVideoRenderer", a.s(iMax, iMax2, "Codec max resolution adjusted to: ", "x"));
                }
            }
            nkbVar = new nkb(iMax2, iMax, iAC);
        }
        String str = nciVar.c;
        this.H = nkbVar;
        boolean z5 = this.C;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i5);
        mfi.f(mediaFormat, mauVar.r);
        mfi.g(mediaFormat, mauVar.z);
        mfi.d(mediaFormat, "rotation-degrees", mauVar.A);
        mfi.c(mediaFormat, mauVar.E);
        if ("video/dolby-vision".equals(mauVar.o)) {
            int i15 = ncy.a;
            Pair pairA = mek.a(mauVar);
            if (pairA != null) {
                mfi.d(mediaFormat, "profile", ((Integer) pairA.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", nkbVar.a);
        mediaFormat.setInteger("max-height", nkbVar.b);
        mfi.d(mediaFormat, "max-input-size", nkbVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            i4 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(i4, -this.ab));
        }
        Surface surfaceAO = aO(nciVar);
        if (this.K != null && !mgb.Z(this.y)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new ncd(nciVar, mediaFormat, mauVar, surfaceAO, mediaCrypto, null);
    }

    @Override // defpackage.ncn
    protected final void aA() {
        this.ai = 0;
        this.W++;
    }

    protected final long aD() {
        return -this.ae;
    }

    public final void aE() {
        this.A.b(this.j);
        this.Q = true;
    }

    protected final void aF(int i, int i2) {
        mpd mpdVar = this.t;
        mpdVar.h += i;
        int i3 = i + i2;
        mpdVar.g += i3;
        this.U += i3;
        int i4 = this.V + i3;
        this.V = i4;
        mpdVar.i = Math.max(i4, mpdVar.i);
        int i5 = this.B;
        if (i5 <= 0 || this.U < i5) {
            return;
        }
        aQ();
    }

    protected final void aG(long j) {
        mpd mpdVar = this.t;
        mpdVar.k += j;
        mpdVar.l++;
        this.X += j;
        this.Y++;
    }

    protected final void aI(ncf ncfVar, int i, long j) {
        Trace.beginSection("releaseOutputBuffer");
        ncfVar.j(i, j);
        Trace.endSection();
        this.t.e++;
        this.V = 0;
        if (this.K == null) {
            mde mdeVar = this.k;
            if (!mdeVar.equals(mde.a) && !mdeVar.equals(this.aa)) {
                this.aa = mdeVar;
                this.A.c(mdeVar);
            }
            if (!this.D.m() || this.j == null) {
                return;
            }
            aE();
        }
    }

    @Override // defpackage.nlb
    public final boolean aJ(long j, long j2, boolean z, boolean z2) throws Throwable {
        int iEN;
        if (this.K != null && this.z) {
            j2 -= aD();
        }
        long j3 = this.F;
        if (j3 != -9223372036854775807L) {
            this.ah = j2 > this.f + 200000 && j < j3;
        }
        if (j >= -500000 || z || (iEN = eN(j2)) == 0) {
            return false;
        }
        if (z2) {
            mpd mpdVar = this.t;
            int i = mpdVar.d + iEN;
            mpdVar.d = i;
            mpdVar.f += this.W;
            mpdVar.d = i + this.G.size();
        } else {
            this.t.j++;
            aF(iEN + this.G.size(), this.W);
        }
        ay();
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            nlxVar.d(false);
        }
        return true;
    }

    protected final void aL(ncf ncfVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        ncfVar.o(i);
        Trace.endSection();
        this.t.f++;
    }

    @Override // defpackage.ncn
    protected final List aa(ncp ncpVar, mau mauVar, boolean z) {
        return ncy.d(aP(this.y, ncpVar, mauVar, z, false), mauVar);
    }

    @Override // defpackage.ncn
    protected final void ab(mix mixVar) {
        if (this.J) {
            ByteBuffer byteBuffer = mixVar.g;
            mee.f(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        ncf ncfVar = ((ncn) this).n;
                        mee.f(ncfVar);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        ncfVar.l(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.ncn
    protected final void ac(final Exception exc) {
        mff.d("MediaCodecVideoRenderer", "Video codec error", exc);
        final nls nlsVar = this.A;
        Handler handler = nlsVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nln
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) nlsVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1030, new mez() { // from class: muj
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.ncn
    protected final void ad(final String str) {
        final nls nlsVar = this.A;
        Handler handler = nlsVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nlr
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = mgb.a;
                    mwk mwkVar = (mwk) nlsVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1019, new mez() { // from class: muv
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.ncn
    protected final void ae(mau mauVar, MediaFormat mediaFormat) {
        ncf ncfVar = ((ncn) this).n;
        if (ncfVar != null) {
            ncfVar.m(this.R);
        }
        mee.f(mediaFormat);
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = mauVar.B;
        int i = mauVar.A;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.k = new mde(integer, integer2, f);
        nlx nlxVar = this.K;
        if (nlxVar == null || !this.ag) {
            this.D.i(mauVar.z);
        } else {
            mat matVar = new mat(mauVar);
            matVar.t = integer;
            matVar.u = integer2;
            matVar.z = f;
            mau mauVar2 = new mau(matVar);
            int i3 = this.M;
            List list = this.N;
            if (list == null) {
                int i4 = ekgb.d;
                list = ekoe.a;
            }
            nlxVar.w(mauVar2, am(), i3, list);
            this.M = 2;
        }
        this.ag = false;
    }

    @Override // defpackage.ncn
    protected final void af() {
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            nlxVar.p();
            if (this.ae == -9223372036854775807L) {
                this.ae = am();
            }
            this.K.i(aD());
        } else {
            this.D.f(2);
        }
        this.ag = true;
    }

    @Override // defpackage.ncn
    protected final void ag() {
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            nlxVar.p();
        }
    }

    @Override // defpackage.ncn
    protected final boolean ah(long j, long j2, ncf ncfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, mau mauVar) {
        mee.f(ncfVar);
        long jAl = j3 - al();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.G;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        aF(i4, 0);
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            if (!z || z2) {
                return nlxVar.s(j3, new njy(this, ncfVar, i));
            }
            aL(ncfVar, i);
            return true;
        }
        nlc nlcVar = this.D;
        long jAm = am();
        nla nlaVar = this.E;
        int iA = nlcVar.a(j3, j, j2, jAm, z, z2, nlaVar);
        if (iA == 0) {
            eO();
            long jNanoTime = System.nanoTime();
            aS(jAl, jNanoTime, mauVar);
            aI(ncfVar, i, jNanoTime);
            aG(nlaVar.a);
            return true;
        }
        if (iA == 1) {
            mee.g(ncfVar);
            long j4 = nlaVar.b;
            long j5 = nlaVar.a;
            if (j4 == this.Z) {
                aL(ncfVar, i);
            } else {
                aS(jAl, j4, mauVar);
                aI(ncfVar, i, j4);
            }
            aG(j5);
            this.Z = j4;
            return true;
        }
        if (iA != 2) {
            if (iA != 3) {
                return false;
            }
            aL(ncfVar, i);
            aG(nlaVar.a);
            return true;
        }
        Trace.beginSection("dropVideoBuffer");
        ncfVar.o(i);
        Trace.endSection();
        aF(0, 1);
        aG(nlaVar.a);
        return true;
    }

    @Override // defpackage.ncn
    protected final float aj(float f, mau[] mauVarArr) {
        float fMax = -1.0f;
        for (mau mauVar : mauVarArr) {
            float f2 = mauVar.z;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // defpackage.ncn
    protected final void ak(String str, final long j, final long j2) {
        final String str2;
        final nls nlsVar = this.A;
        Handler handler = nlsVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable() { // from class: nli
                @Override // java.lang.Runnable
                public final void run() {
                    String str3 = mgb.a;
                    mwk mwkVar = (mwk) nlsVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1016, new mez() { // from class: mwa
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        } else {
            str2 = str;
        }
        this.I = aH(str2);
        nci nciVar = ((ncn) this).p;
        mee.f(nciVar);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(nciVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = nciVar.i();
            int length = codecProfileLevelArrI.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrI[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.J = z;
    }

    @Override // defpackage.ncn
    protected final nch an(Throwable th, nci nciVar) {
        return new njw(th, nciVar, this.j);
    }

    @Override // defpackage.ncn
    protected final void ap(long j) {
        super.ap(j);
        this.W--;
    }

    @Override // defpackage.ncn
    protected final void ar() {
        super.ar();
        this.G.clear();
        this.ah = false;
        this.W = 0;
        this.ai = 0;
    }

    @Override // defpackage.ncn
    protected final boolean at() {
        nci nciVar = ((ncn) this).p;
        if (this.K != null && nciVar != null) {
            String str = nciVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                aq();
                return true;
            }
        }
        return super.at();
    }

    @Override // defpackage.ncn
    protected final boolean av(mix mixVar) {
        if (!M() && !mixVar.g() && this.af != -9223372036854775807L) {
            if (this.af - (mixVar.f - al()) > 100000) {
                boolean z = mixVar.f < this.f;
                if ((z || this.ah) && !mixVar.d() && mixVar.eR(VCardConfig.FLAG_APPEND_TYPE_PARAM)) {
                    mixVar.eP();
                    if (z) {
                        this.t.d++;
                    } else if (this.ah) {
                        this.G.add(Long.valueOf(mixVar.f));
                        this.ai++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ncn
    protected final boolean aw(nci nciVar) {
        return aV(nciVar);
    }

    @Override // defpackage.ncn
    protected final void az(mau mauVar) throws mpn {
        nlx nlxVar = this.K;
        if (nlxVar == null || nlxVar.u()) {
            return;
        }
        try {
            nlxVar.x(mauVar);
        } catch (nlw e) {
            throw h(e, mauVar, 7000);
        }
    }

    @Override // defpackage.mpc, defpackage.mth
    public final void q() {
        nlx nlxVar = this.K;
        if (nlxVar == null) {
            this.D.b();
            return;
        }
        int i = this.M;
        if (i == 0 || i == 1) {
            this.M = 0;
        } else {
            nlxVar.b();
        }
    }

    @Override // defpackage.ncn, defpackage.mpc, defpackage.mtd
    public final void r(int i, Object obj) throws Throwable {
        if (i == 1) {
            aU(obj);
            return;
        }
        if (i == 7) {
            mee.f(obj);
            nkz nkzVar = (nkz) obj;
            this.ad = nkzVar;
            nlx nlxVar = this.K;
            if (nlxVar != null) {
                nlxVar.o(nkzVar);
                return;
            }
            return;
        }
        if (i == 10) {
            mee.f(obj);
            int iIntValue = ((Integer) obj).intValue();
            if (this.ac != iIntValue) {
                this.ac = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            mee.f(obj);
            int iIntValue2 = ((Integer) obj).intValue();
            this.R = iIntValue2;
            ncf ncfVar = ((ncn) this).n;
            if (ncfVar != null) {
                ncfVar.m(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            mee.f(obj);
            int iIntValue3 = ((Integer) obj).intValue();
            this.S = iIntValue3;
            nlx nlxVar2 = this.K;
            if (nlxVar2 != null) {
                nlxVar2.j(iIntValue3);
                return;
            } else {
                this.D.h(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            mee.f(obj);
            List list = (List) obj;
            if (list.equals(mda.a)) {
                nlx nlxVar3 = this.K;
                if (nlxVar3 == null || !nlxVar3.u()) {
                    return;
                }
                nlxVar3.f();
                return;
            }
            this.N = list;
            nlx nlxVar4 = this.K;
            if (nlxVar4 != null) {
                nlxVar4.n(list);
                return;
            }
            return;
        }
        if (i == 14) {
            mee.f(obj);
            mft mftVar = (mft) obj;
            if (mftVar.c == 0 || mftVar.d == 0) {
                return;
            }
            this.P = mftVar;
            nlx nlxVar5 = this.K;
            if (nlxVar5 != null) {
                Surface surface = this.j;
                mee.g(surface);
                nlxVar5.l(surface, mftVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                mee.f(obj);
                this.ab = ((Integer) obj).intValue();
                ncf ncfVar2 = ((ncn) this).n;
                if (ncfVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.ab));
                    ncfVar2.l(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.j;
                aU(null);
                mee.f(obj);
                ((nkc) obj).r(1, surface2);
                break;
            case 18:
                break;
            default:
                super.r(i, obj);
                break;
        }
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void u() {
        this.aa = null;
        this.af = -9223372036854775807L;
        this.Q = false;
        try {
            super.u();
        } finally {
            nls nlsVar = this.A;
            nlsVar.a(this.t);
            nlsVar.c(mde.a);
        }
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void v(boolean z, boolean z2) {
        nlx nlxVar;
        super.v(z, z2);
        Q();
        mee.c(true);
        final nls nlsVar = this.A;
        final mpd mpdVar = this.t;
        Handler handler = nlsVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nlo
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) nlsVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1015, new mez() { // from class: mvu
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        if (!this.L) {
            if (this.N != null && this.K == null) {
                nkj nkjVar = new nkj(this.y, this.D);
                nkjVar.d = true;
                nkjVar.e = eO();
                mee.c(!nkjVar.f);
                if (nkjVar.c == null) {
                    nkjVar.c = new nku();
                }
                nkw nkwVar = new nkw(nkjVar);
                nkjVar.f = true;
                nkwVar.u = 1;
                SparseArray sparseArray = nkwVar.d;
                if (mgb.U(sparseArray, 0)) {
                    nlxVar = (nlx) sparseArray.get(0);
                } else {
                    nkq nkqVar = new nkq(nkwVar, nkwVar.b);
                    nkwVar.h.add(nkqVar);
                    sparseArray.put(0, nkqVar);
                    nlxVar = nkqVar;
                }
                this.K = nlxVar;
            }
            this.L = true;
        }
        int i = !z2 ? 1 : 0;
        nlx nlxVar2 = this.K;
        if (nlxVar2 == null) {
            nlc nlcVar = this.D;
            nlcVar.a = eO();
            nlcVar.f(i);
            return;
        }
        nlxVar2.k(new njx(this), eoqg.a);
        nkz nkzVar = this.ad;
        if (nkzVar != null) {
            this.K.o(nkzVar);
        }
        if (this.j != null && !this.P.equals(mft.a)) {
            this.K.l(this.j, this.P);
        }
        this.K.j(this.S);
        this.K.m(((ncn) this).m);
        List list = this.N;
        if (list != null) {
            this.K.n(list);
        }
        this.M = i;
        this.u = true;
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void w(long j, boolean z) {
        nlx nlxVar = this.K;
        if (nlxVar != null && !z) {
            nlxVar.d(true);
        }
        super.w(j, z);
        if (this.K == null) {
            this.D.g();
        }
        if (z) {
            nlx nlxVar2 = this.K;
            if (nlxVar2 != null) {
                nlxVar2.e(false);
            } else {
                this.D.c(false);
            }
        }
        this.V = 0;
    }

    @Override // defpackage.mpc
    protected final void x() {
        nlx nlxVar = this.K;
        if (nlxVar == null || !this.z) {
            return;
        }
        nlxVar.g();
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void y() {
        try {
            super.y();
        } finally {
            this.L = false;
            this.ae = -9223372036854775807L;
            aT();
        }
    }

    @Override // defpackage.mpc
    protected final void z() {
        this.U = 0;
        eO();
        this.T = SystemClock.elapsedRealtime();
        this.X = 0L;
        this.Y = 0;
        nlx nlxVar = this.K;
        if (nlxVar != null) {
            nlxVar.q();
        } else {
            this.D.d();
        }
    }
}
