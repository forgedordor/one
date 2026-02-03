package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksc extends ksg {
    public krz[] aJ;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public float g = 0.5f;
    public float h = 0.5f;
    public float i = 0.5f;
    public float j = 0.5f;
    public float k = 0.5f;
    public float aB = 0.5f;
    public int aC = 0;
    public int aD = 0;
    public int aE = 2;
    public int aF = 2;
    public int aG = 0;
    public int aH = -1;
    public int aI = 0;
    private final ArrayList aY = new ArrayList();
    private krz[] aZ = null;
    private krz[] ba = null;
    private int[] bb = null;
    public int aK = 0;

    @Override // defpackage.krz
    public final void a(kqe kqeVar, boolean z) {
        krz krzVar;
        float f;
        int i;
        super.a(kqeVar, z);
        krz krzVar2 = this.ae;
        boolean z2 = krzVar2 != null && ((ksa) krzVar2).e;
        int i2 = this.aG;
        if (i2 == 0) {
            ArrayList arrayList = this.aY;
            if (arrayList.size() > 0) {
                ((ksb) arrayList.get(0)).d(z2, 0, true);
            }
        } else if (i2 == 1) {
            ArrayList arrayList2 = this.aY;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ((ksb) arrayList2.get(i3)).d(z2, i3, i3 == size + (-1));
                i3++;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                ArrayList arrayList3 = this.aY;
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    ((ksb) arrayList3.get(i4)).d(z2, i4, i4 == size2 + (-1));
                    i4++;
                }
            }
        } else if (this.bb != null && this.ba != null && this.aZ != null) {
            for (int i5 = 0; i5 < this.aK; i5++) {
                this.aJ[i5].v();
            }
            int[] iArr = this.bb;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f2 = this.g;
            krz krzVar3 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z2) {
                    i = (i6 - i8) - 1;
                    f = 1.0f - this.g;
                } else {
                    f = f2;
                    i = i8;
                }
                krz krzVar4 = this.ba[i];
                if (krzVar4 != null && krzVar4.ar != 8) {
                    if (i8 == 0) {
                        krzVar4.q(krzVar4.T, this.T, this.aR);
                        krzVar4.at = this.a;
                        krzVar4.ao = f;
                        i8 = 0;
                    }
                    if (i8 == i6 - 1) {
                        krzVar4.q(krzVar4.V, this.V, this.aS);
                    }
                    if (i8 > 0 && krzVar3 != null) {
                        kry kryVar = krzVar4.T;
                        int i9 = this.aC;
                        kry kryVar2 = krzVar3.V;
                        krzVar4.q(kryVar, kryVar2, i9);
                        krzVar3.q(kryVar2, kryVar, 0);
                    }
                    krzVar3 = krzVar4;
                }
                i8++;
                f2 = f;
            }
            int i10 = 0;
            while (i10 < i7) {
                krz krzVar5 = this.aZ[i10];
                if (krzVar5 != null && krzVar5.ar != 8) {
                    if (i10 == 0) {
                        krzVar5.q(krzVar5.U, this.U, this.aN);
                        krzVar5.au = this.b;
                        krzVar5.ap = this.h;
                        i10 = 0;
                    }
                    if (i10 == i7 - 1) {
                        krzVar5.q(krzVar5.W, this.W, this.aO);
                    }
                    if (i10 > 0 && krzVar3 != null) {
                        kry kryVar3 = krzVar5.U;
                        int i11 = this.aD;
                        kry kryVar4 = krzVar3.W;
                        krzVar5.q(kryVar3, kryVar4, i11);
                        krzVar3.q(kryVar4, kryVar3, 0);
                    }
                    krzVar3 = krzVar5;
                }
                i10++;
            }
            for (int i12 = 0; i12 < i6; i12++) {
                for (int i13 = 0; i13 < i7; i13++) {
                    int i14 = (i13 * i6) + i12;
                    if (this.aI == 1) {
                        i14 = (i12 * i7) + i13;
                    }
                    krz[] krzVarArr = this.aJ;
                    if (i14 < krzVarArr.length && (krzVar = krzVarArr[i14]) != null && krzVar.ar != 8) {
                        krz krzVar6 = this.ba[i12];
                        krz krzVar7 = this.aZ[i13];
                        if (krzVar != krzVar6) {
                            krzVar.q(krzVar.T, krzVar6.T, 0);
                            krzVar.q(krzVar.V, krzVar6.V, 0);
                        }
                        if (krzVar != krzVar7) {
                            krzVar.q(krzVar.U, krzVar7.U, 0);
                            krzVar.q(krzVar.W, krzVar7.W, 0);
                        }
                    }
                }
            }
        }
        this.aT = false;
    }

    public final int ae(krz krzVar, int i) {
        krz krzVar2;
        if (krzVar == null) {
            return 0;
        }
        if (krzVar.X() == 3) {
            int i2 = krzVar.C;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (krzVar.H * i);
                if (i3 != krzVar.j()) {
                    krzVar.r = true;
                    ak(krzVar, 1, i3, krzVar.Y(), krzVar.h());
                }
                return i3;
            }
            krzVar2 = krzVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((krzVar2.h() * krzVar2.ah) + 0.5f);
            }
        } else {
            krzVar2 = krzVar;
        }
        return krzVar2.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    @Override // defpackage.ksg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksc.b(int, int, int, int):void");
    }

    public final int c(krz krzVar, int i) {
        krz krzVar2;
        if (krzVar == null) {
            return 0;
        }
        if (krzVar.Y() == 3) {
            int i2 = krzVar.D;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (krzVar.K * i);
                if (i3 != krzVar.h()) {
                    krzVar.r = true;
                    ak(krzVar, krzVar.X(), krzVar.j(), 1, i3);
                }
                return i3;
            }
            krzVar2 = krzVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((krzVar2.j() * krzVar2.ah) + 0.5f);
            }
        } else {
            krzVar2 = krzVar;
        }
        return krzVar2.h();
    }
}
