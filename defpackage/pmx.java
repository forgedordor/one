package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pmx implements Cloneable {
    private static final Animator[] v = new Animator[0];
    private static final int[] w = {2, 1, 3, 4};
    private static final pmg x = new pmi();
    private static final ThreadLocal y = new ThreadLocal();
    private pmq[] B;
    public ArrayList j;
    public ArrayList k;
    public pmm q;
    long s;
    public pmo t;
    long u;
    private final String z = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    private ArrayList A = null;
    public pni f = new pni();
    public pni g = new pni();
    pnf h = null;
    public final int[] i = w;
    final ArrayList l = new ArrayList();
    private Animator[] C = v;
    int m = 0;
    private boolean D = false;
    boolean n = false;
    public pmx o = null;
    private ArrayList E = null;
    public ArrayList p = new ArrayList();
    public pmg r = x;

    private static boolean O(pnh pnhVar, pnh pnhVar2, String str) {
        Map map = pnhVar2.a;
        Object obj = pnhVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void f(pni pniVar, View view, pnh pnhVar) {
        pniVar.a.put(view, pnhVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = pniVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = ley.a;
        String strF = len.f(view);
        if (strF != null) {
            csq csqVar = pniVar.d;
            if (csqVar.containsKey(strF)) {
                csqVar.put(strF, null);
            } else {
                csqVar.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                ctz ctzVar = pniVar.c;
                if (ctzVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ctzVar.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ctzVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ctzVar.h(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.A.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            pnh pnhVar = new pnh(view);
            if (z) {
                c(pnhVar);
            } else {
                b(pnhVar);
            }
            pnhVar.c.add(this);
            o(pnhVar);
            if (z) {
                f(this.f, view, pnhVar);
            } else {
                f(this.g, view, pnhVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), z);
            }
        }
    }

    public static csq h() {
        ThreadLocal threadLocal = y;
        csq csqVar = (csq) threadLocal.get();
        if (csqVar != null) {
            return csqVar;
        }
        csq csqVar2 = new csq();
        threadLocal.set(csqVar2);
        return csqVar2;
    }

    public void A(pmg pmgVar) {
        if (pmgVar == null) {
            this.r = x;
        } else {
            this.r = pmgVar;
        }
    }

    protected final void B() {
        if (this.m == 0) {
            t(this, pmw.a, false);
            this.n = false;
        }
        this.m++;
    }

    public boolean C() {
        return !this.l.isEmpty();
    }

    public boolean D(pnh pnhVar, pnh pnhVar2) {
        if (pnhVar != null && pnhVar2 != null) {
            String[] strArrE = e();
            if (strArrE != null) {
                for (String str : strArrE) {
                    if (O(pnhVar, pnhVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = pnhVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (O(pnhVar, pnhVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean E(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.A.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.d;
        return (arrayList2.size() == 0 && this.e.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || this.e.contains(view);
    }

    public final void F(pmq pmqVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(pmqVar);
    }

    public void G(View view) {
        this.e.add(view);
    }

    public void H(Class cls) {
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(cls)) {
            arrayList.add(cls);
        }
        this.A = arrayList;
    }

    public final void I(pmq pmqVar) {
        pmx pmxVar;
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(pmqVar) && (pmxVar = this.o) != null) {
            pmxVar.I(pmqVar);
        }
        if (this.E.size() == 0) {
            this.E = null;
        }
    }

    public void J(View view) {
        this.e.remove(view);
    }

    public void K(long j) {
        this.b = j;
    }

    public void L(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void N(long j) {
        this.a = j;
    }

    public Animator a(ViewGroup viewGroup, pnh pnhVar, pnh pnhVar2) {
        return null;
    }

    public abstract void b(pnh pnhVar);

    public abstract void c(pnh pnhVar);

    public boolean d() {
        return false;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public pmx clone() {
        try {
            pmx pmxVar = (pmx) super.clone();
            pmxVar.p = new ArrayList();
            pmxVar.f = new pni();
            pmxVar.g = new pni();
            pmxVar.j = null;
            pmxVar.k = null;
            pmxVar.t = null;
            pmxVar.o = this;
            pmxVar.E = null;
            return pmxVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final pmx j() {
        pnf pnfVar = this.h;
        return pnfVar != null ? pnfVar.j() : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (defpackage.pnh) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.pnh k(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            pnf r0 = r5.h
            if (r0 == 0) goto L9
            pnh r6 = r0.k(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.j
            goto L10
        Le:
            java.util.ArrayList r0 = r5.k
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            pnh r4 = (defpackage.pnh) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.k
            goto L36
        L34:
            java.util.ArrayList r6 = r5.j
        L36:
            java.lang.Object r6 = r6.get(r3)
            pnh r6 = (defpackage.pnh) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmx.k(android.view.View, boolean):pnh");
    }

    public final pnh l(View view, boolean z) {
        pnf pnfVar = this.h;
        if (pnfVar != null) {
            return pnfVar.l(view, z);
        }
        return (pnh) (z ? this.f : this.g).a.get(view);
    }

    public String m(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c != null) {
            sb.append("interp(");
            sb.append(this.c);
            sb.append(") ");
        }
        ArrayList arrayList = this.d;
        if (arrayList.size() > 0 || this.e.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.e;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    protected void n() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        while (true) {
            size--;
            if (size < 0) {
                this.C = animatorArr;
                t(this, pmw.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    final void p(ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        ArrayList arrayList = this.d;
        if (arrayList.size() <= 0 && this.e.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= arrayList.size()) {
                break;
            }
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                pnh pnhVar = new pnh(viewFindViewById);
                if (z) {
                    c(pnhVar);
                } else {
                    b(pnhVar);
                    z3 = false;
                }
                pnhVar.c.add(this);
                o(pnhVar);
                if (z3) {
                    f(this.f, viewFindViewById, pnhVar);
                } else {
                    f(this.g, viewFindViewById, pnhVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            pnh pnhVar2 = new pnh(view);
            if (z) {
                c(pnhVar2);
                z2 = true;
            } else {
                b(pnhVar2);
                z2 = false;
            }
            pnhVar2.c.add(this);
            o(pnhVar2);
            if (z2) {
                f(this.f, view, pnhVar2);
            } else {
                f(this.g, view, pnhVar2);
            }
            i2++;
        }
    }

    final void q(boolean z) {
        if (z) {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.g();
        } else {
            this.g.a.clear();
            this.g.b.clear();
            this.g.c.g();
        }
    }

    public void r(ViewGroup viewGroup, pni pniVar, pni pniVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        pnh pnhVar;
        pnh pnhVar2;
        csq csqVarH = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        pmo pmoVar = j().t;
        for (int i = 0; i < size; i++) {
            pnh pnhVar3 = (pnh) arrayList.get(i);
            pnh pnhVar4 = (pnh) arrayList2.get(i);
            if (pnhVar3 != null && !pnhVar3.c.contains(this)) {
                pnhVar3 = null;
            }
            if (pnhVar4 != null && !pnhVar4.c.contains(this)) {
                pnhVar4 = null;
            }
            if ((pnhVar3 != null || pnhVar4 != null) && (pnhVar3 == null || pnhVar4 == null || D(pnhVar3, pnhVar4))) {
                Animator animatorA = a(viewGroup, pnhVar3, pnhVar4);
                if (animatorA != null) {
                    if (pnhVar4 != null) {
                        view = pnhVar4.b;
                        String[] strArrE = e();
                        if (strArrE != null) {
                            pnh pnhVar5 = new pnh(view);
                            pnh pnhVar6 = (pnh) pniVar2.a.get(view);
                            animator = animatorA;
                            if (pnhVar6 != null) {
                                int i2 = 0;
                                while (i2 < strArrE.length) {
                                    Map map = pnhVar5.a;
                                    String[] strArr = strArrE;
                                    String str = strArr[i2];
                                    map.put(str, pnhVar6.a.get(str));
                                    i2++;
                                    strArrE = strArr;
                                }
                            }
                            int i3 = csqVarH.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    pnhVar2 = pnhVar5;
                                    break;
                                }
                                pml pmlVar = (pml) csqVarH.get((Animator) csqVarH.d(i4));
                                pnh pnhVar7 = pmlVar.c;
                                if (pnhVar7 != null && pmlVar.a == view && pmlVar.b.equals(this.z) && pnhVar7.equals(pnhVar5)) {
                                    pnhVar2 = pnhVar5;
                                    animator = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator = animatorA;
                            pnhVar2 = null;
                        }
                        pnhVar = pnhVar2;
                    } else {
                        animator = animatorA;
                        view = pnhVar3.b;
                        pnhVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        pml pmlVar2 = new pml(view2, this.z, this, viewGroup.getWindowId(), pnhVar, animator2);
                        if (pmoVar != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            animator2 = animatorSet;
                        }
                        csqVarH.put(animator2, pmlVar2);
                        this.p.add(animator2);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                pml pmlVar3 = (pml) csqVarH.get((Animator) this.p.get(sparseIntArray.keyAt(i5)));
                long jValueAt = sparseIntArray.valueAt(i5);
                Animator animator3 = pmlVar3.f;
                animator3.setStartDelay((jValueAt - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    protected final void s() {
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            t(this, pmw.b, false);
            for (int i2 = 0; i2 < this.f.c.b(); i2++) {
                View view = (View) this.f.c.e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.g.c.b(); i3++) {
                View view2 = (View) this.g.c.e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.n = true;
        }
    }

    public final void t(pmx pmxVar, pmw pmwVar, boolean z) {
        pmx pmxVar2 = this.o;
        if (pmxVar2 != null) {
            pmxVar2.t(pmxVar, pmwVar, z);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.E.size();
        pmq[] pmqVarArr = this.B;
        if (pmqVarArr == null) {
            pmqVarArr = new pmq[size];
        }
        this.B = null;
        pmq[] pmqVarArr2 = (pmq[]) this.E.toArray(pmqVarArr);
        for (int i = 0; i < size; i++) {
            pmwVar.a(pmqVarArr2[i], pmxVar);
            pmqVarArr2[i] = null;
        }
        this.B = pmqVarArr2;
    }

    public final String toString() {
        return m("");
    }

    public void u(View view) {
        if (this.n) {
            return;
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        while (true) {
            size--;
            if (size < 0) {
                this.C = animatorArr;
                t(this, pmw.d, false);
                this.D = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public void v() {
        csq csqVarH = h();
        this.s = 0L;
        for (int i = 0; i < this.p.size(); i++) {
            Animator animator = (Animator) this.p.get(i);
            pml pmlVar = (pml) csqVarH.get(animator);
            if (animator != null && pmlVar != null) {
                long j = this.b;
                if (j >= 0) {
                    pmlVar.f.setDuration(j);
                }
                long j2 = this.a;
                if (j2 >= 0) {
                    Animator animator2 = pmlVar.f;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                TimeInterpolator timeInterpolator = this.c;
                if (timeInterpolator != null) {
                    pmlVar.f.setInterpolator(timeInterpolator);
                }
                this.l.add(animator);
                this.s = Math.max(this.s, animator.getTotalDuration());
            }
        }
        this.p.clear();
    }

    public void w(View view) {
        if (this.D) {
            if (!this.n) {
                ArrayList arrayList = this.l;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
                this.C = v;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.C = animatorArr;
                t(this, pmw.e, false);
            }
            this.D = false;
        }
    }

    protected void x() {
        B();
        csq csqVarH = h();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (csqVarH.containsKey(animator)) {
                B();
                if (animator != null) {
                    animator.addListener(new pmj(this, csqVarH));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new pmk(this));
                    animator.start();
                }
            }
        }
        this.p.clear();
        s();
    }

    public void y(long j, long j2) {
        long j3 = this.s;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.n = false;
            t(this, pmw.a, z);
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.C);
        this.C = v;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.C = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.n = true;
        }
        t(this, pmw.b, z);
    }

    public void z(pmm pmmVar) {
        this.q = pmmVar;
    }

    public void M() {
    }

    public void o(pnh pnhVar) {
    }
}
