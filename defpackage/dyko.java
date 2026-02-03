package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyko extends dyaj {
    public ekgp a = ekoj.a;
    private final dxxk h;

    public dyko(dxxk dxxkVar) {
        this.h = dxxkVar;
    }

    @Override // defpackage.dyaj
    public final ddfo b(Object obj) {
        return (ddfo) ejwi.i(q(obj)).b(new ejvr() { // from class: dykm
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return ((dyal) obj2).a();
            }
        }).f();
    }

    @Override // defpackage.dyaj
    public final boolean c(ekgb ekgbVar) {
        return ekis.q(ekgbVar, new ejwm() { // from class: dykl
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return this.a.b(obj) != null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dyaj
    public final void p(Context context, final Object obj, ViewGroup viewGroup, final dyqd dyqdVar, View view, final dyyb dyybVar, boolean z, dxxr dxxrVar) {
        final boolean z2;
        dyku dykuVar;
        ejwl.m(viewGroup.getChildCount() <= 1, "Critical alert container can contain one child at most.");
        View childAt = viewGroup.getChildAt(0);
        ejwl.m(childAt == null || (childAt instanceof dyku), "Critical alert container can only contain children of type CriticalAlertView.");
        ddfo ddfoVarB = b(obj);
        if (ddfoVarB == null) {
            if (childAt != null) {
                ((dyku) childAt).gW(dyybVar);
                viewGroup.removeAllViews();
            }
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
            view.setContentDescription(null);
            view.setFocusable(false);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        if (childAt == null) {
            z2 = z;
            dykuVar = new dyku(context, z2);
            viewGroup.addView(dykuVar);
            dykuVar.b(dyybVar);
        } else {
            z2 = z;
            dykuVar = (dyku) childAt;
        }
        final dyku dykuVar2 = dykuVar;
        dxxk dxxkVar = this.h;
        dykuVar2.a.setText(ddfoVarB.c);
        dykuVar2.b.setText(ddfoVarB.d);
        dykuVar2.c.a(ekgb.s(ddfoVarB.e, ddfoVarB.f));
        dykuVar2.setContentDescription(dykuVar2.getContext().getString(R.string.og_account_critical_alert_view_label_a11y, ddfoVarB.c, dxxt.b(obj, dxxkVar)) + "\n" + ddfoVarB.d + "\n" + ddfoVarB.e);
        String strB = dymu.b(dxxkVar, obj);
        ekgb ekgbVarR = r(obj);
        int size = ekgbVarR.size();
        for (int i = 0; i < size; i++) {
            ddfo ddfoVarA = ((dyal) ekgbVarR.get(i)).a();
            if (!ddfoVarA.h) {
                s(strB, ddfoVarA);
            }
        }
        dykuVar2.setOnClickListener(new View.OnClickListener() { // from class: dykj
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view2) {
                dyybVar.f(new dsve(5), view2);
                final boolean z3 = z2;
                final dyko dykoVar = this.a;
                final Object obj2 = obj;
                dyqc.a(dyqdVar, new Runnable() { // from class: dyki
                    @Override // java.lang.Runnable
                    public final void run() {
                        dyko dykoVar2 = dykoVar;
                        dykoVar2.t(dykoVar2.q(obj2), view2, z3);
                    }
                });
            }
        });
        viewGroup.setVisibility(0);
        view.setContentDescription(dykuVar2.getContentDescription());
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: dykk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dykuVar2.performClick();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dyal q(Object obj) {
        ekgb ekgbVarR = r(obj);
        if (ekgbVarR.isEmpty()) {
            return null;
        }
        return (dyal) ekgbVarR.get(0);
    }

    public final ekgb r(Object obj) {
        ekgb ekgbVar = (ekgb) dymu.a(this.h, obj, this.a, null);
        if (ekgbVar != null) {
            return ekgbVar;
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    protected abstract void s(String str, ddfo ddfoVar);

    protected abstract void t(dyal dyalVar, View view, boolean z);
}
