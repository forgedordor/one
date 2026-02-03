package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.dggn;
import defpackage.eebt;
import defpackage.pab;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsSimStatusPreference extends Preference {
    public LinearLayout a;
    private MaterialCardView b;
    private TextView c;
    private int d;
    private SpannableStringBuilder e;
    private LinearLayout f;
    private final List g;

    public RcsSimStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 8;
        this.g = new ArrayList();
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        LinearLayout linearLayout = (LinearLayout) pabVar.C(R.id.rcs_sim_status_list);
        if (linearLayout != null) {
            this.a = linearLayout;
            List<RcsSimStatusView> list = this.g;
            if (!list.isEmpty() && this.a.getChildCount() == 0) {
                for (RcsSimStatusView rcsSimStatusView : list) {
                    l(rcsSimStatusView, rcsSimStatusView.H().c);
                }
                list.clear();
            }
        }
        TextView textView = (TextView) pabVar.C(R.id.legal_banner_text);
        if (textView != null) {
            this.c = textView;
            o(this.e);
        }
        MaterialCardView materialCardView = (MaterialCardView) pabVar.C(R.id.legal_banner);
        if (materialCardView != null) {
            this.b = materialCardView;
            ab(this.d);
        }
    }

    public final void ab(int i) {
        this.d = i;
        MaterialCardView materialCardView = this.b;
        if (materialCardView != null) {
            materialCardView.setVisibility(i);
        }
    }

    public final LinearLayout k() {
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = this.a;
        if (linearLayout2 != null && linearLayout2.getParent() != null && (this.a.getParent() instanceof LinearLayout)) {
            this.f = (LinearLayout) this.a.getParent();
        }
        return this.f;
    }

    public final void l(RcsSimStatusView rcsSimStatusView, dggn dggnVar) {
        rcsSimStatusView.H().c = dggnVar;
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.addView(rcsSimStatusView);
        } else {
            this.g.add(rcsSimStatusView);
        }
    }

    public final void o(SpannableStringBuilder spannableStringBuilder) {
        this.e = spannableStringBuilder;
        TextView textView = this.c;
        if (textView == null || spannableStringBuilder == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
        eebt.b(this.c);
    }
}
