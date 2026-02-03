package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyji {
    private final Class a;
    private final String b = null;

    public eyji(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eyji) {
            eyji eyjiVar = (eyji) obj;
            if (Objects.equals(this.a, eyjiVar.a)) {
                String str = eyjiVar.b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.a) ^ 1000003) * 1000003) ^ Objects.hashCode(null);
    }

    public final String toString() {
        return this.a.getCanonicalName();
    }
}
