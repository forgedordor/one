package com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import defpackage.acin;
import defpackage.acmo;
import defpackage.einm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdvancedFeedbackDataView extends acmo {
    public CheckBox g;
    public TextView h;
    public TextView i;
    public acin j;
    public einm k;

    public AdvancedFeedbackDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Optional f() {
        acin acinVar = this.j;
        return acinVar == null ? Optional.empty() : Optional.of(acinVar);
    }

    public final boolean g() {
        return this.g.isChecked();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (CheckBox) findViewById(R.id.advanced_feedback_data_checkbox);
        this.i = (TextView) findViewById(R.id.advanced_feedback_learn_more_button);
        this.h = (TextView) findViewById(R.id.advanced_feedback_data_title);
        this.k.a(this.i, new View.OnClickListener() { // from class: aclg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvancedFeedbackDataView advancedFeedbackDataView = this.a;
                acin acinVar = advancedFeedbackDataView.j;
                if (acinVar != null) {
                    einf.g(new acmh(acinVar), advancedFeedbackDataView.i);
                }
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: aclh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvancedFeedbackDataView advancedFeedbackDataView = this.a;
                TextView textView = advancedFeedbackDataView.i;
                if (view == textView) {
                    textView.callOnClick();
                } else {
                    advancedFeedbackDataView.g.toggle();
                }
            }
        });
    }
}
