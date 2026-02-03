package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksa extends ksh {
    final ksl a;
    krx[] aB;
    public int aC;
    public boolean aD;
    public boolean aE;
    public WeakReference aF;
    public WeakReference aG;
    public WeakReference aH;
    public WeakReference aI;
    final HashSet aJ;
    public final ksj aK;
    public final kso b;
    public int c;
    public ksk d;
    public boolean e;
    public final kqe f;
    int g;
    int h;
    public int i;
    public int j;
    krx[] k;

    public ksa() {
        this.a = new ksl(this);
        this.b = new kso(this);
        this.d = null;
        this.e = false;
        this.f = new kqe();
        this.i = 0;
        this.j = 0;
        this.k = new krx[4];
        this.aB = new krx[4];
        this.aC = 257;
        this.aD = false;
        this.aE = false;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = null;
        this.aJ = new HashSet();
        this.aK = new ksj();
    }

    public static void al(krz krzVar, ksk kskVar, ksj ksjVar) {
        int i;
        int i2;
        if (kskVar == null) {
            return;
        }
        if (krzVar.ar == 8 || (krzVar instanceof ksd) || (krzVar instanceof krv)) {
            ksjVar.c = 0;
            ksjVar.d = 0;
            return;
        }
        ksjVar.i = krzVar.X();
        ksjVar.j = krzVar.Y();
        ksjVar.a = krzVar.j();
        ksjVar.b = krzVar.h();
        ksjVar.g = false;
        ksjVar.h = 0;
        boolean z = ksjVar.i == 3;
        boolean z2 = ksjVar.j == 3;
        boolean z3 = z && krzVar.ah > 0.0f;
        boolean z4 = z2 && krzVar.ah > 0.0f;
        if (z && krzVar.Q(0) && krzVar.C == 0 && !z3) {
            ksjVar.i = 2;
            if (z2 && krzVar.D == 0) {
                ksjVar.i = 1;
            }
            z = false;
        }
        if (z2 && krzVar.Q(1) && krzVar.D == 0 && !z4) {
            ksjVar.j = 2;
            if (z && krzVar.C == 0) {
                ksjVar.j = 1;
            }
            z2 = false;
        }
        if (krzVar.e()) {
            ksjVar.i = 1;
            z = false;
        }
        if (krzVar.f()) {
            ksjVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (krzVar.E[0] == 4) {
                ksjVar.i = 1;
            } else if (!z2) {
                if (ksjVar.j == 1) {
                    i2 = ksjVar.b;
                } else {
                    ksjVar.i = 2;
                    kskVar.b(krzVar, ksjVar);
                    i2 = ksjVar.d;
                }
                ksjVar.i = 1;
                ksjVar.a = (int) (krzVar.ah * i2);
            }
        }
        if (z4) {
            if (krzVar.E[1] == 4) {
                ksjVar.j = 1;
            } else if (!z) {
                if (ksjVar.i == 1) {
                    i = ksjVar.a;
                } else {
                    ksjVar.j = 2;
                    kskVar.b(krzVar, ksjVar);
                    i = ksjVar.c;
                }
                ksjVar.j = 1;
                float f = i;
                if (krzVar.ai == -1) {
                    ksjVar.b = (int) (f / krzVar.ah);
                } else {
                    ksjVar.b = (int) (krzVar.ah * f);
                }
            }
        }
        kskVar.b(krzVar, ksjVar);
        krzVar.N(ksjVar.c);
        krzVar.C(ksjVar.d);
        krzVar.P = ksjVar.f;
        krzVar.y(ksjVar.e);
        ksjVar.h = 0;
        boolean z5 = ksjVar.g;
    }

    private final void ap(kry kryVar, kqj kqjVar) {
        kqe kqeVar = this.f;
        kqeVar.g(kqjVar, kqeVar.b(kryVar), 0, 5);
    }

    private final void aq(kry kryVar, kqj kqjVar) {
        kqe kqeVar = this.f;
        kqeVar.g(kqeVar.b(kryVar), kqjVar, 0, 5);
    }

    private final void ar() {
        this.i = 0;
        this.j = 0;
    }

    @Override // defpackage.krz
    public final void O(boolean z, boolean z2) {
        super.O(z, z2);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((krz) this.aL.get(i)).O(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05f0 A[PHI: r4
      0x05f0: PHI (r4v1 int) = (r4v0 int), (r4v43 int) binds: [B:139:0x0235, B:145:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0714 A[Catch: Exception -> 0x08dc, TryCatch #4 {Exception -> 0x08dc, blocks: (B:386:0x068b, B:395:0x06ae, B:397:0x06ba, B:398:0x06bd, B:400:0x06c1, B:402:0x06cb, B:425:0x06fa, B:405:0x06d4, B:424:0x06f7, B:426:0x0701, B:427:0x0706, B:429:0x070e, B:431:0x0714, B:432:0x071c, B:434:0x0722), top: B:612:0x068b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08ae A[Catch: Exception -> 0x08da, TryCatch #6 {Exception -> 0x08da, blocks: (B:522:0x089d, B:524:0x08a1, B:531:0x08ae, B:533:0x08c5, B:535:0x08c9, B:536:0x08cd), top: B:616:0x089d }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0942 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x094f A[LOOP:14: B:562:0x094d->B:563:0x094f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0774 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.ksh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ae() {
        /*
            Method dump skipped, instructions count: 2620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksa.ae():void");
    }

    public final void af(ksk kskVar) {
        this.d = kskVar;
        this.b.f = kskVar;
    }

    public final void ag(int i) {
        this.aC = i;
        kqe.a = aj(512);
    }

    public final void ah() {
        this.a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ai(boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksa.ai(boolean, int):boolean");
    }

    public final boolean aj(int i) {
        return (this.aC & i) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ak(int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksa.ak(int, int, int, int, int, int, int):void");
    }

    final void b(krz krzVar, int i) {
        if (i == 0) {
            int i2 = this.i + 1;
            krx[] krxVarArr = this.aB;
            int length = krxVarArr.length;
            if (i2 >= length) {
                this.aB = (krx[]) Arrays.copyOf(krxVarArr, length + length);
            }
            krx[] krxVarArr2 = this.aB;
            int i3 = this.i;
            krxVarArr2[i3] = new krx(krzVar, 0, this.e);
            this.i = i3 + 1;
            return;
        }
        int i4 = this.j + 1;
        krx[] krxVarArr3 = this.k;
        int length2 = krxVarArr3.length;
        if (i4 >= length2) {
            this.k = (krx[]) Arrays.copyOf(krxVarArr3, length2 + length2);
        }
        krx[] krxVarArr4 = this.k;
        int i5 = this.j;
        krxVarArr4[i5] = new krx(krzVar, 1, this.e);
        this.j = i5 + 1;
    }

    public final void c() {
        this.b.b = true;
    }

    @Override // defpackage.ksh, defpackage.krz
    public final void u() {
        this.f.k();
        this.g = 0;
        this.h = 0;
        super.u();
    }

    public ksa(byte[] bArr) {
        super(null);
        this.a = new ksl(this);
        this.b = new kso(this);
        this.d = null;
        this.e = false;
        this.f = new kqe();
        this.i = 0;
        this.j = 0;
        this.k = new krx[4];
        this.aB = new krx[4];
        this.aC = 257;
        this.aD = false;
        this.aE = false;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = null;
        this.aJ = new HashSet();
        this.aK = new ksj();
    }
}
