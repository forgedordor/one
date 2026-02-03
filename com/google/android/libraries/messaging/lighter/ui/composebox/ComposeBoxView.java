package com.google.android.libraries.messaging.lighter.ui.composebox;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.composebox.LighterEditText;
import defpackage.csg;
import defpackage.csh;
import defpackage.dvho;
import defpackage.dwxq;
import defpackage.dwyh;
import defpackage.dwyn;
import defpackage.dwyo;
import defpackage.dwyy;
import defpackage.dwza;
import defpackage.dwzd;
import defpackage.dwze;
import defpackage.dwzg;
import defpackage.eehg;
import defpackage.eejq;
import defpackage.fbfm;
import defpackage.kyy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ComposeBoxView extends CardView implements dwyy {
    public final LighterEditText g;
    public boolean h;
    private final LinearLayout i;
    private final ImageButton j;
    private final ViewGroup k;

    static {
        Color.parseColor("#F1F3F4");
        Color.parseColor("#1A73E8");
        Color.parseColor("#9AA0A6");
    }

    public ComposeBoxView(Context context) {
        this(context, null);
    }

    private final int g(float f) {
        return dwyo.a(getContext(), f);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dwza dwzaVar = (dwza) obj;
        this.j.setOnClickListener(new View.OnClickListener() { // from class: dwzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LighterEditText lighterEditText = this.a.g;
                dwzaVar.b.a(lighterEditText.getText() == null ? null : lighterEditText.getText().toString());
                lighterEditText.setText("");
            }
        });
        this.g.addTextChangedListener(new dwzd(this, dwzaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwyy
    public final void b(dwxq dwxqVar) {
        ViewGroup viewGroup = this.k;
        viewGroup.removeAllViews();
        viewGroup.addView((View) dwxqVar);
    }

    @Override // defpackage.dwyy
    public final void c(CharSequence charSequence) {
        LighterEditText lighterEditText = this.g;
        lighterEditText.setText(charSequence);
        lighterEditText.setSelection(charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.g.clearFocus();
    }

    public final void f(boolean z) {
        ImageButton imageButton = this.j;
        imageButton.setEnabled(z);
        imageButton.setColorFilter(z ? eehg.b(this, R.attr.colorPrimary) : eehg.b(this, R.attr.colorOnSurfaceVariant), PorterDuff.Mode.SRC_IN);
    }

    public ComposeBoxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.composeBoxStyle);
    }

    public ComposeBoxView(Context context, AttributeSet attributeSet, int i) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        this.h = false;
        inflate(getContext(), R.layout.compose_view_layout, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_container);
        this.i = linearLayout;
        ImageButton imageButton = (ImageButton) findViewById(R.id.send_message_button);
        this.j = imageButton;
        LighterEditText lighterEditText = (LighterEditText) findViewById(R.id.compose);
        this.g = lighterEditText;
        this.k = (ViewGroup) findViewById(R.id.attachment_preview_container);
        imageButton.setImageResource(R.drawable.quantum_gm_ic_send_vd_24);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dwzg.a, i, R.style.LighterComposeBox);
        gQ(eejq.a(R.dimen.m3_sys_elevation_level3, getContext()));
        e(typedArrayObtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.compose_box_border_radius)));
        d(0.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(g(1.0f), eejq.a(R.dimen.m3_sys_elevation_level3, getContext()));
        linearLayout.setBackground(gradientDrawable);
        if (dvho.a(getContext())) {
            linearLayout.setPadding(g(0.0f), g(0.0f), g(12.0f), g(0.0f));
        } else {
            linearLayout.setPadding(g(12.0f), g(0.0f), g(0.0f), g(0.0f));
        }
        if (!this.a) {
            this.a = true;
            csh cshVar = CardView.e;
            csg csgVar = this.f;
            cshVar.a(csgVar, csh.b(csgVar));
        }
        lighterEditText.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(2, R.style.ComposeBoxInputText));
        lighterEditText.setTypeface(kyy.b(getContext(), R.font.google_sans_text));
        lighterEditText.setHighlightColor(getResources().getColor(true != dwyh.c(getContext()) ? R.color.input_text_highlight_font_color_dark : R.color.input_text_highlight_font_color_light));
        lighterEditText.setHintTextColor(typedArrayObtainStyledAttributes.getColor(0, eehg.b(this, R.attr.colorOnSurfaceVariant)));
        lighterEditText.setHint(R.string.composebox_text_placeholder);
        lighterEditText.addTextChangedListener(new dwze(this));
        lighterEditText.setBackgroundColor(0);
        lighterEditText.setInputType(147457);
        f(false);
        dwyn.a(lighterEditText, eehg.b(this, R.attr.colorPrimary));
        typedArrayObtainStyledAttributes.recycle();
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dwzb
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    this.a.g.requestFocus();
                }
            }
        });
    }
}
