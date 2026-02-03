package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzit implements dzis {
    public abstract Object a();

    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof dzit) {
            return Objects.equals(a(), ((dzit) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return b();
    }
}
