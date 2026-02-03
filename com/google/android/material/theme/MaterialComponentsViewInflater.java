package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.eegq;
import defpackage.eewr;
import defpackage.qm;
import defpackage.qp;
import defpackage.rf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final qm a(Context context, AttributeSet attributeSet) {
        return new eewr(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final qp b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new eegq(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final rf d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
