package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyor extends vo {
    public final ains a;
    public final ains d;
    public final eigp e;
    public final Context f;
    public final fcsu g;
    public final einm h;
    public List i;
    private final ekgp j;
    private final String k;
    private final cqjk l;
    private final cqtj m;
    private final cema n;
    private final cfga o;
    private final fcsu p;
    private final Optional q;
    private final fcsu r;
    private final fcsu s;
    private View t;
    private View u;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;

    public cyor(cqjk cqjkVar, cqtj cqtjVar, ains ainsVar, ains ainsVar2, cema cemaVar, cfga cfgaVar, fcsu fcsuVar, einm einmVar, eigp eigpVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, Context context, Optional optional) throws Resources.NotFoundException {
        this.l = cqjkVar;
        this.m = cqtjVar;
        this.a = ainsVar;
        this.d = ainsVar2;
        this.n = cemaVar;
        this.o = cfgaVar;
        this.p = fcsuVar2;
        this.e = eigpVar;
        this.f = context;
        this.h = einmVar;
        this.r = fcsuVar;
        this.s = fcsuVar4;
        this.q = optional;
        this.g = fcsuVar3;
        Resources resources = context.getResources();
        String string = resources.getString(R.string.desktop_browser_type_unknown);
        this.k = string;
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(epnp.UNKNOWN, string);
        ekgiVar.i(epnp.OTHER, resources.getString(R.string.desktop_browser_type_other));
        ekgiVar.i(epnp.CHROME, resources.getString(R.string.desktop_browser_type_chrome));
        ekgiVar.i(epnp.FIREFOX, resources.getString(R.string.desktop_browser_type_firefox));
        ekgiVar.i(epnp.SAFARI, resources.getString(R.string.desktop_browser_type_safari));
        ekgiVar.i(epnp.OPERA, resources.getString(R.string.desktop_browser_type_opera));
        ekgiVar.i(epnp.IE, resources.getString(R.string.desktop_browser_type_ie));
        ekgiVar.i(epnp.EDGE, resources.getString(R.string.desktop_browser_type_edge));
        this.j = ekgiVar.c();
    }

    private final boolean I() {
        return ((aqpb) this.s.b()).a() ? abxb.b() && this.x && this.q.isPresent() && ((Optional) this.g.b()).isPresent() : abxb.b() && this.q.isPresent() && ((Optional) this.g.b()).isPresent();
    }

    final void F(boolean z) {
        this.v = true;
        this.w = z;
        p();
    }

    final void G(boolean z) {
        this.x = z;
        p();
    }

    final void H(LottieAnimationView lottieAnimationView) {
        (((cpch) this.p.b()).g() ? this.w ? eebi.a : eebk.a : this.w ? eebj.a : eebl.a).g(lottieAnimationView);
    }

    @Override // defpackage.vo
    public final int a() {
        if (!this.v) {
            return 0;
        }
        List list = this.i;
        if (list == null || list.isEmpty()) {
            return 1;
        }
        return this.i.size() + 2;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        if (i == 0) {
            return 0;
        }
        return i == this.i.size() + 1 ? 2 : 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f);
        if (i != 0) {
            if (i == 1) {
                return new cyoq(layoutInflaterFrom.inflate(R.layout.paired_desktop_list_item_view, viewGroup, false));
            }
            if (i == 2) {
                return new cyoq(layoutInflaterFrom.inflate(R.layout.delete_all_desktops_button, viewGroup, false));
            }
            throw new IllegalStateException(a.e(i, "View type ", " is not supported."));
        }
        View viewInflate = layoutInflaterFrom.inflate(this.w ? R.layout.cms_no_qr_welcome_banner : (((aqpb) this.s.b()).a() || I()) ? R.layout.qr_welcome_banner_animated_add_gaia : R.layout.qr_welcome_banner_animated, viewGroup, false);
        this.t = viewInflate.findViewById(R.id.ditto_welcome_banner);
        this.u = viewInflate.findViewById(R.id.simplified_ditto_welcome_banner);
        LottieAnimationView lottieAnimationView = this.w ? (LottieAnimationView) this.t.findViewById(R.id.cms_illustration) : (LottieAnimationView) this.t.findViewById(R.id.qr_illustration);
        H(lottieAnimationView);
        lottieAnimationView.d();
        return new cyoq(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0255  */
    @Override // defpackage.vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.wv r13, int r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyor.g(wv, int):void");
    }

    final void l(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezol ezolVarA = bvfe.a(((baia) it.next()).a.q());
            ((bvio) this.r.b()).r(ezolVarA.c, 11);
            this.n.a(this.o.a(ezolVarA));
        }
    }
}
