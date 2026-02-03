package defpackage;

import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntj implements nnr {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final mau c;
    private long A;
    private long B;
    private nti C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private nnu I;
    private nox[] J;
    private boolean K;
    public nox[] a;
    private final nvl d;
    private final int e;
    private final List f;
    private final SparseArray g;
    private final mfr h;
    private final mfr i;
    private final mfr j;
    private final byte[] k;
    private final mfr l;
    private final nqr m;
    private final mfr n;
    private final ArrayDeque o;
    private final ArrayDeque p;
    private final mhc q;
    private ekgb r;
    private int s;
    private int t;
    private long u;
    private int v;
    private mfr w;
    private long x;
    private int y;
    private long z;

    static {
        mat matVar = new mat();
        matVar.c("application/x-emsg");
        c = new mau(matVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public ntj() {
        nvl nvlVar = nvl.a;
        int i = ekgb.d;
        this(nvlVar, 32, ekoe.a);
    }

    private static mao h(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            mgh mghVar = (mgh) list.get(i);
            if (mghVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = mghVar.a.a;
                ntr ntrVarA = nts.a(bArr);
                UUID uuid = ntrVarA == null ? null : ntrVarA.a;
                if (uuid == null) {
                    mff.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new man(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new mao(null, false, (man[]) arrayList.toArray(new man[0]));
    }

    private final void i() {
        this.s = 0;
        this.v = 0;
    }

    private static void j(mfr mfrVar, int i, nty ntyVar) throws mby {
        mfrVar.K(i + 8);
        int iA = ntd.a(mfrVar.e());
        if ((iA & 1) != 0) {
            throw new mby("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
        }
        boolean z = (iA & 2) != 0;
        int iM = mfrVar.m();
        if (iM == 0) {
            Arrays.fill(ntyVar.l, 0, ntyVar.e, false);
            return;
        }
        int i2 = ntyVar.e;
        if (iM != i2) {
            throw new mby(a.s(i2, iM, "Senc sample count ", " is different from fragment sample count"), null, true, 1);
        }
        Arrays.fill(ntyVar.l, 0, iM, z);
        ntyVar.b(mfrVar.a());
        mfr mfrVar2 = ntyVar.n;
        mfrVar.F(mfrVar2.a, 0, mfrVar2.c);
        mfrVar2.K(0);
        ntyVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x06ec, code lost:
    
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06ef, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0400  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(long r53) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntj.k(long):void");
    }

    private static void l(int i) throws mby {
        if (i < 0) {
            throw new mby(a.g(i, "Unexpected negative value: "), null, true, 1);
        }
    }

    private static final nte m(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (nte) sparseArray.valueAt(0);
        }
        nte nteVar = (nte) sparseArray.get(i);
        mee.f(nteVar);
        return nteVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fe, code lost:
    
        if (defpackage.mbw.h(r9.k, r6) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0201, code lost:
    
        r22 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0205, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0207, code lost:
    
        r22 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        if ((r10 & 31) == 6) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0212, code lost:
    
        if (j$.util.Objects.equals(r2, "video/hevc") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021a, code lost:
    
        if (defpackage.mbw.h(r9.k, "video/hevc") == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
    
        if (((r10 & 126) >> 1) != 39) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0224, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        r21 = r3;
        r22 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022c, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022d, code lost:
    
        r37.H = r2;
        r11.m(r12, r4);
        r37.E += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0237, code lost:
    
        if (r4 <= 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023b, code lost:
    
        if (r37.G != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0243, code lost:
    
        if (defpackage.mgy.k(r13, r4, r7.g) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0245, code lost:
    
        r37.G = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0249, code lost:
    
        r3 = r21;
        r6 = r22;
        r2 = r27;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0253, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025d, code lost:
    
        throw new defpackage.mby("Invalid NAL length", null, r2, r2 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025e, code lost:
    
        r27 = r2;
        r21 = r3;
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0267, code lost:
    
        if (r37.H == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0269, code lost:
    
        r2 = r37.j;
        r2.G(r4);
        r38.j(r2.a, 0, r37.F);
        r11.m(r2, r37.F);
        r3 = r37.F;
        r4 = defpackage.mgy.e(r2.a, r2.c);
        r2.K(0);
        r2.J(r4);
        r4 = r7.g.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0290, code lost:
    
        if (r4 != (-1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0292, code lost:
    
        r4 = r37.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0296, code lost:
    
        if (r4.b == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0298, code lost:
    
        r4.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029c, code lost:
    
        r9 = r37.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a0, code lost:
    
        if (r9.b == r4) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a2, code lost:
    
        r9.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a5, code lost:
    
        r4 = r37.q;
        r4.a(r14, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b2, code lost:
    
        if ((r27.a() & 4) == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b4, code lost:
    
        r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b8, code lost:
    
        r3 = r11.e(r38, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02bd, code lost:
    
        r37.E += r3;
        r37.F -= r3;
        r3 = r21;
        r6 = r22;
        r2 = r27;
        r10 = 0;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d3, code lost:
    
        r0 = r27.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d9, code lost:
    
        if (r37.G != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02db, code lost:
    
        r0 = r0 | com.android.vcard.VCardConfig.FLAG_APPEND_TYPE_PARAM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02de, code lost:
    
        r22 = r0;
        r0 = r27.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e4, code lost:
    
        if (r0 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e6, code lost:
    
        r25 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02eb, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ed, code lost:
    
        r20 = r14;
        r11.o(r20, r22, r37.D, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fa, code lost:
    
        r0 = r37.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0300, code lost:
    
        if (r0.isEmpty() != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0302, code lost:
    
        r0 = (defpackage.nth) r0.removeFirst();
        r2 = r37.y;
        r7 = r0.c;
        r37.y = r2 - r7;
        r2 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0313, code lost:
    
        if (r0.b == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0315, code lost:
    
        r2 = r2 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0317, code lost:
    
        r4 = r2;
        r0 = r37.J;
        r2 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031c, code lost:
    
        if (r10 >= r2) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031e, code lost:
    
        r0[r10].o(r4, 1, r7, r37.y, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032e, code lost:
    
        if (r27.g() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0330, code lost:
    
        r37.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0333, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0334, code lost:
    
        r37.s = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0338, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r6 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r37.s != 3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r2.k != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r37.D = r3;
        r3 = r2.d.a.g.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (j$.util.Objects.equals(r3, "video/avc") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        j$.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        r37.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r2.f >= r2.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r38.l(r37.D);
        r0 = r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        r3 = r2.b;
        r5 = r3.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (r0 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        r5.L(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (r3.c(r2.f) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        r5.L(r5.n() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        if (r2.g() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        r37.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010a, code lost:
    
        if (r2.d.a.h != 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010c, code lost:
    
        r37.D -= 8;
        r38.l(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.o) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        r37.E = r2.b(r37.D, 7);
        r3 = r37.D;
        r11 = r37.l;
        defpackage.nmw.b(r3, r11);
        r2.a.m(r11, 7);
        r3 = r37.E + 7;
        r37.E = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0140, code lost:
    
        r3 = r2.b(r37.D, 0);
        r37.E = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        r37.D += r3;
        r37.s = 4;
        r37.F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0152, code lost:
    
        r3 = r2.d;
        r7 = r3.a;
        r11 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        if (r2.k != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015c, code lost:
    
        r14 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0163, code lost:
    
        r14 = r2.b.a(r2.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        r3 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016d, code lost:
    
        if (r3 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016f, code lost:
    
        r3 = r37.E;
        r4 = r37.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        if (r3 >= r4) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
    
        r37.E += r11.e(r38, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r12 = r37.i;
        r13 = r12.a;
        r13[0] = 0;
        r13[1] = 0;
        r13[r39] = 0;
        r8 = 4 - r3;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0196, code lost:
    
        if (r37.E >= r37.D) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0198, code lost:
    
        r4 = r37.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019a, code lost:
    
        if (r4 != 0) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019f, code lost:
    
        if (r37.a.length > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a3, code lost:
    
        if (r37.G != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        r27 = r2;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        r4 = defpackage.mgy.d(r7.g);
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b9, code lost:
    
        if ((r3 + r4) <= (r37.D - r37.E)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bc, code lost:
    
        r38.j(r13, r8, r3 + r4);
        r12.K(0);
        r9 = r12.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c9, code lost:
    
        if (r9 < 0) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cb, code lost:
    
        r37.F = r9 - r4;
        r9 = r37.h;
        r9.K(0);
        r11.m(r9, 4);
        r37.E += 4;
        r37.D += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e4, code lost:
    
        if (r37.a.length <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
    
        if (r4 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        r9 = r7.g;
        r10 = r13[4];
        r2 = defpackage.mgy.a;
        r2 = r9.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
    
        if (j$.util.Objects.equals(r2, r6) != false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r38, defpackage.non r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntj.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        int i;
        int i2 = this.e;
        if ((i2 & 32) == 0) {
            nnuVar = new nvo(nnuVar, this.d);
        }
        this.I = nnuVar;
        i();
        nox[] noxVarArr = new nox[2];
        this.J = noxVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            noxVarArr[0] = this.I.p(100, 5);
            i = 1;
            i3 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            i = 0;
        }
        nox[] noxVarArr2 = (nox[]) mgb.ag(this.J, i);
        this.J = noxVarArr2;
        for (nox noxVar : noxVarArr2) {
            noxVar.i(c);
        }
        List list = this.f;
        this.a = new nox[list.size()];
        while (i4 < this.a.length) {
            nox noxVarP = this.I.p(i3, 3);
            noxVarP.i((mau) list.get(i4));
            this.a[i4] = noxVarP;
            i4++;
            i3++;
        }
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((nti) sparseArray.valueAt(i)).f();
        }
        this.p.clear();
        this.y = 0;
        this.q.a.clear();
        this.z = j2;
        this.o.clear();
        i();
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        ekgb ekgbVarR;
        nou nouVarA = ntv.a(nnsVar, true, false);
        if (nouVarA != null) {
            ekgbVarR = ekgb.r(nouVarA);
        } else {
            int i = ekgb.d;
            ekgbVarR = ekoe.a;
        }
        this.r = ekgbVarR;
        return nouVarA == null;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        return this.r;
    }

    public ntj(nvl nvlVar, int i, List list) {
        this.d = nvlVar;
        this.e = i;
        this.f = DesugarCollections.unmodifiableList(list);
        this.m = new nqr();
        this.n = new mfr(16);
        this.h = new mfr(mgy.a);
        this.i = new mfr(6);
        this.j = new mfr();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new mfr(bArr);
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.g = new SparseArray();
        int i2 = ekgb.d;
        this.r = ekoe.a;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = nnu.y;
        this.J = new nox[0];
        this.a = new nox[0];
        this.q = new mhc(new mhb() { // from class: ntg
            @Override // defpackage.mhb
            public final void a(long j, mfr mfrVar) {
                nnf.a(j, mfrVar, this.a.a);
            }
        });
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
