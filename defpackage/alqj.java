package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alqj {
    public final String a;

    public alqj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alqj) {
            return Objects.equals(this.a, ((alqj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ejwk.b(this.a);
    }
}
