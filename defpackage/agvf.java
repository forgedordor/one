package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agvf extends agvi {
    public final Intent a;

    public agvf(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agvf) && fdbq.f(this.a, ((agvf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecoverableError(recoverableIntent=" + this.a + ")";
    }
}
