package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwz implements ixm {
    public final cxg a;

    public cwz(cxg cxgVar) {
        this.a = cxgVar;
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((ivt) list.get(0)).a(i));
            int iE = fcva.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ivt) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((ivt) list.get(0)).b(i));
            int iE = fcva.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ivt) list.get(i2)).b(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((ivt) list.get(0)).c(i));
            int iE = fcva.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ivt) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((ivt) list.get(0)).d(i));
            int iE = fcva.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ivt) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        iyl iylVar;
        int i;
        iyl iylVar2;
        int i2;
        int i3;
        int size = list.size();
        iyl[] iylVarArr = new iyl[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            iylVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            ixk ixkVar = (ixk) list.get(i4);
            Object objF = ixkVar.f();
            cxb cxbVar = objF instanceof cxb ? (cxb) objF : null;
            if (cxbVar != null && ((Boolean) cxbVar.a.a()).booleanValue()) {
                long j3 = r7.b & 4294967295L;
                iylVarArr[i4] = ixkVar.e(j);
                j2 = j3 | (r7.a << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            ixk ixkVar2 = (ixk) list.get(i5);
            if (iylVarArr[i5] == null) {
                iylVarArr[i5] = ixkVar2.e(j);
            }
        }
        if (ixpVar.ev()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                iylVar2 = null;
            } else {
                iylVar2 = iylVarArr[0];
                int iC = fcur.C(iylVarArr);
                if (iC != 0) {
                    int i6 = iylVar2 != null ? iylVar2.a : 0;
                    if (iC > 0) {
                        int i7 = 1;
                        while (true) {
                            iyl iylVar3 = iylVarArr[i7];
                            int i8 = iylVar3 != null ? iylVar3.a : 0;
                            int i9 = i6 < i8 ? i8 : i6;
                            if (i6 < i8) {
                                iylVar2 = iylVar3;
                            }
                            if (i7 == iC) {
                                break;
                            }
                            i7++;
                            i6 = i9;
                        }
                    }
                }
            }
            i2 = iylVar2 != null ? iylVar2.a : 0;
        }
        if (ixpVar.ev()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                iylVar = iylVarArr[0];
                int iC2 = fcur.C(iylVarArr);
                if (iC2 != 0) {
                    int i10 = iylVar != null ? iylVar.b : 0;
                    if (iC2 > 0) {
                        while (true) {
                            iyl iylVar4 = iylVarArr[i];
                            int i11 = iylVar4 != null ? iylVar4.b : 0;
                            int i12 = i10 < i11 ? i11 : i10;
                            if (i10 < i11) {
                                iylVar = iylVar4;
                            }
                            if (i == iC2) {
                                break;
                            }
                            i++;
                            i10 = i12;
                        }
                    }
                }
            }
            i3 = iylVar != null ? iylVar.b : 0;
        }
        if (!ixpVar.ev()) {
            this.a.c.b(new kjg((i2 << 32) | (i3 & 4294967295L)));
        }
        return ixpVar.ej(i2, i3, fcvp.a, new cwy(iylVarArr, this, i2, i3));
    }
}
