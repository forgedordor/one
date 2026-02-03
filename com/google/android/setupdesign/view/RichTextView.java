package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.eftb;
import defpackage.eftr;
import defpackage.eftv;
import defpackage.eftx;
import defpackage.efty;
import defpackage.eftz;
import defpackage.efuz;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RichTextView extends AppCompatTextView implements eftx {
    public static Typeface a;
    private eftr b;

    public RichTextView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (isInEditMode()) {
            return;
        }
        eftr eftrVar = new eftr();
        this.b = eftrVar;
        ley.p(this, eftrVar);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof efuz) {
            efuz efuzVar = (efuz) movementMethod;
            if (efuzVar.b == motionEvent) {
                return efuzVar.a;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object eftyVar;
        Context context = getContext();
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    eftz.a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    if (eftb.c()) {
                        annotation.getValue();
                        eftyVar = new eftv(context);
                    } else {
                        annotation.getValue();
                        eftyVar = new efty();
                    }
                    eftz.a(spannableString, annotation, eftyVar, a != null ? new TypefaceSpan(a) : new TypefaceSpan("sans-serif-medium"));
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        boolean z = (charSequence instanceof Spanned) && ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length > 0;
        if (z) {
            setMovementMethod(new efuz());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        setRevealOnFocusHint(false);
        setFocusableInTouchMode(z);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // defpackage.eftx
    public final void i() {
    }
}
