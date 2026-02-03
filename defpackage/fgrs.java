package defpackage;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgrs extends fgry {
    private static final List a = Collections.EMPTY_LIST;
    private static final String b;
    public static final /* synthetic */ int i = 0;
    public fgsl e;
    public WeakReference f;
    public List g;
    public fgrh h;

    static {
        Pattern.compile("\\s+");
        b = "/baseUri";
    }

    public fgrs(fgsl fgslVar, String str) {
        this(fgslVar, str, null);
    }

    public static void D(StringBuilder sb, fgsb fgsbVar) {
        String strM = fgsbVar.m();
        if (I(fgsbVar.k) || (fgsbVar instanceof fgri)) {
            sb.append(strM);
        } else {
            fgre.f(sb, strM, fgsb.p(sb));
        }
    }

    public static void E(fgry fgryVar, StringBuilder sb) {
        if (fgryVar instanceof fgsb) {
            sb.append(((fgsb) fgryVar).m());
        } else if (fgryVar.Z()) {
            sb.append("\n");
        }
    }

    static boolean I(fgry fgryVar) {
        if (fgryVar instanceof fgrs) {
            fgrs fgrsVarA = (fgrs) fgryVar;
            int i2 = 0;
            while (!fgrsVarA.e.h) {
                fgrsVarA = fgrsVarA.A();
                i2++;
                if (i2 >= 6 || fgrsVarA == null) {
                }
            }
            return true;
        }
        return false;
    }

    private static int h(fgrs fgrsVar, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == fgrsVar) {
                return i2;
            }
        }
        return 0;
    }

    @Override // defpackage.fgry
    public final /* bridge */ /* synthetic */ fgry B() {
        return (fgrs) super.B();
    }

    public final fgte C() {
        return new fgte(t());
    }

    @Override // defpackage.fgry
    protected final void F(String str) {
        v().p(b, str);
    }

    @Override // defpackage.fgry
    protected final boolean G() {
        return this.h != null;
    }

    public final boolean H() {
        return this.e.d;
    }

    final boolean J(fgrl fgrlVar) {
        boolean z = fgrlVar.c;
        if (!this.e.e && (A() == null || !A().e.e)) {
            return false;
        }
        if (this.e.d) {
            return true;
        }
        return !(A() == null || A().H()) || Q() == null;
    }

    public final void K(fgry fgryVar) {
        fgqz.g(fgryVar);
        fgryVar.V(this);
        u();
        this.g.add(fgryVar);
        fgryVar.l = this.g.size() - 1;
    }

    public final void L(Collection collection) {
        fgqz.h(collection, "Children collection to be inserted must not be null.");
        int iHP = hP();
        fgqz.d(iHP >= 0, "Insert position out of bounds.");
        R(iHP, (fgry[]) new ArrayList(collection).toArray(new fgry[0]));
    }

    @Override // defpackage.fgry
    public String a() {
        return this.e.b;
    }

    @Override // defpackage.fgry
    public void e(Appendable appendable, int i2, fgrl fgrlVar) throws IOException {
        if (J(fgrlVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            Y(appendable, i2, fgrlVar);
        }
        appendable.append('<').append(p());
        fgrh fgrhVar = this.h;
        if (fgrhVar != null) {
            fgrhVar.j(appendable, fgrlVar);
        }
        if (!this.g.isEmpty() || !this.e.c()) {
            appendable.append('>');
            return;
        }
        int i3 = fgrlVar.g;
        if (this.e.f) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    @Override // defpackage.fgry
    public void f(Appendable appendable, int i2, fgrl fgrlVar) throws IOException {
        if (this.g.isEmpty() && this.e.c()) {
            return;
        }
        boolean z = fgrlVar.c;
        if (!this.g.isEmpty() && this.e.e) {
            Y(appendable, i2, fgrlVar);
        }
        appendable.append("</").append(p()).append('>');
    }

    @Override // defpackage.fgry
    public final /* bridge */ /* synthetic */ void g() {
        this.g.clear();
    }

    @Override // defpackage.fgry
    public final int hP() {
        return this.g.size();
    }

    @Override // defpackage.fgry
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public fgrs d() {
        return (fgrs) super.d();
    }

    public final int k() {
        if (A() == null) {
            return 0;
        }
        return h(this, A().t());
    }

    @Override // defpackage.fgry
    public final String l() {
        String str = b;
        for (fgrs fgrsVarA = this; fgrsVarA != null; fgrsVarA = fgrsVarA.A()) {
            fgrh fgrhVar = fgrsVarA.h;
            if (fgrhVar != null && fgrhVar.l(str)) {
                return fgrsVarA.h.d(str);
            }
        }
        return "";
    }

    public final String m() {
        final StringBuilder sbE = fgre.e();
        fguv.a(new fguw() { // from class: fgro
            @Override // defpackage.fguw
            public final void a(fgry fgryVar, int i2) {
                int i3 = fgrs.i;
                StringBuilder sb = sbE;
                if (fgryVar instanceof fgrk) {
                    sb.append(((fgrk) fgryVar).m());
                } else if (fgryVar instanceof fgrj) {
                    sb.append(((fgrj) fgryVar).m());
                } else if (fgryVar instanceof fgri) {
                    sb.append(((fgri) fgryVar).m());
                }
            }

            @Override // defpackage.fguw
            public final /* synthetic */ void b(fgry fgryVar, int i2) {
            }
        }, this);
        return fgre.c(sbE);
    }

    @Override // defpackage.fgry
    public final String n() {
        return this.e.c;
    }

    public final String o() {
        StringBuilder sbE = fgre.e();
        for (int i2 = 0; i2 < hP(); i2++) {
            fgry fgryVar = (fgry) this.g.get(i2);
            if (fgryVar instanceof fgsb) {
                D(sbE, (fgsb) fgryVar);
            } else if (fgryVar.Z() && !fgsb.p(sbE)) {
                sbE.append(" ");
            }
        }
        return fgre.c(sbE).trim();
    }

    public final String p() {
        return this.e.b;
    }

    public final String q() {
        StringBuilder sbE = fgre.e();
        fguv.a(new fgrq(sbE), this);
        return fgre.c(sbE).trim();
    }

    public final String r() {
        StringBuilder sbE = fgre.e();
        int iHP = hP();
        for (int i2 = 0; i2 < iHP; i2++) {
            E((fgry) this.g.get(i2), sbE);
        }
        return fgre.c(sbE);
    }

    public final String s() {
        final StringBuilder sbE = fgre.e();
        fguv.a(new fguw() { // from class: fgrp
            @Override // defpackage.fguw
            public final void a(fgry fgryVar, int i2) {
                fgrs.E(fgryVar, sbE);
            }

            @Override // defpackage.fguw
            public final /* synthetic */ void b(fgry fgryVar, int i2) {
            }
        }, this);
        return fgre.c(sbE);
    }

    public final List t() {
        List list;
        if (hP() == 0) {
            return a;
        }
        WeakReference weakReference = this.f;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            fgry fgryVar = (fgry) this.g.get(i2);
            if (fgryVar instanceof fgrs) {
                arrayList.add((fgrs) fgryVar);
            }
        }
        this.f = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // defpackage.fgry
    public final List u() {
        if (this.g == j) {
            this.g = new fgrr(this, 4);
        }
        return this.g;
    }

    @Override // defpackage.fgry
    public final fgrh v() {
        if (this.h == null) {
            this.h = new fgrh();
        }
        return this.h;
    }

    public final fgrs w(String str) {
        fgrs fgrsVar = new fgrs(fgsl.b(str, fgrz.b(this).c), l());
        K(fgrsVar);
        return fgrsVar;
    }

    @Override // defpackage.fgry
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final fgrs A() {
        return (fgrs) this.k;
    }

    public final fgrs y() {
        List listT;
        int iH;
        if (this.k != null && (iH = h(this, (listT = A().t()))) > 0) {
            return (fgrs) listT.get(iH - 1);
        }
        return null;
    }

    @Override // defpackage.fgry
    protected final /* bridge */ /* synthetic */ fgry z(fgry fgryVar) {
        fgrs fgrsVar = (fgrs) super.z(fgryVar);
        fgrh fgrhVar = this.h;
        fgrsVar.h = fgrhVar != null ? fgrhVar.clone() : null;
        fgrr fgrrVar = new fgrr(fgrsVar, this.g.size());
        fgrsVar.g = fgrrVar;
        fgrrVar.addAll(this.g);
        return fgrsVar;
    }

    public fgrs(fgsl fgslVar, String str, fgrh fgrhVar) {
        fgqz.g(fgslVar);
        this.g = j;
        this.h = fgrhVar;
        this.e = fgslVar;
        if (str != null) {
            U(str);
        }
    }
}
