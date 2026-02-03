package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exto extends extv {
    public final evqs a;

    public exto(evqs evqsVar) {
        this.a = evqsVar;
    }

    @Override // defpackage.extv
    protected final int a() {
        return c((byte) 64);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iD;
        int iD2;
        extv extvVar = (extv) obj;
        if (a() != extvVar.a()) {
            iD = a();
            iD2 = extvVar.a();
        } else {
            evqs evqsVar = this.a;
            int iD3 = evqsVar.d();
            evqs evqsVar2 = ((exto) extvVar).a;
            if (iD3 == evqsVar2.d()) {
                return eonk.b.compare(evqsVar.I(), evqsVar2.I());
            }
            iD = evqsVar.d();
            iD2 = evqsVar2.d();
        }
        return iD - iD2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((exto) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        eldu elduVar;
        eldz eldvVar = eldz.h;
        eldy eldyVar = (eldy) eldvVar;
        eldz eldzVar = eldyVar.d;
        if (eldzVar == null) {
            eldu elduVar2 = eldyVar.b;
            if (elduVar2.d()) {
                ejwl.m(!elduVar2.e(), "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr = elduVar2.b;
                char[] cArr2 = new char[cArr.length];
                for (int i = 0; i < cArr.length; i++) {
                    cArr2[i] = ejuf.b(cArr[i]);
                }
                elduVar = new eldu(elduVar2.a.concat(".upperCase()"), cArr2);
                if (elduVar2.h) {
                    elduVar = elduVar.c();
                }
            } else {
                elduVar = elduVar2;
            }
            if (elduVar != elduVar2) {
                Character ch = eldyVar.c;
                eldvVar = new eldv(elduVar);
            }
            eldyVar.d = eldvVar;
            eldzVar = eldvVar;
        }
        return "h'" + eldzVar.j(this.a.I()) + "'";
    }
}
