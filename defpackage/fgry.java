package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgry implements Cloneable {
    static final List j = Collections.EMPTY_LIST;
    public fgry k;
    public int l;

    protected fgry() {
    }

    protected static final void Y(Appendable appendable, int i, fgrl fgrlVar) throws IOException {
        String strValueOf;
        Appendable appendableAppend = appendable.append('\n');
        int i2 = fgrlVar.d;
        int i3 = fgrlVar.e;
        boolean z = i >= 0;
        String[] strArr = fgre.a;
        fgqz.d(z, "width must be >= 0");
        fgqz.c(true);
        int iMin = Math.min(i, 30);
        if (iMin < 21) {
            strValueOf = fgre.a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i4 = 0; i4 < iMin; i4++) {
                cArr[i4] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    private final void h(int i) {
        int iHP = hP();
        if (iHP == 0) {
            return;
        }
        List listU = u();
        while (i < iHP) {
            ((fgry) listU.get(i)).l = i;
            i++;
        }
    }

    public fgry A() {
        return this.k;
    }

    public fgry B() {
        fgry fgryVar = this;
        while (true) {
            fgry fgryVar2 = fgryVar.k;
            if (fgryVar2 == null) {
                return fgryVar;
            }
            fgryVar = fgryVar2;
        }
    }

    protected abstract void F(String str);

    protected abstract boolean G();

    public final List M() {
        if (hP() == 0) {
            return j;
        }
        List listU = u();
        ArrayList arrayList = new ArrayList(listU.size());
        arrayList.addAll(listU);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final fgrm N() {
        fgry fgryVarB = B();
        if (fgryVarB instanceof fgrm) {
            return (fgrm) fgryVarB;
        }
        return null;
    }

    public final fgry O(int i) {
        return (fgry) u().get(i);
    }

    public final fgry P() {
        fgry fgryVar = this.k;
        if (fgryVar == null) {
            return null;
        }
        List listU = fgryVar.u();
        int i = this.l + 1;
        if (listU.size() > i) {
            return (fgry) listU.get(i);
        }
        return null;
    }

    public final fgry Q() {
        fgry fgryVar = this.k;
        if (fgryVar != null && this.l > 0) {
            return (fgry) fgryVar.u().get(this.l - 1);
        }
        return null;
    }

    public final void R(int i, fgry... fgryVarArr) {
        fgqz.g(fgryVarArr);
        int length = fgryVarArr.length;
        if (length == 0) {
            return;
        }
        List listU = u();
        fgry fgryVarA = fgryVarArr[0].A();
        if (fgryVarA != null && fgryVarA.hP() == length) {
            List listU2 = fgryVarA.u();
            while (length > 0) {
                length--;
                if (fgryVarArr[length] != listU2.get(length)) {
                }
            }
            int iHP = hP();
            fgryVarA.g();
            listU.addAll(i, Arrays.asList(fgryVarArr));
            int length2 = fgryVarArr.length;
            while (true) {
                int i2 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                fgryVarArr[i2].k = this;
                length2 = i2;
            }
            if (iHP == 0 && fgryVarArr[0].l == 0) {
                return;
            }
            h(i);
            return;
        }
        for (fgry fgryVar : fgryVarArr) {
            if (fgryVar == null) {
                throw new fgra("Array must not contain any null objects");
            }
        }
        for (fgry fgryVar2 : fgryVarArr) {
            fgryVar2.V(this);
        }
        listU.addAll(i, Arrays.asList(fgryVarArr));
        h(i);
    }

    protected final void S(Appendable appendable) {
        fguv.a(new fgrx(appendable, fgrz.a(this)), this);
    }

    public final void T() {
        fgqz.g(this.k);
        this.k.hT(this);
    }

    public final void U(String str) {
        fgqz.g(str);
        F(str);
    }

    protected final void V(fgry fgryVar) {
        fgry fgryVar2 = this.k;
        if (fgryVar2 != null) {
            fgryVar2.hT(this);
        }
        this.k = fgryVar;
    }

    public final boolean W(String str) {
        fgqz.g(str);
        if (!G()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (v().m(strSubstring) && !hR(strSubstring).isEmpty()) {
                return true;
            }
        }
        return v().m(str);
    }

    public final boolean X() {
        return this.k != null;
    }

    final boolean Z() {
        return n().equals("br");
    }

    public abstract String a();

    @Override // 
    public fgry c() {
        fgry fgryVarZ = z(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(fgryVarZ);
        while (!linkedList.isEmpty()) {
            fgry fgryVar = (fgry) linkedList.remove();
            int iHP = fgryVar.hP();
            for (int i = 0; i < iHP; i++) {
                List listU = fgryVar.u();
                fgry fgryVarZ2 = ((fgry) listU.get(i)).z(fgryVar);
                listU.set(i, fgryVarZ2);
                linkedList.add(fgryVarZ2);
            }
        }
        return fgryVarZ;
    }

    public abstract void e(Appendable appendable, int i, fgrl fgrlVar);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract void f(Appendable appendable, int i, fgrl fgrlVar);

    public abstract void g();

    public abstract int hP();

    public String hQ() {
        StringBuilder sbE = fgre.e();
        S(sbE);
        return fgre.c(sbE);
    }

    public String hR(String str) {
        fgqz.e(str);
        return (G() && v().m(str)) ? fgre.d(l(), v().e(str)) : "";
    }

    public String hS(String str) {
        fgqz.g(str);
        if (!G()) {
            return "";
        }
        String strE = v().e(str);
        return strE.length() > 0 ? strE : str.startsWith("abs:") ? hR(str.substring(4)) : "";
    }

    public void hT(fgry fgryVar) {
        fgqz.c(fgryVar.k == this);
        int i = fgryVar.l;
        u().remove(i);
        h(i);
        fgryVar.k = null;
    }

    public abstract String l();

    public String n() {
        return a();
    }

    public String toString() {
        return hQ();
    }

    public abstract List u();

    public abstract fgrh v();

    protected fgry z(fgry fgryVar) {
        fgrm fgrmVarN;
        try {
            fgry fgryVar2 = (fgry) super.clone();
            fgryVar2.k = fgryVar;
            fgryVar2.l = fgryVar == null ? 0 : this.l;
            if (fgryVar == null && !(this instanceof fgrm) && (fgrmVarN = N()) != null) {
                fgrm fgrmVar = new fgrm(fgrmVarN.l());
                fgrh fgrhVar = fgrmVarN.h;
                if (fgrhVar != null) {
                    fgrmVar.h = fgrhVar.clone();
                }
                fgrmVar.b = fgrmVarN.b.clone();
                fgryVar2.k = fgrmVar;
                fgrmVar.u().add(fgryVar2);
            }
            return fgryVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
