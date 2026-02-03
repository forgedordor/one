package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.oyo;
import defpackage.oyp;
import defpackage.ozd;
import defpackage.pac;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String F;
    private boolean G;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kyz.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.v) {
            return parcelableE;
        }
        oyo oyoVar = new oyo(parcelableE);
        oyoVar.a = this.i;
        return oyoVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(oyo.class)) {
            super.g(parcelable);
            return;
        }
        oyo oyoVar = (oyo) parcelable;
        super.g(oyoVar.getSuperState());
        o(oyoVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(u((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int iK = k(this.i);
        if (iK < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        ozd ozdVar = this.E;
        if (ozdVar != null) {
            return ozdVar.a(this);
        }
        CharSequence charSequenceL = l();
        CharSequence charSequenceM = super.m();
        String str = this.F;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceM)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceM;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.F = null;
        } else {
            this.F = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean zEquals = TextUtils.equals(this.i, str);
        if (zEquals && this.G) {
            return;
        }
        this.i = str;
        this.G = true;
        Y(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.e, i, 0);
        this.g = kyz.j(typedArrayObtainStyledAttributes, 2, 0);
        this.h = kyz.j(typedArrayObtainStyledAttributes, 3, 1);
        if (kyz.h(typedArrayObtainStyledAttributes, 4, 4, false)) {
            if (oyp.a == null) {
                oyp.a = new oyp();
            }
            K(oyp.a);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, pac.g, i, 0);
        this.F = kyz.g(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
