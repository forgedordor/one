package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqq implements lun {
    public cyqr a;
    public final Map b = new HashMap();
    private final ea c;
    private int d;
    private Animation e;
    private Animation f;

    public cyqq(ea eaVar) {
        this.c = eaVar;
        ((czmk) eaVar).a.c(this);
    }

    private final void j(int i) {
        View decorView;
        if (this.c.Q == null || (decorView = g().getWindow().getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(i);
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        cyqr cyqrVar = this.a;
        i(cyqrVar.b && cyqrVar.a, false);
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        g().getWindow().getDecorView().setSystemUiVisibility(this.d);
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        Map.EL.replaceAll(this.b, new BiFunction() { // from class: cyql
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return null;
            }
        });
    }

    public final eg g() {
        return this.c.G();
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        cyqr cyqrVar = (cyqr) new lxo(g()).a(cyqr.class);
        this.a = cyqrVar;
        cyqrVar.c.f(this.c, new lvz() { // from class: cyqm
            @Override // defpackage.lvz
            public final void a(Object obj) {
                this.a.i(((Boolean) obj).booleanValue(), true);
            }
        });
        this.d = g().getWindow().getDecorView().getSystemUiVisibility();
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        eg egVarG = g();
        if (this.e == null) {
            this.e = AnimationUtils.loadAnimation(egVarG, R.anim.fullscreen_fade_in);
            this.f = AnimationUtils.loadAnimation(egVarG, R.anim.fullscreen_fade_out);
            this.e.setAnimationListener(new cyqn(this));
            this.f.setAnimationListener(new cyqo(this));
        }
    }

    public final void h(cyqp cyqpVar) {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        czmx czmxVar = (czmx) cyqpVar;
        if (!czmxVar.aa && (view = czmxVar.H.Q) != null) {
            ea eaVar = czmxVar.t;
            if (eaVar == null || ((view2 = eaVar.Q) != null && view2.getVisibility() != 0)) {
                arrayList.add(czmxVar.c());
            }
            arrayList.add(view.findViewById(R.id.primary_button));
            arrayList.add(view.findViewById(R.id.secondary_button_container));
            arrayList.add(view.findViewById(R.id.media_viewer_duration_text));
        }
        this.b.put(cyqpVar, arrayList);
    }

    public final void i(boolean z, boolean z2) {
        if (z) {
            j(3846);
        } else {
            j(1792);
        }
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    View view = (View) it2.next();
                    if (z2) {
                        view.setVisibility(true != z ? 4 : 0);
                        view.requestLayout();
                        view.startAnimation(!z ? this.e : this.f);
                    } else {
                        view.setVisibility(true == z ? 8 : 0);
                    }
                }
            }
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }
}
