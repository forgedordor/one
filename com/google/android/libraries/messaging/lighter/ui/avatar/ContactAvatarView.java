package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.messaging.R;
import defpackage.dwpf;
import defpackage.dwxv;
import defpackage.dwxy;
import defpackage.dwxz;
import defpackage.dwyb;
import defpackage.dwyd;
import defpackage.dwyh;
import defpackage.dwyo;
import defpackage.eehg;
import defpackage.fbfm;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContactAvatarView extends RelativeLayout implements dwxz {
    public ImageView a;
    public int[] b;
    public int c;
    public int d;
    public Bitmap e;
    private final dwxy f;

    public ContactAvatarView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.dwxz
    public final void b(dwpf dwpfVar) {
        Bitmap bitmapB = this.f.b(dwpfVar, this.d, new dwyb(this));
        this.e = bitmapB;
        this.a.setImageBitmap(bitmapB);
    }

    @Override // defpackage.dwyw
    public final void c() {
        this.e = null;
    }

    public ContactAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactAvatarView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray;
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        this.f = dwxy.a();
        inflate(getContext(), R.layout.avatar_view_layout, this);
        this.a = (ImageView) findViewById(R.id.avatar_icon);
        setClickable(true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dwyd.b, i, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dwyo.a(getContext(), 60.0f));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            typedArrayObtainTypedArray = getResources().obtainTypedArray(resourceId);
        } else {
            typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.avatar_bg_colors_default_array);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.c = getContext().getColor(resourceId2);
        } else {
            this.c = eehg.b(this, R.attr.colorSurface);
        }
        this.b = new int[typedArrayObtainTypedArray.length()];
        for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
            this.b[i2] = typedArrayObtainTypedArray.getColor(i2, -7829368);
        }
        typedArrayObtainTypedArray.recycle();
        typedArrayObtainStyledAttributes.recycle();
        dwxv.a();
    }
}
