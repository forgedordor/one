package defpackage;

import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blt {
    private final boolean a;
    private final Set b;
    private final Set c;

    public blt(boolean z, Set set, Set set2) {
        this.a = z;
        this.b = set == null ? Collections.EMPTY_SET : new HashSet(set);
        this.c = set2 == null ? Collections.EMPTY_SET : new HashSet(set2);
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof blt)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        blt bltVar = (blt) obj;
        return this.a == bltVar.a && Objects.equals(this.b, bltVar.b) && Objects.equals(this.c, bltVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
