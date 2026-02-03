package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crlw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/palette/PaletteUtil");
    public final Context b;
    public final cpch c;
    public final TypedArray[] d;
    public final TypedArray[] e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    public crlw(Context context, cpch cpchVar, aidr aidrVar) {
        TypedArray[] typedArrayArr = new TypedArray[3];
        this.d = typedArrayArr;
        TypedArray[] typedArrayArr2 = new TypedArray[3];
        this.e = typedArrayArr2;
        this.b = context;
        this.c = cpchVar;
        Resources resources = context.getResources();
        if (((Boolean) crlv.a.e()).booleanValue()) {
            typedArrayArr[0] = resources.obtainTypedArray(R.array.oneplus_tile_colors);
            typedArrayArr2[0] = resources.obtainTypedArray(R.array.oneplus_dark_tile_colors);
            this.j = context.getColor(R.color.oneplus_dark_avatar_letter_color);
        } else {
            typedArrayArr[0] = resources.obtainTypedArray(R.array.tile_colors_m2);
            typedArrayArr2[0] = resources.obtainTypedArray(R.array.dark_tile_colors_m2);
            if (aidrVar.a()) {
                this.j = context.getColor(R.color.samsung_dark_avatar_letter_color);
            } else {
                this.j = context.getColor(R.color.dark_avatar_letter_color);
            }
        }
        typedArrayArr[2] = resources.obtainTypedArray(R.array.sender_text_colors_m2);
        typedArrayArr2[2] = resources.obtainTypedArray(R.array.dark_sender_text_colors_m2);
        typedArrayArr[1] = resources.obtainTypedArray(R.array.customized_letter_tile_colors);
        typedArrayArr2[1] = resources.obtainTypedArray(R.array.customized_letter_tile_colors_dark);
        this.g = context.getColor(R.color.google_blue600);
        this.h = context.getColor(R.color.google_blue500);
        this.i = context.getColor(R.color.google_white);
        for (int i = 0; i < 3; i++) {
            cqaz.a(this.d[i].length(), this.e[i].length());
        }
        this.f = this.d[0].getColor(0, 0);
        this.e[0].getColor(0, 0);
    }

    public static float a(int i) {
        float f;
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        int iMax = Math.max(i4, Math.max(i2, i3));
        int iMin = Math.min(i4, Math.min(i2, i3));
        if (iMax == iMin) {
            return 0.0f;
        }
        int i5 = iMax - i2;
        float f2 = iMax - iMin;
        float f3 = (iMax - i4) / f2;
        float f4 = (iMax - i3) / f2;
        if (i2 == iMax) {
            f = f3 - f4;
        } else {
            float f5 = i5 / f2;
            f = i3 == iMax ? (f5 + 2.0f) - f3 : (f4 + 4.0f) - f5;
        }
        float f6 = f / 6.0f;
        return f6 < 0.0f ? f6 + 1.0f : f6;
    }

    public static String i(int i) {
        return Integer.toHexString(i & 16777215);
    }

    public final int b() {
        return this.c.g() ? this.h : this.g;
    }

    public final int c() {
        return this.c.g() ? this.j : this.i;
    }

    public final int d(String str) {
        return e(str, this.c.g());
    }

    public final int e(String str, boolean z) {
        return (z ? this.e : this.d)[0].getColor(f(str), 0);
    }

    public final int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Math.abs(str.hashCode() % this.d[0].length());
    }

    public final cqcg g() {
        return new cqcg(this.f);
    }

    public final cqcg h(String str) {
        TypedArray[] typedArrayArr = this.d;
        int iF = f(str);
        int color = typedArrayArr[0].getColor(iF, 0);
        this.e[0].getColor(iF, 0);
        return new cqcg(color);
    }
}
