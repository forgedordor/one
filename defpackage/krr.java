package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krr extends krm {
    public krr(krj krjVar) {
        super(krjVar, 1);
    }

    @Override // defpackage.krf, defpackage.kqx, defpackage.krg
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kqx kqxVarB = this.al.b(arrayList.get(i));
            if (kqxVarB.N != null) {
                kqxVarB.ak = 5;
            } else {
                kqxVarB.ak = 6;
            }
            kqxVarB.k();
            if (kqxVarB.P != null) {
                kqxVarB.ak = 7;
            } else {
                kqxVarB.ak = 8;
            }
            kqxVarB.k();
            if (kqxVarB.J != null) {
                kqxVarB.ak = 1;
            } else {
                kqxVarB.ak = 2;
            }
            kqxVarB.k();
            if (kqxVarB.L != null) {
                kqxVarB.ak = 3;
            } else {
                kqxVarB.ak = 4;
            }
            kqxVarB.k();
        }
        int size2 = arrayList.size();
        kqx kqxVar = null;
        int i2 = 0;
        kqx kqxVar2 = null;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            kqx kqxVarB2 = this.al.b(obj);
            if (kqxVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    kqxVarB2.t(obj2);
                    kqxVarB2.o(this.l);
                    kqxVarB2.p(this.r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        kqxVarB2.s(obj3);
                        kqxVarB2.o(this.l);
                        kqxVarB2.p(this.r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            kqxVarB2.t(obj4);
                            kqxVarB2.o(this.j);
                            kqxVarB2.p(this.p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                kqxVarB2.s(obj5);
                                kqxVarB2.o(this.j);
                                kqxVarB2.p(this.p);
                            } else {
                                String string = kqxVarB2.a.toString();
                                kqxVarB2.t(krj.c);
                                kqxVarB2.w(Float.valueOf(D(string)));
                                kqxVarB2.q(Float.valueOf(C(string)));
                            }
                        }
                    }
                }
                kqxVar2 = kqxVarB2;
            }
            if (kqxVar != null) {
                String string2 = kqxVar.a.toString();
                String string3 = kqxVarB2.a.toString();
                kqxVar.m(kqxVarB2.a);
                kqxVar.w(Float.valueOf(B(string2)));
                kqxVar.q(Float.valueOf(A(string2)));
                kqxVarB2.s(kqxVar.a);
                kqxVarB2.w(Float.valueOf(D(string3)));
                kqxVarB2.q(Float.valueOf(C(string3)));
            }
            float fE = E(obj.toString());
            if (fE != -1.0f) {
                kqxVarB2.f = fE;
            }
            i2++;
            kqxVar = kqxVarB2;
        }
        if (kqxVar != null) {
            Object obj6 = this.P;
            if (obj6 != null) {
                kqxVar.m(obj6);
                kqxVar.o(this.m);
                kqxVar.p(this.s);
            } else {
                Object obj7 = this.Q;
                if (obj7 != null) {
                    kqxVar.l(obj7);
                    kqxVar.o(this.m);
                    kqxVar.p(this.s);
                } else {
                    Object obj8 = this.L;
                    if (obj8 != null) {
                        kqxVar.m(obj8);
                        kqxVar.o(this.k);
                        kqxVar.p(this.q);
                    } else {
                        Object obj9 = this.M;
                        if (obj9 != null) {
                            kqxVar.l(obj9);
                            kqxVar.o(this.k);
                            kqxVar.p(this.q);
                        } else {
                            String string4 = kqxVar.a.toString();
                            kqxVar.l(krj.c);
                            kqxVar.w(Float.valueOf(B(string4)));
                            kqxVar.q(Float.valueOf(A(string4)));
                        }
                    }
                }
            }
        }
        if (kqxVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            kqxVar2.h = f;
        }
        krh krhVar = krh.SPREAD;
        int iOrdinal = this.as.ordinal();
        if (iOrdinal == 0) {
            kqxVar2.d = 0;
        } else if (iOrdinal == 1) {
            kqxVar2.d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            kqxVar2.d = 2;
        }
    }
}
