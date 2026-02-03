package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ncn extends mpc {
    private final MediaCodec.BufferInfo A;
    private final ArrayDeque B;
    private final mzc C;
    private mau D;
    private mau E;
    private nad F;
    private nad G;
    private MediaCrypto H;
    private float I;
    private mau J;
    private boolean K;
    private float L;
    private ArrayDeque M;
    private ncl N;
    private boolean O;
    private boolean P;
    private long Q;
    private long R;
    private int S;
    private int T;
    private ByteBuffer U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private long ag;
    private long ah;
    private boolean ai;
    private boolean aj;
    private ncm ak;
    private long al;
    private boolean am;
    private final nce j;
    private final ncp k;
    private final float l;
    public float m;
    public ncf n;
    public MediaFormat o;
    public nci p;
    public boolean q;
    public boolean r;
    public mpn s;
    public mpd t;
    public boolean u;
    public mrs v;
    private final mix w;
    private final mix x;
    private final mix y;
    private final nbz z;

    public ncn(int i, nce nceVar, ncp ncpVar, float f) {
        super(i);
        this.j = nceVar;
        mee.f(ncpVar);
        this.k = ncpVar;
        this.l = f;
        this.w = new mix(0);
        this.x = new mix(0);
        this.y = new mix(2);
        nbz nbzVar = new nbz();
        this.z = nbzVar;
        this.A = new MediaCodec.BufferInfo();
        this.m = 1.0f;
        this.I = 1.0f;
        this.B = new ArrayDeque();
        this.ak = ncm.a;
        nbzVar.h(0);
        nbzVar.d.order(ByteOrder.nativeOrder());
        this.C = new mzc();
        this.L = -1.0f;
        this.aa = 0;
        this.S = -1;
        this.T = -1;
        this.R = -9223372036854775807L;
        this.ag = -9223372036854775807L;
        this.ah = -9223372036854775807L;
        this.al = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.ab = 0;
        this.ac = 0;
        this.t = new mpd();
    }

    private final void aB() {
        this.Y = false;
        this.z.eP();
        this.y.eP();
        this.X = false;
        this.q = false;
        this.C.a();
    }

    private final void aC() throws Throwable {
        if (!this.ad) {
            aF();
        } else {
            this.ab = 1;
            this.ac = 3;
        }
    }

    private final void aD() {
        try {
            ncf ncfVar = this.n;
            mee.g(ncfVar);
            ncfVar.h();
        } finally {
            ar();
        }
    }

    private final void aE() throws Throwable {
        int i = this.ac;
        if (i == 1) {
            aD();
            return;
        }
        if (i == 2) {
            aD();
            aL();
        } else if (i == 3) {
            aF();
        } else {
            this.r = true;
            ag();
        }
    }

    private final void aF() throws Throwable {
        aq();
        ao();
    }

    private final void aG() {
        this.S = -1;
        this.x.d = null;
    }

    private final void aH() {
        this.T = -1;
        this.U = null;
    }

    private final void aI(nad nadVar) {
        nab.a(this.F, nadVar);
        this.F = nadVar;
    }

    private final void aJ(ncm ncmVar) {
        this.ak = ncmVar;
        if (ncmVar.d != -9223372036854775807L) {
            this.am = true;
        }
    }

    private final void aK(nad nadVar) {
        nab.a(this.G, nadVar);
        this.G = nadVar;
    }

    private final void aL() throws MediaCryptoException, mpn {
        nad nadVar = this.G;
        mee.f(nadVar);
        mir mirVarB = nadVar.b();
        if (mirVarB instanceof naw) {
            try {
                MediaCrypto mediaCrypto = this.H;
                mee.f(mediaCrypto);
                mediaCrypto.setMediaDrmSession(((naw) mirVarB).c);
            } catch (MediaCryptoException e) {
                throw h(e, this.D, 6006);
            }
        }
        aI(this.G);
        this.ab = 0;
        this.ac = 0;
    }

    private final boolean aM() {
        return this.T >= 0;
    }

    private final boolean aN() throws mpn {
        mee.c(this.H == null);
        nad nadVar = this.F;
        mir mirVarB = nadVar.b();
        if (naw.a && (mirVarB instanceof naw)) {
            int iA = nadVar.a();
            if (iA == 1) {
                nac nacVarC = nadVar.c();
                mee.f(nacVarC);
                throw h(nacVarC, this.D, nacVarC.a);
            }
            if (iA != 4) {
                return false;
            }
        }
        if (mirVarB == null) {
            return nadVar.c() != null;
        }
        try {
            this.H = new MediaCrypto(((naw) mirVarB).b, ((naw) mirVarB).c);
            return true;
        } catch (MediaCryptoException e) {
            throw h(e, this.D, 6006);
        }
    }

    private final boolean aO(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        mau mauVar = this.E;
        return (mauVar != null && Objects.equals(mauVar.o, "audio/opus") && nom.d(j, j2)) ? false : true;
    }

    private final boolean aP(int i) throws Throwable {
        msa msaVarJ = j();
        mix mixVar = this.w;
        mixVar.eP();
        int iC = c(msaVarJ, mixVar, i | 4);
        if (iC == -5) {
            Y(msaVarJ);
            return true;
        }
        if (iC != -4 || !mixVar.eS()) {
            return false;
        }
        this.ai = true;
        aE();
        return false;
    }

    private final boolean aQ(mau mauVar) throws Throwable {
        if (this.n != null && this.ac != 3 && this.c != 0) {
            float f = this.I;
            mee.f(mauVar);
            float fAj = aj(f, O());
            float f2 = this.L;
            if (f2 != fAj) {
                if (fAj == -1.0f) {
                    aC();
                    return false;
                }
                if (f2 != -1.0f || fAj > this.l) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fAj);
                    ncf ncfVar = this.n;
                    mee.f(ncfVar);
                    ncfVar.l(bundle);
                    this.L = fAj;
                }
            }
        }
        return true;
    }

    private final void aR() throws MediaCryptoException, mpn {
        if (!this.ad) {
            aL();
        } else {
            this.ab = 1;
            this.ac = 2;
        }
    }

    protected static boolean ax(mau mauVar) {
        int i = mauVar.O;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.mpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void B(defpackage.mau[] r12, long r13, long r15, defpackage.nen r17) {
        /*
            r11 = this;
            ncm r12 = r11.ak
            long r0 = r12.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            ncm r4 = new ncm
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.aJ(r4)
            boolean r12 = r11.u
            if (r12 == 0) goto L56
            r11.af()
            return
        L24:
            java.util.ArrayDeque r12 = r11.B
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.ag
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.al
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            ncm r4 = new ncm
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.aJ(r4)
            ncm r12 = r11.ak
            long r12 = r12.d
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.af()
        L56:
            return
        L57:
            ncm r0 = new ncm
            long r1 = r11.ag
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncn.B(mau[], long, long, nen):void");
    }

    @Override // defpackage.mpc, defpackage.mth
    public void I(float f, float f2) throws Throwable {
        this.m = f;
        this.I = f2;
        aQ(this.J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        r26.X = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r26.r = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04b5, code lost:
    
        if (r26.P != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04b7, code lost:
    
        r26.ae = true;
        r2.n(r26.S, 0, 0, 4);
        aG();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04c5, code lost:
    
        r26.ab = 2;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0625, code lost:
    
        r12 = false;
        r15 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045f A[Catch: IllegalStateException -> 0x064c, CryptoException -> 0x069c, TryCatch #8 {CryptoException -> 0x069c, blocks: (B:5:0x0008, B:7:0x000c, B:9:0x0010, B:11:0x0015, B:13:0x001b, B:16:0x0023, B:17:0x0028, B:19:0x0036, B:21:0x005f, B:166:0x0332, B:364:0x0644, B:22:0x0067, B:25:0x006c, B:31:0x0076, B:33:0x007a, B:35:0x0084, B:41:0x008e, B:43:0x0092, B:45:0x0098, B:51:0x00ad, B:52:0x00bc, B:57:0x00c9, B:59:0x00cf, B:156:0x031a, B:158:0x0320, B:159:0x0323, B:161:0x0329, B:163:0x032d, B:61:0x00d5, B:63:0x00db, B:65:0x00e3, B:67:0x00f3, B:70:0x00fd, B:73:0x0103, B:75:0x0112, B:77:0x011c, B:78:0x013a, B:81:0x0144, B:83:0x014b, B:85:0x0153, B:87:0x0159, B:88:0x0160, B:90:0x016a, B:93:0x0186, B:96:0x018b, B:98:0x0191, B:100:0x0198, B:103:0x01a0, B:106:0x01bb, B:112:0x01c9, B:114:0x01d1, B:119:0x01e7, B:122:0x01f1, B:124:0x0229, B:126:0x0231, B:128:0x023d, B:130:0x0243, B:134:0x026c, B:136:0x0279, B:135:0x0274, B:139:0x0280, B:140:0x028a, B:142:0x0299, B:144:0x02d1, B:143:0x02b8, B:123:0x0222, B:118:0x01e2, B:145:0x02f1, B:150:0x0308, B:154:0x0314, B:148:0x02f8, B:69:0x00fb, B:155:0x0317, B:168:0x033f, B:170:0x0343, B:171:0x034e, B:173:0x0359, B:179:0x036a, B:180:0x037a, B:182:0x037f, B:184:0x0383, B:188:0x038a, B:190:0x038f, B:264:0x0488, B:266:0x048c, B:268:0x0491, B:271:0x0497, B:273:0x049b, B:275:0x04a3, B:276:0x04ae, B:279:0x04b3, B:281:0x04b7, B:282:0x04c5, B:358:0x0627, B:283:0x04ca, B:286:0x04cf, B:288:0x04dc, B:289:0x04f3, B:290:0x04f5, B:292:0x0505, B:295:0x050c, B:297:0x0512, B:300:0x051b, B:302:0x051f, B:303:0x0526, B:304:0x052b, B:306:0x0533, B:308:0x053b, B:309:0x0540, B:311:0x0546, B:312:0x054b, B:314:0x054f, B:315:0x055f, B:317:0x0563, B:319:0x0569, B:321:0x0570, B:322:0x0574, B:324:0x057a, B:326:0x0580, B:329:0x0585, B:331:0x0589, B:332:0x0593, B:333:0x059a, B:335:0x05a0, B:337:0x05a8, B:339:0x05c5, B:338:0x05b9, B:340:0x05c7, B:342:0x05d5, B:345:0x05dd, B:347:0x05e6, B:348:0x05e9, B:350:0x05ee, B:352:0x0605, B:351:0x05f6, B:344:0x05db, B:354:0x0616, B:193:0x0397, B:195:0x03a5, B:200:0x03b0, B:202:0x03b4, B:204:0x03ba, B:206:0x03bf, B:208:0x03c9, B:209:0x03d8, B:213:0x03e3, B:216:0x03eb, B:221:0x03f4, B:223:0x0404, B:225:0x0408, B:227:0x040c, B:229:0x0418, B:235:0x0423, B:237:0x042e, B:245:0x043d, B:247:0x0449, B:249:0x0459, B:251:0x045f, B:256:0x046f, B:258:0x0473, B:260:0x0477, B:261:0x0480, B:263:0x0485, B:231:0x041b, B:233:0x041f, B:363:0x0634), top: B:402:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0488 A[EDGE_INSN: B:446:0x0488->B:475:? BREAK  A[LOOP:4: B:171:0x034e->B:450:0x034e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [mpc, ncn] */
    /* JADX WARN: Type inference failed for: r3v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // defpackage.mth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(long r27, long r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncn.S(long, long):void");
    }

    @Override // defpackage.mth
    public boolean T() {
        throw null;
    }

    @Override // defpackage.mth
    public boolean U() {
        boolean zD;
        if (this.D == null) {
            return false;
        }
        if (M()) {
            zD = this.g;
        } else {
            ngc ngcVar = this.d;
            mee.f(ngcVar);
            zD = ngcVar.d();
        }
        if (zD || aM()) {
            return true;
        }
        if (this.R == -9223372036854775807L) {
            return false;
        }
        eO();
        return SystemClock.elapsedRealtime() < this.R;
    }

    @Override // defpackage.mtk
    public final int V(mau mauVar) throws mpn {
        try {
            return W(this.k, mauVar);
        } catch (ncv e) {
            throw h(e, mauVar, 4002);
        }
    }

    protected abstract int W(ncp ncpVar, mau mauVar);

    protected mpe X(nci nciVar, mau mauVar, mau mauVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r3.o(r2) != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.mpe Y(defpackage.msa r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncn.Y(msa):mpe");
    }

    protected abstract ncd Z(nci nciVar, mau mauVar, MediaCrypto mediaCrypto, float f);

    protected abstract List aa(ncp ncpVar, mau mauVar, boolean z);

    protected void ab(mix mixVar) {
        throw null;
    }

    protected void ac(Exception exc) {
        throw null;
    }

    protected void ad(String str) {
        throw null;
    }

    protected void ae(mau mauVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void ag() {
        throw null;
    }

    protected abstract boolean ah(long j, long j2, ncf ncfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, mau mauVar);

    protected boolean ai(mau mauVar) {
        return false;
    }

    protected float aj(float f, mau[] mauVarArr) {
        throw null;
    }

    protected void ak(String str, long j, long j2) {
        throw null;
    }

    protected final long al() {
        return this.ak.d;
    }

    protected final long am() {
        return this.ak.c;
    }

    protected nch an(Throwable th, nci nciVar) {
        return new nch(th, nciVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:306|72|(1:74)|298|79|80|(9:(18:295|83|(24:331|85|(0)|174|310|175|176|(2:302|178)|182|183|(1:188)(1:187)|189|(1:212)(1:204)|213|(1:215)|216|217|316|218|219|328|220|221|351)|163|333|164|339|165|(1:172)(1:171)|173|174|310|175|176|(0)|182|183|(4:185|188|189|(19:191|193|195|197|199|201|205|212|213|(0)|216|217|316|218|219|328|220|221|351)(13:205|212|213|(0)|216|217|316|218|219|328|220|221|351))(0))|337|94|95|308|96|320|97|(27:318|99|(1:107)(1:104)|108|109|322|110|111|342|112|(1:114)(1:115)|116|117|314|118|(1:120)|121|(1:125)|126|174|310|175|176|(0)|182|183|(0)(0))(0))|90|326|91|300|92|93) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b2, code lost:
    
        r27 = r8;
        r25 = r10;
        r24 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bf, code lost:
    
        r27 = r8;
        r24 = r12;
        r26 = r13;
        r28 = r14;
        r12 = 0;
        r25 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d2 A[Catch: all -> 0x0417, TryCatch #28 {all -> 0x0417, blocks: (B:164:0x02ec, B:165:0x02fe, B:167:0x0305, B:169:0x0309, B:173:0x0314, B:174:0x032e, B:118:0x0234, B:120:0x0252, B:121:0x0270, B:123:0x027f, B:125:0x0283, B:126:0x0286, B:155:0x02ce, B:157:0x02d5, B:156:0x02d2), top: B:333:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036d A[Catch: Exception -> 0x035a, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x035a, blocks: (B:178:0x0344, B:185:0x036d, B:191:0x0381, B:193:0x0389, B:195:0x0391, B:197:0x0399, B:199:0x03a1, B:201:0x03a9, B:215:0x03da, B:207:0x03be, B:209:0x03c8), top: B:302:0x0344 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03da A[Catch: Exception -> 0x035a, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x035a, blocks: (B:178:0x0344, B:185:0x036d, B:191:0x0381, B:193:0x0389, B:195:0x0391, B:197:0x0399, B:199:0x03a1, B:201:0x03a9, B:215:0x03da, B:207:0x03be, B:209:0x03c8), top: B:302:0x0344 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x047e A[Catch: ncl -> 0x04f4, TryCatch #5 {ncl -> 0x04f4, blocks: (B:262:0x045d, B:264:0x047e, B:266:0x048a, B:268:0x049a, B:270:0x04ba, B:274:0x04d0, B:275:0x04d2, B:269:0x049d, B:276:0x04d3, B:284:0x04ea, B:285:0x04f3), top: B:297:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x049a A[Catch: ncl -> 0x04f4, TryCatch #5 {ncl -> 0x04f4, blocks: (B:262:0x045d, B:264:0x047e, B:266:0x048a, B:268:0x049a, B:270:0x04ba, B:274:0x04d0, B:275:0x04d2, B:269:0x049d, B:276:0x04d3, B:284:0x04ea, B:285:0x04f3), top: B:297:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x049d A[Catch: ncl -> 0x04f4, TryCatch #5 {ncl -> 0x04f4, blocks: (B:262:0x045d, B:264:0x047e, B:266:0x048a, B:268:0x049a, B:270:0x04ba, B:274:0x04d0, B:275:0x04d2, B:269:0x049d, B:276:0x04d3, B:284:0x04ea, B:285:0x04f3), top: B:297:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0344 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[Catch: ncl -> 0x04f6, TryCatch #26 {ncl -> 0x04f6, blocks: (B:27:0x005c, B:29:0x0061, B:31:0x0068, B:33:0x0071, B:37:0x0081, B:40:0x008e, B:43:0x00a1, B:45:0x00ab, B:46:0x00cd, B:48:0x00da, B:49:0x00e5, B:54:0x00f2, B:56:0x00fa, B:57:0x00ff, B:59:0x0103, B:52:0x00e9, B:53:0x00f1), top: B:330:0x005c, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void ao() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncn.ao():void");
    }

    protected void ap(long j) {
        this.al = j;
        while (true) {
            ArrayDeque arrayDeque = this.B;
            if (arrayDeque.isEmpty() || j < ((ncm) arrayDeque.peek()).b) {
                return;
            }
            ncm ncmVar = (ncm) arrayDeque.poll();
            mee.f(ncmVar);
            aJ(ncmVar);
            af();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void aq() {
        try {
            ncf ncfVar = this.n;
            if (ncfVar != null) {
                ncfVar.i();
                this.t.b++;
                nci nciVar = this.p;
                mee.f(nciVar);
                ad(nciVar.a);
            }
            this.n = null;
            MediaCrypto mediaCrypto = this.H;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        } catch (Throwable th) {
            this.n = null;
            MediaCrypto mediaCrypto2 = this.H;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.H = null;
            aI(null);
            as();
        }
    }

    protected void ar() {
        aG();
        aH();
        this.R = -9223372036854775807L;
        this.ae = false;
        this.Q = -9223372036854775807L;
        this.ad = false;
        this.V = false;
        this.W = false;
        this.ag = -9223372036854775807L;
        this.ah = -9223372036854775807L;
        this.al = -9223372036854775807L;
        this.ab = 0;
        this.ac = 0;
        this.aa = this.Z ? 1 : 0;
    }

    protected final void as() {
        ar();
        this.s = null;
        this.M = null;
        this.p = null;
        this.J = null;
        this.o = null;
        this.K = false;
        this.af = false;
        this.L = -1.0f;
        this.O = false;
        this.P = false;
        this.Z = false;
        this.aa = 0;
    }

    protected boolean at() throws MediaCryptoException {
        if (this.n == null) {
            return false;
        }
        int i = this.ac;
        if (i == 3 || (this.O && !this.af)) {
            aq();
            return true;
        }
        if (i == 2) {
            mee.c(true);
            try {
                aL();
            } catch (mpn e) {
                mff.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                aq();
                return true;
            }
        }
        aD();
        return false;
    }

    protected final boolean au(mau mauVar) {
        return this.G == null && ai(mauVar);
    }

    protected boolean av(mix mixVar) {
        return false;
    }

    protected boolean aw(nci nciVar) {
        return true;
    }

    protected final void ay() throws Throwable {
        if (at()) {
            ao();
        }
    }

    @Override // defpackage.mpc, defpackage.mtk
    public final int e() {
        return 8;
    }

    @Override // defpackage.mpc, defpackage.mtd
    public void r(int i, Object obj) {
        if (i == 11) {
            mrs mrsVar = (mrs) obj;
            mee.f(mrsVar);
            this.v = mrsVar;
        }
    }

    @Override // defpackage.mpc
    protected void u() throws MediaCryptoException {
        this.D = null;
        aJ(ncm.a);
        this.B.clear();
        at();
    }

    @Override // defpackage.mpc
    protected void v(boolean z, boolean z2) {
        this.t = new mpd();
    }

    @Override // defpackage.mpc
    protected void w(long j, boolean z) {
        this.ai = false;
        this.r = false;
        if (this.q) {
            this.z.eP();
            this.y.eP();
            this.X = false;
            this.C.a();
        } else {
            ay();
        }
        mfx mfxVar = this.ak.e;
        if (mfxVar.a() > 0) {
            this.aj = true;
        }
        mfxVar.f();
        this.B.clear();
    }

    @Override // defpackage.mpc
    protected void y() {
        try {
            aB();
            aq();
        } finally {
            aK(null);
        }
    }

    protected void aA() {
    }

    protected void af() {
    }

    protected void az(mau mauVar) {
    }
}
