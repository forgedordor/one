package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nuo extends num {
    private nun a;
    private int o;
    private boolean p;
    private npc q;
    private npa r;

    @Override // defpackage.num
    protected final long a(mfr mfrVar) {
        byte b = mfrVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        nun nunVar = this.a;
        mee.g(nunVar);
        int i = !nunVar.d[(b >> 1) & (255 >>> (8 - nunVar.e))].a ? nunVar.a.e : nunVar.a.f;
        int i2 = this.p ? (this.o + i) / 4 : 0;
        int iB = mfrVar.b();
        int i3 = mfrVar.c + 4;
        if (iB < i3) {
            mfrVar.H(Arrays.copyOf(mfrVar.a, i3));
        } else {
            mfrVar.J(i3);
        }
        long j = i2;
        byte[] bArr = mfrVar.a;
        int i4 = mfrVar.c;
        bArr[i4 - 4] = (byte) (j & 255);
        bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.num
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.num
    protected final boolean c(mfr mfrVar, long j, nuk nukVar) throws mby {
        nun nunVar;
        int i;
        int iA;
        int i2;
        int[] iArr;
        int i3 = 0;
        if (this.a != null) {
            mee.f(nukVar.a);
            return false;
        }
        npc npcVar = this.q;
        int i4 = 1;
        if (npcVar == null) {
            npd.d(1, mfrVar, false);
            mfrVar.g();
            int iJ = mfrVar.j();
            int iG = mfrVar.g();
            int iF = mfrVar.f();
            int i5 = iF <= 0 ? -1 : iF;
            int iF2 = mfrVar.f();
            int i6 = iF2 <= 0 ? -1 : iF2;
            mfrVar.f();
            int iJ2 = mfrVar.j();
            int iPow = (int) Math.pow(2.0d, iJ2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iJ2 & 240) >> 4);
            mfrVar.j();
            this.q = new npc(iJ, iG, i5, i6, iPow, iPow2, Arrays.copyOf(mfrVar.a, mfrVar.c));
        } else {
            int i7 = 4;
            npa npaVar = this.r;
            if (npaVar == null) {
                this.r = npd.c(mfrVar, true, true);
            } else {
                int i8 = mfrVar.c;
                byte[] bArr = new byte[i8];
                System.arraycopy(mfrVar.a, 0, bArr, 0, i8);
                int i9 = npcVar.a;
                int i10 = 5;
                npd.d(5, mfrVar, false);
                int iJ3 = mfrVar.j() + 1;
                noz nozVar = new noz(mfrVar.a);
                int i11 = 8;
                nozVar.b(mfrVar.b * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = i3;
                    int i15 = 16;
                    if (i12 < iJ3) {
                        int i16 = i11;
                        if (nozVar.a(24) != 5653314) {
                            throw new mby("expected code book to start with [0x56, 0x43, 0x42] at " + ((nozVar.a * 8) + nozVar.b), null, true, 1);
                        }
                        int iA2 = nozVar.a(16);
                        int iA3 = nozVar.a(24);
                        if (nozVar.c()) {
                            nozVar.b(i10);
                            for (int iA4 = i14; iA4 < iA3; iA4 += nozVar.a(npd.a(iA3 - iA4))) {
                            }
                        } else {
                            boolean zC = nozVar.c();
                            for (int i17 = i14; i17 < iA3; i17++) {
                                if (!zC) {
                                    nozVar.b(i10);
                                } else if (nozVar.c()) {
                                    nozVar.b(i10);
                                }
                            }
                        }
                        int i18 = i7;
                        int iA5 = nozVar.a(i18);
                        if (iA5 > 2) {
                            throw new mby(a.g(iA5, "lookup type greater than 2 not decodable: "), null, true, 1);
                        }
                        if (iA5 != i4) {
                            if (iA5 == 2) {
                            }
                            i12++;
                            i11 = i16;
                            i3 = i14;
                            i7 = 4;
                            i10 = 5;
                            i4 = 1;
                        } else {
                            i13 = iA5;
                        }
                        nozVar.b(32);
                        nozVar.b(32);
                        int iA6 = nozVar.a(i18) + i4;
                        nozVar.b(i4);
                        nozVar.b((int) ((i13 == i4 ? iA2 != 0 ? (long) Math.floor(Math.pow(iA3, 1.0d / iA2)) : 0L : iA2 * iA3) * iA6));
                        i12++;
                        i11 = i16;
                        i3 = i14;
                        i7 = 4;
                        i10 = 5;
                        i4 = 1;
                    } else {
                        int i19 = i11;
                        boolean z = i4;
                        int i20 = 6;
                        int iA7 = nozVar.a(6) + (z ? 1 : 0);
                        for (int i21 = i14; i21 < iA7; i21++) {
                            if (nozVar.a(16) != 0) {
                                throw new mby("placeholder of time domain transforms not zeroed out", null, z, z ? 1 : 0);
                            }
                        }
                        int iA8 = nozVar.a(6) + (z ? 1 : 0);
                        int i22 = i14;
                        int i23 = z;
                        while (true) {
                            int i24 = 3;
                            if (i22 < iA8) {
                                int iA9 = nozVar.a(i15);
                                if (iA9 == 0) {
                                    int i25 = i19;
                                    nozVar.b(i25);
                                    nozVar.b(16);
                                    nozVar.b(16);
                                    nozVar.b(6);
                                    nozVar.b(i25);
                                    int iA10 = nozVar.a(4) + i23;
                                    int i26 = i14;
                                    while (i26 < iA10) {
                                        nozVar.b(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (iA9 != i23) {
                                        throw new mby(a.g(iA9, "floor type greater than 1 not decodable: "), null, true, 1);
                                    }
                                    int iA11 = nozVar.a(5);
                                    int[] iArr2 = new int[iA11];
                                    int i27 = -1;
                                    for (int i28 = i14; i28 < iA11; i28++) {
                                        int iA12 = nozVar.a(4);
                                        iArr2[i28] = iA12;
                                        if (iA12 > i27) {
                                            i27 = iA12;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr3 = new int[i29];
                                    int i30 = i14;
                                    while (i30 < i29) {
                                        int i31 = 1;
                                        iArr3[i30] = nozVar.a(i24) + 1;
                                        int iA13 = nozVar.a(2);
                                        if (iA13 > 0) {
                                            i2 = i19;
                                            nozVar.b(i2);
                                        } else {
                                            i2 = i19;
                                        }
                                        int i32 = i29;
                                        int i33 = i14;
                                        while (true) {
                                            int i34 = i31 << iA13;
                                            iArr = iArr2;
                                            if (i33 < i34) {
                                                nozVar.b(i2);
                                                i33++;
                                                iArr2 = iArr;
                                                i2 = 8;
                                                i31 = 1;
                                            }
                                        }
                                        i30++;
                                        iArr2 = iArr;
                                        i29 = i32;
                                        i19 = 8;
                                        i24 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    nozVar.b(2);
                                    int iA14 = nozVar.a(4);
                                    int i35 = i14;
                                    int i36 = i35;
                                    int i37 = i36;
                                    while (i35 < iA11) {
                                        i36 += iArr3[iArr4[i35]];
                                        while (i37 < i36) {
                                            nozVar.b(iA14);
                                            i37++;
                                        }
                                        i35++;
                                    }
                                }
                                i22++;
                                i19 = 8;
                                i20 = 6;
                                i15 = 16;
                                i23 = 1;
                            } else {
                                int i38 = 1;
                                int iA15 = nozVar.a(i20) + 1;
                                int i39 = i14;
                                while (i39 < iA15) {
                                    if (nozVar.a(16) > 2) {
                                        throw new mby("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                    nozVar.b(24);
                                    nozVar.b(24);
                                    nozVar.b(24);
                                    int iA16 = nozVar.a(i20) + i38;
                                    int i40 = 8;
                                    nozVar.b(8);
                                    int[] iArr5 = new int[iA16];
                                    for (int i41 = i14; i41 < iA16; i41++) {
                                        iArr5[i41] = ((nozVar.c() ? nozVar.a(5) : i14) * 8) + nozVar.a(3);
                                    }
                                    int i42 = i14;
                                    while (i42 < iA16) {
                                        int i43 = i14;
                                        while (i43 < i40) {
                                            if ((iArr5[i42] & (1 << i43)) != 0) {
                                                nozVar.b(i40);
                                            }
                                            i43++;
                                            i40 = 8;
                                        }
                                        i42++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    i20 = 6;
                                    i38 = 1;
                                }
                                int iA17 = nozVar.a(i20) + i38;
                                for (int i44 = i14; i44 < iA17; i44++) {
                                    int iA18 = nozVar.a(16);
                                    if (iA18 != 0) {
                                        mff.c("VorbisUtil", a.g(iA18, "mapping type other than 0 not supported: "));
                                    } else {
                                        if (nozVar.c()) {
                                            i = 1;
                                            iA = nozVar.a(4) + 1;
                                        } else {
                                            i = 1;
                                            iA = 1;
                                        }
                                        if (nozVar.c()) {
                                            int iA19 = nozVar.a(8) + i;
                                            for (int i45 = i14; i45 < iA19; i45++) {
                                                int i46 = i9 - 1;
                                                nozVar.b(npd.a(i46));
                                                nozVar.b(npd.a(i46));
                                            }
                                        }
                                        if (nozVar.a(2) != 0) {
                                            throw new mby("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (iA > 1) {
                                            for (int i47 = i14; i47 < i9; i47++) {
                                                nozVar.b(4);
                                            }
                                        }
                                        for (int i48 = i14; i48 < iA; i48++) {
                                            nozVar.b(8);
                                            nozVar.b(8);
                                            nozVar.b(8);
                                        }
                                    }
                                }
                                int iA20 = nozVar.a(6);
                                int i49 = iA20 + 1;
                                npb[] npbVarArr = new npb[i49];
                                for (int i50 = i14; i50 < i49; i50++) {
                                    boolean zC2 = nozVar.c();
                                    nozVar.a(16);
                                    nozVar.a(16);
                                    nozVar.a(8);
                                    npbVarArr[i50] = new npb(zC2);
                                }
                                if (!nozVar.c()) {
                                    throw new mby("framing bit after modes not set as expected", null, true, 1);
                                }
                                nunVar = new nun(npcVar, npaVar, bArr, npbVarArr, npd.a(iA20));
                            }
                        }
                    }
                }
            }
        }
        nunVar = null;
        this.a = nunVar;
        if (nunVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        npc npcVar2 = nunVar.a;
        arrayList.add(npcVar2.g);
        arrayList.add(nunVar.c);
        mbt mbtVarB = npd.b(ekgb.p(nunVar.b.a));
        mat matVar = new mat();
        matVar.a("audio/ogg");
        matVar.c("audio/vorbis");
        matVar.h = npcVar2.d;
        matVar.i = npcVar2.c;
        matVar.E = npcVar2.a;
        matVar.F = npcVar2.b;
        matVar.p = arrayList;
        matVar.k = mbtVarB;
        nukVar.a = new mau(matVar);
        return true;
    }

    @Override // defpackage.num
    protected final void g(long j) {
        this.h = j;
        this.p = j != 0;
        npc npcVar = this.q;
        this.o = npcVar != null ? npcVar.e : 0;
    }
}
