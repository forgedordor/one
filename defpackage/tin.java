package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tin extends tio {
    public final List a;
    public final boolean b;
    public final fdae c;

    public tin(List list, boolean z, fdae fdaeVar) {
        this.a = list;
        this.b = z;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tin)) {
            return false;
        }
        tin tinVar = (tin) obj;
        return fdbq.f(this.a, tinVar.a) && this.b == tinVar.b && fdbq.f(this.c, tinVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Success(blockedParticipantListItems=" + this.a + ", measureListInteractive=" + this.b + ", onListInteractive=" + this.c + ")";
    }
}
