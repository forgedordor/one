package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class age {
    public final String a;
    public final int b;

    public age(String str, int i) {
        lca.a(str);
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof age)) {
            return false;
        }
        age ageVar = (age) obj;
        return this.b == ageVar.b && this.a.equals(ageVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        int i = this.b;
        if (i == -1) {
            return this.a;
        }
        return this.a + "[" + i + "]";
    }
}
