package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fr {
    private ArrayList A;
    private final lbz C;
    private final lbz D;
    private final lbz E;
    private final lbz F;
    private final em G;
    private adj H;
    private adj I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final fa O;
    private final fc P;
    public ace e;
    final ArrayList k;
    public final er l;
    public final CopyOnWriteArrayList m;
    int n;
    public en o;
    public ek p;
    public ea q;
    ea r;
    public adj s;
    ArrayDeque t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public fw y;
    private boolean z;
    public final ArrayList a = new ArrayList();
    public final ge b = new ge();
    ArrayList c = new ArrayList();
    public final ep d = new ep(this);
    cg f = null;
    boolean g = false;
    public final abs h = new ez(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = DesugarCollections.synchronizedMap(new HashMap());
    private final Map B = DesugarCollections.synchronizedMap(new HashMap());

    public fr() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.k = new ArrayList();
        this.l = new er(this);
        this.m = new CopyOnWriteArrayList();
        this.C = new lbz() { // from class: eu
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                fr frVar = this.a;
                Configuration configuration = (Configuration) obj;
                if (frVar.ae()) {
                    frVar.w(configuration, false);
                }
            }
        };
        this.D = new lbz() { // from class: ev
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                fr frVar = this.a;
                Integer num = (Integer) obj;
                if (frVar.ae() && num.intValue() == 80) {
                    frVar.z(false);
                }
            }
        };
        this.E = new lbz() { // from class: ew
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                fr frVar = this.a;
                gw gwVar = (gw) obj;
                if (frVar.ae()) {
                    frVar.A(gwVar.a, false);
                }
            }
        };
        this.F = new lbz() { // from class: ex
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                fr frVar = this.a;
                gz gzVar = (gz) obj;
                if (frVar.ae()) {
                    frVar.F(gzVar.a, false);
                }
            }
        };
        this.O = new fa(this);
        this.n = -1;
        this.G = new fb(this);
        this.P = new fc();
        this.t = new ArrayDeque();
        this.N = new fd(this);
    }

    private final void aA() {
        Iterator it = au().iterator();
        while (it.hasNext()) {
            boolean z = ((hj) it.next()).f;
        }
    }

    private final void aB(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((cg) arrayList.get(i)).t) {
                if (i2 != i) {
                    az(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((cg) arrayList.get(i2)).t) {
                        i2++;
                    }
                }
                az(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            az(arrayList, arrayList2, i2, size);
        }
    }

    private final void aC(ea eaVar) {
        ViewGroup viewGroupAt = at(eaVar);
        if (viewGroupAt == null || eaVar.v() + eaVar.w() + eaVar.x() + eaVar.y() <= 0) {
            return;
        }
        if (viewGroupAt.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAt.setTag(R.id.visible_removing_fragment_view_tag, eaVar);
        }
        ((ea) viewGroupAt.getTag(R.id.visible_removing_fragment_view_tag)).az(eaVar.aE());
    }

    private final void aD() {
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            R((gc) it.next());
        }
    }

    public static boolean ad(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set am(cg cgVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = cgVar.e;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            ea eaVar = ((gf) arrayList.get(i)).b;
            if (eaVar != null && cgVar.k) {
                hashSet.add(eaVar);
            }
            i++;
        }
    }

    public static final boolean an(ea eaVar) {
        if (eaVar.M && eaVar.N) {
            return true;
        }
        boolean zAn = false;
        for (ea eaVar2 : eaVar.D.b.f()) {
            if (eaVar2 != null) {
                zAn = an(eaVar2);
            }
            if (zAn) {
                return true;
            }
        }
        return false;
    }

    static final boolean ao(ea eaVar) {
        if (eaVar == null) {
            return true;
        }
        if (eaVar.N) {
            return eaVar.B == null || ao(eaVar.E);
        }
        return false;
    }

    static final void ar(ea eaVar) {
        if (ad(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.I) {
            eaVar.I = false;
            eaVar.U = !eaVar.U;
        }
    }

    private final ViewGroup at(ea eaVar) {
        ViewGroup viewGroup = eaVar.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (eaVar.G <= 0 || !this.p.b()) {
            return null;
        }
        View viewA = this.p.a(eaVar.G);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set au() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((gc) it.next()).a.P;
            if (viewGroup != null) {
                hashSet.add(hc.a(viewGroup, ak()));
            }
        }
        return hashSet;
    }

    private final void av() {
        if (ag()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void aw() {
        this.z = false;
        this.L.clear();
        this.K.clear();
    }

    private final void ax() {
        if (this.J) {
            this.J = false;
            aD();
        }
    }

    private final void ay(boolean z) {
        if (this.z) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.o == null) {
            if (!this.x) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.o.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            av();
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0228 A[PHI: r13
      0x0228: PHI (r13v39 int) = (r13v38 int), (r13v40 int) binds: [B:100:0x0218, B:105:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void az(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.az(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public static ea f(View view) {
        ea eaVarI = i(view);
        if (eaVarI != null) {
            return eaVarI;
        }
        throw new IllegalStateException(a.h(view, "View ", " does not have a Fragment set"));
    }

    static ea i(View view) {
        while (view != null) {
            ea eaVarJ = j(view);
            if (eaVarJ != null) {
                return eaVarJ;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static ea j(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ea) {
            return (ea) tag;
        }
        return null;
    }

    public static fr l(View view) {
        eg egVar;
        ea eaVarI = i(view);
        if (eaVarI != null) {
            if (eaVarI.aF()) {
                return eaVarI.I();
            }
            throw new IllegalStateException(a.j(view, eaVarI, "The Fragment ", " that owns View ", " has already been destroyed. Nested fragments should always use the child FragmentManager."));
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                egVar = null;
                break;
            }
            if (context instanceof eg) {
                egVar = (eg) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (egVar != null) {
            return egVar.a();
        }
        throw new IllegalStateException(a.h(view, "View ", " is not within a subclass of FragmentActivity."));
    }

    final void A(boolean z, boolean z2) {
        if (z2 && (this.o instanceof gx)) {
            X(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.al(z);
                if (z2) {
                    eaVar.D.A(z, true);
                }
            }
        }
    }

    final void B() {
        for (ea eaVar : this.b.f()) {
            if (eaVar != null) {
                eaVar.D.B();
            }
        }
    }

    public final void C(Menu menu) {
        if (this.n <= 0) {
            return;
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && !eaVar.I) {
                eaVar.D.C(menu);
            }
        }
    }

    public final void D(ea eaVar) {
        if (eaVar == null || !eaVar.equals(e(eaVar.l))) {
            return;
        }
        boolean zAf = eaVar.B.af(eaVar);
        Boolean bool = eaVar.q;
        if (bool == null || bool.booleanValue() != zAf) {
            eaVar.q = Boolean.valueOf(zAf);
            fr frVar = eaVar.D;
            frVar.Y();
            frVar.D(frVar.r);
        }
    }

    final void E() {
        I(5);
    }

    final void F(boolean z, boolean z2) {
        if (z2 && (this.o instanceof gy)) {
            X(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.an(z);
                if (z2) {
                    eaVar.D.F(z, true);
                }
            }
        }
    }

    final void G() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        I(7);
    }

    final void H() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        I(5);
    }

    public final void I(int i) {
        try {
            this.z = true;
            for (gc gcVar : this.b.b.values()) {
                if (gcVar != null) {
                    gcVar.b = i;
                }
            }
            P(i, false);
            Iterator it = au().iterator();
            while (it.hasNext()) {
                ((hj) it.next()).g();
            }
            this.z = false;
            as(true);
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    final void J() {
        this.w = true;
        this.y.g = true;
        I(4);
    }

    public final void K(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        ge geVar = this.b;
        HashMap map = geVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (gc gcVar : map.values()) {
                printWriter.print(str);
                if (gcVar != null) {
                    String strValueOf = String.valueOf(str);
                    ea eaVar = gcVar.a;
                    printWriter.println(eaVar);
                    eaVar.ac(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = geVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                ea eaVar2 = (ea) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(eaVar2.toString());
            }
        }
        ArrayList arrayList2 = this.A;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                ea eaVar3 = (ea) this.A.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(eaVar3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                cg cgVar = (cg) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(cgVar.toString());
                cgVar.f(strValueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (fm) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    public final void L() {
        Iterator it = au().iterator();
        while (it.hasNext()) {
            ((hj) it.next()).g();
        }
    }

    public final void M(fm fmVar, boolean z) {
        if (!z) {
            if (this.o == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            av();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(fmVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    Handler handler = this.o.d;
                    Runnable runnable = this.N;
                    handler.removeCallbacks(runnable);
                    this.o.d.post(runnable);
                    Y();
                }
            }
        }
    }

    final void N(fm fmVar, boolean z) {
        if (z && (this.o == null || this.x)) {
            return;
        }
        ay(z);
        cg cgVar = this.f;
        if (cgVar != null) {
            cgVar.b = false;
            cgVar.b();
            if (ad(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execSingleAction for action " + fmVar);
            }
            this.f.n(false, false);
            this.f.h(this.K, this.L);
            ArrayList arrayList = this.f.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ea eaVar = ((gf) arrayList.get(i)).b;
                if (eaVar != null) {
                    eaVar.t = false;
                }
            }
            this.f = null;
        }
        fmVar.h(this.K, this.L);
        this.z = true;
        try {
            aB(this.K, this.L);
            aw();
            Y();
            ax();
            this.b.i();
        } catch (Throwable th) {
            aw();
            throw th;
        }
    }

    final void O(ea eaVar) {
        if (ad(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.I) {
            return;
        }
        eaVar.I = true;
        eaVar.U = true ^ eaVar.U;
        aC(eaVar);
    }

    final void P(int i, boolean z) {
        en enVar;
        if (this.o == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.n) {
            this.n = i;
            ge geVar = this.b;
            ArrayList arrayList = geVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gc gcVar = (gc) geVar.b.get(((ea) arrayList.get(i2)).l);
                if (gcVar != null) {
                    gcVar.e();
                }
            }
            for (gc gcVar2 : geVar.b.values()) {
                if (gcVar2 != null) {
                    gcVar2.e();
                    ea eaVar = gcVar2.a;
                    if (eaVar.s && !eaVar.aH()) {
                        if (eaVar.u && !geVar.c.containsKey(eaVar.l)) {
                            geVar.a(eaVar.l, gcVar2.a());
                        }
                        geVar.k(gcVar2);
                    }
                }
            }
            aD();
            if (this.u && (enVar = this.o) != null && this.n == 7) {
                enVar.f();
                this.u = false;
            }
        }
    }

    public final void Q(FragmentContainerView fragmentContainerView) {
        View view;
        for (gc gcVar : this.b.e()) {
            ea eaVar = gcVar.a;
            if (eaVar.G == fragmentContainerView.getId() && (view = eaVar.Q) != null && view.getParent() == null) {
                eaVar.P = fragmentContainerView;
                gcVar.b();
                gcVar.e();
            }
        }
    }

    final void R(gc gcVar) {
        ea eaVar = gcVar.a;
        if (eaVar.R) {
            if (this.z) {
                this.J = true;
            } else {
                eaVar.R = false;
                gcVar.e();
            }
        }
    }

    final void S(ea eaVar) {
        if (ad(2)) {
            Log.v("FragmentManager", "remove: " + eaVar + " nesting=" + eaVar.A);
        }
        boolean zAH = eaVar.aH();
        if (eaVar.J && zAH) {
            return;
        }
        this.b.l(eaVar);
        if (an(eaVar)) {
            this.u = true;
        }
        eaVar.s = true;
        aC(eaVar);
    }

    final void T(Parcelable parcelable) {
        gc gcVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.o.c.getClassLoader());
                this.B.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.o.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        ge geVar = this.b;
        HashMap map2 = geVar.c;
        map2.clear();
        map2.putAll(map);
        fu fuVar = (fu) bundle3.getParcelable("state");
        if (fuVar == null) {
            return;
        }
        geVar.b.clear();
        ArrayList arrayList = fuVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundleA = geVar.a((String) arrayList.get(i), null);
            if (bundleA != null) {
                ea eaVar = (ea) this.y.b.get(((ga) bundleA.getParcelable("state")).b);
                if (eaVar != null) {
                    if (ad(2)) {
                        Objects.toString(eaVar);
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(eaVar.toString()));
                    }
                    gcVar = new gc(this.l, geVar, eaVar, bundleA);
                } else {
                    gcVar = new gc(this.l, geVar, this.o.c.getClassLoader(), k(), bundleA);
                }
                ea eaVar2 = gcVar.a;
                eaVar2.h = bundleA;
                eaVar2.B = this;
                if (ad(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + eaVar2.l + "): " + eaVar2);
                }
                gcVar.f(this.o.c.getClassLoader());
                geVar.j(gcVar);
                gcVar.b = this.n;
            }
        }
        for (ea eaVar3 : new ArrayList(this.y.b.values())) {
            if (!geVar.m(eaVar3.l)) {
                if (ad(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + eaVar3 + " that was not found in the set of active Fragments " + fuVar.a);
                }
                this.y.e(eaVar3);
                eaVar3.B = this;
                gc gcVar2 = new gc(this.l, geVar, eaVar3);
                gcVar2.b = 1;
                gcVar2.e();
                eaVar3.s = true;
                gcVar2.e();
            }
        }
        ArrayList<String> arrayList2 = fuVar.b;
        geVar.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                ea eaVarB = geVar.b(str3);
                if (eaVarB == null) {
                    throw new IllegalStateException(a.a(str3, "No instantiated fragment for (", ")"));
                }
                if (ad(2)) {
                    Log.v("FragmentManager", a.m(eaVarB, str3, "restoreSaveState: added (", "): "));
                }
                geVar.h(eaVarB);
            }
        }
        ci[] ciVarArr = fuVar.c;
        if (ciVarArr != null) {
            this.c = new ArrayList(ciVarArr.length);
            int i2 = 0;
            while (true) {
                ci[] ciVarArr2 = fuVar.c;
                if (i2 >= ciVarArr2.length) {
                    break;
                }
                ci ciVar = ciVarArr2[i2];
                cg cgVar = new cg(this);
                ciVar.a(cgVar);
                cgVar.c = ciVar.g;
                int i3 = 0;
                while (true) {
                    ArrayList arrayList3 = ciVar.b;
                    if (i3 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i3);
                    if (str4 != null) {
                        ((gf) cgVar.e.get(i3)).b = e(str4);
                    }
                    i3++;
                }
                cgVar.a(1);
                if (ad(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + cgVar.c + "): " + cgVar);
                    PrintWriter printWriter = new PrintWriter(new gv());
                    cgVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(cgVar);
                i2++;
            }
        } else {
            this.c = new ArrayList();
        }
        this.i.set(fuVar.d);
        String str5 = fuVar.e;
        if (str5 != null) {
            ea eaVarE = e(str5);
            this.r = eaVarE;
            D(eaVarE);
        }
        ArrayList arrayList4 = fuVar.f;
        if (arrayList4 != null) {
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                this.j.put((String) arrayList4.get(i4), (ck) fuVar.g.get(i4));
            }
        }
        this.t = new ArrayDeque(fuVar.h);
    }

    final void U(ea eaVar, boolean z) {
        ViewGroup viewGroupAt = at(eaVar);
        if (viewGroupAt == null || !(viewGroupAt instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupAt).a = !z;
    }

    final void V(ea eaVar, lvb lvbVar) {
        if (!eaVar.equals(e(eaVar.l)) || (eaVar.C != null && eaVar.B != this)) {
            throw new IllegalArgumentException(a.i(this, eaVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        eaVar.Y = lvbVar;
    }

    final void W(ea eaVar) {
        if (eaVar != null && (!eaVar.equals(e(eaVar.l)) || (eaVar.C != null && eaVar.B != this))) {
            throw new IllegalArgumentException(a.i(this, eaVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        ea eaVar2 = this.r;
        this.r = eaVar;
        D(eaVar2);
        D(this.r);
    }

    public final void X(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new gv());
        en enVar = this.o;
        if (enVar == null) {
            try {
                K("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((ef) enVar).a.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void Y() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.h.h(true);
                if (ad(3)) {
                    Log.d("FragmentManager", a.h(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = b() > 0 && af(this.q);
            if (ad(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.h.h(z);
        }
    }

    final boolean Z(MenuItem menuItem) {
        if (this.n <= 0) {
            return false;
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && !eaVar.I && (eaVar.aL(menuItem) || eaVar.D.Z(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final int a(String str, int i, boolean z) {
        if (this.c.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.c.size() - 1;
        }
        int size = this.c.size() - 1;
        while (size >= 0) {
            cg cgVar = (cg) this.c.get(size);
            if ((str != null && str.equals(cgVar.m)) || (i >= 0 && i == cgVar.c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.c.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            int i2 = size - 1;
            cg cgVar2 = (cg) this.c.get(i2);
            if ((str == null || !str.equals(cgVar2.m)) && (i < 0 || i != cgVar2.c)) {
                break;
            }
            size = i2;
        }
        return size;
    }

    public final boolean aa(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.n <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && ao(eaVar) && !eaVar.I) {
                if (eaVar.M && eaVar.N) {
                    eaVar.ah(menu, menuInflater);
                    z = true;
                } else {
                    z = false;
                }
                if (z | eaVar.D.aa(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(eaVar);
                    z2 = true;
                }
            }
        }
        if (this.A != null) {
            for (int i = 0; i < this.A.size(); i++) {
                ea eaVar2 = (ea) this.A.get(i);
                if (arrayList != null) {
                    arrayList.contains(eaVar2);
                }
            }
        }
        this.A = arrayList;
        return z2;
    }

    public final boolean ab(MenuItem menuItem) {
        if (this.n <= 0) {
            return false;
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && !eaVar.I && ((eaVar.M && eaVar.N && eaVar.aM(menuItem)) || eaVar.D.ab(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean ac(Menu menu) {
        boolean z;
        if (this.n <= 0) {
            return false;
        }
        boolean z2 = false;
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && ao(eaVar) && !eaVar.I) {
                if (eaVar.M && eaVar.N) {
                    eaVar.aT();
                    z = true;
                } else {
                    z = false;
                }
                if (eaVar.D.ac(menu) | z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean ae() {
        ea eaVar = this.q;
        if (eaVar == null) {
            return true;
        }
        return eaVar.aF() && eaVar.J().ae();
    }

    final boolean af(ea eaVar) {
        if (eaVar == null) {
            return true;
        }
        fr frVar = eaVar.B;
        return eaVar.equals(frVar.r) && af(frVar.q);
    }

    public final boolean ag() {
        return this.v || this.w;
    }

    public final boolean ah() {
        return ai(null, -1, 0);
    }

    public final boolean ai(String str, int i, int i2) {
        as(false);
        ay(true);
        ea eaVar = this.r;
        if (eaVar != null && i < 0 && str == null && eaVar.I().ah()) {
            return true;
        }
        boolean zAj = aj(this.K, this.L, str, i, i2);
        if (zAj) {
            this.z = true;
            try {
                aB(this.K, this.L);
            } finally {
                aw();
            }
        }
        Y();
        ax();
        this.b.i();
        return zAj;
    }

    final boolean aj(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iA = a(str, i, 1 == i2);
        if (iA < 0) {
            return false;
        }
        int size = this.c.size();
        while (true) {
            size--;
            if (size < iA) {
                return true;
            }
            arrayList.add((cg) this.c.remove(size));
            arrayList2.add(true);
        }
    }

    final fc ak() {
        ea eaVar = this.q;
        return eaVar != null ? eaVar.B.ak() : this.P;
    }

    public final void al() {
        as(true);
        aA();
    }

    public final void ap(String str) {
        M(new fn(this, str, -1), false);
    }

    public final void aq(String str) {
        ai(str, -1, 1);
    }

    final void as(boolean z) {
        cg cgVar;
        ay(z);
        if (!this.g && (cgVar = this.f) != null) {
            cgVar.b = false;
            cgVar.b();
            if (ad(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execPendingActions for actions " + this.a);
            }
            this.f.n(false, false);
            this.a.add(0, this.f);
            ArrayList arrayList = this.f.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ea eaVar = ((gf) arrayList.get(i)).b;
                if (eaVar != null) {
                    eaVar.t = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zH = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zH |= ((fm) arrayList4.get(i2)).h(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.o.d.removeCallbacks(this.N);
                    if (!zH) {
                        break;
                    }
                    this.z = true;
                    try {
                        aB(this.K, this.L);
                    } finally {
                        aw();
                    }
                } catch (Throwable th) {
                    this.a.clear();
                    this.o.d.removeCallbacks(this.N);
                    throw th;
                }
            }
        }
        Y();
        ax();
        this.b.i();
    }

    public final int b() {
        return this.c.size() + (this.f != null ? 1 : 0);
    }

    final Bundle c() {
        ci[] ciVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        aA();
        L();
        as(true);
        this.v = true;
        this.y.g = true;
        ge geVar = this.b;
        HashMap map = geVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (gc gcVar : map.values()) {
            if (gcVar != null) {
                ea eaVar = gcVar.a;
                geVar.a(eaVar.l, gcVar.a());
                arrayList2.add(eaVar.l);
                if (ad(2)) {
                    Log.v("FragmentManager", "Saved state of " + eaVar + ": " + eaVar.h);
                }
            }
        }
        HashMap map2 = geVar.c;
        if (!map2.isEmpty()) {
            ArrayList arrayList3 = geVar.a;
            synchronized (arrayList3) {
                ciVarArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ea eaVar2 = (ea) it.next();
                        arrayList.add(eaVar2.l);
                        if (ad(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + eaVar2.l + "): " + eaVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                ciVarArr = new ci[size];
                for (int i = 0; i < size; i++) {
                    ciVarArr[i] = new ci((cg) this.c.get(i));
                    if (ad(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            fu fuVar = new fu();
            fuVar.a = arrayList2;
            fuVar.b = arrayList;
            fuVar.c = ciVarArr;
            fuVar.d = this.i.get();
            ea eaVar3 = this.r;
            if (eaVar3 != null) {
                fuVar.e = eaVar3.l;
            }
            ArrayList arrayList4 = fuVar.f;
            Map map3 = this.j;
            arrayList4.addAll(map3.keySet());
            fuVar.g.addAll(map3.values());
            fuVar.h = new ArrayList(this.t);
            bundle.putParcelable("state", fuVar);
            Map map4 = this.B;
            for (String str : map4.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str)), (Bundle) map4.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str2)), (Bundle) map2.get(str2));
            }
        } else if (ad(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final dz d(ea eaVar) {
        gc gcVarD = this.b.d(eaVar.l);
        if (gcVarD == null || !gcVarD.a.equals(eaVar)) {
            X(new IllegalStateException(a.h(eaVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        if (gcVarD.a.g >= 0) {
            return new dz(gcVarD.a());
        }
        return null;
    }

    final ea e(String str) {
        return this.b.b(str);
    }

    public final ea g(int i) {
        ge geVar = this.b;
        ArrayList arrayList = geVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (gc gcVar : geVar.b.values()) {
                    if (gcVar != null) {
                        ea eaVar = gcVar.a;
                        if (eaVar.F == i) {
                            return eaVar;
                        }
                    }
                }
                return null;
            }
            ea eaVar2 = (ea) arrayList.get(size);
            if (eaVar2 != null && eaVar2.F == i) {
                return eaVar2;
            }
        }
    }

    public final ea h(String str) {
        ge geVar = this.b;
        if (str != null) {
            ArrayList arrayList = geVar.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ea eaVar = (ea) arrayList.get(size);
                if (eaVar != null && str.equals(eaVar.H)) {
                    return eaVar;
                }
            }
        }
        if (str != null) {
            for (gc gcVar : geVar.b.values()) {
                if (gcVar != null) {
                    ea eaVar2 = gcVar.a;
                    if (str.equals(eaVar2.H)) {
                        return eaVar2;
                    }
                }
            }
        }
        return null;
    }

    public final em k() {
        ea eaVar = this.q;
        return eaVar != null ? eaVar.B.k() : this.G;
    }

    final gc m(ea eaVar) {
        String str = eaVar.X;
        if (str != null) {
            lsb.a(eaVar, str);
        }
        if (ad(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(eaVar)));
        }
        gc gcVarN = n(eaVar);
        eaVar.B = this;
        ge geVar = this.b;
        geVar.j(gcVarN);
        if (!eaVar.J) {
            geVar.h(eaVar);
            eaVar.s = false;
            if (eaVar.Q == null) {
                eaVar.U = false;
            }
            if (an(eaVar)) {
                this.u = true;
            }
        }
        return gcVarN;
    }

    final gc n(ea eaVar) {
        ge geVar = this.b;
        gc gcVarD = geVar.d(eaVar.l);
        if (gcVarD != null) {
            return gcVarD;
        }
        gc gcVar = new gc(this.l, geVar, eaVar);
        gcVar.f(this.o.c.getClassLoader());
        gcVar.b = this.n;
        return gcVar;
    }

    public void noteStateNotSaved() {
        if (this.o == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.g = false;
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.D.noteStateNotSaved();
            }
        }
    }

    public final List o() {
        return this.b.g();
    }

    final Set p(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((cg) arrayList.get(i)).e;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ea eaVar = ((gf) arrayList2.get(i3)).b;
                if (eaVar != null && (viewGroup = eaVar.P) != null) {
                    hashSet.add(hj.d(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void q(fx fxVar) {
        this.m.add(fxVar);
    }

    public final void r(fl flVar) {
        this.k.add(flVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [en, kxy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [en, pjb] */
    /* JADX WARN: Type inference failed for: r4v9, types: [adr, en] */
    final void s(en enVar, ek ekVar, ea eaVar) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = enVar;
        this.p = ekVar;
        this.q = eaVar;
        if (eaVar != null) {
            q(new fe());
        } else if (enVar instanceof fx) {
            q(enVar);
        }
        if (this.q != null) {
            Y();
        }
        if (enVar instanceof ach) {
            ace aceVarC = enVar.c();
            this.e = aceVarC;
            aceVarC.b(eaVar != null ? eaVar : enVar, this.h);
        }
        if (eaVar != null) {
            fw fwVar = eaVar.B.y;
            HashMap map = fwVar.c;
            fw fwVar2 = (fw) map.get(eaVar.l);
            if (fwVar2 == null) {
                fwVar2 = new fw(fwVar.e);
                map.put(eaVar.l, fwVar2);
            }
            this.y = fwVar2;
        } else {
            eaVar = null;
            if (enVar instanceof lxq) {
                this.y = (fw) new lxo(enVar.S(), fw.a).a(fw.class);
            } else {
                this.y = new fw(false);
            }
        }
        fw fwVar3 = this.y;
        fwVar3.g = ag();
        this.b.d = fwVar3;
        ?? r4 = this.o;
        if ((r4 instanceof pjb) && eaVar == null) {
            pix pixVarU = r4.U();
            pixVarU.b("android:support:fragments", new piw() { // from class: es
                @Override // defpackage.piw
                public final Bundle a() {
                    return this.a.c();
                }
            });
            Bundle bundleA = pixVarU.a("android:support:fragments");
            if (bundleA != null) {
                T(bundleA);
            }
        }
        ?? r42 = this.o;
        if (r42 instanceof adr) {
            adq adqVarD = r42.d();
            String strConcat = eaVar != null ? String.valueOf(eaVar.l).concat(":") : "";
            aeo aeoVar = new aeo();
            ff ffVar = new ff(this);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.s = adqVarD.b(strConcat2.concat("StartActivityForResult"), aeoVar, ffVar);
            this.H = adqVarD.b(strConcat2.concat("StartIntentSenderForResult"), new fh(), new fg(this));
            this.I = adqVarD.b(strConcat2.concat("RequestPermissions"), new aem(), new ey(this));
        }
        ?? r43 = this.o;
        if (r43 instanceof kxy) {
            r43.hg(this.C);
        }
        en enVar2 = this.o;
        if (enVar2 instanceof kxz) {
            lbz lbzVar = this.D;
            eg egVar = ((ef) enVar2).a;
            lbzVar.getClass();
            egVar.i.add(lbzVar);
        }
        en enVar3 = this.o;
        if (enVar3 instanceof gx) {
            lbz lbzVar2 = this.E;
            eg egVar2 = ((ef) enVar3).a;
            lbzVar2.getClass();
            egVar2.k.add(lbzVar2);
        }
        en enVar4 = this.o;
        if (enVar4 instanceof gy) {
            lbz lbzVar3 = this.F;
            eg egVar3 = ((ef) enVar4).a;
            lbzVar3.getClass();
            egVar3.l.add(lbzVar3);
        }
        en enVar5 = this.o;
        if ((enVar5 instanceof ldd) && eaVar == null) {
            fa faVar = this.O;
            eg egVar4 = ((ef) enVar5).a;
            faVar.getClass();
            ldf ldfVar = egVar4.g;
            ldfVar.b.add(faVar);
            ldfVar.a.run();
        }
    }

    final void t(ea eaVar) {
        if (ad(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.J) {
            eaVar.J = false;
            if (eaVar.r) {
                return;
            }
            this.b.h(eaVar);
            if (ad(2)) {
                Objects.toString(eaVar);
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(eaVar)));
            }
            if (an(eaVar)) {
                this.u = true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ea eaVar = this.q;
        if (eaVar != null) {
            sb.append(eaVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.q)));
            sb.append("}");
        } else {
            en enVar = this.o;
            if (enVar != null) {
                sb.append(enVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.o)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u(ea eaVar) {
        if (ad(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.J) {
            return;
        }
        eaVar.J = true;
        if (eaVar.r) {
            if (ad(2)) {
                Objects.toString(eaVar);
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(eaVar)));
            }
            this.b.l(eaVar);
            if (an(eaVar)) {
                this.u = true;
            }
            aC(eaVar);
        }
    }

    final void v() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        I(4);
    }

    final void w(Configuration configuration, boolean z) {
        if (z && (this.o instanceof kxy)) {
            X(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.onConfigurationChanged(configuration);
                if (z) {
                    eaVar.D.w(configuration, true);
                }
            }
        }
    }

    final void x() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        I(1);
    }

    final void y() {
        this.x = true;
        as(true);
        L();
        en enVar = this.o;
        if (enVar instanceof lxq ? this.b.d.f : true ^ ((Activity) enVar.c).isChangingConfigurations()) {
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ck) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.b.d.c((String) it2.next(), false);
                }
            }
        }
        I(-1);
        en enVar2 = this.o;
        if (enVar2 instanceof kxz) {
            lbz lbzVar = this.D;
            eg egVar = ((ef) enVar2).a;
            lbzVar.getClass();
            egVar.i.remove(lbzVar);
        }
        en enVar3 = this.o;
        if (enVar3 instanceof kxy) {
            ((ef) enVar3).a.g(this.C);
        }
        en enVar4 = this.o;
        if (enVar4 instanceof gx) {
            lbz lbzVar2 = this.E;
            eg egVar2 = ((ef) enVar4).a;
            lbzVar2.getClass();
            egVar2.k.remove(lbzVar2);
        }
        en enVar5 = this.o;
        if (enVar5 instanceof gy) {
            lbz lbzVar3 = this.F;
            eg egVar3 = ((ef) enVar5).a;
            lbzVar3.getClass();
            egVar3.l.remove(lbzVar3);
        }
        en enVar6 = this.o;
        if ((enVar6 instanceof ldd) && this.q == null) {
            fa faVar = this.O;
            eg egVar4 = ((ef) enVar6).a;
            faVar.getClass();
            ldf ldfVar = egVar4.g;
            ldfVar.b.remove(faVar);
            if (((lde) ldfVar.c.remove(faVar)) != null) {
                throw null;
            }
            ldfVar.a.run();
        }
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.e != null) {
            this.h.f();
            this.e = null;
        }
        adj adjVar = this.s;
        if (adjVar != null) {
            adjVar.b();
            this.H.b();
            this.I.b();
        }
    }

    final void z(boolean z) {
        if (z && (this.o instanceof kxz)) {
            X(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.onLowMemory();
                if (z) {
                    eaVar.D.z(true);
                }
            }
        }
    }
}
