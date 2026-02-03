package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypf extends LinearLayout implements dyyh {
    public static final /* synthetic */ int t = 0;
    private static final String u = String.valueOf(dypf.class.getName()).concat(".superState");
    private static final String v = String.valueOf(dypf.class.getName()).concat(".collapsed");
    private static final Interpolator w = new lud();
    public final MyAccountChip a;
    public final SelectedAccountView b;
    public final RecyclerView c;
    public final RecyclerView d;
    public final ViewGroup e;
    public final lvy f;
    public final lvz g;
    public boolean h;
    public dyyb i;
    public dyiw j;
    public ejwi k;
    public dyqd l;
    public dyqr m;
    public dyix n;
    public dydh o;
    public exbg p;
    public ejwi q;
    public dyaf r;
    public final dyay s;

    public dypf(Context context) {
        super(context);
        int i = ekgb.d;
        this.f = new lvy(ekoe.a);
        this.s = new dype(this);
        LayoutInflater.from(context).inflate(R.layout.has_selected_content, this);
        setOrientation(1);
        this.a = (MyAccountChip) findViewById(R.id.my_account_chip);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account_view);
        this.b = selectedAccountView;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accounts);
        this.c = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.account_management_actions);
        this.d = recyclerView2;
        recyclerView.setFocusable(false);
        recyclerView2.setFocusable(false);
        this.e = (ViewGroup) findViewById(R.id.og_critical_alert_container);
        selectedAccountView.l(200L);
        selectedAccountView.m(new lud());
        setLayoutTransition(i());
        if (!fbgh.a.get().a(context)) {
            ((ViewGroup) recyclerView.getParent()).setLayoutTransition(i());
        }
        this.g = new lvz() { // from class: dyou
            @Override // defpackage.lvz
            public final void a(Object obj) {
                final dypf dypfVar = this.a;
                dyrf.a(new Runnable() { // from class: dyot
                    @Override // java.lang.Runnable
                    public final void run() {
                        dypf dypfVar2 = dypfVar;
                        if (dypfVar2.q.g()) {
                            Object objC = dypfVar2.q.c();
                            Context context2 = dypfVar2.getContext();
                            Object objA = ((dydm) dypfVar2.o).b.a();
                            ViewGroup viewGroup = dypfVar2.e;
                            ((dyaj) objC).p(context2, objA, viewGroup, dypfVar2.l, viewGroup, dypfVar2.i, true, dypfVar2.r.b);
                        }
                    }
                });
            }
        };
    }

    public static void d(RecyclerView recyclerView, vo voVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.ao(new LinearLayoutManager());
        dyra.a(recyclerView, voVar);
    }

    public static void f(vo voVar, RecyclerView recyclerView, vx vxVar) {
        if (voVar.a() > 0) {
            recyclerView.ad(vxVar);
            return;
        }
        for (int i = 0; i < recyclerView.e(); i++) {
            if (recyclerView.h(i).equals(vxVar)) {
                return;
            }
        }
        recyclerView.v(vxVar);
    }

    public static dybz h(View view) {
        return new dybz(view, dymv.b(view.getContext()));
    }

    private static LayoutTransition i() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        Interpolator interpolator = w;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }

    public final dyfx a(lvv lvvVar, dymv dymvVar, int i) {
        Context context = getContext();
        dydi dydiVar = ((dydm) this.o).b;
        if (lvvVar == null) {
            int i2 = ekgb.d;
            lvvVar = new lvy(ekoe.a);
        }
        return new dyfx(context, dydiVar, lvvVar, this.l, this.i, i);
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        SelectedAccountView selectedAccountView = this.b;
        dyybVar.b(selectedAccountView, 90784);
        dyybVar.b(selectedAccountView.i, 111271);
    }

    public final void c(boolean z) {
        ecem.c();
        this.h = z;
        int i = true != z ? 0 : 8;
        this.c.setVisibility(i);
        this.d.setVisibility(i);
        this.b.e(!z);
    }

    public final void g(dydh dydhVar, dybw dybwVar, dyfx dyfxVar) {
        View.OnClickListener dyqqVar;
        ecem.c();
        int i = (!((dyii) ((dydm) dydhVar).e).g.e() || (dybwVar.a() <= 0 && dyfxVar.a() <= 0)) ? 3 : 1;
        SelectedAccountView selectedAccountView = this.b;
        selectedAccountView.n(i);
        int i2 = i - 1;
        if (i2 == 0) {
            dyqqVar = new View.OnClickListener() { // from class: dyox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dypf dypfVar = this.a;
                    dypfVar.i.f(new dsve(5), view);
                    dypfVar.c(!dypfVar.h);
                }
            };
        } else if (i2 != 1) {
            dyqqVar = null;
        } else {
            ejwl.l(false);
            dyqs dyqsVar = new dyqs(new View.OnClickListener() { // from class: dyoy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dypf dypfVar = this.a;
                    dyiu dyiuVar = (dyiu) dypfVar.k.c();
                    dypfVar.getContext();
                    dyiuVar.a();
                }
            });
            dyqsVar.d = this.l.b();
            dyqsVar.e = this.l.a();
            dyqsVar.a(this.m, 56);
            dyqqVar = new dyqq(dyqsVar);
        }
        selectedAccountView.setOnClickListener(dyqqVar);
        selectedAccountView.setClickable(i != 3);
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        SelectedAccountView selectedAccountView = this.b;
        dyybVar.e(selectedAccountView.i);
        dyybVar.e(selectedAccountView);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MyAccountChip myAccountChip = this.a;
        CharSequence text = myAccountChip.getText();
        myAccountChip.a.b(((View) myAccountChip.getParent()).getMeasuredWidth());
        if (TextUtils.equals(text, myAccountChip.getText())) {
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(u);
            c(bundle.getBoolean(v));
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(u, super.onSaveInstanceState());
        bundle.putBoolean(v, this.h);
        return bundle;
    }
}
