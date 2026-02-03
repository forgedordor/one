package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swl implements swm {
    public final Bundle a;

    public swl(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swl) && fdbq.f(this.a, ((swl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(bundle=" + this.a + ")";
    }
}
