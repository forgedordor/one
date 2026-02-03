package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class df extends hd {
    public final List a;
    public final hi b;
    public final hi c;
    public final gp d;
    public final csq e;
    public Object f;
    public boolean g;
    private final Object j;
    private final ArrayList k;
    private final ArrayList l;
    private final csq m;
    private final ArrayList n;
    private final ArrayList o;
    private final csq p;
    private final lac q = new lac();

    public df(List list, hi hiVar, hi hiVar2, gp gpVar, Object obj, ArrayList arrayList, ArrayList arrayList2, csq csqVar, ArrayList arrayList3, ArrayList arrayList4, csq csqVar2, csq csqVar3) {
        this.a = list;
        this.b = hiVar;
        this.c = hiVar2;
        this.d = gpVar;
        this.j = obj;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = csqVar;
        this.n = arrayList3;
        this.o = arrayList4;
        this.p = csqVar2;
        this.e = csqVar3;
    }

    private final fcti g(ViewGroup viewGroup, hi hiVar, hi hiVar2) {
        Object obj;
        final ArrayList arrayList;
        Object obj2;
        hi hiVar3 = hiVar;
        View view = new View(viewGroup.getContext());
        final Rect rect = new Rect();
        List list = this.a;
        Iterator it = list.iterator();
        boolean z = false;
        View view2 = null;
        while (it.hasNext()) {
            if (((dg) it.next()).c() && hiVar2 != null && hiVar3 != null && !this.m.isEmpty() && (obj2 = this.j) != null) {
                csq csqVar = this.p;
                gp gpVar = gh.a;
                ldq.b(viewGroup, new Runnable() { // from class: cw
                    @Override // java.lang.Runnable
                    public final void run() {
                        gp gpVar2 = gh.a;
                    }
                });
                ArrayList arrayList2 = this.k;
                arrayList2.addAll(csqVar.values());
                ArrayList arrayList3 = this.o;
                if (!arrayList3.isEmpty()) {
                    Object obj3 = arrayList3.get(0);
                    obj3.getClass();
                    view2 = (View) csqVar.get((String) obj3);
                    this.d.i(obj2, view2);
                }
                ArrayList arrayList4 = this.l;
                csq csqVar2 = this.e;
                arrayList4.addAll(csqVar2.values());
                ArrayList arrayList5 = this.n;
                if (!arrayList5.isEmpty()) {
                    Object obj4 = arrayList5.get(0);
                    obj4.getClass();
                    final View view3 = (View) csqVar2.get((String) obj4);
                    if (view3 != null) {
                        ldq.b(viewGroup, new Runnable() { // from class: cx
                            @Override // java.lang.Runnable
                            public final void run() {
                                gp.y(view3, rect);
                            }
                        });
                        z = true;
                    }
                }
                gp gpVar2 = this.d;
                gpVar2.j(obj2, view, arrayList2);
                gpVar2.p(obj2, null, null, obj2, arrayList4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        Object objO = null;
        while (it2.hasNext()) {
            dg dgVar = (dg) it2.next();
            hi hiVar4 = dgVar.a;
            gp gpVar3 = this.d;
            Object objA = gpVar3.a(dgVar.b);
            if (objA != null) {
                Iterator it3 = it2;
                ArrayList arrayList7 = new ArrayList();
                boolean z2 = z;
                ea eaVar = hiVar4.a;
                Object obj5 = objO;
                View view4 = eaVar.Q;
                view4.getClass();
                h(arrayList7, view4);
                if (this.j != null && (hiVar4 == hiVar2 || hiVar4 == hiVar3)) {
                    if (hiVar4 == hiVar2) {
                        arrayList7.removeAll(fcva.av(this.k));
                    } else {
                        arrayList7.removeAll(fcva.av(this.l));
                    }
                }
                if (arrayList7.isEmpty()) {
                    gpVar3.c(objA, view);
                    arrayList = arrayList7;
                    obj = objA;
                } else {
                    gpVar3.d(objA, arrayList7);
                    gpVar3.p(objA, objA, arrayList7, null, null);
                    obj = objA;
                    arrayList = arrayList7;
                    if (hiVar4.h == 3) {
                        hiVar4.g();
                        ArrayList arrayList8 = new ArrayList(arrayList);
                        arrayList8.remove(eaVar.Q);
                        gpVar3.g(obj, eaVar.Q, arrayList8);
                        ldq.b(viewGroup, new Runnable() { // from class: cy
                            @Override // java.lang.Runnable
                            public final void run() {
                                gh.a(arrayList, 4);
                            }
                        });
                    }
                }
                if (hiVar4.h == 2) {
                    arrayList6.addAll(arrayList);
                    if (z2) {
                        gpVar3.h(obj, rect);
                    }
                    if (fr.ad(2)) {
                        Objects.toString(obj);
                        Log.v("FragmentManager", "Entering Transition: ".concat(obj.toString()));
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        Iterator it4 = arrayList.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            View view5 = (View) next;
                            Objects.toString(view5);
                            Log.v("FragmentManager", "View: ".concat(view5.toString()));
                        }
                    }
                } else {
                    gpVar3.i(obj, view2);
                    if (fr.ad(2)) {
                        Objects.toString(obj);
                        Log.v("FragmentManager", "Exiting Transition: ".concat(obj.toString()));
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        Iterator it5 = arrayList.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            next2.getClass();
                            View view6 = (View) next2;
                            Objects.toString(view6);
                            Log.v("FragmentManager", "View: ".concat(view6.toString()));
                        }
                    }
                }
                boolean z3 = dgVar.c;
                objO = gpVar3.o(obj5, obj);
                hiVar3 = hiVar;
                it2 = it3;
                z = z2;
            } else {
                hiVar3 = hiVar;
            }
        }
        Object objR = this.d.r(objO, this.j);
        if (fr.ad(2)) {
            Log.v("FragmentManager", a.i(viewGroup, objR, "Final merged transition: ", " for container "));
        }
        return new fcti(arrayList6, objR);
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = lfc.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, fdae fdaeVar) {
        gh.a(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.l;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = ley.a;
            arrayList2.add(len.f(view));
            len.l(view, null);
        }
        if (fr.ad(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = this.k.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                int[] iArr2 = ley.a;
                sb.append(len.f(view2));
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                int[] iArr3 = ley.a;
                sb2.append(len.f(view3));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        fdaeVar.invoke();
        gp gpVar = this.d;
        ArrayList arrayList4 = this.k;
        csq csqVar = this.m;
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            int[] iArr4 = ley.a;
            String strF = len.f(view4);
            arrayList5.add(strF);
            if (strF != null) {
                len.l(view4, null);
                String str = (String) csqVar.get(strF);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        len.l((View) arrayList3.get(i3), strF);
                        break;
                    }
                    i3++;
                }
            }
        }
        ldq.b(viewGroup, new go(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        gh.a(arrayList, 0);
        gpVar.k(this.j, arrayList4, arrayList3);
    }

    @Override // defpackage.hd
    public final void a(ViewGroup viewGroup) {
        this.q.a();
    }

    @Override // defpackage.hd
    public final void b(final ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut() || this.g) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                hi hiVar = ((dg) it.next()).a;
                if (fr.ad(2)) {
                    if (this.g) {
                        Objects.toString(hiVar);
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation ".concat(hiVar.toString()));
                    } else {
                        Log.v("FragmentManager", a.i(hiVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Completing operation "));
                    }
                }
                hiVar.f(this);
            }
            this.g = false;
            return;
        }
        Object obj = this.f;
        if (obj != null) {
            this.d.t(obj);
            if (fr.ad(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + this.b + " to " + this.c);
                return;
            }
            return;
        }
        hi hiVar2 = this.c;
        hi hiVar3 = this.b;
        fcti fctiVarG = g(viewGroup, hiVar2, hiVar3);
        Object obj2 = fctiVarG.a;
        final Object obj3 = fctiVarG.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<hi> arrayList2 = new ArrayList(fcva.p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((dg) it2.next()).a);
        }
        for (final hi hiVar4 : arrayList2) {
            gp gpVar = this.d;
            ea eaVar = hiVar4.a;
            gpVar.q(obj3, this.q, new Runnable() { // from class: cz
                @Override // java.lang.Runnable
                public final void run() {
                    hi hiVar5 = hiVar4;
                    if (fr.ad(2)) {
                        Log.v("FragmentManager", a.h(hiVar5, "Transition for operation ", " has completed"));
                    }
                    hiVar5.f(this);
                }
            });
        }
        i(arrayList, viewGroup, new fdae() { // from class: da
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.d.e(viewGroup, obj3);
                return fctx.a;
            }
        });
        if (fr.ad(2)) {
            Log.v("FragmentManager", a.i(hiVar2, hiVar3, "Completed executing operations from ", " to "));
        }
    }

    @Override // defpackage.hd
    public final void c(final ViewGroup viewGroup) {
        Object obj;
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                hi hiVar = ((dg) it.next()).a;
                if (fr.ad(2)) {
                    Log.v("FragmentManager", a.i(hiVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Skipping onStart for operation "));
                }
            }
            return;
        }
        if (f() && (obj = this.j) != null && !d()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (d() && f()) {
            final fdci fdciVar = new fdci();
            fcti fctiVarG = g(viewGroup, this.c, this.b);
            Object obj2 = fctiVarG.a;
            final Object obj3 = fctiVarG.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj2;
            ArrayList<hi> arrayList2 = new ArrayList(fcva.p(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((dg) it2.next()).a);
            }
            for (final hi hiVar2 : arrayList2) {
                Runnable runnable = new Runnable() { // from class: db
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdae fdaeVar = (fdae) fdciVar.a;
                        if (fdaeVar != null) {
                            fdaeVar.invoke();
                        }
                    }
                };
                gp gpVar = this.d;
                ea eaVar = hiVar2.a;
                gpVar.z(obj3, this.q, runnable, new Runnable() { // from class: dc
                    @Override // java.lang.Runnable
                    public final void run() {
                        hi hiVar3 = hiVar2;
                        if (fr.ad(2)) {
                            Log.v("FragmentManager", a.h(hiVar3, "Transition for operation ", " has completed"));
                        }
                        hiVar3.f(this);
                    }
                });
            }
            i(arrayList, viewGroup, new fdae() { // from class: dd
                @Override // defpackage.fdae
                public final Object invoke() {
                    if (fr.ad(2)) {
                        Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                    }
                    final Object obj4 = obj3;
                    final ViewGroup viewGroup2 = viewGroup;
                    final df dfVar = this.a;
                    dfVar.f = dfVar.d.s(viewGroup2, obj4);
                    if (dfVar.f == null) {
                        if (fr.ad(2)) {
                            Log.v("FragmentManager", "TransitionSeekController was not created.");
                        }
                        dfVar.g = true;
                        return fctx.a;
                    }
                    fdciVar.a = new fdae() { // from class: cu
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
                        @Override // defpackage.fdae
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r6 = this;
                                df r0 = r1
                                java.util.List r1 = r0.a
                                boolean r2 = r1.isEmpty()
                                java.lang.String r3 = "FragmentManager"
                                r4 = 2
                                if (r2 == 0) goto Le
                                goto L4d
                            Le:
                                java.util.Iterator r2 = r1.iterator()
                            L12:
                                boolean r5 = r2.hasNext()
                                if (r5 == 0) goto L4d
                                java.lang.Object r5 = r2.next()
                                dg r5 = (defpackage.dg) r5
                                hi r5 = r5.a
                                boolean r5 = r5.d
                                if (r5 != 0) goto L12
                                boolean r2 = defpackage.fr.ad(r4)
                                if (r2 == 0) goto L2f
                                java.lang.String r2 = "Completing animating immediately"
                                android.util.Log.v(r3, r2)
                            L2f:
                                java.lang.Object r2 = r2
                                lac r3 = new lac
                                r3.<init>()
                                gp r4 = r0.d
                                r5 = 0
                                java.lang.Object r1 = r1.get(r5)
                                dg r1 = (defpackage.dg) r1
                                hi r1 = r1.a
                                cv r1 = new cv
                                r1.<init>()
                                r4.q(r2, r3, r1)
                                r3.a()
                                goto L69
                            L4d:
                                boolean r1 = defpackage.fr.ad(r4)
                                if (r1 == 0) goto L58
                                java.lang.String r1 = "Animating to start"
                                android.util.Log.v(r3, r1)
                            L58:
                                android.view.ViewGroup r1 = r3
                                gp r2 = r0.d
                                java.lang.Object r3 = r0.f
                                r3.getClass()
                                de r4 = new de
                                r4.<init>()
                                r2.u(r3, r4)
                            L69:
                                fctx r0 = defpackage.fctx.a
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cu.invoke():java.lang.Object");
                        }
                    };
                    if (fr.ad(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + dfVar.b + " to " + dfVar.c);
                    }
                    return fctx.a;
                }
            });
        }
    }

    @Override // defpackage.hd
    public final boolean d() {
        Object obj;
        gp gpVar = this.d;
        if (!gpVar.m()) {
            return false;
        }
        List<dg> list = this.a;
        if (!list.isEmpty()) {
            for (dg dgVar : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = dgVar.b) == null || !gpVar.n(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.j;
        return obj2 == null || gpVar.n(obj2);
    }

    @Override // defpackage.hd
    public final void e(aao aaoVar) {
        Object obj = this.f;
        if (obj != null) {
            this.d.w(obj, aaoVar.b);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((dg) it.next()).a.a.t) {
                return false;
            }
        }
        return true;
    }
}
