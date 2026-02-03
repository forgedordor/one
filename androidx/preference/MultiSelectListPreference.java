package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.oyt;
import defpackage.pac;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iB = kyz.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iB);
        this.i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.f, iB, 0);
        this.g = kyz.j(typedArrayObtainStyledAttributes, 2, 0);
        this.h = kyz.j(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.v) {
            return parcelableE;
        }
        oyt oytVar = new oyt(parcelableE);
        oytVar.a = this.i;
        return oytVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(oyt.class)) {
            super.g(parcelable);
            return;
        }
        oyt oytVar = (oyt) parcelable;
        super.g(oytVar.getSuperState());
        k(oytVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(v((Set) obj));
    }

    public final void k(Set set) {
        Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (V() && !set.equals(v(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.s, set);
            super.O(editorB);
        }
        d();
    }
}
