package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdd {
    public final cvcw a;
    public final ehbb b;
    public final Optional c;
    public final eils d;
    public final ehay e;
    public SwitchPreferenceCompat f;

    public cvdd(cvcw cvcwVar, ehbb ehbbVar, Optional optional, eils eilsVar) {
        ehbbVar.getClass();
        this.a = cvcwVar;
        this.b = ehbbVar;
        this.c = optional;
        this.d = eilsVar;
        this.e = new ehay() { // from class: cvcx
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            @Override // defpackage.ehay
            public final void b(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = this.a.f;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                    switchPreferenceCompat.N(true);
                    switchPreferenceCompat.k(zBooleanValue);
                }
            }
        };
    }
}
