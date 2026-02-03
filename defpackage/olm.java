package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
@okx(a = "dialog")
/* loaded from: classes.dex */
public final class olm extends oky<olk> {
    public final Set b = new LinkedHashSet();
    public final oll c = new oll(this);
    public final Map d = new LinkedHashMap();
    private final Context e;
    private final fr f;

    public olm(Context context, fr frVar) {
        this.e = context;
        this.f = frVar;
    }

    private final dn l(oip oipVar) {
        ojx ojxVar = oipVar.a;
        ojxVar.getClass();
        olk olkVar = (olk) ojxVar;
        String strJ = olkVar.j();
        if (strJ.charAt(0) == '.') {
            strJ = String.valueOf(this.e.getPackageName()).concat(strJ);
        }
        fr frVar = this.f;
        Context context = this.e;
        em emVarK = frVar.k();
        context.getClassLoader();
        ea eaVarB = emVarK.b(strJ);
        eaVarB.getClass();
        if (!dn.class.isAssignableFrom(eaVarB.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + olkVar.j() + " is not an instance of DialogFragment");
        }
        dn dnVar = (dn) eaVarB;
        dnVar.at(oipVar.a());
        dnVar.P().c(this.c);
        this.d.put(oipVar.d, dnVar);
        return dnVar;
    }

    @Override // defpackage.oky
    public final /* synthetic */ ojx a() {
        return new olk(this);
    }

    @Override // defpackage.oky
    public final void d(List list, okg okgVar) {
        fr frVar = this.f;
        if (frVar.ag()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oip oipVar = (oip) it.next();
            l(oipVar).s(frVar, oipVar.d);
            oip oipVar2 = (oip) fcva.T((List) f().g.c());
            boolean zAz = fcva.az((Iterable) f().h.c(), oipVar2);
            f().h(oipVar);
            if (oipVar2 != null && !zAz) {
                f().c(oipVar2);
            }
        }
    }

    @Override // defpackage.oky
    public final void g(olb olbVar) {
        lvc lvcVarP;
        super.g(olbVar);
        for (oip oipVar : (List) olbVar.g.c()) {
            fr frVar = this.f;
            String str = oipVar.d;
            dn dnVar = (dn) frVar.h(str);
            if (dnVar == null || (lvcVarP = dnVar.P()) == null) {
                this.b.add(str);
            } else {
                lvcVarP.c(this.c);
            }
        }
        this.f.q(new fx() { // from class: olj
            @Override // defpackage.fx
            public final void h(ea eaVar) {
                olm olmVar = this.a;
                Set set = olmVar.b;
                fdcm.f(set);
                if (set.remove(eaVar.H)) {
                    eaVar.P().c(olmVar.c);
                }
                Map map = olmVar.d;
                String str2 = eaVar.H;
                fdcm.g(map);
                map.remove(str2);
            }
        });
    }

    @Override // defpackage.oky
    public final void h(oip oipVar) {
        oipVar.getClass();
        fr frVar = this.f;
        if (frVar.ag()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        Map map = this.d;
        String str = oipVar.d;
        dn dnVar = (dn) map.get(str);
        if (dnVar == null) {
            ea eaVarH = frVar.h(str);
            dnVar = eaVarH instanceof dn ? (dn) eaVarH : null;
        }
        if (dnVar != null) {
            dnVar.P().d(this.c);
            dnVar.hh();
        }
        l(oipVar).s(frVar, str);
        olb olbVarF = f();
        List list = (List) olbVarF.g.c();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            oip oipVar2 = (oip) listIterator.previous();
            if (fdbq.f(oipVar2.d, str)) {
                fduf fdufVar = olbVarF.e;
                fdufVar.f(fcwm.h(fcwm.h((Set) fdufVar.c(), oipVar2), oipVar));
                olbVarF.f(oipVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.oky
    public final void j(oip oipVar, boolean z) {
        fr frVar = this.f;
        if (frVar.ag()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) f().g.c();
        int iIndexOf = list.indexOf(oipVar);
        Iterator it = fcva.aj(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            ea eaVarH = frVar.h(((oip) it.next()).d);
            if (eaVarH != null) {
                ((dn) eaVarH).hh();
            }
        }
        k(iIndexOf, oipVar, z);
    }

    public final void k(int i, oip oipVar, boolean z) {
        oip oipVar2 = (oip) fcva.Q((List) f().g.c(), i - 1);
        boolean zAz = fcva.az((Iterable) f().h.c(), oipVar2);
        f().g(oipVar, z);
        if (oipVar2 == null || zAz) {
            return;
        }
        f().c(oipVar2);
    }
}
