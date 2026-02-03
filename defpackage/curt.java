package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class curt {
    public final curq a;
    public final fcsu b;
    public final fcsu c;
    public SwitchPreferenceCompat d;
    public SwitchPreferenceCompat e;
    public final egps f = new egps<Boolean, Void>() { // from class: curt.2
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            curt curtVar = curt.this;
            SwitchPreferenceCompat switchPreferenceCompat = curtVar.d;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(false);
            }
            SwitchPreferenceCompat switchPreferenceCompat2 = curtVar.d;
            if (switchPreferenceCompat2 != null) {
                switchPreferenceCompat2.k(zBooleanValue);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            SwitchPreferenceCompat switchPreferenceCompat = curt.this.d;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            curt curtVar = curt.this;
            SwitchPreferenceCompat switchPreferenceCompat = curtVar.d;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
            SwitchPreferenceCompat switchPreferenceCompat2 = curtVar.d;
            if (switchPreferenceCompat2 != null) {
                switchPreferenceCompat2.k(!zBooleanValue);
            }
        }
    };
    public final egps g = new egps<Boolean, Void>() { // from class: curt.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            curt curtVar = curt.this;
            SwitchPreferenceCompat switchPreferenceCompat = curtVar.e;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(false);
            }
            SwitchPreferenceCompat switchPreferenceCompat2 = curtVar.e;
            if (switchPreferenceCompat2 != null) {
                switchPreferenceCompat2.k(zBooleanValue);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            SwitchPreferenceCompat switchPreferenceCompat = curt.this.e;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            curt curtVar = curt.this;
            SwitchPreferenceCompat switchPreferenceCompat = curtVar.e;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
            SwitchPreferenceCompat switchPreferenceCompat2 = curtVar.e;
            if (switchPreferenceCompat2 != null) {
                switchPreferenceCompat2.k(!zBooleanValue);
            }
        }
    };

    public curt(curq curqVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = curqVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }
}
