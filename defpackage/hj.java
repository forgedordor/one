package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hj {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public hj(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final hj d(ViewGroup viewGroup, fr frVar) {
        viewGroup.getClass();
        fc fcVarAk = frVar.ak();
        fcVarAk.getClass();
        return hc.a(viewGroup, fcVarAk);
    }

    public abstract void a(List list, boolean z);

    public final hi b(ea eaVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            hi hiVar = (hi) next;
            if (fdbq.f(hiVar.a, eaVar) && !hiVar.b) {
                break;
            }
        }
        return (hi) next;
    }

    public final hi c(ea eaVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            hi hiVar = (hi) next;
            if (fdbq.f(hiVar.a, eaVar) && !hiVar.b) {
                break;
            }
        }
        return (hi) next;
    }

    public final void e(hi hiVar) {
        hiVar.getClass();
        if (hiVar.f) {
            int i = hiVar.h;
            ea eaVar = hiVar.a;
            hh.b(i, eaVar.N(), this.a);
            hiVar.g();
        }
    }

    public final void f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcva.y(arrayList, ((hi) it.next()).g);
        }
        List listAo = fcva.ao(fcva.av(arrayList));
        int size = listAo.size();
        for (int i = 0; i < size; i++) {
            ((hd) listAo.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e((hi) list.get(i2));
        }
        List listAo2 = fcva.ao(list);
        int size3 = listAo2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            hi hiVar = (hi) listAo2.get(i3);
            if (hiVar.g.isEmpty()) {
                hiVar.a();
            }
        }
    }

    public final void g() {
        if (fr.ad(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        List list = this.b;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            i();
            h(list);
            List<hi> listAq = fcva.aq(this.c);
            Iterator it = listAq.iterator();
            while (it.hasNext()) {
                ((hi) it.next()).d = false;
            }
            for (hi hiVar : listAq) {
                if (fr.ad(2)) {
                    Log.v("FragmentManager", a.m(hiVar, zIsAttachedToWindow ? "" : "Container " + viewGroup + " is not attached to window. ", "SpecialEffectsController: ", "Cancelling running operation "));
                }
                hiVar.e(viewGroup);
            }
            List<hi> listAq2 = fcva.aq(list);
            Iterator it2 = listAq2.iterator();
            while (it2.hasNext()) {
                ((hi) it2.next()).d = false;
            }
            for (hi hiVar2 : listAq2) {
                if (fr.ad(2)) {
                    Log.v("FragmentManager", a.m(hiVar2, zIsAttachedToWindow ? "" : "Container " + viewGroup + " is not attached to window. ", "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                hiVar2.e(viewGroup);
            }
        }
    }

    public final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((hi) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcva.y(arrayList, ((hi) it.next()).g);
        }
        List listAo = fcva.ao(fcva.av(arrayList));
        int size2 = listAo.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hd hdVar = (hd) listAo.get(i2);
            ViewGroup viewGroup = this.a;
            if (!hdVar.h) {
                hdVar.c(viewGroup);
            }
            hdVar.h = true;
        }
    }

    public final void i() {
        for (hi hiVar : this.b) {
            if (hiVar.i == 2) {
                hiVar.h(hg.a(hiVar.a.N().getVisibility()), 1);
            }
        }
    }

    public final void j(int i, int i2, gc gcVar) {
        List list = this.b;
        synchronized (list) {
            ea eaVar = gcVar.a;
            eaVar.getClass();
            hi hiVarB = b(eaVar);
            if (hiVarB == null) {
                if (eaVar.t || eaVar.s) {
                    eaVar.getClass();
                    hiVarB = c(eaVar);
                } else {
                    hiVarB = null;
                }
            }
            if (hiVarB != null) {
                hiVarB.h(i, i2);
                return;
            }
            final he heVar = new he(i, i2, gcVar);
            list.add(heVar);
            heVar.c(new Runnable() { // from class: ha
                @Override // java.lang.Runnable
                public final void run() {
                    hj hjVar = this.a;
                    List list2 = hjVar.b;
                    he heVar2 = heVar;
                    if (list2.contains(heVar2)) {
                        int i3 = heVar2.h;
                        View view = heVar2.a.Q;
                        view.getClass();
                        hh.b(i3, view, hjVar.a);
                    }
                }
            });
            heVar.c(new Runnable() { // from class: hb
                @Override // java.lang.Runnable
                public final void run() {
                    hj hjVar = this.a;
                    List list2 = hjVar.b;
                    he heVar2 = heVar;
                    list2.remove(heVar2);
                    hjVar.c.remove(heVar2);
                }
            });
        }
    }
}
