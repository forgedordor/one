package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecuv extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final ekgb c = ekgb.v(Integer.valueOf(R.drawable.very_dissatisfied), Integer.valueOf(R.drawable.dissatisfied), Integer.valueOf(R.drawable.neutral), Integer.valueOf(R.drawable.satisfied), Integer.valueOf(R.drawable.very_satisfied));
    public ecuu a;
    private exqi d;

    public ecuv(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_rating_container, (ViewGroup) this, true);
    }

    public static void b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    public static void c(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    public static boolean e(MotionEvent motionEvent, View view) {
        return motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) view.getHeight());
    }

    private final Drawable f(int i, int i2) {
        return ecrw.a(getContext().getDrawable(i), getContext(), i2);
    }

    private static void g(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    private final void h(View view, int i, int i2, int i3) throws Resources.NotFoundException {
        NumberFormat numberFormat = NumberFormat.getInstance(getContext().getResources().getConfiguration().getLocales().get(0));
        String str = numberFormat.format(i);
        String str2 = numberFormat.format(i2);
        String string = getContext().getString(R.string.survey_num_rating, str, str2);
        if (i3 == 4) {
            string = getResources().getQuantityString(R.plurals.survey_star_rating, i, Integer.valueOf(i), Integer.valueOf(i2));
            i3 = 4;
        }
        if (i == 1) {
            string = string + " " + this.d.e;
        } else if (i == i2) {
            string = string + " " + this.d.f;
        }
        if (i3 == 3) {
            string = getContext().getString(R.string.survey_smiley_rating, str, str2, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : getContext().getString(R.string.survey_very_satisfied) : getContext().getString(R.string.survey_somewhat_satisfied) : getContext().getString(R.string.survey_neutral) : getContext().getString(R.string.survey_somewhat_dissatisfied) : getContext().getString(R.string.survey_very_dissatisfied));
        }
        view.setContentDescription(string);
    }

    public final int a(int i) {
        return getContext().getColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(exqi exqiVar) throws Resources.NotFoundException {
        this.d = exqiVar;
        int i = exqiVar.c;
        if (i < 2 || i > 7) {
            throw new IllegalArgumentException("Number of ratings must be between 2 and 7.");
        }
        int iA = exqh.a(exqiVar.b);
        if (iA == 0 || iA != 6) {
            g((TextView) findViewById(R.id.survey_rating_low_value_text), exqiVar.e);
            g((TextView) findViewById(R.id.survey_rating_high_value_text), exqiVar.f);
        }
        int i2 = exqiVar.b;
        int iA2 = exqh.a(i2);
        int i3 = R.id.survey_rating_image_icon;
        int i4 = R.id.survey_rating_image_layout;
        int i5 = R.layout.survey_question_rating_image_item;
        if (iA2 != 0 && iA2 == 3) {
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            ekgb ekgbVar = c;
            int i6 = ((ekoe) ekgbVar).c;
            final int i7 = 0;
            while (i7 < i6) {
                View viewInflate = layoutInflaterFrom.inflate(i5, viewGroup, false);
                if (i7 == 0) {
                    viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i7 = 0;
                }
                final FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(i4);
                final ImageView imageView = (ImageView) frameLayout.findViewById(i3);
                imageView.setImageDrawable(ecrw.a(getContext().getDrawable(((Integer) ekgbVar.get(i7)).intValue()), getContext(), a(R.color.survey_grey_icon_color)));
                i7++;
                imageView.setTag(Integer.valueOf(i7));
                h(imageView, i7, i6, 3);
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: ecuo
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        FrameLayout frameLayout2 = frameLayout;
                        ecuv ecuvVar = this.a;
                        ImageView imageView2 = imageView;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (!ecuv.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout2.setPressed(true);
                            ecrw.e(imageView2, ecuvVar.getContext(), ecuvVar.a(R.color.survey_accent_color));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout2.isPressed()) {
                                return true;
                            }
                            frameLayout2.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (ecuv.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout2.setPressed(false);
                        ecrw.e(imageView2, ecuvVar.getContext(), ecuvVar.a(R.color.survey_grey_icon_color));
                        return true;
                    }
                });
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ecup
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ecuv.b(viewGroup);
                        Handler handler = new Handler();
                        final ecuv ecuvVar = this.a;
                        final int i8 = i7;
                        handler.postDelayed(new Runnable() { // from class: ecut
                            @Override // java.lang.Runnable
                            public final void run() {
                                ecuv ecuvVar2 = ecuvVar;
                                ecuu ecuuVar = ecuvVar2.a;
                                if (ecuuVar != null) {
                                    ecuuVar.a(i8);
                                    ecuvVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup.addView(viewInflate);
                i3 = R.id.survey_rating_image_icon;
                i4 = R.id.survey_rating_image_layout;
                i5 = R.layout.survey_question_rating_image_item;
            }
            return;
        }
        int iA3 = exqh.a(i2);
        if (iA3 != 0 && iA3 == 5) {
            final ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(getContext());
            int i8 = this.d.c;
            final int i9 = 0;
            while (i9 < i8) {
                View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.survey_question_rating_number_item, viewGroup2, false);
                if (i9 == 0) {
                    viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i9 = 0;
                }
                final FrameLayout frameLayout2 = (FrameLayout) viewInflate2.findViewById(R.id.survey_rating_number_layout);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.survey_rating_number_large_button_horizontal_padding);
                viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                final MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                int dimension = (int) getResources().getDimension(R.dimen.survey_rating_number_large_side_length);
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                final TextView textView = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                i9++;
                textView.setTag(Integer.valueOf(i9));
                textView.setText(String.valueOf(i9));
                h(textView, i9, i8, 5);
                frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: ecuj
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        FrameLayout frameLayout3 = frameLayout2;
                        ecuv ecuvVar = this.a;
                        MaterialCardView materialCardView2 = materialCardView;
                        TextView textView2 = textView;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (!ecuv.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout3.setPressed(true);
                            materialCardView2.gQ(ecuvVar.a(R.color.survey_accent_color));
                            textView2.setTextColor(ecuvVar.a(R.color.survey_surface_color_elevation_2));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout3.isPressed()) {
                                return true;
                            }
                            frameLayout3.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (ecuv.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout3.setPressed(false);
                        materialCardView2.gQ(ecuvVar.a(R.color.google_transparent));
                        textView2.setTextColor(ecuvVar.a(R.color.survey_primary_text_color));
                        return true;
                    }
                });
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ecuk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ecuv.b(viewGroup2);
                        Handler handler = new Handler();
                        final ecuv ecuvVar = this.a;
                        final int i10 = i9;
                        handler.postDelayed(new Runnable() { // from class: ecuq
                            @Override // java.lang.Runnable
                            public final void run() {
                                ecuv ecuvVar2 = ecuvVar;
                                ecuu ecuuVar = ecuvVar2.a;
                                if (ecuuVar != null) {
                                    ecuuVar.a(i10);
                                    ecuvVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup2.addView(viewInflate2);
            }
            return;
        }
        int iA4 = exqh.a(i2);
        if (iA4 == 0 || iA4 != 4) {
            int iA5 = exqh.a(i2);
            if (iA5 != 0 && iA5 == 6) {
                int iA6 = a(R.color.survey_grey_icon_color);
                Drawable drawableF = f(R.drawable.quantum_ic_thumb_up_grey600_36, iA6);
                Drawable drawableF2 = f(R.drawable.quantum_ic_thumb_down_grey600_36, iA6);
                final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.survey_rating_images_container);
                linearLayout.setGravity(17);
                View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.survey_question_rating_thumb_item, (ViewGroup) linearLayout, false);
                ImageView imageView2 = (ImageView) viewInflate3.findViewById(R.id.survey_rating_thumb_up_icon);
                imageView2.setImageDrawable(drawableF);
                imageView2.setContentDescription(this.d.e);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: ecuh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ecuv.b(linearLayout);
                        Handler handler = new Handler();
                        final ecuv ecuvVar = this.a;
                        handler.postDelayed(new Runnable() { // from class: ecum
                            @Override // java.lang.Runnable
                            public final void run() {
                                ecuv ecuvVar2 = ecuvVar;
                                ecuu ecuuVar = ecuvVar2.a;
                                if (ecuuVar != null) {
                                    ecuuVar.a(1);
                                    ecuvVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                ImageView imageView3 = (ImageView) viewInflate3.findViewById(R.id.survey_rating_thumb_down_icon);
                imageView3.setImageDrawable(drawableF2);
                imageView3.setContentDescription(this.d.f);
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: ecul
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ecuv.b(linearLayout);
                        Handler handler = new Handler();
                        final ecuv ecuvVar = this.a;
                        handler.postDelayed(new Runnable() { // from class: ecun
                            @Override // java.lang.Runnable
                            public final void run() {
                                ecuv ecuvVar2 = ecuvVar;
                                ecuu ecuuVar = ecuvVar2.a;
                                if (ecuuVar != null) {
                                    ecuuVar.a(2);
                                    ecuvVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                linearLayout.addView(viewInflate3);
                return;
            }
            return;
        }
        int iA7 = a(R.color.survey_accent_color);
        Drawable drawableF3 = f(R.drawable.quantum_ic_star_border_grey600_36, a(R.color.survey_grey_icon_color));
        final Drawable drawableF4 = f(R.drawable.quantum_ic_star_grey600_36, iA7);
        final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
        LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(getContext());
        int i10 = this.d.c;
        final int i11 = 0;
        while (i11 < i10) {
            View viewInflate4 = layoutInflaterFrom3.inflate(R.layout.survey_question_rating_image_item, viewGroup3, false);
            if (i11 == 0) {
                viewInflate4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                i11 = 0;
            }
            final FrameLayout frameLayout3 = (FrameLayout) viewInflate4.findViewById(R.id.survey_rating_image_layout);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.survey_rating_image_large_button_horizontal_padding);
            viewGroup3.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
            ImageView imageView4 = (ImageView) frameLayout3.findViewById(R.id.survey_rating_image_icon);
            imageView4.setImageDrawable(drawableF3);
            i11++;
            imageView4.setTag(Integer.valueOf(i11));
            h(imageView4, i11, i10, 4);
            final Drawable drawable = drawableF3;
            frameLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: ecur
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i12 = ecuv.b;
                    ViewGroup viewGroup4 = viewGroup3;
                    FrameLayout frameLayout4 = frameLayout3;
                    int i13 = i11;
                    Drawable drawable2 = drawable;
                    int action = motionEvent.getAction();
                    Drawable drawable3 = drawableF4;
                    if (action == 0) {
                        if (!ecuv.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout4.setPressed(true);
                        ecuv.c(viewGroup4, i13, drawable2, drawable3);
                        return true;
                    }
                    if (action == 1) {
                        if (!frameLayout4.isPressed()) {
                            return true;
                        }
                        frameLayout4.performClick();
                        ecuv.c(viewGroup4, i13, drawable2, drawable3);
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    if (ecuv.e(motionEvent, view)) {
                        return true;
                    }
                    frameLayout4.setPressed(false);
                    ecuv.c(viewGroup4, 0, drawable2, drawable3);
                    return true;
                }
            });
            frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: ecus
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ecuv.b(viewGroup3);
                    Handler handler = new Handler();
                    final ecuv ecuvVar = this.a;
                    final int i12 = i11;
                    handler.postDelayed(new Runnable() { // from class: ecui
                        @Override // java.lang.Runnable
                        public final void run() {
                            ecuv ecuvVar2 = ecuvVar;
                            ecuu ecuuVar = ecuvVar2.a;
                            if (ecuuVar != null) {
                                ecuuVar.a(i12);
                                ecuvVar2.a = null;
                            }
                        }
                    }, 250L);
                }
            });
            viewGroup3.addView(viewInflate4);
            drawableF3 = drawable;
        }
    }
}
