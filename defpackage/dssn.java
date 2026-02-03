package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssn extends dssx {
    private final Bundle a;
    private final dssp b;

    public dssn(Bundle bundle, dssp dsspVar) {
        this.a = bundle;
        this.b = dsspVar;
    }

    @Override // defpackage.dssx
    public final Bundle a() {
        return this.a;
    }

    @Override // defpackage.dssx
    public final dssp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dssx) {
            dssx dssxVar = (dssx) obj;
            Bundle bundle = this.a;
            if (bundle != null ? bundle.equals(dssxVar.a()) : dssxVar.a() == null) {
                dssxVar.c();
                dssxVar.d();
                if (this.b.equals(dssxVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        return (((((bundle == null ? 0 : bundle.hashCode()) ^ 1000003) * (-721379959)) ^ 3) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IntentBuilderParams{initialExtras=" + String.valueOf(this.a) + ", accountName=null, promoType=DIALOG, actionType=" + this.b.toString() + "}";
    }

    @Override // defpackage.dssx
    public final void c() {
    }

    @Override // defpackage.dssx
    public final void d() {
    }
}
