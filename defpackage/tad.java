package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tad {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final tab d;
    public final UUID e;
    private final enoq f;

    public /* synthetic */ tad(boolean z, enoq enoqVar, boolean z2, boolean z3, tab tabVar, UUID uuid, int i) {
        this.a = z;
        this.f = (i & 2) != 0 ? null : enoqVar;
        this.b = (!((i & 4) == 0)) | z2;
        this.c = ((i & 8) == 0) & z3;
        this.d = tabVar;
        this.e = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tad)) {
            return false;
        }
        tad tadVar = (tad) obj;
        return this.a == tadVar.a && this.f == tadVar.f && this.b == tadVar.b && this.c == tadVar.c && fdbq.f(this.d, tadVar.d) && fdbq.f(this.e, tadVar.e);
    }

    public final int hashCode() {
        enoq enoqVar = this.f;
        int iA = (((((((tac.a(this.a) * 31) + (enoqVar == null ? 0 : enoqVar.hashCode())) * 31) + tac.a(this.b)) * 31) + tac.a(this.c)) * 31) + this.d.hashCode();
        UUID uuid = this.e;
        return (iA * 31) + (uuid != null ? uuid.hashCode() : 0);
    }

    public final String toString() {
        return "GetCustomD2DItemResult(isSuccess=" + this.a + ", failureReason=" + this.f + ", shouldLog=" + this.b + ", pfdSent=" + this.c + ", result=" + this.d + ", sessionId=" + this.e + ")";
    }
}
