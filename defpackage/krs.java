package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krs extends krm {
    public krs(krj krjVar) {
        super(krjVar, 2);
    }

    @Override // defpackage.krf, defpackage.kqx, defpackage.krg
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kqx kqxVarB = this.al.b(arrayList.get(i));
            if (kqxVarB.R != null) {
                kqxVarB.ak = 9;
            } else {
                kqxVarB.ak = 10;
            }
            kqxVarB.k();
            kqxVarB.ak = 15;
            kqxVarB.k();
            kqxVarB.ak = kqxVarB.U != null ? 12 : 13;
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
                Object obj2 = this.R;
                if (obj2 != null) {
                    kqxVarB2.v(obj2);
                    kqxVarB2.o(this.n);
                    kqxVarB2.p(this.t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        kqxVarB2.u(obj3);
                        kqxVarB2.o(this.n);
                        kqxVarB2.p(this.t);
                    } else {
                        String string = kqxVarB2.a.toString();
                        kqxVarB2.v(krj.c);
                        kqxVarB2.w(Float.valueOf(D(string)));
                        kqxVarB2.q(Float.valueOf(C(string)));
                    }
                }
                kqxVar2 = kqxVarB2;
            }
            if (kqxVar != null) {
                String string2 = kqxVar.a.toString();
                String string3 = kqxVarB2.a.toString();
                kqxVar.j(kqxVarB2.a);
                kqxVar.w(Float.valueOf(B(string2)));
                kqxVar.q(Float.valueOf(A(string2)));
                kqxVarB2.u(kqxVar.a);
                kqxVarB2.w(Float.valueOf(D(string3)));
                kqxVarB2.q(Float.valueOf(C(string3)));
            }
            float fE = E(obj.toString());
            if (fE != -1.0f) {
                kqxVarB2.g = fE;
            }
            i2++;
            kqxVar = kqxVarB2;
        }
        if (kqxVar != null) {
            Object obj4 = this.U;
            if (obj4 != null) {
                kqxVar.j(obj4);
                kqxVar.o(this.o);
                kqxVar.p(this.u);
            } else {
                Object obj5 = this.V;
                if (obj5 != null) {
                    kqxVar.i(obj5);
                    kqxVar.o(this.o);
                    kqxVar.p(this.u);
                } else {
                    String string4 = kqxVar.a.toString();
                    kqxVar.i(krj.c);
                    kqxVar.w(Float.valueOf(B(string4)));
                    kqxVar.q(Float.valueOf(A(string4)));
                }
            }
        }
        if (kqxVar2 == null) {
            return;
        }
        float f = this.ao;
        if (f != 0.5f) {
            kqxVar2.i = f;
        }
        krh krhVar = krh.SPREAD;
        int iOrdinal = this.as.ordinal();
        if (iOrdinal == 0) {
            kqxVar2.e = 0;
        } else if (iOrdinal == 1) {
            kqxVar2.e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            kqxVar2.e = 2;
        }
    }
}
