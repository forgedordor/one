package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqv extends aarb {
    public final boolean a;
    public final boolean b;
    public final double c;
    public final ekgb d;
    private final Bundle e;

    public aaqv(boolean z, boolean z2, double d, ekgb ekgbVar, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = d;
        this.d = ekgbVar;
        this.e = bundle;
    }

    @Override // defpackage.aarb
    public final double a() {
        return this.c;
    }

    @Override // defpackage.aarb
    public final Bundle b() {
        return this.e;
    }

    @Override // defpackage.aarb
    public final ekgb c() {
        return this.d;
    }

    @Override // defpackage.aarb
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.aarb
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aarb) {
            aarb aarbVar = (aarb) obj;
            if (this.a == aarbVar.d()) {
                aarbVar.f();
                if (this.b == aarbVar.e() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aarbVar.a()) && ekjz.h(this.d, aarbVar.c()) && this.e.equals(aarbVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.c;
        return ((((((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.e;
        return "DonatableMessageRequest{includePersonalMessages=" + this.a + ", includeMessagesFromContacts=false, includeSentMessages=" + this.b + ", normalizedEditDistanceThreshold=" + this.c + ", redactors=" + this.d.toString() + ", intentExtras=" + bundle.toString() + "}";
    }

    @Override // defpackage.aarb
    public final void f() {
    }
}
