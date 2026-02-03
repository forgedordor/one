package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.ecrq;
import defpackage.ecrz;
import defpackage.ecsj;
import defpackage.fblt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyPromptBannerWrapper extends FrameLayout {
    public SurveyPromptBannerWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int i3;
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fblt.a.get().b(ecrz.b))) {
            i3 = i;
            i2 = ecrq.b(this, findViewById(R.id.survey_prompt_banner), i3, i2, findViewById(R.id.survey_prompt_header), null, false);
        } else {
            i3 = i;
        }
        super.onMeasure(i3, i2);
    }
}
