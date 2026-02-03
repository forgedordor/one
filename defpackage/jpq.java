package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpq {
    public static final Map a = new LinkedHashMap();

    public static final hnb a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof hnb) {
            return (hnb) tag;
        }
        return null;
    }

    public static final void b(View view, hnb hnbVar) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, hnbVar);
    }

    public static /* synthetic */ hqq c(View view, fcyh fcyhVar, int i) {
        fcyh fcyhVarA;
        hpn hpnVar;
        if ((i & 1) != 0) {
            fcyhVar = fcyi.a;
        }
        if (fcyhVar.get(fcya.k) == null || fcyhVar.get(hoq.e) == null) {
            fctc fctcVar = jkj.a;
            if (jkk.a()) {
                fcyhVarA = jkh.a();
            } else {
                fcyhVarA = (fcyh) jkj.b.get();
                if (fcyhVarA == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            fcyhVar = fcyhVarA.plus(fcyhVar);
        }
        hoq hoqVar = (hoq) fcyhVar.get(hoq.e);
        if (hoqVar != null) {
            hpn hpnVar2 = new hpn(hoqVar);
            hol holVar = hpnVar2.a;
            synchronized (holVar.a) {
                holVar.d = false;
            }
            hpnVar = hpnVar2;
        } else {
            hpnVar = null;
        }
        fdci fdciVar = new fdci();
        fcyh jnpVar = (icv) fcyhVar.get(icv.b);
        if (jnpVar == null) {
            jnpVar = new jnp();
            fdciVar.a = jnpVar;
        }
        fcyh fcyhVarPlus = fcyhVar.plus(hpnVar != null ? hpnVar : fcyi.a).plus(jnpVar);
        hqq hqqVar = new hqq(fcyhVarPlus);
        hqqVar.x();
        fdjx fdjxVarB = fdjy.b(fcyhVarPlus);
        lvj lvjVarA = lxr.a(view);
        lvc lvcVarP = lvjVarA != null ? lvjVarA.P() : null;
        if (lvcVarP != null) {
            view.addOnAttachStateChangeListener(new jpj(view, hqqVar));
            lvcVarP.c(new jpn(fdjxVarB, hpnVar, hqqVar, fdciVar, view));
            return hqqVar;
        }
        Objects.toString(view);
        itw.b("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new fcta();
    }
}
