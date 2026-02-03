package com.google.android.apps.messaging.ui.appsettings.protectionandsafety;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.AapmSwitchPreference;
import defpackage.ekrg;
import defpackage.fdae;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AapmSwitchPreference extends SwitchPreferenceCompat {
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/ui/appsettings/protectionandsafety/AapmSwitchPreference");
    public fdae d;
    private fdae e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AapmSwitchPreference(Context context) {
        super(context);
        context.getClass();
        this.d = new fdae() { // from class: cvdh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.e = new fdae() { // from class: cvdi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
    }

    @Override // androidx.preference.Preference
    public final void E() {
        if (T()) {
            super.E();
        } else {
            this.d.invoke();
        }
    }

    @Override // androidx.preference.Preference
    public final void G(boolean z) {
        super.G(z);
        this.e.invoke();
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(final pab pabVar) throws Resources.NotFoundException {
        pabVar.getClass();
        super.a(pabVar);
        fdae fdaeVar = new fdae() { // from class: cvdj
            @Override // defpackage.fdae
            public final Object invoke() {
                try {
                    View view = pabVar.a;
                    view.setEnabled(true);
                    view.findViewById(R.id.title).setEnabled(true);
                } catch (Exception unused) {
                    ((ekrd) AapmSwitchPreference.c.j().h("com/google/android/apps/messaging/ui/appsettings/protectionandsafety/AapmSwitchPreference", "onBindViewHolder$lambda$2", 64, "AapmSwitchPreference.kt")).q("Failed to update AapmSwitchPreference isEnabled");
                }
                return fctx.a;
            }
        };
        this.e = fdaeVar;
        fdaeVar.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AapmSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.d = new fdae() { // from class: cvdh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.e = new fdae() { // from class: cvdi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AapmSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.d = new fdae() { // from class: cvdh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.e = new fdae() { // from class: cvdi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AapmSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.d = new fdae() { // from class: cvdh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.e = new fdae() { // from class: cvdi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
    }
}
