package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqo extends kqp {
    public ArrayList a;

    public kqo(char[] cArr) {
        super(cArr);
        this.a = new ArrayList();
    }

    public final float a(int i) throws kqu {
        kqp kqpVarH = h(i);
        if (kqpVarH != null) {
            return kqpVarH.t();
        }
        throw new kqu(a.g(i, "no float at index "), this);
    }

    public final float b(String str) throws kqu {
        kqp kqpVarI = i(str);
        kqpVarI.getClass();
        return kqpVarI.t();
    }

    public final int c(int i) throws kqu {
        kqp kqpVarH = h(i);
        if (kqpVarH != null) {
            return kqpVarH.u();
        }
        throw new kqu(a.g(i, "no int at index "), this);
    }

    public final int d() {
        return this.a.size();
    }

    public final kqn e(String str) {
        kqp kqpVarK = k(str);
        if (kqpVarK instanceof kqn) {
            return (kqn) kqpVarK;
        }
        return null;
    }

    @Override // defpackage.kqp
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kqo) {
            return this.a.equals(((kqo) obj).a);
        }
        return false;
    }

    @Override // defpackage.kqp
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public kqo clone() {
        kqo kqoVar = (kqo) super.clone();
        ArrayList arrayList = new ArrayList(this.a.size());
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            kqp kqpVarClone = ((kqp) arrayList2.get(i)).clone();
            kqpVarClone.d = kqoVar;
            arrayList.add(kqpVarClone);
        }
        kqoVar.a = arrayList;
        return kqoVar;
    }

    public final kqp h(int i) throws kqu {
        if (i < 0 || i >= this.a.size()) {
            throw new kqu(a.g(i, "no element at index "), this);
        }
        return (kqp) this.a.get(i);
    }

    @Override // defpackage.kqp
    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(super.hashCode()));
    }

    public final kqp i(String str) throws kqu {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            kqq kqqVar = (kqq) ((kqp) arrayList.get(i));
            i++;
            if (kqqVar.v().equals(str)) {
                return kqqVar.A();
            }
        }
        throw new kqu(a.a(str, "no element for key <", ">"), this);
    }

    public final kqp j(int i) {
        if (i < this.a.size()) {
            return (kqp) this.a.get(i);
        }
        return null;
    }

    public final kqp k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            kqq kqqVar = (kqq) ((kqp) arrayList.get(i));
            i++;
            if (kqqVar.v().equals(str)) {
                return kqqVar.A();
            }
        }
        return null;
    }

    public final kqt l(String str) {
        kqp kqpVarK = k(str);
        if (kqpVarK instanceof kqt) {
            return (kqt) kqpVarK;
        }
        return null;
    }

    public final String m(int i) throws kqu {
        kqp kqpVarH = h(i);
        if (kqpVarH instanceof kqv) {
            return kqpVarH.v();
        }
        throw new kqu(a.g(i, "no string at index "), this);
    }

    public final String n(String str) throws kqu {
        kqp kqpVarI = i(str);
        if (kqpVarI instanceof kqv) {
            return kqpVarI.v();
        }
        throw new kqu("no string found for key <" + str + ">, found [" + (kqpVarI != null ? kqpVarI.w() : null) + "] : " + kqpVarI, this);
    }

    public final String o(String str) {
        kqp kqpVarK = k(str);
        if (kqpVarK instanceof kqv) {
            return kqpVarK.v();
        }
        return null;
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            kqp kqpVar = (kqp) arrayList2.get(i);
            if (kqpVar instanceof kqq) {
                arrayList.add(((kqq) kqpVar).v());
            }
        }
        return arrayList;
    }

    public final void q(kqp kqpVar) {
        this.a.add(kqpVar);
    }

    public final void r(String str, kqp kqpVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            kqq kqqVar = (kqq) ((kqp) arrayList.get(i));
            i++;
            if (kqqVar.v().equals(str)) {
                kqqVar.B(kqpVar);
                return;
            }
        }
        kqq kqqVar2 = new kqq(str.toCharArray());
        kqqVar2.z();
        kqqVar2.x(str.length() - 1);
        kqqVar2.B(kqpVar);
        this.a.add(kqqVar2);
    }

    public final boolean s(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kqp kqpVar = (kqp) arrayList.get(i);
            if ((kqpVar instanceof kqq) && ((kqq) kqpVar).v().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kqp
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kqp kqpVar = (kqp) arrayList.get(i);
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(kqpVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }
}
