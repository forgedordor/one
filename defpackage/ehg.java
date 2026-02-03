package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehg {
    public static final WeakHashMap a = new WeakHashMap();
    public final eby b;
    public final eby c;
    public final eby d;
    public final eby e;
    public final eby f;
    public final ehc g;
    public final boolean h;
    public int i;
    public final efg j;
    private final eby k = new eby(4, "captionBar");
    private final eby l;
    private final eby m;
    private final eby n;
    private final eha o;
    private final eha p;
    private final eha q;
    private final eha r;
    private final eha s;
    private final eha t;
    private final eha u;
    private final eha v;

    public ehg(View view) {
        eby ebyVar = new eby(128, "displayCutout");
        this.b = ebyVar;
        eby ebyVar2 = new eby(8, "ime");
        this.c = ebyVar2;
        this.l = new eby(32, "mandatorySystemGestures");
        this.d = new eby(2, "navigationBars");
        this.e = new eby(1, "statusBars");
        eby ebyVar3 = new eby(519, "systemBars");
        this.f = ebyVar3;
        this.m = new eby(16, "systemGestures");
        this.n = new eby(64, "tappableElement");
        this.o = ehv.b(kzc.a, "waterfall");
        this.g = new egw(new egw(ebyVar3, ebyVar2), ebyVar);
        this.p = ehv.b(kzc.a, "captionBarIgnoringVisibility");
        this.q = ehv.b(kzc.a, "navigationBarsIgnoringVisibility");
        this.r = ehv.b(kzc.a, "statusBarsIgnoringVisibility");
        this.s = ehv.b(kzc.a, "systemBarsIgnoringVisibility");
        this.t = ehv.b(kzc.a, "tappableElementIgnoringVisibility");
        this.u = ehv.b(kzc.a, "imeAnimationTarget");
        this.v = ehv.b(kzc.a, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.h = bool != null ? bool.booleanValue() : false;
        this.j = new efg(this);
    }

    public static /* synthetic */ void c(ehg ehgVar, lgt lgtVar) {
        ehgVar.k.f(lgtVar);
        ehgVar.c.f(lgtVar);
        ehgVar.b.f(lgtVar);
        ehgVar.d.f(lgtVar);
        ehgVar.e.f(lgtVar);
        ehgVar.f.f(lgtVar);
        ehgVar.m.f(lgtVar);
        ehgVar.n.f(lgtVar);
        ehgVar.l.f(lgtVar);
        ehgVar.p.f(ehv.a(lgtVar.g(4)));
        ehgVar.q.f(ehv.a(lgtVar.g(2)));
        ehgVar.r.f(ehv.a(lgtVar.g(1)));
        ehgVar.s.f(ehv.a(lgtVar.g(519)));
        ehgVar.t.f(ehv.a(lgtVar.g(64)));
        lcz lczVarJ = lgtVar.j();
        if (lczVarJ != null) {
            ehgVar.o.f(ehv.a(lczVarJ.e()));
        }
        hzf.f();
    }

    public final void a(lgt lgtVar) {
        this.v.f(ehv.a(lgtVar.f(8)));
    }

    public final void b(lgt lgtVar) {
        this.u.f(ehv.a(lgtVar.f(8)));
    }
}
