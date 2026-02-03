package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.oyi;
import defpackage.oyj;
import defpackage.pac;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iB = kyz.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iB);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.d, iB, 0);
        if (kyz.h(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (oyj.a == null) {
                oyj.a = new oyj();
            }
            K(oyj.a);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.v) {
            return parcelableE;
        }
        oyi oyiVar = new oyi(parcelableE);
        oyiVar.a = this.g;
        return oyiVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(oyi.class)) {
            super.g(parcelable);
            return;
        }
        oyi oyiVar = (oyi) parcelable;
        super.g(oyiVar.getSuperState());
        i(oyiVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(u((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        Y(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            z(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
