package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.cupl;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExperimentBadgePreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentBadgePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        pabVar.getClass();
        super.a(pabVar);
        View viewC = pabVar.C(R.id.experiment_badge);
        viewC.getClass();
        ((ComposeView) viewC).a(cupl.b);
    }
}
