package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ez extends abs {
    final /* synthetic */ fr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(fr frVar) {
        super(false);
        this.a = frVar;
    }

    @Override // defpackage.abs
    public final void a() {
        if (fr.ad(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        final fr frVar = this.a;
        if (fr.ad(3)) {
            cg cgVar = frVar.f;
            Objects.toString(cgVar);
            Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(String.valueOf(cgVar)));
        }
        cg cgVar2 = frVar.f;
        if (cgVar2 != null) {
            cgVar2.b = false;
            cgVar2.b();
            frVar.f.y(true, new Runnable() { // from class: et
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList = frVar.k;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((fl) arrayList.get(i)).a();
                    }
                }
            });
            frVar.f.j();
            frVar.g = true;
            frVar.al();
            frVar.g = false;
            frVar.f = null;
        }
    }

    @Override // defpackage.abs
    public final void b() {
        int i;
        if (fr.ad(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        fr frVar = this.a;
        frVar.g = true;
        frVar.as(true);
        frVar.g = false;
        if (frVar.f == null) {
            if (frVar.h.b) {
                if (fr.ad(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                frVar.ah();
                return;
            } else {
                if (fr.ad(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                frVar.e.d();
                return;
            }
        }
        ArrayList arrayList = frVar.k;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(fr.am(frVar.f));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                fl flVar = (fl) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        flVar.b((ea) it.next(), true);
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = frVar.f.e;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ea eaVar = ((gf) arrayList2.get(i3)).b;
            if (eaVar != null) {
                eaVar.t = false;
            }
        }
        for (hj hjVar : frVar.p(new ArrayList(Collections.singletonList(frVar.f)), 0, 1)) {
            if (fr.ad(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            List list = hjVar.c;
            hjVar.h(list);
            hjVar.f(list);
        }
        ArrayList arrayList3 = frVar.f.e;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ea eaVar2 = ((gf) arrayList3.get(i4)).b;
            if (eaVar2 != null && eaVar2.P == null) {
                frVar.n(eaVar2).e();
            }
        }
        frVar.f = null;
        frVar.Y();
        if (fr.ad(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + frVar.h.b + " for  FragmentManager " + frVar);
        }
    }

    @Override // defpackage.abs
    public final void c(aao aaoVar) {
        if (fr.ad(2)) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        fr frVar = this.a;
        cg cgVar = frVar.f;
        if (cgVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(cgVar));
            for (hj hjVar : frVar.p(arrayList, 0, 1)) {
                if (fr.ad(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aaoVar.b);
                }
                List list = hjVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fcva.y(arrayList2, ((hi) it.next()).g);
                }
                List listAo = fcva.ao(fcva.av(arrayList2));
                int size = listAo.size();
                for (int i = 0; i < size; i++) {
                    hd hdVar = (hd) listAo.get(i);
                    ViewGroup viewGroup = hjVar.a;
                    hdVar.e(aaoVar);
                }
            }
            ArrayList arrayList3 = frVar.k;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((fl) arrayList3.get(i2)).e();
            }
        }
    }

    @Override // defpackage.abs
    public final void d(aao aaoVar) {
        if (fr.ad(3)) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        fr frVar = this.a;
        frVar.L();
        frVar.M(new fo(frVar), false);
    }
}
