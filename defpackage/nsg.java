package defpackage;

import android.util.SparseArray;
import com.android.vcard.VCardConfig;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nsg implements nnr {
    public static final Map c;
    private final nsi C;
    private final SparseArray D;
    private final boolean E;
    private final nvl F;
    private final mfr G;
    private final mfr H;
    private final mfr I;
    private final mfr J;
    private final mfr K;
    private final mfr L;
    private final mfr M;
    private final mfr N;
    private final mfr O;
    private final mfr P;
    private ByteBuffer Q;
    private long R;
    private boolean S;
    private int T;
    private long U;
    private int V;
    private int W;
    private int[] X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private byte ai;
    private boolean aj;
    private final nsd ak;
    public final boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public nsf k;
    public boolean l;
    public int m;
    public long n;
    public boolean o;
    public long p;
    public long q;
    public mfg r;
    public mfg s;
    public boolean t;
    public long u;
    public int v;
    public boolean w;
    public long x;
    public nnu y;
    private static final byte[] z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = mgb.af("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] A = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] B = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        c = DesugarCollections.unmodifiableMap(map);
    }

    @Deprecated
    public nsg() {
        this(new nsd(), 2, nvl.a);
    }

    private final int n() {
        int i = this.ac;
        s();
        return i;
    }

    private final int o(nns nnsVar, nsf nsfVar, int i, boolean z2) throws mby {
        int i2;
        if ("S_TEXT/UTF8".equals(nsfVar.c)) {
            t(nnsVar, z, i);
            return n();
        }
        if ("S_TEXT/ASS".equals(nsfVar.c) || "S_TEXT/SSA".equals(nsfVar.c)) {
            t(nnsVar, A, i);
            return n();
        }
        if ("S_TEXT/WEBVTT".equals(nsfVar.c)) {
            t(nnsVar, B, i);
            return n();
        }
        nox noxVar = nsfVar.Z;
        if (!this.ae) {
            if (nsfVar.i) {
                this.aa &= -1073741825;
                if (!this.af) {
                    mfr mfrVar = this.I;
                    nnsVar.j(mfrVar.a, 0, 1);
                    this.ab++;
                    byte b2 = mfrVar.a[0];
                    if ((b2 & 128) == 128) {
                        throw new mby("Extension bit is set in signal byte", null, true, 1);
                    }
                    this.ai = b2;
                    this.af = true;
                }
                byte b3 = this.ai;
                if ((b3 & 1) == 1) {
                    int i3 = b3 & 2;
                    this.aa |= 1073741824;
                    if (!this.aj) {
                        mfr mfrVar2 = this.N;
                        nnsVar.j(mfrVar2.a, 0, 8);
                        this.ab += 8;
                        this.aj = true;
                        mfr mfrVar3 = this.I;
                        mfrVar3.a[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                        mfrVar3.K(0);
                        noxVar.n(mfrVar3, 1, 1);
                        this.ac++;
                        mfrVar2.K(0);
                        noxVar.n(mfrVar2, 8, 1);
                        this.ac += 8;
                    }
                    if (i3 == 2) {
                        if (!this.ag) {
                            mfr mfrVar4 = this.I;
                            nnsVar.j(mfrVar4.a, 0, 1);
                            this.ab++;
                            mfrVar4.K(0);
                            this.ah = mfrVar4.j();
                            this.ag = true;
                        }
                        int i4 = this.ah * 4;
                        mfr mfrVar5 = this.I;
                        mfrVar5.G(i4);
                        nnsVar.j(mfrVar5.a, 0, i4);
                        this.ab += i4;
                        int i5 = (this.ah >> 1) + 1;
                        int i6 = (i5 * 6) + 2;
                        ByteBuffer byteBuffer = this.Q;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.Q = ByteBuffer.allocate(i6);
                        }
                        this.Q.position(0);
                        this.Q.putShort((short) i5);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i2 = this.ah;
                            if (i7 >= i2) {
                                break;
                            }
                            int iM = mfrVar5.m();
                            int i9 = iM - i8;
                            if (i7 % 2 == 0) {
                                this.Q.putShort((short) i9);
                            } else {
                                this.Q.putInt(i9);
                            }
                            i7++;
                            i8 = iM;
                        }
                        int i10 = (i - this.ab) - i8;
                        if ((i2 & 1) == 1) {
                            this.Q.putInt(i10);
                        } else {
                            this.Q.putShort((short) i10);
                            this.Q.putInt(0);
                        }
                        mfr mfrVar6 = this.O;
                        mfrVar6.I(this.Q.array(), i6);
                        noxVar.n(mfrVar6, i6, 1);
                        this.ac += i6;
                    }
                }
            } else {
                byte[] bArr = nsfVar.j;
                if (bArr != null) {
                    this.L.I(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(nsfVar.c) ? nsfVar.g > 0 : z2) {
                this.aa |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                this.P.G(0);
                int i11 = (this.L.c + i) - this.ab;
                mfr mfrVar7 = this.I;
                mfrVar7.G(4);
                byte[] bArr2 = mfrVar7.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                noxVar.n(mfrVar7, 4, 2);
                this.ac += 4;
            }
            this.ae = true;
        }
        mfr mfrVar8 = this.L;
        int i12 = i + mfrVar8.c;
        if (!"V_MPEG4/ISO/AVC".equals(nsfVar.c) && !"V_MPEGH/ISO/HEVC".equals(nsfVar.c)) {
            if (nsfVar.V != null) {
                mee.c(mfrVar8.c == 0);
                nsfVar.V.d(nnsVar);
            }
            while (true) {
                int i13 = this.ab;
                if (i13 >= i12) {
                    break;
                }
                int iP = p(nnsVar, noxVar, i12 - i13);
                this.ab += iP;
                this.ac += iP;
            }
        } else {
            mfr mfrVar9 = this.H;
            byte[] bArr3 = mfrVar9.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i14 = nsfVar.aa;
            int i15 = 4 - i14;
            while (this.ab < i12) {
                int i16 = this.ad;
                if (i16 == 0) {
                    int iMin = Math.min(i14, mfrVar8.a());
                    nnsVar.j(bArr3, i15 + iMin, i14 - iMin);
                    if (iMin > 0) {
                        mfrVar8.F(bArr3, i15, iMin);
                    }
                    this.ab += i14;
                    mfrVar9.K(0);
                    this.ad = mfrVar9.m();
                    mfr mfrVar10 = this.G;
                    mfrVar10.K(0);
                    noxVar.m(mfrVar10, 4);
                    this.ac += 4;
                } else {
                    int iP2 = p(nnsVar, noxVar, i16);
                    this.ab += iP2;
                    this.ac += iP2;
                    this.ad -= iP2;
                }
            }
        }
        if ("A_VORBIS".equals(nsfVar.c)) {
            mfr mfrVar11 = this.J;
            mfrVar11.K(0);
            noxVar.m(mfrVar11, 4);
            this.ac += 4;
        }
        return n();
    }

    private final int p(nns nnsVar, nox noxVar, int i) {
        mfr mfrVar = this.L;
        int iA = mfrVar.a();
        if (iA <= 0) {
            return noxVar.e(nnsVar, i, false);
        }
        int iMin = Math.min(i, iA);
        noxVar.m(mfrVar, iMin);
        return iMin;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(defpackage.nsf r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsg.q(nsf, long, int, int, int):void");
    }

    private final void r(nns nnsVar, int i) {
        mfr mfrVar = this.I;
        if (mfrVar.c >= i) {
            return;
        }
        if (mfrVar.b() < i) {
            int iB = mfrVar.b();
            mfrVar.D(Math.max(iB + iB, i));
        }
        byte[] bArr = mfrVar.a;
        int i2 = mfrVar.c;
        nnsVar.j(bArr, i2, i - i2);
        mfrVar.J(i);
    }

    private final void s() {
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = 0;
        this.ai = (byte) 0;
        this.aj = false;
        this.L.G(0);
    }

    private final void t(nns nnsVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        mfr mfrVar = this.M;
        if (mfrVar.b() < i2) {
            mfrVar.H(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, mfrVar.a, 0, length);
        }
        nnsVar.j(mfrVar.a, length, i);
        mfrVar.K(0);
        mfrVar.J(i2);
    }

    private static byte[] u(long j, String str, long j2) {
        mee.a(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return mgb.af(String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] v(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0a53, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0c37, code lost:
    
        r3 = ((defpackage.nni) r6).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0c3e, code lost:
    
        if (r1.o == false) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0c40, code lost:
    
        r1.R = r3;
        r36.a = r1.p;
        r1.o = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0c48, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0c4c, code lost:
    
        if (r1.l == false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0c4e, code lost:
    
        r3 = r1.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0c52, code lost:
    
        if (r3 == (-1)) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0c54, code lost:
    
        r36.a = r3;
        r1.R = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0c5c, code lost:
    
        r0 = r1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0aae A[LOOP:1: B:6:0x0012->B:555:0x0aae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0abb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0b73 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0b7e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0b9c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c24 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r35, defpackage.non r36) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 4014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsg.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        if (this.E) {
            nnuVar = new nvo(nnuVar, this.F);
        }
        this.y = nnuVar;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.q = -9223372036854775807L;
        int i = 0;
        this.T = 0;
        nsd nsdVar = this.ak;
        nsdVar.d = 0;
        nsdVar.b.clear();
        nsdVar.c.d();
        this.C.d();
        s();
        while (true) {
            SparseArray sparseArray = this.D;
            if (i >= sparseArray.size()) {
                return;
            }
            noy noyVar = ((nsf) sparseArray.valueAt(i)).V;
            if (noyVar != null) {
                noyVar.b();
            }
            i++;
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        nsh nshVar = new nsh();
        long j = ((nni) nnsVar).a;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        mfr mfrVar = nshVar.a;
        nnsVar.i(mfrVar.a, 0, 4);
        long jR = mfrVar.r();
        nshVar.b = 4;
        while (true) {
            if (jR != 440786851) {
                int i = (int) j2;
                int i2 = nshVar.b + 1;
                nshVar.b = i2;
                if (i2 == i) {
                    break;
                }
                nnsVar.i(mfrVar.a, 0, 1);
                jR = ((jR << 8) & (-256)) | (mfrVar.a[0] & 255);
            } else {
                long jA = nshVar.a(nnsVar);
                long j3 = nshVar.b;
                if (jA != Long.MIN_VALUE) {
                    long j4 = j3 + jA;
                    if (j == -1 || j4 < j) {
                        while (true) {
                            long j5 = nshVar.b;
                            if (j5 < j4) {
                                if (nshVar.a(nnsVar) == Long.MIN_VALUE) {
                                    break;
                                }
                                long jA2 = nshVar.a(nnsVar);
                                if (jA2 < 0) {
                                    break;
                                }
                                if (jA2 != 0) {
                                    int i3 = (int) jA2;
                                    nnsVar.g(i3);
                                    nshVar.b += i3;
                                }
                            } else if (j5 == j4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long h(long j) throws mby {
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            return mgb.y(j, j2, 1000L);
        }
        throw new mby("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    protected final nsf i(int i) throws mby {
        k(i);
        return this.k;
    }

    public final void j(int i) throws mby {
        if (this.r == null || this.s == null) {
            throw new mby(a.e(i, "Element ", " must be in a Cues"), null, true, 1);
        }
    }

    public final void k(int i) throws mby {
        if (this.k == null) {
            throw new mby(a.e(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    public final void l() {
        mee.g(this.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void m(int i, int i2, nns nnsVar) throws mby {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        Throwable th = null;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.T != 2) {
                    return;
                }
                nsf nsfVar = (nsf) this.D.get(this.Y);
                if (this.v != 4 || !"V_VP9".equals(nsfVar.c)) {
                    nnsVar.l(i2);
                    return;
                }
                mfr mfrVar = this.P;
                mfrVar.G(i2);
                nnsVar.j(mfrVar.a, 0, i2);
                return;
            }
            if (i10 == 16877) {
                nsf nsfVarI = i(i);
                int i13 = nsfVarI.h;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    nnsVar.l(i2);
                    return;
                } else {
                    nsfVarI.P = new byte[i2];
                    nnsVar.j(nsfVarI.P, 0, i2);
                    return;
                }
            }
            if (i10 == 16981) {
                k(i);
                nsf nsfVar2 = this.k;
                nsfVar2.j = new byte[i2];
                nnsVar.j(nsfVar2.j, 0, i2);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr = new byte[i2];
                nnsVar.j(bArr, 0, i2);
                i(i).k = new now(1, bArr, 0, 0);
                return;
            }
            if (i10 == 21419) {
                mfr mfrVar2 = this.K;
                Arrays.fill(mfrVar2.a, (byte) 0);
                nnsVar.j(mfrVar2.a, 4 - i2, i2);
                mfrVar2.K(0);
                this.m = (int) mfrVar2.r();
                return;
            }
            if (i10 == 25506) {
                k(i);
                nsf nsfVar3 = this.k;
                nsfVar3.l = new byte[i2];
                nnsVar.j(nsfVar3.l, 0, i2);
                return;
            }
            if (i10 != 30322) {
                throw new mby(a.g(i10, "Unexpected id: "), null, true, 1);
            }
            k(i);
            nsf nsfVar4 = this.k;
            nsfVar4.x = new byte[i2];
            nnsVar.j(nsfVar4.x, 0, i2);
            return;
        }
        int i14 = 8;
        if (this.T == 0) {
            nsi nsiVar = this.C;
            this.Y = (int) nsiVar.c(nnsVar, false, true, 8);
            this.Z = nsiVar.a;
            this.u = -9223372036854775807L;
            this.T = 1;
            this.I.G(0);
        }
        nsf nsfVar5 = (nsf) this.D.get(this.Y);
        if (nsfVar5 == null) {
            nnsVar.l(i2 - this.Z);
            this.T = 0;
            return;
        }
        nsfVar5.c();
        if (this.T == 1) {
            r(nnsVar, 3);
            mfr mfrVar3 = this.I;
            int i15 = (mfrVar3.a[2] & 6) >> 1;
            if (i15 == 0) {
                this.W = 1;
                int[] iArrV = v(this.X, 1);
                this.X = iArrV;
                iArrV[0] = (i2 - this.Z) - 3;
            } else {
                r(nnsVar, 4);
                int i16 = (mfrVar3.a[3] & 255) + 1;
                this.W = i16;
                int[] iArrV2 = v(this.X, i16);
                this.X = iArrV2;
                if (i15 == 2) {
                    int i17 = (i2 - this.Z) - 4;
                    int i18 = this.W;
                    Arrays.fill(iArrV2, 0, i18, i17 / i18);
                } else {
                    if (i15 != 1) {
                        if (i15 != 3) {
                            throw new mby("Unexpected lacing value: 2", null, true, 1);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 4;
                        while (true) {
                            int i22 = this.W - 1;
                            if (i19 >= i22) {
                                i4 = i11;
                                this.X[i22] = ((i2 - this.Z) - i21) - i20;
                                break;
                            }
                            this.X[i19] = i11;
                            int i23 = i21 + 1;
                            r(nnsVar, i23);
                            int i24 = i11;
                            if (mfrVar3.a[i21] == 0) {
                                boolean z2 = i12;
                                throw new mby("No valid varint length mask found", th, z2, z2 ? 1 : 0);
                            }
                            int i25 = i24;
                            while (true) {
                                if (i25 >= i14) {
                                    i5 = i14;
                                    j = 0;
                                    break;
                                }
                                i5 = i14;
                                int i26 = i12 << (7 - i25);
                                if ((mfrVar3.a[i21] & i26) != 0) {
                                    i23 += i25;
                                    r(nnsVar, i23);
                                    j = mfrVar3.a[i21] & 255 & (~i26);
                                    for (int i27 = i21 + 1; i27 < i23; i27++) {
                                        j = (j << i5) | (mfrVar3.a[i27] & 255);
                                    }
                                    if (i19 > 0) {
                                        j -= (1 << ((i25 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i25++;
                                    i14 = i5;
                                    i12 = 1;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.X;
                            int i28 = (int) j;
                            if (i19 != 0) {
                                i28 += iArr[i19 - 1];
                            }
                            iArr[i19] = i28;
                            i20 += i28;
                            i19++;
                            i21 = i23;
                            i11 = i24;
                            i14 = i5;
                            th = null;
                            i12 = 1;
                        }
                        throw new mby("EBML lacing sample size out of range.", null, true, 1);
                    }
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 4;
                    while (true) {
                        i6 = this.W - 1;
                        if (i29 >= i6) {
                            break;
                        }
                        this.X[i29] = 0;
                        while (true) {
                            i7 = i31 + 1;
                            r(nnsVar, i7);
                            int i32 = mfrVar3.a[i31] & 255;
                            int[] iArr2 = this.X;
                            i8 = iArr2[i29] + i32;
                            iArr2[i29] = i8;
                            if (i32 != 255) {
                                break;
                            } else {
                                i31 = i7;
                            }
                        }
                        i30 += i8;
                        i29++;
                        i31 = i7;
                    }
                    this.X[i6] = ((i2 - this.Z) - i31) - i30;
                }
            }
            i4 = 0;
            int i33 = mfrVar3.a[i4] << 8;
            this.U = this.q + h((r2[1] & 255) | i33);
            if (nsfVar5.e == 2) {
                i9 = 1;
                this.aa = i9;
                this.T = 2;
                this.V = i4;
                i3 = 163;
            } else {
                if (i10 != 163) {
                    i9 = i4;
                } else if ((mfrVar3.a[2] & 128) == 128) {
                    i10 = 163;
                    i9 = 1;
                } else {
                    i9 = i4;
                    i10 = 163;
                }
                this.aa = i9;
                this.T = 2;
                this.V = i4;
                i3 = 163;
            }
        } else {
            i3 = 163;
        }
        if (i10 == i3) {
            while (true) {
                int i34 = this.V;
                if (i34 >= this.W) {
                    this.T = 0;
                    return;
                }
                int iO = o(nnsVar, nsfVar5, this.X[i34], false);
                nsf nsfVar6 = nsfVar5;
                q(nsfVar6, this.U + ((this.V * nsfVar5.f) / 1000), this.aa, iO, 0);
                this.V++;
                nsfVar5 = nsfVar6;
            }
        } else {
            while (true) {
                int i35 = this.V;
                if (i35 >= this.W) {
                    return;
                }
                int[] iArr3 = this.X;
                iArr3[i35] = o(nnsVar, nsfVar5, iArr3[i35], true);
                this.V++;
            }
        }
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    public nsg(nsd nsdVar, int i, nvl nvlVar) {
        this.f = -1L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.p = -1L;
        this.R = -1L;
        this.q = -9223372036854775807L;
        this.ak = nsdVar;
        nsdVar.g = new nse(this);
        this.F = nvlVar;
        this.d = 1 == ((i & 1) ^ 1);
        this.E = (i & 2) == 0;
        this.C = new nsi();
        this.D = new SparseArray();
        this.I = new mfr(4);
        this.J = new mfr(ByteBuffer.allocate(4).putInt(-1).array());
        this.K = new mfr(4);
        this.G = new mfr(mgy.a);
        this.H = new mfr(4);
        this.L = new mfr();
        this.M = new mfr();
        this.N = new mfr(8);
        this.O = new mfr();
        this.P = new mfr();
        this.X = new int[1];
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
