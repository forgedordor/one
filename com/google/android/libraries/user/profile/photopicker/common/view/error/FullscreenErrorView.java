package com.google.android.libraries.user.profile.photopicker.common.view.error;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.dsvh;
import defpackage.dswb;
import defpackage.edhe;
import defpackage.edmx;
import defpackage.eygk;
import defpackage.fbgv;
import defpackage.ku;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FullscreenErrorView extends edmx {
    public dswb d;
    public dsvh e;
    public MaterialButton f;
    public MaterialButton g;
    private AppCompatImageView i;
    private MaterialTextView j;

    public FullscreenErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!((edmx) this).h) {
            Object context2 = getContext();
            while (!(context2 instanceof eygk) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            ((eygk) context2).ab().a(this);
        }
        if (fbgv.p()) {
            inflate(getContext(), R.layout.photo_picker_fullscreen_error_remove_settings, this);
        } else {
            inflate(getContext(), R.layout.photo_picker_fullscreen_error, this);
        }
        this.i = (AppCompatImageView) findViewById(R.id.photo_picker_error_image);
        this.j = (MaterialTextView) findViewById(R.id.photo_picker_error_text);
        this.f = (MaterialButton) findViewById(R.id.photo_picker_retry_button);
        this.d.b.a(110128).b(this);
        this.d.b.a(97066).b(this.f);
        if (fbgv.p()) {
            return;
        }
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.photo_picker_settings_button);
        this.g = materialButton;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: edmv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenErrorView fullscreenErrorView = this.a;
                fullscreenErrorView.e.a(dsvg.e(), fullscreenErrorView.g);
                fullscreenErrorView.getContext().startActivity(new Intent("android.settings.SETTINGS"));
            }
        });
        this.d.b.a(104981).b(this.g);
    }

    private final void j(int i) {
        Drawable drawableA = ku.a(getContext(), i);
        drawableA.setTint(getResources().getColor(R.color.google_grey500));
        this.i.setImageDrawable(drawableA);
    }

    public final void b(final View.OnClickListener onClickListener) {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: edmu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenErrorView fullscreenErrorView = this.a;
                fullscreenErrorView.e.a(dsvg.e(), fullscreenErrorView.f);
                onClickListener.onClick(view);
            }
        });
    }

    public final void c(edhe edheVar) {
        int iOrdinal = edheVar.ordinal();
        if (iOrdinal == 0) {
            f();
        } else if (iOrdinal == 1) {
            g();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            d();
        }
    }

    public final void d() {
        j(R.drawable.quantum_gm_ic_cloud_off_vd_theme_24);
        this.j.setText(R.string.op3_check_your_connection);
        this.f.setVisibility(0);
        if (fbgv.p()) {
            return;
        }
        this.g.setVisibility(0);
    }

    public final void f() {
        j(R.drawable.quantum_gm_ic_alert_vd_theme_24);
        this.j.setText(R.string.op3_something_went_wrong);
        this.f.setVisibility(8);
        if (fbgv.p()) {
            return;
        }
        this.g.setVisibility(8);
    }

    public final void g() {
        j(R.drawable.quantum_gm_ic_alert_vd_theme_24);
        this.j.setText(R.string.op3_something_went_wrong);
        this.f.setVisibility(0);
        if (fbgv.p()) {
            return;
        }
        this.g.setVisibility(8);
    }
}
