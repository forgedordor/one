package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.apps.messaging.R;
import defpackage.kyz;
import defpackage.pab;
import defpackage.pac;
import defpackage.pah;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final pah c;
    private final CharSequence d;
    private final CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iB = kyz.b(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iB, 0);
        this.c = new pah(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pac.l, iB, 0);
        o(kyz.g(typedArrayObtainStyledAttributes, 7, 0));
        l(kyz.g(typedArrayObtainStyledAttributes, 6, 1));
        this.d = kyz.g(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = kyz.g(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = kyz.h(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        ad(pabVar.C(android.R.id.switch_widget));
        ac(pabVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        E();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(android.R.id.switch_widget));
            ab(view.findViewById(android.R.id.summary));
        }
    }
}
