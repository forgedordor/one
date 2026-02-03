package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusOwnerImpl;
import defpackage.cup;
import defpackage.cuu;
import defpackage.fctg;
import defpackage.fdae;
import defpackage.fdap;
import defpackage.fdat;
import defpackage.fdbq;
import defpackage.fdbt;
import defpackage.fdci;
import defpackage.hum;
import defpackage.icr;
import defpackage.ics;
import defpackage.ifq;
import defpackage.ify;
import defpackage.ifz;
import defpackage.ige;
import defpackage.igf;
import defpackage.igi;
import defpackage.igj;
import defpackage.igk;
import defpackage.igx;
import defpackage.ihc;
import defpackage.ihe;
import defpackage.ihf;
import defpackage.ihu;
import defpackage.itw;
import defpackage.jbg;
import defpackage.jbi;
import defpackage.jcr;
import defpackage.jdy;
import defpackage.jee;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements ige {
    public final fdat a;
    public final fdae b;
    public final ify d;
    public FocusTargetNode h;
    private final fdap i;
    private final fdae j;
    private final fdae k;
    private cup l;
    public final FocusTargetNode c = new FocusTargetNode(2, null, 6);
    public final ihc e = new ihc();
    public final ics f = new jdy<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ icr d() {
            return this.a.c;
        }

        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.a.c.hashCode();
        }
    };
    public final cuu g = new cuu(1);

    public FocusOwnerImpl(fdap fdapVar, fdat fdatVar, fdap fdapVar2, fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3) {
        this.a = fdatVar;
        this.i = fdapVar2;
        this.b = fdaeVar;
        this.j = fdaeVar2;
        this.k = fdaeVar3;
        this.d = new ify(fdapVar, new igf(this), new fdbt(this) { // from class: igg
            @Override // defpackage.fdbt, defpackage.fdee
            public final Object a() {
                return ((FocusOwnerImpl) this.g).h;
            }
        });
    }

    private final void i() {
        jee jeeVar;
        FocusTargetNode focusTargetNode = this.h;
        if (focusTargetNode == null) {
            return;
        }
        e(null);
        igx igxVar = igx.a;
        igx igxVar2 = igx.d;
        focusTargetNode.i(igxVar, igxVar2);
        if (!focusTargetNode.s.C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar = focusTargetNode.s.v;
        jcr jcrVarD = jbg.d(focusTargetNode);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 1024) != 0) {
                while (icrVar != null) {
                    if ((icrVar.t & 1024) != 0) {
                        hum humVar = null;
                        icr icrVarA = icrVar;
                        while (icrVarA != null) {
                            if (icrVarA instanceof FocusTargetNode) {
                                ((FocusTargetNode) icrVarA).i(igx.b, igxVar2);
                            } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                int i = 0;
                                for (icr icrVar2 = ((jbi) icrVarA).E; icrVar2 != null; icrVar2 = icrVar2.w) {
                                    if ((icrVar2.t & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            icrVarA = icrVar2;
                                        } else {
                                            if (humVar == null) {
                                                humVar = new hum(new icr[16]);
                                            }
                                            if (icrVarA != null) {
                                                humVar.n(icrVarA);
                                            }
                                            humVar.n(icrVar2);
                                            icrVarA = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            icrVarA = jbg.a(humVar);
                        }
                    }
                    icrVar = icrVar.v;
                }
            }
            jcrVarD = jcrVarD.s();
            icrVar = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
        }
    }

    @Override // defpackage.iga
    public final void a(boolean z) {
        g(z, true, 8);
    }

    @Override // defpackage.iga
    public final boolean b(int i) {
        Boolean boolD;
        fdci fdciVar = new fdci();
        fdciVar.a = false;
        ihc ihcVar = this.e;
        int i2 = ihcVar.a;
        FocusTargetNode focusTargetNode = this.h;
        Boolean boolD2 = d(i, (ihu) this.j.invoke(), new igi(fdciVar, i));
        int i3 = ihcVar.a;
        if (fdbq.f(boolD2, true) && focusTargetNode != this.h) {
            return true;
        }
        if (boolD2 != null && fdciVar.a != null) {
            if (fdbq.f(boolD2, true) && fdbq.f(fdciVar.a, true)) {
                return true;
            }
            if (igk.a(i)) {
                return g(false, false, i) && (boolD = d(i, null, new igj(i))) != null && boolD.booleanValue();
            }
            if (((Boolean) this.i.invoke(new ifq(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ige
    public final ihu c() {
        FocusTargetNode focusTargetNodeH = h();
        if (focusTargetNodeH != null) {
            return ihf.c(focusTargetNodeH);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v12, types: [icr] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.focus.FocusTargetNode] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.ige
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean d(int r20, defpackage.ihu r21, defpackage.fdap r22) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.d(int, ihu, fdap):java.lang.Boolean");
    }

    @Override // defpackage.ige
    public final void e(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.h;
        this.h = focusTargetNode;
        cuu cuuVar = this.g;
        Object[] objArr = cuuVar.b;
        int i = cuuVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ifz) objArr[i2]).a(focusTargetNode2, focusTargetNode);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        r32 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r3 = r2.b(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        if (r2.e != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
    
        if (((r2.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        r3 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        if (r3 <= 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (java.lang.Long.compare((r2.d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        r3 = r2.a;
        r6 = r2.c;
        r8 = r2.b;
        r9 = (r6 + 7) >> 3;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r10 >= r9) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r12 = r3[r10] & (-9187201950435737472L);
        r3[r10] = ((~r12) + (r12 >>> 7)) & (-72340172838076674L);
        r10 = r10 + 1;
        r8 = r8;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012d, code lost:
    
        r31 = r8;
        r8 = defpackage.fcur.B(r3);
        r9 = r8 - 1;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014a, code lost:
    
        if (r8 == r6) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014c, code lost:
    
        r9 = r8 >> 3;
        r10 = (r8 & 7) << 3;
        r12 = (r3[r9] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0159, code lost:
    
        if (r12 != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0160, code lost:
    
        if (r12 == 254) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
    
        r12 = defpackage.cuo.a(r31[r8]) * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r35 = r2.b(r13);
        r13 = r13 & r6;
        r37 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0182, code lost:
    
        if ((((r35 - r13) & r6) / 8) != (((r8 - r13) & r6) / 8)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0184, code lost:
    
        r3[r9] = ((~(255 << r10)) & r3[r9]) | ((r12 & 127) << r10);
        r3[defpackage.fcur.B(r3)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a6, code lost:
    
        r11 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a9, code lost:
    
        r36 = r8;
        r8 = r35 >> 3;
        r9 = r3[r8];
        r11 = r12 & 127;
        r12 = (r35 & 7) << 3;
        r8 = ~(255 << r12);
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c8, code lost:
    
        if (((r9 >> r12) & 255) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ca, code lost:
    
        r3[r8] = (r8 << r12) | (r9 & r8);
        r3[r9] = (r3[r9] & (~(255 << r10))) | (128 << r10);
        r31[r35] = r31[r36];
        r31[r36] = 0;
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e4, code lost:
    
        r3[r8] = (r8 << r12) | (r9 & r8);
        r8 = r31[r35];
        r31[r35] = r31[r36];
        r31[r36] = r8;
        r8 = r36 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f4, code lost:
    
        r3[defpackage.fcur.B(r3)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0203, code lost:
    
        r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0208, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x020a, code lost:
    
        r3 = defpackage.cvp.b(r2.c);
        r6 = r2.a;
        r8 = r2.b;
        r9 = r2.c;
        r2.d(r3);
        r3 = r2.a;
        r10 = r2.b;
        r11 = r2.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0221, code lost:
    
        if (r12 >= r9) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0231, code lost:
    
        if (((r6[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r21) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0233, code lost:
    
        r24 = r8[r12];
        r13 = defpackage.cuo.a(r24) * (-862048943);
        r27 = r3;
        r3 = r2.b((r13 ^ (r13 << 16)) >>> 7);
        r28 = r3 >> 3;
        r29 = (r3 & 7) << 3;
        r33 = r8;
        r34 = r9;
        r8 = (r27[r28] & (~(255 << r29))) | ((r13 & 127) << r29);
        r27[r28] = r8;
        r27[(((r3 - 7) & r11) + (r11 & 7)) >> 3] = r8;
        r10[r3] = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0271, code lost:
    
        r27 = r3;
        r33 = r8;
        r34 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0277, code lost:
    
        r12 = r12 + 1;
        r3 = r27;
        r8 = r33;
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0280, code lost:
    
        r3 = r2.b(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0285, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0287, code lost:
    
        r31 = r3;
        r2.d++;
        r3 = r2.e;
        r6 = r2.a;
        r7 = r31 >> 3;
        r8 = r6[r7];
        r10 = (r31 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a1, code lost:
    
        if (((r8 >> r10) & 255) != r21) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a3, code lost:
    
        r11 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a6, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a8, code lost:
    
        r2.e = r3 - r11;
        r3 = r2.c;
        r8 = (r8 & (~(255 << r10))) | (r14 << r10);
        r6[r7] = r8;
        r6[(((r31 - 7) & r3) + (r3 & 7)) >> 3] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x035b, code lost:
    
        if (((r11 & ((~r11) << 6)) & (-9187201950435737472L)) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x035d, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0450 A[Catch: all -> 0x06b7, TryCatch #0 {all -> 0x06b7, blocks: (B:3:0x0009, B:5:0x000f, B:6:0x0019, B:8:0x0038, B:10:0x003c, B:11:0x0043, B:12:0x005a, B:15:0x009c, B:67:0x02c0, B:92:0x0392, B:95:0x039d, B:97:0x03a3, B:98:0x03a8, B:100:0x03b0, B:102:0x03b5, B:104:0x03bb, B:108:0x03c1, B:208:0x04dd, B:210:0x04e5, B:211:0x04e8, B:213:0x04f5, B:247:0x055b, B:249:0x0561, B:251:0x0565, B:217:0x0502, B:221:0x050c, B:224:0x0512, B:225:0x0517, B:245:0x0553, B:226:0x051b, B:228:0x0521, B:230:0x0525, B:232:0x052e, B:234:0x0534, B:238:0x053d, B:240:0x0546, B:241:0x0549, B:242:0x054d, B:246:0x0558, B:254:0x056c, B:256:0x0574, B:262:0x058a, B:263:0x059a, B:265:0x059e, B:267:0x05a2, B:296:0x05fd, B:270:0x05ab, B:272:0x05b4, B:274:0x05b8, B:276:0x05c0, B:278:0x05c6, B:280:0x05cb, B:281:0x05ce, B:283:0x05d4, B:284:0x05db, B:286:0x05e3, B:288:0x05e9, B:289:0x05ec, B:290:0x05ee, B:292:0x05f4, B:293:0x05f7, B:297:0x0608, B:300:0x0616, B:301:0x0626, B:303:0x062a, B:305:0x062e, B:336:0x068c, B:308:0x0638, B:310:0x0641, B:312:0x0645, B:314:0x064d, B:316:0x0653, B:318:0x0658, B:319:0x065b, B:321:0x0661, B:322:0x0668, B:324:0x0670, B:326:0x0676, B:327:0x0679, B:328:0x067b, B:330:0x0681, B:331:0x0684, B:339:0x069a, B:341:0x06a2, B:112:0x03c9, B:114:0x03cf, B:115:0x03d2, B:117:0x03da, B:149:0x0436, B:151:0x043c, B:153:0x0440, B:121:0x03e7, B:125:0x03f1, B:156:0x0446, B:158:0x044a, B:128:0x03f6, B:130:0x03fc, B:132:0x0400, B:134:0x0409, B:136:0x040f, B:140:0x0418, B:142:0x0421, B:143:0x0424, B:144:0x0428, B:147:0x042e, B:148:0x0433, B:159:0x0450, B:161:0x0458, B:162:0x045b, B:164:0x0465, B:196:0x04c1, B:198:0x04c7, B:200:0x04cb, B:168:0x0472, B:172:0x047c, B:203:0x04d1, B:205:0x04d5, B:175:0x0481, B:177:0x0487, B:179:0x048b, B:181:0x0494, B:183:0x049a, B:187:0x04a3, B:189:0x04ac, B:190:0x04af, B:191:0x04b3, B:194:0x04b9, B:195:0x04be, B:18:0x00b2, B:19:0x00bb, B:21:0x00c7, B:23:0x00d1, B:26:0x00e4, B:28:0x00e8, B:53:0x020a, B:55:0x0223, B:57:0x0233, B:59:0x0277, B:60:0x0280, B:62:0x0287, B:66:0x02a8, B:31:0x0104, B:33:0x0112, B:34:0x012d, B:36:0x014c, B:38:0x015b, B:42:0x0163, B:44:0x0184, B:46:0x01a9, B:48:0x01ca, B:50:0x01f4, B:49:0x01e4, B:51:0x0203, B:68:0x02c6, B:69:0x02d2, B:71:0x02e8, B:73:0x02ec, B:75:0x02f2, B:77:0x02f6, B:78:0x0306, B:81:0x033b, B:89:0x0361, B:84:0x034c, B:85:0x0353, B:90:0x0388), top: B:350:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04dd A[Catch: all -> 0x06b7, TryCatch #0 {all -> 0x06b7, blocks: (B:3:0x0009, B:5:0x000f, B:6:0x0019, B:8:0x0038, B:10:0x003c, B:11:0x0043, B:12:0x005a, B:15:0x009c, B:67:0x02c0, B:92:0x0392, B:95:0x039d, B:97:0x03a3, B:98:0x03a8, B:100:0x03b0, B:102:0x03b5, B:104:0x03bb, B:108:0x03c1, B:208:0x04dd, B:210:0x04e5, B:211:0x04e8, B:213:0x04f5, B:247:0x055b, B:249:0x0561, B:251:0x0565, B:217:0x0502, B:221:0x050c, B:224:0x0512, B:225:0x0517, B:245:0x0553, B:226:0x051b, B:228:0x0521, B:230:0x0525, B:232:0x052e, B:234:0x0534, B:238:0x053d, B:240:0x0546, B:241:0x0549, B:242:0x054d, B:246:0x0558, B:254:0x056c, B:256:0x0574, B:262:0x058a, B:263:0x059a, B:265:0x059e, B:267:0x05a2, B:296:0x05fd, B:270:0x05ab, B:272:0x05b4, B:274:0x05b8, B:276:0x05c0, B:278:0x05c6, B:280:0x05cb, B:281:0x05ce, B:283:0x05d4, B:284:0x05db, B:286:0x05e3, B:288:0x05e9, B:289:0x05ec, B:290:0x05ee, B:292:0x05f4, B:293:0x05f7, B:297:0x0608, B:300:0x0616, B:301:0x0626, B:303:0x062a, B:305:0x062e, B:336:0x068c, B:308:0x0638, B:310:0x0641, B:312:0x0645, B:314:0x064d, B:316:0x0653, B:318:0x0658, B:319:0x065b, B:321:0x0661, B:322:0x0668, B:324:0x0670, B:326:0x0676, B:327:0x0679, B:328:0x067b, B:330:0x0681, B:331:0x0684, B:339:0x069a, B:341:0x06a2, B:112:0x03c9, B:114:0x03cf, B:115:0x03d2, B:117:0x03da, B:149:0x0436, B:151:0x043c, B:153:0x0440, B:121:0x03e7, B:125:0x03f1, B:156:0x0446, B:158:0x044a, B:128:0x03f6, B:130:0x03fc, B:132:0x0400, B:134:0x0409, B:136:0x040f, B:140:0x0418, B:142:0x0421, B:143:0x0424, B:144:0x0428, B:147:0x042e, B:148:0x0433, B:159:0x0450, B:161:0x0458, B:162:0x045b, B:164:0x0465, B:196:0x04c1, B:198:0x04c7, B:200:0x04cb, B:168:0x0472, B:172:0x047c, B:203:0x04d1, B:205:0x04d5, B:175:0x0481, B:177:0x0487, B:179:0x048b, B:181:0x0494, B:183:0x049a, B:187:0x04a3, B:189:0x04ac, B:190:0x04af, B:191:0x04b3, B:194:0x04b9, B:195:0x04be, B:18:0x00b2, B:19:0x00bb, B:21:0x00c7, B:23:0x00d1, B:26:0x00e4, B:28:0x00e8, B:53:0x020a, B:55:0x0223, B:57:0x0233, B:59:0x0277, B:60:0x0280, B:62:0x0287, B:66:0x02a8, B:31:0x0104, B:33:0x0112, B:34:0x012d, B:36:0x014c, B:38:0x015b, B:42:0x0163, B:44:0x0184, B:46:0x01a9, B:48:0x01ca, B:50:0x01f4, B:49:0x01e4, B:51:0x0203, B:68:0x02c6, B:69:0x02d2, B:71:0x02e8, B:73:0x02ec, B:75:0x02f2, B:77:0x02f6, B:78:0x0306, B:81:0x033b, B:89:0x0361, B:84:0x034c, B:85:0x0353, B:90:0x0388), top: B:350:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x059e A[Catch: all -> 0x06b7, TryCatch #0 {all -> 0x06b7, blocks: (B:3:0x0009, B:5:0x000f, B:6:0x0019, B:8:0x0038, B:10:0x003c, B:11:0x0043, B:12:0x005a, B:15:0x009c, B:67:0x02c0, B:92:0x0392, B:95:0x039d, B:97:0x03a3, B:98:0x03a8, B:100:0x03b0, B:102:0x03b5, B:104:0x03bb, B:108:0x03c1, B:208:0x04dd, B:210:0x04e5, B:211:0x04e8, B:213:0x04f5, B:247:0x055b, B:249:0x0561, B:251:0x0565, B:217:0x0502, B:221:0x050c, B:224:0x0512, B:225:0x0517, B:245:0x0553, B:226:0x051b, B:228:0x0521, B:230:0x0525, B:232:0x052e, B:234:0x0534, B:238:0x053d, B:240:0x0546, B:241:0x0549, B:242:0x054d, B:246:0x0558, B:254:0x056c, B:256:0x0574, B:262:0x058a, B:263:0x059a, B:265:0x059e, B:267:0x05a2, B:296:0x05fd, B:270:0x05ab, B:272:0x05b4, B:274:0x05b8, B:276:0x05c0, B:278:0x05c6, B:280:0x05cb, B:281:0x05ce, B:283:0x05d4, B:284:0x05db, B:286:0x05e3, B:288:0x05e9, B:289:0x05ec, B:290:0x05ee, B:292:0x05f4, B:293:0x05f7, B:297:0x0608, B:300:0x0616, B:301:0x0626, B:303:0x062a, B:305:0x062e, B:336:0x068c, B:308:0x0638, B:310:0x0641, B:312:0x0645, B:314:0x064d, B:316:0x0653, B:318:0x0658, B:319:0x065b, B:321:0x0661, B:322:0x0668, B:324:0x0670, B:326:0x0676, B:327:0x0679, B:328:0x067b, B:330:0x0681, B:331:0x0684, B:339:0x069a, B:341:0x06a2, B:112:0x03c9, B:114:0x03cf, B:115:0x03d2, B:117:0x03da, B:149:0x0436, B:151:0x043c, B:153:0x0440, B:121:0x03e7, B:125:0x03f1, B:156:0x0446, B:158:0x044a, B:128:0x03f6, B:130:0x03fc, B:132:0x0400, B:134:0x0409, B:136:0x040f, B:140:0x0418, B:142:0x0421, B:143:0x0424, B:144:0x0428, B:147:0x042e, B:148:0x0433, B:159:0x0450, B:161:0x0458, B:162:0x045b, B:164:0x0465, B:196:0x04c1, B:198:0x04c7, B:200:0x04cb, B:168:0x0472, B:172:0x047c, B:203:0x04d1, B:205:0x04d5, B:175:0x0481, B:177:0x0487, B:179:0x048b, B:181:0x0494, B:183:0x049a, B:187:0x04a3, B:189:0x04ac, B:190:0x04af, B:191:0x04b3, B:194:0x04b9, B:195:0x04be, B:18:0x00b2, B:19:0x00bb, B:21:0x00c7, B:23:0x00d1, B:26:0x00e4, B:28:0x00e8, B:53:0x020a, B:55:0x0223, B:57:0x0233, B:59:0x0277, B:60:0x0280, B:62:0x0287, B:66:0x02a8, B:31:0x0104, B:33:0x0112, B:34:0x012d, B:36:0x014c, B:38:0x015b, B:42:0x0163, B:44:0x0184, B:46:0x01a9, B:48:0x01ca, B:50:0x01f4, B:49:0x01e4, B:51:0x0203, B:68:0x02c6, B:69:0x02d2, B:71:0x02e8, B:73:0x02ec, B:75:0x02f2, B:77:0x02f6, B:78:0x0306, B:81:0x033b, B:89:0x0361, B:84:0x034c, B:85:0x0353, B:90:0x0388), top: B:350:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0608 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038e  */
    @Override // defpackage.ige
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r45, defpackage.fdae r46) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.f(android.view.KeyEvent, fdae):boolean");
    }

    @Override // defpackage.ige
    public final boolean g(boolean z, boolean z2, int i) {
        boolean z3;
        if (z) {
            i();
        } else {
            int iC = ihe.c(this.c, i);
            int i2 = iC - 1;
            if (iC == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new fctg();
                }
                z3 = false;
                if (z3 || !z2) {
                    return z3;
                }
                this.b.invoke();
                return true;
            }
            i();
        }
        z3 = true;
        if (z3) {
        }
        return z3;
    }

    public final FocusTargetNode h() {
        return ihf.a(this.c);
    }
}
