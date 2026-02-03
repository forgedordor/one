package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.messaging.R;
import defpackage.dwxs;
import defpackage.dwxv;
import defpackage.dwyc;
import defpackage.dwyd;
import defpackage.dwyo;
import defpackage.eehg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AnonymousConversationAvatarView extends RelativeLayout implements dwyc {
    ImageView a;
    ImageView b;
    public int[] c;
    int d;

    public AnonymousConversationAvatarView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    @Override // defpackage.dwyc
    public final void b(int i) {
        this.d = i;
    }

    @Override // defpackage.dwyw
    public final void c() {
        this.b.setImageBitmap(null);
    }

    @Override // defpackage.dwyc
    public final void d() {
        this.b.setVisibility(0);
    }

    public AnonymousConversationAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnonymousConversationAvatarView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray;
        super(context, attributeSet, i);
        dwxs.a();
        inflate(getContext(), R.layout.avatar_view_layout, this);
        this.a = (ImageView) findViewById(R.id.avatar_icon);
        this.b = (ImageView) findViewById(R.id.avatar_badge);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dwyd.a, i, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dwyo.a(getContext(), 60.0f));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            typedArrayObtainTypedArray = getResources().obtainTypedArray(resourceId);
        } else {
            typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.avatar_bg_colors_default_array);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            getContext().getColor(resourceId2);
        } else {
            eehg.b(this, R.attr.colorSurface);
            this.c = new int[typedArrayObtainTypedArray.length()];
            for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                this.c[i2] = typedArrayObtainTypedArray.getColor(i2, -7829368);
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        dwxv.a();
        int i3 = this.d;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setColor(0);
        float f = i3 / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        ImageView imageView = this.a;
        int i4 = this.d;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmapCreateBitmap, i4, i4, false));
    }
}
