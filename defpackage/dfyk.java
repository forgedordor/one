package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfyk extends dfyt {
    private final Optional a;
    private final Optional b;
    private final boolean c;

    public dfyk(Optional optional, Optional optional2, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = z;
    }

    @Override // defpackage.dfyt
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.dfyt
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.dfyt
    @Deprecated
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfyt) {
            dfyt dfytVar = (dfyt) obj;
            if (this.a.equals(dfytVar.a()) && this.b.equals(dfytVar.b()) && this.c == dfytVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        Optional optional = this.b;
        return "ImsNetworkInfo{ipAddress=" + this.a.toString() + ", network=" + optional.toString() + ", registered=" + this.c + "}";
    }
}
