package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.cupn;
import defpackage.fdat;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsStatusPreference extends Preference {
    private final fdat a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcsStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = cupn.a;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        pabVar.getClass();
        super.a(pabVar);
        View viewC = pabVar.C(R.id.rcs_sim_status_compose_view);
        ComposeView composeView = viewC instanceof ComposeView ? (ComposeView) viewC : null;
        if (composeView != null) {
            composeView.a(this.a);
        }
    }
}
