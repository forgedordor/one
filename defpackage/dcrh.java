package defpackage;

import android.os.Bundle;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrh extends dcrk {
    public final Duration a;
    public final Duration b;
    public final boolean c;
    public final Bundle d;

    public dcrh(Duration duration, Duration duration2, boolean z, Bundle bundle) {
        this.a = duration;
        this.b = duration2;
        this.c = z;
        this.d = bundle;
    }

    @Override // defpackage.dcrk
    public final Bundle a() {
        return this.d;
    }

    @Override // defpackage.dcrk
    public final Duration b() {
        return this.a;
    }

    @Override // defpackage.dcrk
    public final Duration c() {
        return this.b;
    }

    @Override // defpackage.dcrk
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcrk) {
            dcrk dcrkVar = (dcrk) obj;
            if (this.a.equals(dcrkVar.b()) && this.b.equals(dcrkVar.c()) && this.c == dcrkVar.d() && this.d.equals(dcrkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.d;
        Duration duration = this.b;
        return "DroidGuardClientOptions{initTimeout=" + String.valueOf(this.a) + ", snapshotTimeout=" + String.valueOf(duration) + ", reinitializeHandleOnGetSnapshot=" + this.c + ", extras=" + String.valueOf(bundle) + "}";
    }
}
