package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kss {
    public static ksz a(krz krzVar, int i, ArrayList arrayList, ksz kszVar) {
        int i2;
        int i3 = i == 0 ? krzVar.ay : krzVar.az;
        if (i3 != -1 && (kszVar == null || i3 != kszVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                ksz kszVar2 = (ksz) arrayList.get(i4);
                if (kszVar2.c == i3) {
                    if (kszVar != null) {
                        kszVar.c(i, kszVar2);
                        arrayList.remove(kszVar);
                    }
                    kszVar = kszVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return kszVar;
        }
        if (kszVar == null) {
            if (krzVar instanceof kse) {
                kse kseVar = (kse) krzVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= kseVar.aM) {
                        i2 = -1;
                        break;
                    }
                    krz krzVar2 = kseVar.aL[i5];
                    if (i == 0) {
                        i2 = krzVar2.ay;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = krzVar2.az;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        ksz kszVar3 = (ksz) arrayList.get(i6);
                        if (kszVar3.c == i2) {
                            kszVar = kszVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (kszVar == null) {
                kszVar = new ksz(i);
            }
            arrayList.add(kszVar);
        }
        if (kszVar.d(krzVar)) {
            if (krzVar instanceof ksd) {
                ksd ksdVar = (ksd) krzVar;
                ksdVar.d.d(ksdVar.e == 0 ? 1 : 0, arrayList, kszVar);
            }
            if (i == 0) {
                krzVar.ay = kszVar.c;
                krzVar.T.d(0, arrayList, kszVar);
                krzVar.V.d(0, arrayList, kszVar);
            } else {
                krzVar.az = kszVar.c;
                krzVar.U.d(1, arrayList, kszVar);
                krzVar.X.d(1, arrayList, kszVar);
                krzVar.W.d(1, arrayList, kszVar);
            }
            krzVar.aa.d(i, arrayList, kszVar);
        }
        return kszVar;
    }

    public static ksz b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ksz kszVar = (ksz) arrayList.get(i2);
            if (i == kszVar.c) {
                return kszVar;
            }
        }
        return null;
    }

    public static boolean c(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
