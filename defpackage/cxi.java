package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxi implements ixm {
    private final cyh a;
    private boolean b;

    public cxi(cyh cyhVar) {
        this.a = cyhVar;
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((ivt) list.get(0)).a(i);
        int iE = fcva.e(list);
        if (iE > 0) {
            int i2 = 1;
            while (true) {
                int iA2 = ((ivt) list.get(i2)).a(i);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iA;
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((ivt) list.get(0)).b(i);
        int iE = fcva.e(list);
        if (iE > 0) {
            int i2 = 1;
            while (true) {
                int iB2 = ((ivt) list.get(i2)).b(i);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iB;
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((ivt) list.get(0)).c(i);
        int iE = fcva.e(list);
        if (iE > 0) {
            int i2 = 1;
            while (true) {
                int iC2 = ((ivt) list.get(i2)).c(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((ivt) list.get(0)).d(i);
        int iE = fcva.e(list);
        if (iE > 0) {
            int i2 = 1;
            while (true) {
                int iD2 = ((ivt) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            iyl iylVarE = ((ixk) list.get(i)).e(j);
            iMax2 = Math.max(iMax2, iylVarE.a);
            iMax = Math.max(iMax, iylVarE.b);
            arrayList.add(iylVarE);
        }
        if (ixpVar.ev()) {
            this.b = true;
            this.a.b.b(new kjg((iMax2 << 32) | (4294967295L & iMax)));
        } else if (!this.b) {
            this.a.b.b(new kjg((iMax2 << 32) | (4294967295L & iMax)));
        }
        return ixpVar.ej(iMax2, iMax, fcvp.a, new cxh(arrayList));
    }
}
