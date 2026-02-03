package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
@okx(a = "fragment")
/* loaded from: classes.dex */
public class oma extends oky<olx> {
    public final fr b;
    private final Context f;
    private final int g;
    private final Set h = new LinkedHashSet();
    public final List c = new ArrayList();
    public final lvh d = new lvh() { // from class: olu
        @Override // defpackage.lvh
        public final void gL(lvj lvjVar, lva lvaVar) {
            if (lvaVar == lva.ON_DESTROY) {
                oma omaVar = this.a;
                ea eaVar = (ea) lvjVar;
                Object obj = null;
                for (Object obj2 : (Iterable) omaVar.f().h.c()) {
                    if (fdbq.f(((oip) obj2).d, eaVar.H)) {
                        obj = obj2;
                    }
                }
                oip oipVar = (oip) obj;
                if (oipVar != null) {
                    if (oma.l()) {
                        Log.v("FragmentNavigator", a.j(lvjVar, oipVar, "Marking transition complete for entry ", " due to fragment ", " lifecycle reaching DESTROYED"));
                    }
                    omaVar.f().c(oipVar);
                }
            }
        }
    };
    public final fdap e = new fdap() { // from class: olv
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            final oip oipVar = (oip) obj;
            oipVar.getClass();
            final oma omaVar = this.a;
            return new lvh() { // from class: olo
                @Override // defpackage.lvh
                public final void gL(lvj lvjVar, lva lvaVar) {
                    oma omaVar2 = omaVar;
                    oip oipVar2 = oipVar;
                    if (lvaVar == lva.ON_RESUME && ((List) omaVar2.f().g.c()).contains(oipVar2)) {
                        if (oma.l()) {
                            Log.v("FragmentNavigator", a.j(lvjVar, oipVar2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching RESUMED"));
                        }
                        omaVar2.f().c(oipVar2);
                    }
                    if (lvaVar == lva.ON_DESTROY) {
                        if (oma.l()) {
                            Log.v("FragmentNavigator", a.j(lvjVar, oipVar2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching DESTROYED"));
                        }
                        omaVar2.f().c(oipVar2);
                    }
                }
            };
        }
    };

    public oma(Context context, fr frVar, int i) {
        this.f = context;
        this.b = frVar;
        this.g = i;
    }

    static /* synthetic */ void k(oma omaVar, final String str, boolean z, int i) {
        if ((i & 4) != 0) {
            fcva.x(omaVar.c, new fdap() { // from class: olr
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    fcti fctiVar = (fcti) obj;
                    fctiVar.getClass();
                    return Boolean.valueOf(fdbq.f(fctiVar.a, str));
                }
            });
        }
        omaVar.c.add(new fcti(str, Boolean.valueOf(z & ((i & 2) == 0))));
    }

    public static final boolean l() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    public static final void m(final ea eaVar, final olb olbVar) {
        lxp lxpVarS = eaVar.S();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fdap fdapVar = new fdap() { // from class: ols
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((lyp) obj).getClass();
                return new olw();
            }
        };
        int i = fdcj.a;
        lyr.b(new fdbi(olw.class), fdapVar, linkedHashMap);
        ((olw) new lxo(lxpVarS, lyr.a(linkedHashMap), lyn.a).a(olw.class)).a = new WeakReference(new fdae() { // from class: olt
            @Override // defpackage.fdae
            public final Object invoke() {
                olb olbVar2 = olbVar;
                for (oip oipVar : (Iterable) olbVar2.h.c()) {
                    if (oma.l()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + oipVar + " due to fragment " + eaVar + " viewmodel being cleared");
                    }
                    olbVar2.c(oipVar);
                }
                return fctx.a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.gg n(defpackage.oip r8, defpackage.okg r9) {
        /*
            r7 = this;
            ojx r0 = r8.a
            r0.getClass()
            olx r0 = (defpackage.olx) r0
            android.os.Bundle r1 = r8.a()
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L87
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L26
            android.content.Context r3 = r7.f
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r3.concat(r0)
        L26:
            fr r3 = r7.b
            android.content.Context r4 = r7.f
            em r5 = r3.k()
            r4.getClassLoader()
            ea r0 = r5.b(r0)
            r0.getClass()
            r0.at(r1)
            cg r1 = new cg
            r1.<init>(r3)
            r3 = -1
            if (r9 == 0) goto L46
            int r4 = r9.f
            goto L47
        L46:
            r4 = r3
        L47:
            if (r9 == 0) goto L4c
            int r5 = r9.g
            goto L4d
        L4c:
            r5 = r3
        L4d:
            if (r9 == 0) goto L52
            int r6 = r9.h
            goto L53
        L52:
            r6 = r3
        L53:
            if (r9 == 0) goto L58
            int r9 = r9.i
            goto L59
        L58:
            r9 = r3
        L59:
            if (r4 != r3) goto L69
            if (r5 != r3) goto L68
            if (r6 != r3) goto L65
            if (r9 == r3) goto L79
            r4 = r3
            r5 = r4
            r6 = r5
            goto L69
        L65:
            r4 = r3
            r5 = r4
            goto L69
        L68:
            r4 = r3
        L69:
            if (r4 != r3) goto L6c
            r4 = r2
        L6c:
            if (r5 != r3) goto L6f
            r5 = r2
        L6f:
            if (r6 != r3) goto L72
            r6 = r2
        L72:
            if (r9 != r3) goto L75
            goto L76
        L75:
            r2 = r9
        L76:
            r1.z(r4, r5, r6, r2)
        L79:
            int r9 = r7.g
            java.lang.String r8 = r8.d
            r1.x(r9, r0, r8)
            r1.p(r0)
            r1.A()
            return r1
        L87:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Fragment class was not set"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oma.n(oip, okg):gg");
    }

    @Override // defpackage.oky
    public final /* synthetic */ ojx a() {
        return new olx(this);
    }

    @Override // defpackage.oky
    public final void d(List list, okg okgVar) {
        fr frVar = this.b;
        if (frVar.ag()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oip oipVar = (oip) it.next();
            boolean zIsEmpty = ((List) f().g.c()).isEmpty();
            if (okgVar != null && !zIsEmpty && okgVar.b) {
                Set set = this.h;
                String str = oipVar.d;
                if (set.remove(str)) {
                    frVar.M(new fp(frVar, str), false);
                    f().h(oipVar);
                }
            }
            gg ggVarN = n(oipVar, okgVar);
            if (!zIsEmpty) {
                oip oipVar2 = (oip) fcva.T((List) f().g.c());
                if (oipVar2 != null) {
                    k(this, oipVar2.d, false, 6);
                }
                String str2 = oipVar.d;
                k(this, str2, false, 6);
                ggVarN.v(str2);
            }
            ggVarN.j();
            if (l()) {
                Objects.toString(oipVar);
                Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry ".concat(String.valueOf(oipVar)));
            }
            f().h(oipVar);
        }
    }

    @Override // defpackage.oky
    public final Bundle e() {
        Set set = this.h;
        if (set.isEmpty()) {
            return null;
        }
        return lab.a(new fcti("androidx-nav-fragment:navigator:savedIds", new ArrayList(set)));
    }

    @Override // defpackage.oky
    public final void g(final olb olbVar) {
        super.g(olbVar);
        if (l()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        fr frVar = this.b;
        frVar.q(new fx() { // from class: olq
            @Override // defpackage.fx
            public final void h(final ea eaVar) {
                Object objPrevious;
                olb olbVar2 = olbVar;
                List list = (List) olbVar2.g.c();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (fdbq.f(((oip) objPrevious).d, eaVar.H)) {
                            break;
                        }
                    }
                }
                final oma omaVar = this;
                final oip oipVar = (oip) objPrevious;
                if (oma.l()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + eaVar + " associated with entry " + oipVar + " to FragmentManager " + omaVar.b);
                }
                if (oipVar != null) {
                    eaVar.ab.f(eaVar, new olz(new fdap() { // from class: oln
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lvi] */
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ea eaVar2 = eaVar;
                            oma omaVar2 = omaVar;
                            List list2 = omaVar2.c;
                            lvj lvjVar = (lvj) obj;
                            boolean z = false;
                            if (!list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (fdbq.f(((fcti) it.next()).a, eaVar2.H)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (lvjVar != null && !z) {
                                lvc lvcVarP = eaVar2.Q().P();
                                if (((lvn) lvcVarP).c.a(lvb.c)) {
                                    lvcVarP.c(omaVar2.e.invoke(oipVar));
                                }
                            }
                            return fctx.a;
                        }
                    }));
                    eaVar.P().c(omaVar.d);
                    oma.m(eaVar, olbVar2);
                }
            }
        });
        frVar.r(new oly(olbVar, this));
    }

    @Override // defpackage.oky
    public final void h(oip oipVar) {
        oipVar.getClass();
        fr frVar = this.b;
        if (frVar.ag()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        gg ggVarN = n(oipVar, null);
        List list = (List) f().g.c();
        if (list.size() > 1) {
            oip oipVar2 = (oip) fcva.Q(list, fcva.e(list) - 1);
            if (oipVar2 != null) {
                k(this, oipVar2.d, false, 6);
            }
            String str = oipVar.d;
            k(this, str, true, 4);
            frVar.ap(str);
            k(this, str, false, 2);
            ggVarN.v(str);
        }
        ggVarN.j();
        f().f(oipVar);
    }

    @Override // defpackage.oky
    public final void i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            Set set = this.h;
            set.clear();
            fcva.y(set, stringArrayList);
        }
    }

    @Override // defpackage.oky
    public final void j(oip oipVar, boolean z) {
        fr frVar = this.b;
        if (frVar.ag()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) f().g.c();
        int iIndexOf = list.indexOf(oipVar);
        List listSubList = list.subList(iIndexOf, list.size());
        oip oipVar2 = (oip) fcva.N(list);
        oip oipVar3 = (oip) fcva.Q(list, iIndexOf - 1);
        if (oipVar3 != null) {
            k(this, oipVar3.d, false, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            fdev fdevVarJ = fdey.j(fcva.ax(this.c), new fdap() { // from class: olp
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    fcti fctiVar = (fcti) obj2;
                    fctiVar.getClass();
                    return (String) fctiVar.a;
                }
            });
            String str = ((oip) obj).d;
            fdft fdftVar = new fdft((fdfu) fdevVarJ);
            int i = 0;
            while (true) {
                if (!fdftVar.hasNext()) {
                    break;
                }
                Object next = fdftVar.next();
                if (i < 0) {
                    fcva.m();
                }
                if (!fdbq.f(str, next)) {
                    i++;
                } else if (i >= 0) {
                }
            }
            if (!fdbq.f(str, oipVar2.d)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((oip) it.next()).d, true, 4);
        }
        if (z) {
            for (oip oipVar4 : fcva.aj(listSubList)) {
                if (fdbq.f(oipVar4, oipVar2)) {
                    Objects.toString(oipVar4);
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination ".concat(String.valueOf(oipVar4)));
                } else {
                    String str2 = oipVar4.d;
                    frVar.M(new fq(frVar, str2), false);
                    this.h.add(str2);
                }
            }
        } else {
            frVar.ap(oipVar.d);
        }
        if (l()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + oipVar + " with savedState " + z);
        }
        f().g(oipVar, z);
    }
}
