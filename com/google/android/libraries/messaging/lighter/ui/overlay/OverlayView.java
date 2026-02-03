package com.google.android.libraries.messaging.lighter.ui.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.dwqf;
import defpackage.dwqs;
import defpackage.dwye;
import defpackage.dwyh;
import defpackage.dwyo;
import defpackage.ejwi;
import defpackage.evqs;
import defpackage.fbfm;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class OverlayView extends FrameLayout implements dwye {
    final LinearLayout a;
    public final MaterialCardView b;
    public final ImageView c;
    public final FrameLayout.LayoutParams d;
    public final FrameLayout.LayoutParams e;
    private final ImageView f;
    private final TextView g;
    private final LinearLayout h;
    private final FrameLayout.LayoutParams i;

    public OverlayView(Context context) {
        this(context, null);
    }

    public static boolean c(View view) {
        return view.getVisibility() == 0;
    }

    private static void d(View view, boolean z) {
        view.setVisibility(true != z ? 4 : 0);
    }

    private static boolean e(ejwi ejwiVar) {
        return ejwiVar.g() && !((String) ejwiVar.c()).isEmpty();
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.CharSequence, java.lang.Object] */
    public final void b(dwqs dwqsVar, boolean z) {
        LinearLayout linearLayout = this.a;
        linearLayout.removeAllViews();
        linearLayout.setVisibility(8);
        if (z) {
            this.i.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_margin);
        } else {
            this.i.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_collapsed_margin);
        }
        this.b.setLayoutParams(this.i);
        setClickable(false);
        setVisibility(0);
        setBackgroundColor(getContext().getColor(R.color.overlay_background_transparent_color));
        boolean z2 = dwqsVar.g().g() && ((dwqf) dwqsVar.g().c()).e().length != 0;
        if (z2) {
            Object objC = dwqsVar.g().c();
            ImageView imageView = this.f;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            dwqf dwqfVar = (dwqf) objC;
            layoutParams.height = dwyo.a(getContext(), dwqfVar.a());
            layoutParams.width = dwyo.a(getContext(), dwqfVar.b());
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(dwqfVar.e(), 0, dwqfVar.e().length));
            imageView.setContentDescription(dwqfVar.d());
        } else if (dwqsVar.d().g()) {
            byte[] bArrI = ((evqs) dwqsVar.d().c()).I();
            this.f.setImageBitmap(BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length));
        }
        if (e(dwqsVar.e())) {
            this.g.setText((CharSequence) dwqsVar.e().c());
        }
        ImageView imageView2 = this.f;
        d(imageView2, z2);
        TextView textView = this.g;
        d(textView, e(dwqsVar.e()));
        ImageView imageView3 = this.c;
        d(imageView3, !dwqsVar.i());
        if (c(imageView2) || c(textView) || c(imageView3)) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.i = layoutParams;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        this.d = layoutParams2;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        this.e = layoutParams3;
        inflate(getContext(), R.layout.overlay_layout, this);
        this.f = (ImageView) findViewById(R.id.display_icon);
        this.g = (TextView) findViewById(R.id.title);
        this.a = (LinearLayout) findViewById(R.id.overlay_content);
        this.b = (MaterialCardView) findViewById(R.id.overlay_card_view);
        this.h = (LinearLayout) findViewById(R.id.overlay_header);
        this.c = (ImageView) findViewById(R.id.dismiss_button);
        layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_bottom_margin));
        layoutParams.gravity = 0;
        layoutParams2.setMargins(getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), 0, getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), 0);
        layoutParams2.gravity = 17;
        layoutParams3.gravity = 80;
        getResources().getDimensionPixelSize(R.dimen.overlay_card_view_corner_radius);
    }
}
