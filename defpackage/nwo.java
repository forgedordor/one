package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwo implements nvn {
    private final mfr a = new mfr();
    private final mfr b = new mfr();
    private final nwn c = new nwn();
    private Inflater d;

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    @Override // defpackage.nvn
    public final void b(byte[] bArr, int i, int i2, nvm nvmVar, meo meoVar) {
        mdu mduVarA;
        mfr mfrVar;
        int i3;
        int i4;
        mfr mfrVar2;
        int i5;
        int i6;
        int iL;
        mfr mfrVar3 = this.a;
        mfrVar3.I(bArr, i + i2);
        mfrVar3.K(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        mfr mfrVar4 = this.b;
        if (mgb.ad(mfrVar3, mfrVar4, this.d)) {
            mfrVar3.I(mfrVar4.a, mfrVar4.c);
        }
        nwn nwnVar = this.c;
        nwnVar.a();
        ArrayList arrayList = new ArrayList();
        while (mfrVar3.a() >= 3) {
            int i7 = mfrVar3.c;
            int iJ = mfrVar3.j();
            int iN = mfrVar3.n();
            int i8 = mfrVar3.b + iN;
            if (i8 > i7) {
                mfrVar3.K(i7);
                mduVarA = null;
            } else {
                if (iJ != 128) {
                    switch (iJ) {
                        case 20:
                            if (iN % 5 == 2) {
                                mfrVar3.L(2);
                                int[] iArr = nwnVar.b;
                                Arrays.fill(iArr, 0);
                                int i9 = iN / 5;
                                int i10 = 0;
                                while (i10 < i9) {
                                    int iJ2 = mfrVar3.j();
                                    int iJ3 = mfrVar3.j();
                                    int iJ4 = mfrVar3.j();
                                    double d = iJ3;
                                    double d2 = iJ4 - 128;
                                    int i11 = i9;
                                    double dJ = mfrVar3.j() - 128;
                                    iArr[iJ2] = (mgb.d((int) (d + (1.402d * d2)), 0, 255) << 16) | (mfrVar3.j() << 24) | (mgb.d((int) ((d - (0.34414d * dJ)) - (d2 * 0.71414d)), 0, 255) << 8) | mgb.d((int) (d + (dJ * 1.772d)), 0, 255);
                                    i10++;
                                    i9 = i11;
                                    i8 = i8;
                                }
                                nwnVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (iN >= 4) {
                                mfrVar3.L(3);
                                int i12 = iN - 4;
                                if ((128 & mfrVar3.j()) == 0) {
                                    mfrVar2 = nwnVar.a;
                                    i5 = mfrVar2.b;
                                    i6 = mfrVar2.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        mfrVar3.F(mfrVar2.a, i5, iMin);
                                        mfrVar2.K(i5 + iMin);
                                        break;
                                    }
                                } else if (i12 >= 7 && (iL = mfrVar3.l()) >= 4) {
                                    nwnVar.h = mfrVar3.n();
                                    nwnVar.i = mfrVar3.n();
                                    nwnVar.a.G(iL - 4);
                                    i12 = iN - 11;
                                    mfrVar2 = nwnVar.a;
                                    i5 = mfrVar2.b;
                                    i6 = mfrVar2.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        mfrVar3.F(mfrVar2.a, i5, iMin2);
                                        mfrVar2.K(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iN >= 19) {
                                nwnVar.d = mfrVar3.n();
                                nwnVar.e = mfrVar3.n();
                                mfrVar3.L(11);
                                nwnVar.f = mfrVar3.n();
                                nwnVar.g = mfrVar3.n();
                                break;
                            }
                            break;
                    }
                    mduVarA = null;
                } else {
                    if (nwnVar.d == 0 || nwnVar.e == 0 || nwnVar.h == 0 || nwnVar.i == 0 || (i3 = (mfrVar = nwnVar.a).c) == 0 || mfrVar.b != i3 || !nwnVar.c) {
                        mduVarA = null;
                    } else {
                        mfrVar.K(0);
                        int i13 = nwnVar.h * nwnVar.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iJ5 = mfrVar.j();
                            if (iJ5 != 0) {
                                i4 = i14 + 1;
                                iArr2[i14] = nwnVar.b[iJ5];
                            } else {
                                int iJ6 = mfrVar.j();
                                if (iJ6 != 0) {
                                    int iJ7 = iJ6 & 63;
                                    if ((iJ6 & 64) != 0) {
                                        iJ7 = (iJ7 << 8) | mfrVar.j();
                                    }
                                    i4 = iJ7 + i14;
                                    Arrays.fill(iArr2, i14, i4, (iJ6 & 128) == 0 ? nwnVar.b[0] : nwnVar.b[mfrVar.j()]);
                                }
                            }
                            i14 = i4;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, nwnVar.h, nwnVar.i, Bitmap.Config.ARGB_8888);
                        mdt mdtVar = new mdt();
                        mdtVar.b = bitmapCreateBitmap;
                        mdtVar.f = nwnVar.f / nwnVar.d;
                        mdtVar.g = 0;
                        mdtVar.c(nwnVar.g / nwnVar.e, 0);
                        mdtVar.e = 0;
                        mdtVar.h = nwnVar.h / nwnVar.d;
                        mdtVar.i = nwnVar.i / nwnVar.e;
                        mduVarA = mdtVar.a();
                    }
                    nwnVar.a();
                    i8 = i8;
                }
                mfrVar3.K(i8);
            }
            if (mduVarA != null) {
                arrayList.add(mduVarA);
            }
        }
        meoVar.a(new nut(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
