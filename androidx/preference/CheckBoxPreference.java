package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.oye;
import defpackage.pab;
import defpackage.pac;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final oye c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iB = kyz.b(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iB, 0);
        this.c = new oye(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.b, iB, 0);
        o(kyz.g(typedArrayObtainStyledAttributes, 5, 0));
        l(kyz.g(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = kyz.h(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        ad(pabVar.C(android.R.id.checkbox));
        ac(pabVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        E();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(android.R.id.checkbox));
            ab(view.findViewById(android.R.id.summary));
        }
    }
}
