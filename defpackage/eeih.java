package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeih extends eeiy {
    public eeht a;
    public RecyclerView ag;
    public View ah;
    public MaterialButton ai;
    public int aj;
    private int al;
    private eehu am;
    private View an;
    private View ao;
    private View ap;
    private AccessibilityManager aq;
    public eehq b;
    public eeis c;
    public eehs d;
    public RecyclerView e;

    static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private final void q(int i) {
        this.ag.post(new eehx(this, i));
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(z(), this.al);
        this.d = new eehs(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.aq = (AccessibilityManager) A().getSystemService("accessibility");
        eeis eeisVar = this.b.a;
        boolean zBa = eeio.ba(contextThemeWrapper);
        View viewInflate = layoutInflaterCloneInContext.inflate(true != zBa ? R.layout.mtrl_calendar_horizontal : R.layout.mtrl_calendar_vertical, viewGroup, false);
        Resources resources = A().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i = eeit.a;
        viewInflate.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ley.p(gridView, new eehy());
        int i2 = this.b.e;
        gridView.setAdapter((ListAdapter) (i2 > 0 ? new eehv(i2) : new eehv()));
        gridView.setNumColumns(eeisVar.d);
        gridView.setEnabled(false);
        this.ag = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.ag.ao(new eehz(this, zBa ? 1 : 0, zBa ? 1 : 0));
        this.ag.setTag("MONTHS_VIEW_GROUP_TAG");
        eeiw eeiwVar = new eeiw(contextThemeWrapper, this.a, this.b, this.am, new eeia(this));
        this.ag.al(eeiwVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e = recyclerView;
        if (recyclerView != null) {
            recyclerView.aK();
            this.e.ao(new GridLayoutManager(integer, 1));
            this.e.al(new eejg(this));
            this.e.v(new eeic(this));
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.ai = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ley.p(this.ai, new eeid(this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.an = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.ao = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.ap = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.ah = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            p(1);
            this.ai.setText(this.c.f());
            this.ag.y(new eeie(this, eeiwVar));
            this.ai.setOnClickListener(new eeif(this));
            this.ao.setOnClickListener(new eeig(this, eeiwVar));
            this.an.setOnClickListener(new eehw(this, eeiwVar));
            f(eeiwVar.l(this.c));
        }
        if (!eeio.ba(contextThemeWrapper)) {
            new ve().f(this.ag);
        }
        this.ag.aj(eeiwVar.l(this.c));
        ley.p(this.ag, new eeib());
        return viewInflate;
    }

    final LinearLayoutManager b() {
        return (LinearLayoutManager) this.ag.o;
    }

    final void e(eeis eeisVar) {
        eeiw eeiwVar = (eeiw) this.ag.n;
        int iL = eeiwVar.l(eeisVar);
        AccessibilityManager accessibilityManager = this.aq;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iL2 = iL - eeiwVar.l(this.c);
            int iAbs = Math.abs(iL2);
            this.c = eeisVar;
            if (iAbs <= 3) {
                q(iL);
            } else if (iL2 > 0) {
                this.ag.aj(iL - 3);
                q(iL);
            } else {
                this.ag.aj(iL + 3);
                q(iL);
            }
        } else {
            this.c = eeisVar;
            this.ag.aj(iL);
        }
        f(iL);
    }

    public final void f(int i) {
        this.ao.setEnabled(i + 1 < this.ag.n.a());
        this.an.setEnabled(i + (-1) >= 0);
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.al = bundle.getInt("THEME_RES_ID_KEY");
        this.a = (eeht) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b = (eehq) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.am = (eehu) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.c = (eeis) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.al);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.am);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c);
    }

    final void p(int i) {
        this.aj = i;
        if (i != 2) {
            this.ap.setVisibility(8);
            this.ah.setVisibility(0);
            this.an.setVisibility(0);
            this.ao.setVisibility(0);
            e(this.c);
            return;
        }
        RecyclerView recyclerView = this.e;
        recyclerView.o.aa(((eejg) recyclerView.n).l(this.c.c));
        this.ap.setVisibility(0);
        this.ah.setVisibility(8);
        this.an.setVisibility(8);
        this.ao.setVisibility(8);
    }
}
