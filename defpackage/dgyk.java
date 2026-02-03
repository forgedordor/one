package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgyk extends dhap {
    private final Optional a;

    public dgyk(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.dhap
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhap) {
            dhap dhapVar = (dhap) obj;
            dhapVar.b();
            if (this.a.equals(dhapVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        return "SendCpimMessageResponse{type=OK, error=" + this.a.toString() + "}";
    }

    @Override // defpackage.dhap
    public final void b() {
    }
}
