package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mq {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final mo d;
    private final int e;
    private final int f;

    public mq(mo moVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = moVar;
        int iB = moVar.b();
        this.e = iB;
        int iA = moVar.a();
        this.f = iA;
        mp mpVar = list.isEmpty() ? null : (mp) list.get(0);
        if (mpVar == null || mpVar.a != 0 || mpVar.b != 0) {
            list.add(0, new mp(0, 0, 0));
        }
        list.add(new mp(iB, iA, 0));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mp mpVar2 = (mp) it.next();
            for (int i = 0; i < mpVar2.c; i++) {
                int i2 = mpVar2.a + i;
                int i3 = mpVar2.b + i;
                int i4 = true != this.d.d(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int iA2 = 0;
        for (mp mpVar3 : this.a) {
            while (iA2 < mpVar3.a) {
                if (this.b[iA2] == 0) {
                    int size = this.a.size();
                    int i5 = 0;
                    int iB2 = 0;
                    while (true) {
                        if (i5 < size) {
                            mp mpVar4 = (mp) this.a.get(i5);
                            while (iB2 < mpVar4.b) {
                                if (this.c[iB2] == 0 && this.d.e(iA2, iB2)) {
                                    int i6 = true != this.d.d(iA2, iB2) ? 4 : 8;
                                    this.b[iA2] = (iB2 << 4) | i6;
                                    this.c[iB2] = i6 | (iA2 << 4);
                                } else {
                                    iB2++;
                                }
                            }
                            iB2 = mpVar4.b();
                            i5++;
                        }
                    }
                }
                iA2++;
            }
            iA2 = mpVar3.a();
        }
    }

    private static ms d(Collection collection, int i, boolean z) {
        ms msVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                msVar = null;
                break;
            }
            msVar = (ms) it.next();
            if (msVar.a == i && msVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ms msVar2 = (ms) it.next();
            if (z) {
                msVar2.b--;
            } else {
                msVar2.b++;
            }
        }
        return msVar;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.e) {
            int i2 = this.b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
        throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.e);
    }

    public final void b(mw mwVar) {
        int i;
        mm mmVar = mwVar instanceof mm ? (mm) mwVar : new mm(mwVar);
        int i2 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.f;
        List list = this.a;
        int i4 = i3;
        int i5 = i2;
        for (int size = list.size() - 1; size >= 0; size--) {
            mp mpVar = (mp) list.get(size);
            int iA = mpVar.a();
            int iB = mpVar.b();
            while (true) {
                if (i5 <= iA) {
                    break;
                }
                i5--;
                int i6 = this.b[i5];
                if ((i6 & 12) != 0) {
                    int i7 = i6 >> 4;
                    ms msVarD = d(arrayDeque, i7, false);
                    if (msVarD != null) {
                        int i8 = (i2 - msVarD.b) - 1;
                        mmVar.c(i5, i8);
                        if ((i6 & 4) != 0) {
                            mmVar.a(i8, 1, this.d.c(i5, i7));
                        }
                    } else {
                        arrayDeque.add(new ms(i5, (i2 - i5) - 1, true));
                    }
                } else {
                    mmVar.d(i5, 1);
                    i2--;
                }
            }
            while (i4 > iB) {
                i4--;
                int i9 = this.c[i4];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    if (d(arrayDeque, i10, true) == null) {
                        arrayDeque.add(new ms(i4, i2 - i5, false));
                    } else {
                        mmVar.c((i2 - r12.b) - 1, i5);
                        if ((i9 & 4) != 0) {
                            mmVar.a(i5, 1, this.d.c(i10, i4));
                        }
                    }
                } else {
                    mmVar.b(i5, 1);
                    i2++;
                }
            }
            i5 = mpVar.a;
            i4 = mpVar.b;
            int i11 = i5;
            int i12 = i4;
            for (i = 0; i < mpVar.c; i++) {
                if ((this.b[i11] & 15) == 2) {
                    mmVar.a(i11, 1, this.d.c(i11, i12));
                }
                i11++;
                i12++;
            }
        }
        mmVar.e();
    }

    public final void c(vo voVar) {
        b(new ml(voVar));
    }
}
