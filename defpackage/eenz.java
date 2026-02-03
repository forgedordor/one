package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eenz implements oa {
    final /* synthetic */ eeoc a;

    public eenz(eeoc eeocVar) {
        this.a = eeocVar;
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        ona onaVar;
        ojx ojxVar;
        int i;
        ojx ojxVarB;
        onm onmVar = this.a.d;
        if (onmVar != null) {
            okf okfVar = new okf();
            okfVar.a = true;
            ojc ojcVar = onmVar.a;
            ojx ojxVarB2 = ojcVar.b();
            ojxVarB2.getClass();
            oka okaVar = ojxVarB2.e;
            okaVar.getClass();
            of ofVar = (of) menuItem;
            int i2 = ofVar.a;
            if (okaVar.l(i2) instanceof ohu) {
                okfVar.c = R.anim.nav_default_enter_anim;
                okfVar.d = R.anim.nav_default_exit_anim;
                okfVar.e = R.anim.nav_default_pop_enter_anim;
                okfVar.f = R.anim.nav_default_pop_exit_anim;
            } else {
                okfVar.c = R.animator.nav_default_enter_anim;
                okfVar.d = R.animator.nav_default_exit_anim;
                okfVar.e = R.animator.nav_default_pop_enter_anim;
                okfVar.f = R.animator.nav_default_pop_exit_anim;
            }
            if ((ofVar.c & 196608) == 0) {
                okfVar.b(ojz.b(ojcVar.c()).c(), false, false);
            }
            okg okgVarA = okfVar.a();
            try {
                onaVar = ojcVar.b;
                fcuq fcuqVar = onaVar.f;
                ojxVar = fcuqVar.isEmpty() ? onaVar.c : ((oip) fcuqVar.e()).a;
            } catch (IllegalArgumentException e) {
                Log.i("NavigationUI", "Ignoring onNavDestinationSelected for MenuItem " + ojv.a(new omn(ojcVar.a), ofVar.a) + " as it cannot be found from the current destination " + ojcVar.b(), e);
            }
            if (ojxVar == null) {
                throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + ojcVar + '.');
            }
            oik oikVarE = ojxVar.e(i2);
            Bundle bundleA = null;
            if (oikVarE != null) {
                i = oikVarE.a;
                Bundle bundle = oikVarE.c;
                if (bundle != null) {
                    bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
                    bundleA.putAll(bundle);
                }
            } else {
                i = i2;
            }
            if (i == 0) {
                int i3 = okgVarA.c;
                if (i3 != -1) {
                    if (i3 != -1) {
                        onaVar.w(i3, okgVarA.d);
                    }
                    ojxVarB = ojcVar.b();
                    if (ojxVarB != null && ono.a(ojxVarB, i2)) {
                    }
                    return true;
                }
                i = 0;
            }
            if (i == 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            ojx ojxVarD = ojcVar.b.d(i, null);
            if (ojxVarD != null) {
                ojcVar.i(ojxVarD, bundleA, okgVarA);
                ojxVarB = ojcVar.b();
                if (ojxVarB != null) {
                }
                return true;
            }
            omn omnVar = ojcVar.c;
            String strA = ojv.a(omnVar, i);
            if (oikVarE == null) {
                throw new IllegalArgumentException(a.m(ojxVar, strA, "Navigation action/destination ", " cannot be found from the current destination "));
            }
            throw new IllegalArgumentException("Navigation destination " + strA + " referenced from action " + ojv.a(omnVar, i2) + " cannot be found from the current destination " + ojxVar);
        }
        return false;
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) {
    }
}
