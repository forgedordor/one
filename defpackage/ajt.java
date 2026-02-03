package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajt extends ajn {
    public final boolean a;
    public final List b;

    public ajt(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajt)) {
            return false;
        }
        ajt ajtVar = (ajt) obj;
        return Objects.equals(Boolean.valueOf(this.a), Boolean.valueOf(ajtVar.a)) && Objects.equals(this.b, ajtVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "{indexNestedProperties: " + this.a + ", indexableNestedPropertiesList: " + this.b + "}";
    }
}
