package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egal extends efzi {
    public final Intent a;

    public egal(Intent intent) {
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = intent;
    }

    @Override // defpackage.efzi
    public final Intent a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efzi) {
            return this.a.equals(((efzi) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SelectorContext{intent=" + this.a.toString() + "}";
    }
}
