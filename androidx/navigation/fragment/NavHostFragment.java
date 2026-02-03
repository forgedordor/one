package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.cg;
import defpackage.ea;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.ojc;
import defpackage.okc;
import defpackage.oku;
import defpackage.old;
import defpackage.ome;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavHostFragment extends ea {
    public int a;
    private final fctc b = fctd.a(new fdae() { // from class: omb
        @Override // defpackage.fdae
        public final Object invoke() {
            int i;
            lvc lvcVarP;
            final NavHostFragment navHostFragment = this.a;
            Context contextZ = navHostFragment.z();
            if (contextZ == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            final okc okcVar = new okc(contextZ);
            ona onaVar = okcVar.b;
            if (!fdbq.f(navHostFragment, onaVar.k)) {
                lvj lvjVar = onaVar.k;
                if (lvjVar != null && (lvcVarP = lvjVar.P()) != null) {
                    lvcVarP.d(onaVar.o);
                }
                onaVar.k = navHostFragment;
                navHostFragment.P().c(onaVar.o);
            }
            lxp lxpVarS = navHostFragment.S();
            if (!fdbq.f(onaVar.l, ojd.a(lxpVarS))) {
                if (!onaVar.f.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                onaVar.l = ojd.a(lxpVarS);
            }
            ola olaVarE = okcVar.e();
            Context contextA = navHostFragment.A();
            fr frVarI = navHostFragment.I();
            frVarI.getClass();
            olaVarE.c(new olm(contextA, frVarI));
            ola olaVarE2 = okcVar.e();
            Context contextA2 = navHostFragment.A();
            fr frVarI2 = navHostFragment.I();
            frVarI2.getClass();
            olaVarE2.c(new oma(contextA2, frVarI2, navHostFragment.a()));
            Bundle bundleA = navHostFragment.U().a("android-support-nav:fragment:navControllerState");
            if (bundleA != null) {
                bundleA.setClassLoader(okcVar.a.getClassLoader());
                onaVar.d = pis.g(bundleA, "android-support-nav:controller:navigatorState") ? pis.b(bundleA, "android-support-nav:controller:navigatorState") : null;
                onaVar.e = pis.g(bundleA, "android-support-nav:controller:backStack") ? (Bundle[]) pis.d(bundleA, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                Map map = onaVar.j;
                map.clear();
                if (pis.g(bundleA, "android-support-nav:controller:backStackDestIds") && pis.g(bundleA, "android-support-nav:controller:backStackIds")) {
                    int[] iArrJ = pis.j(bundleA, "android-support-nav:controller:backStackDestIds");
                    List listE = pis.e(bundleA, "android-support-nav:controller:backStackIds");
                    int length = iArrJ.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = i3 + 1;
                        onaVar.i.put(Integer.valueOf(iArrJ[i2]), !fdbq.f(listE.get(i3), "") ? (String) listE.get(i3) : null);
                        i2++;
                        i3 = i4;
                    }
                }
                if (pis.g(bundleA, "android-support-nav:controller:backStackStates")) {
                    for (String str : pis.e(bundleA, "android-support-nav:controller:backStackStates")) {
                        if (pis.g(bundleA, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str)))) {
                            List listD = pis.d(bundleA, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str)));
                            fcuq fcuqVar = new fcuq(listD.size());
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                fcuqVar.add(new oiq((Bundle) it.next()));
                            }
                            map.put(str, fcuqVar);
                        }
                    }
                }
                i = 0;
                boolean z = bundleA.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                Boolean boolValueOf = (z || !bundleA.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : null;
                okcVar.e = boolValueOf != null ? boolValueOf.booleanValue() : false;
            } else {
                i = 0;
            }
            navHostFragment.U().b("android-support-nav:fragment:navControllerState", new piw() { // from class: omc
                @Override // defpackage.piw
                public final Bundle a() {
                    Bundle bundleA2;
                    ArrayList arrayList = new ArrayList();
                    Bundle bundleA3 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                    okc okcVar2 = okcVar;
                    ona onaVar2 = okcVar2.b;
                    for (Map.Entry entry : onaVar2.p.b().entrySet()) {
                        String str2 = (String) entry.getKey();
                        Bundle bundleE = ((oky) entry.getValue()).e();
                        if (bundleE != null) {
                            arrayList.add(str2);
                            pjc.b(bundleA3, str2, bundleE);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        bundleA2 = null;
                    } else {
                        bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                        pjc.f(bundleA3, "android-support-nav:controller:navigatorState:names", arrayList);
                        pjc.b(bundleA2, "android-support-nav:controller:navigatorState", bundleA3);
                    }
                    fcuq fcuqVar2 = onaVar2.f;
                    if (!fcuqVar2.isEmpty()) {
                        if (bundleA2 == null) {
                            bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = fcuqVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new oiq((oip) it2.next()).b());
                        }
                        pjc.c(bundleA2, "android-support-nav:controller:backStack", arrayList2);
                    }
                    Map map2 = onaVar2.i;
                    if (!map2.isEmpty()) {
                        if (bundleA2 == null) {
                            bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                        }
                        int[] iArr = new int[map2.size()];
                        ArrayList arrayList3 = new ArrayList();
                        int i5 = 0;
                        for (Map.Entry entry2 : map2.entrySet()) {
                            int iIntValue = ((Number) entry2.getKey()).intValue();
                            String str3 = (String) entry2.getValue();
                            int i6 = i5 + 1;
                            iArr[i5] = iIntValue;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList3.add(str3);
                            i5 = i6;
                        }
                        bundleA2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                        pjc.f(bundleA2, "android-support-nav:controller:backStackIds", arrayList3);
                    }
                    Map map3 = onaVar2.j;
                    if (!map3.isEmpty()) {
                        if (bundleA2 == null) {
                            bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            String str4 = (String) entry3.getKey();
                            fcuq fcuqVar3 = (fcuq) entry3.getValue();
                            arrayList4.add(str4);
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<E> it3 = fcuqVar3.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(((oiq) it3.next()).b());
                            }
                            pjc.c(bundleA2, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str4)), arrayList5);
                        }
                        pjc.f(bundleA2, "android-support-nav:controller:backStackStates", arrayList4);
                    }
                    if (okcVar2.e) {
                        if (bundleA2 == null) {
                            bundleA2 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                        }
                        bundleA2.putBoolean("android-support-nav:controller:deepLinkHandled", okcVar2.e);
                    }
                    if (bundleA2 != null) {
                        return bundleA2;
                    }
                    Bundle bundle = Bundle.EMPTY;
                    bundle.getClass();
                    return bundle;
                }
            });
            Bundle bundleA2 = navHostFragment.U().a("android-support-nav:fragment:graphId");
            if (bundleA2 != null) {
                navHostFragment.a = bundleA2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.U().b("android-support-nav:fragment:graphId", new piw() { // from class: omd
                @Override // defpackage.piw
                public final Bundle a() {
                    int i5 = navHostFragment.a;
                    if (i5 != 0) {
                        return lab.a(new fcti("android-support-nav:fragment:graphId", Integer.valueOf(i5)));
                    }
                    Bundle bundle = Bundle.EMPTY;
                    bundle.getClass();
                    return bundle;
                }
            });
            int i5 = navHostFragment.a;
            if (i5 != 0) {
                okcVar.g(i5);
                return okcVar;
            }
            Bundle bundle = navHostFragment.m;
            int i6 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : i;
            Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i6 != 0) {
                onaVar.l(okcVar.d().a(i6), bundle2);
            }
            return okcVar;
        }
    });
    private View c;
    private boolean d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(a());
        return fragmentContainerView;
    }

    public final int a() {
        int i = this.F;
        return (i == 0 || i == -1) ? R.id.nav_host_fragment_container : i;
    }

    @Override // defpackage.ea
    public final void ak(Context context, AttributeSet attributeSet, Bundle bundle) {
        attributeSet.getClass();
        super.ak(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, old.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.a = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ome.c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(a.h(view, "created host view ", " is not a ViewGroup"));
        }
        oku.a(view, b());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.c = view2;
            view2.getClass();
            if (view2.getId() == this.F) {
                View view3 = this.c;
                view3.getClass();
                oku.a(view3, b());
            }
        }
    }

    public final okc b() {
        return (okc) this.b.a();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.d) {
            cg cgVar = new cg(J());
            cgVar.p(this);
            cgVar.j();
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        b();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            cg cgVar = new cg(J());
            cgVar.p(this);
            cgVar.j();
        }
        super.h(bundle);
    }

    @Override // defpackage.ea
    public final void i() {
        super.i();
        View view = this.c;
        if (view != null) {
            ojc ojcVarB = oku.b(view);
            if (ojcVarB == null) {
                throw new IllegalStateException(a.h(view, "View ", " does not have a NavController set"));
            }
            if (ojcVarB == b()) {
                oku.a(view, null);
            }
        }
        this.c = null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }
}
