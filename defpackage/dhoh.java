package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhoh extends dhph {
    public final boolean a;
    private final boolean b = false;

    public dhoh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhoh)) {
            return false;
        }
        dhoh dhohVar = (dhoh) obj;
        if (this.a != dhohVar.a) {
            return false;
        }
        boolean z = dhohVar.b;
        return true;
    }

    public final int hashCode() {
        return (dhog.a(this.a) * 31) + dhog.a(false);
    }
}
