package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crnc {
    public final int a;

    public crnc(int i) {
        this.a = i;
    }

    public final Optional a() {
        return b() ? Optional.empty() : Optional.of(this);
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof crnc ? this.a == ((crnc) obj).a && Objects.equals(null, null) : (obj instanceof Integer) && this.a == ((Integer) obj).intValue();
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
