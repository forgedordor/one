package com.google.android.apps.messaging.ui.appsettings;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.FederatedLearningSettingsActivity;
import defpackage.achu;
import defpackage.cg;
import defpackage.crbf;
import defpackage.cupt;
import defpackage.cuqc;
import defpackage.dajs;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FederatedLearningSettingsActivity extends cuqc {
    public achu L;
    public fcsu M;

    @Override // defpackage.aiic
    protected final int C() {
        return R.layout.federated_learning_settings_activity_gm3;
    }

    @Override // defpackage.aiic
    protected final Integer G() {
        return Integer.valueOf(R.id.federated_learning_settings_container);
    }

    @Override // defpackage.aiic, defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        TextView textView = (TextView) findViewById(R.id.federated_learning_preference_fragment_container_text_view);
        final String str = (String) crbf.F.e();
        if (!TextUtils.isEmpty(str)) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: cupp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FederatedLearningSettingsActivity federatedLearningSettingsActivity = this.a;
                    ((aise) federatedLearningSettingsActivity.M.b()).c(3, 3);
                    federatedLearningSettingsActivity.L.d(federatedLearningSettingsActivity, str);
                }
            });
        }
        SpannableStringBuilder spannableStringBuilderD = dajs.d(this, R.string.federated_learning_preference_info_text);
        textView.setText(spannableStringBuilderD);
        textView.setContentDescription(spannableStringBuilderD.toString());
        cg cgVar = new cg(a());
        cgVar.D(R.id.federated_learning_preference_fragment_container, new cupt());
        cgVar.j();
    }
}
