package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjx {
    public final cjw a;
    public final bbd b = null;

    public cjx(cjw cjwVar) {
        this.a = cjwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjx)) {
            return false;
        }
        cjx cjxVar = (cjx) obj;
        if (this.a == cjxVar.a) {
            bbd bbdVar = cjxVar.b;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }
}
