package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eibr extends eigx {
    private final ekgb a;
    private final ekgb b;
    private final UUID c;
    private final long d;

    public eibr(ekgb ekgbVar, ekgb ekgbVar2, UUID uuid, long j) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = uuid;
        this.d = j;
    }

    @Override // defpackage.eigx
    public final long a() {
        return this.d;
    }

    @Override // defpackage.eigx
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.eigx
    public final ekgb c() {
        return this.a;
    }

    @Override // defpackage.eigx
    public final UUID d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eigx) {
            eigx eigxVar = (eigx) obj;
            if (ekjz.h(this.a, eigxVar.c()) && ekjz.h(this.b, eigxVar.b()) && this.c.equals(eigxVar.d()) && this.d == eigxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
