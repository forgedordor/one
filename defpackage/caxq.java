package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxq extends cbcw {
    public final boolean a;
    public final boolean b;
    public final ekgb c;
    public final Exception d;
    public final boolean e;
    public final Bundle f;

    public caxq(boolean z, boolean z2, ekgb ekgbVar, Exception exc, boolean z3, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = ekgbVar;
        this.d = exc;
        this.e = z3;
        this.f = bundle;
    }

    @Override // defpackage.cbcw
    public final Bundle a() {
        return this.f;
    }

    @Override // defpackage.cbcw
    public final cbcv b() {
        return new caxp(this);
    }

    @Override // defpackage.cbcw
    public final ekgb c() {
        return this.c;
    }

    @Override // defpackage.cbcw
    public final Exception d() {
        return this.d;
    }

    @Override // defpackage.cbcw
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        Exception exc;
        Bundle bundle;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbcw) {
            cbcw cbcwVar = (cbcw) obj;
            if (this.a == cbcwVar.e() && this.b == cbcwVar.f() && ((ekgbVar = this.c) != null ? ekjz.h(ekgbVar, cbcwVar.c()) : cbcwVar.c() == null) && ((exc = this.d) != null ? exc.equals(cbcwVar.d()) : cbcwVar.d() == null) && this.e == cbcwVar.g() && ((bundle = this.f) != null ? bundle.equals(cbcwVar.a()) : cbcwVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cbcw
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.cbcw
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        ekgb ekgbVar = this.c;
        int iHashCode = (ekgbVar == null ? 0 : ekgbVar.hashCode()) ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
        Exception exc = this.d;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (exc == null ? 0 : exc.hashCode())) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003;
        Bundle bundle = this.f;
        return iHashCode2 ^ (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        Bundle bundle = this.f;
        Exception exc = this.d;
        return "WorkQueueResult{completed=" + this.a + ", retryable=" + this.b + ", newRequests=" + String.valueOf(this.c) + ", error=" + String.valueOf(exc) + ", skipped=" + this.e + ", extras=" + String.valueOf(bundle) + "}";
    }
}
