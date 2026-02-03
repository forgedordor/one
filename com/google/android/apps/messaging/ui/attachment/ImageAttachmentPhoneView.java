package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import defpackage.cpbd;
import defpackage.cvif;
import defpackage.kxj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImageAttachmentPhoneView extends cpbd {
    public ImageAttachmentPhoneView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        inflate(context, R.layout.image_attachment_view, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvif.a);
        this.a = (RoundedImageView) findViewById(R.id.image_attachment_rounded_view);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        ColorStateList colorStateListD = kxj.d(getContext(), R.color.message_image_selected_tint_selector);
        colorStateListD.getClass();
        colorStateListD.getDefaultColor();
        typedArrayObtainStyledAttributes.recycle();
    }
}
