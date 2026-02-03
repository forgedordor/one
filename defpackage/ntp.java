package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntp implements nnr, noq {
    private long A;
    private int B;
    private nrn C;
    private final nvl a;
    private final int b;
    private final mfr c;
    private final mfr d;
    private final mfr e;
    private final mfr f;
    private final ArrayDeque g;
    private final ntu h;
    private final List i;
    private ekgb j;
    private int k;
    private int l;
    private long m;
    private int n;
    private mfr o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private long v;
    private nnu w;
    private nto[] x;
    private long[][] y;
    private int z;

    @Deprecated
    public ntp() {
        this(nvl.a, 16);
    }

    private static int h(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int i(ntz ntzVar, long j) {
        int iA = ntzVar.a(j);
        return iA == -1 ? ntzVar.b(j) : iA;
    }

    private static long j(ntz ntzVar, long j, long j2) {
        int i = i(ntzVar, j);
        return i == -1 ? j2 : Math.min(ntzVar.c[i], j2);
    }

    private final void k() {
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0227, code lost:
    
        r13 = "image/png";
        r12 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022c, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022d, code lost:
    
        if (r13 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022f, code lost:
    
        defpackage.mff.f("MetadataUtil", "Unrecognized cover art flags: " + r12);
        r21 = r5;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0248, code lost:
    
        r7.L(4);
        r10 = r10 - 16;
        r0 = new byte[r10];
        r7.F(r0, 0, r10);
        r21 = r5;
        r13 = new defpackage.nqx(r13, null, 3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r21 = r5;
        defpackage.mff.f("MetadataUtil", "Failed to parse cover art attribute");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0267, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0268, code lost:
    
        r7.K(r11);
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026f, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0275, code lost:
    
        if (r12 != 1631670868) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
    
        r0 = defpackage.ntl.d(1631670868, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0280, code lost:
    
        r7.K(r11);
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028a, code lost:
    
        if (r12 != 1936682605) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x028c, code lost:
    
        r0 = defpackage.ntl.d(1936682605, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0299, code lost:
    
        if (r12 != 1936679276) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x029b, code lost:
    
        r0 = defpackage.ntl.d(1936679276, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a8, code lost:
    
        if (r12 != 1936679282) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        r0 = defpackage.ntl.d(1936679282, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b7, code lost:
    
        if (r12 != 1936679265) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b9, code lost:
    
        r0 = defpackage.ntl.d(1936679265, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c6, code lost:
    
        if (r12 != 1936679791) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02c8, code lost:
    
        r0 = defpackage.ntl.d(1936679791, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d5, code lost:
    
        if (r12 != 1920233063) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d7, code lost:
    
        r0 = defpackage.ntl.b(1920233063, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02e5, code lost:
    
        if (r12 != 1885823344) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e7, code lost:
    
        r0 = defpackage.ntl.b(1885823344, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02f6, code lost:
    
        if (r12 != 1936683886) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02f8, code lost:
    
        r0 = defpackage.ntl.d(1936683886, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0306, code lost:
    
        if (r12 != 1953919848) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0308, code lost:
    
        r0 = defpackage.ntl.d(1953919848, "TVSHOW", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0316, code lost:
    
        if (r12 != 757935405) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0318, code lost:
    
        r0 = null;
        r5 = null;
        r10 = r19;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031d, code lost:
    
        r13 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031f, code lost:
    
        if (r13 >= r11) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0321, code lost:
    
        r31 = r7.e();
        r32 = r12;
        r12 = r7.e();
        r7.L(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0334, code lost:
    
        if (r12 != 1835360622) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0336, code lost:
    
        r0 = r7.x(r31 - 12);
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x033f, code lost:
    
        r13 = r31 - 12;
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0346, code lost:
    
        if (r12 != 1851878757) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0348, code lost:
    
        r5 = r7.x(r13);
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x034e, code lost:
    
        r3 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0354, code lost:
    
        if (r12 != 1684108385) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0357, code lost:
    
        r31 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0359, code lost:
    
        if (r12 != 1684108385) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x035b, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x035d, code lost:
    
        r7.L(r13);
        r12 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0363, code lost:
    
        r34 = r3;
        r32 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0367, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0369, code lost:
    
        if (r5 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x036d, code lost:
    
        if (r10 != r19) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0370, code lost:
    
        r7.K(r10);
        r7.L(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0383, code lost:
    
        r13 = new defpackage.nri(r0, r5, r7.x(r32 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0385, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0386, code lost:
    
        r7.K(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x038b, code lost:
    
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0392, code lost:
    
        r34 = r3;
        r21 = r5;
        r3 = 16777215 & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x039d, code lost:
    
        if (r3 != 6516084) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x039f, code lost:
    
        r3 = r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03aa, code lost:
    
        if (r7.e() != 1684108385) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ac, code lost:
    
        r7.L(8);
        r0 = r7.x(r3 - 16);
        r3 = new defpackage.nrb("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03bf, code lost:
    
        defpackage.mff.f("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.mgi.e(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03cc, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03cd, code lost:
    
        r7.K(r11);
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03dc, code lost:
    
        if (r3 == 7233901) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03e1, code lost:
    
        if (r3 != 7631467) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03e8, code lost:
    
        if (r3 == 6516589) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ed, code lost:
    
        if (r3 != 7828084) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03f4, code lost:
    
        if (r3 != 6578553) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03f6, code lost:
    
        r0 = defpackage.ntl.d(r12, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0401, code lost:
    
        if (r3 != 4280916) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0403, code lost:
    
        r0 = defpackage.ntl.d(r12, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x040d, code lost:
    
        if (r3 != 7630703) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x040f, code lost:
    
        r0 = defpackage.ntl.d(r12, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0419, code lost:
    
        if (r3 != 6384738) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x041b, code lost:
    
        r0 = defpackage.ntl.d(r12, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0425, code lost:
    
        if (r3 != 7108978) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0427, code lost:
    
        r0 = defpackage.ntl.d(r12, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0431, code lost:
    
        if (r3 != 6776174) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0433, code lost:
    
        r0 = defpackage.ntl.d(r12, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x043d, code lost:
    
        if (r3 != 6779504) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x043f, code lost:
    
        r0 = defpackage.ntl.d(r12, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0446, code lost:
    
        defpackage.mff.b("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.mgi.e(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x045e, code lost:
    
        r7.K(r11);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0463, code lost:
    
        r0 = defpackage.ntl.d(r12, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x046a, code lost:
    
        r0 = defpackage.ntl.d(r12, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0470, code lost:
    
        r7.K(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0473, code lost:
    
        if (r0 == null) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0475, code lost:
    
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0478, code lost:
    
        r5 = r21;
        r0 = r30;
        r3 = r34;
        r19 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0488, code lost:
    
        r7.K(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x048b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x048c, code lost:
    
        r30 = r0;
        r34 = r3;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0499, code lost:
    
        if (r2.isEmpty() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x049c, code lost:
    
        r0 = new defpackage.mbt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        r7.K(r11);
        r7.L(r10);
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0177, code lost:
    
        r11 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        if (r11 >= r15) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r11 = r11 + r7.e();
        r12 = r7.e();
        r10 = (r12 >> 24) & 255;
        r30 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018f, code lost:
    
        if (r10 == 169) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0193, code lost:
    
        if (r10 != 253) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019a, code lost:
    
        if (r12 != 1735291493) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019c, code lost:
    
        r10 = defpackage.nrh.a(defpackage.ntl.a(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a6, code lost:
    
        if (r10 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a8, code lost:
    
        r0 = new defpackage.nrl("TCON", null, defpackage.ekgb.r(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b5, code lost:
    
        defpackage.mff.f("MetadataUtil", "Failed to parse standard genre code");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bf, code lost:
    
        if (r12 != 1684632427) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        r13 = defpackage.ntl.c(1684632427, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c7, code lost:
    
        r7.K(r11);
        r34 = r3;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ce, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d7, code lost:
    
        if (r12 != 1953655662) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d9, code lost:
    
        r13 = defpackage.ntl.c(1953655662, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e3, code lost:
    
        if (r12 != 1953329263) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e5, code lost:
    
        r0 = defpackage.ntl.b(1953329263, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ed, code lost:
    
        r7.K(r11);
        r34 = r3;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f8, code lost:
    
        if (r12 != 1668311404) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fa, code lost:
    
        r0 = defpackage.ntl.b(1668311404, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0205, code lost:
    
        if (r12 != 1668249202) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0207, code lost:
    
        r10 = r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0212, code lost:
    
        if (r7.e() != 1684108385) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0214, code lost:
    
        r12 = defpackage.ntd.a(r7.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021e, code lost:
    
        if (r12 != 13) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0220, code lost:
    
        r13 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0225, code lost:
    
        if (r12 != 14) goto L101;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0772 A[LOOP:10: B:353:0x076f->B:355:0x0772, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(long r36) {
        /*
            Method dump skipped, instructions count: 2052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntp.l(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x02af A[SYNTHETIC] */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r38, defpackage.non r39) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntp.a(nns, non):int");
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int iB;
        long j6 = j;
        nto[] ntoVarArr = this.x;
        if (ntoVarArr.length == 0) {
            nor norVar = nor.a;
            return new noo(norVar, norVar);
        }
        int i = this.z;
        if (i != -1) {
            ntz ntzVar = ntoVarArr[i].b;
            int i2 = i(ntzVar, j6);
            if (i2 == -1) {
                nor norVar2 = nor.a;
                return new noo(norVar2, norVar2);
            }
            long[] jArr = ntzVar.f;
            long j7 = jArr[i2];
            long[] jArr2 = ntzVar.c;
            j2 = jArr2[i2];
            if (j7 >= j6 || i2 >= ntzVar.b - 1 || (iB = ntzVar.b(j6)) == -1 || iB == i2) {
                j5 = -9223372036854775807L;
                j4 = -1;
            } else {
                j5 = jArr[iB];
                j4 = jArr2[iB];
            }
            j3 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            j4 = -1;
        }
        int i3 = 0;
        while (true) {
            nto[] ntoVarArr2 = this.x;
            if (i3 >= ntoVarArr2.length) {
                break;
            }
            if (i3 != this.z) {
                ntz ntzVar2 = ntoVarArr2[i3].b;
                long j8 = j(ntzVar2, j6, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = j(ntzVar2, j3, j4);
                }
                j2 = j8;
            }
            i3++;
        }
        nor norVar3 = new nor(j6, j2);
        return j3 == -9223372036854775807L ? new noo(norVar3, norVar3) : new noo(norVar3, new nor(j3, j4));
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        if ((this.b & 16) == 0) {
            nnuVar = new nvo(nnuVar, this.a);
        }
        this.w = nnuVar;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                k();
                return;
            }
            ntu ntuVar = this.h;
            ntuVar.c.clear();
            ntuVar.d = 0;
            this.i.clear();
            return;
        }
        for (nto ntoVar : this.x) {
            ntz ntzVar = ntoVar.b;
            int iA = ntzVar.a(j2);
            if (iA == -1) {
                iA = ntzVar.b(j2);
            }
            ntoVar.e = iA;
            noy noyVar = ntoVar.d;
            if (noyVar != null) {
                noyVar.b();
            }
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        ekgb ekgbVarR;
        nou nouVarA = ntv.a(nnsVar, false, (this.b & 2) != 0);
        if (nouVarA != null) {
            ekgbVarR = ekgb.r(nouVarA);
        } else {
            int i = ekgb.d;
            ekgbVarR = ekoe.a;
        }
        this.j = ekgbVarR;
        return nouVarA == null;
    }

    @Override // defpackage.noq
    public final long w() {
        return this.A;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        return this.j;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }

    public ntp(nvl nvlVar, int i) {
        this.a = nvlVar;
        this.b = i;
        int i2 = ekgb.d;
        this.j = ekoe.a;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new ntu();
        this.i = new ArrayList();
        this.f = new mfr(16);
        this.g = new ArrayDeque();
        this.c = new mfr(mgy.a);
        this.d = new mfr(6);
        this.e = new mfr();
        this.p = -1;
        this.w = nnu.y;
        this.x = new nto[0];
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
