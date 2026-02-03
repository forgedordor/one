package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egao extends egbd {
    private final boolean a;
    private final boolean b;
    private final Intent c;

    public egao(boolean z, boolean z2, Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }

    @Override // defpackage.egbd
    public final Intent a() {
        return this.c;
    }

    @Override // defpackage.egbd
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.egbd
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof egbd) {
            egbd egbdVar = (egbd) obj;
            if (this.a == egbdVar.c() && this.b == egbdVar.b() && ((intent = this.c) != null ? intent.equals(egbdVar.a()) : egbdVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.c;
        return (intent == null ? 0 : intent.hashCode()) ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        return "ValidationResult{isValid=" + this.a + ", clearState=" + this.b + ", getIntentToMeet=" + String.valueOf(this.c) + "}";
    }
}
