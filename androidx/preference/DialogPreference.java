package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.ozv;
import defpackage.pac;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kyz.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        ozv ozvVar = this.k.d;
        if (ozvVar != null) {
            ozvVar.r(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.c, i, 0);
        String strG = kyz.g(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strG;
        if (strG == null) {
            this.a = t();
        }
        this.b = kyz.g(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = kyz.g(typedArrayObtainStyledAttributes, 11, 3);
        this.e = kyz.g(typedArrayObtainStyledAttributes, 10, 4);
        this.f = kyz.d(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
