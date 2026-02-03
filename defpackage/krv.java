package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krv extends kse {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[PHI: r14
      0x00e4: PHI (r14v8 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:74:0x00df, B:76:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    @Override // defpackage.krz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.kqe r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krv.a(kqe, boolean):void");
    }

    @Override // defpackage.krz
    public final boolean ay() {
        return true;
    }

    public final int b() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.aM;
            if (i4 >= i) {
                break;
            }
            krz krzVar = this.aL[i4];
            if ((this.b || krzVar.ay()) && ((((i2 = this.a) == 0 || i2 == 1) && !krzVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !krzVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.aM; i5++) {
            krz krzVar2 = this.aL[i5];
            if (this.b || krzVar2.ay()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = krzVar2.V(2).a();
                    } else if (i6 == 1) {
                        iMax = krzVar2.V(4).a();
                    } else if (i6 == 2) {
                        iMax = krzVar2.V(3).a();
                    } else if (i6 == 3) {
                        iMax = krzVar2.V(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, krzVar2.V(2).a());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, krzVar2.V(4).a());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, krzVar2.V(3).a());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, krzVar2.V(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            A(i8, i8);
        } else {
            B(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.krz
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.krz
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.krz
    public final String toString() {
        String strConcat = "[Barrier] " + this.as + " {";
        for (int i = 0; i < this.aM; i++) {
            krz krzVar = this.aL[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(String.valueOf(krzVar.as));
        }
        return strConcat.concat("}");
    }
}
