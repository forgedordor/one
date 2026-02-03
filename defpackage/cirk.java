package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cirk extends cirx {
    public final ekgb a;
    public final ekgb b;

    public cirk(ekgb ekgbVar, ekgb ekgbVar2) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null usersWhoLeft");
        }
        this.a = ekgbVar;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null usersWhoJoined");
        }
        this.b = ekgbVar2;
    }

    @Override // defpackage.cirx
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.cirx
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cirx) {
            cirx cirxVar = (cirx) obj;
            if (ekjz.h(this.a, cirxVar.b()) && ekjz.h(this.b, cirxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.b;
        return "UsersToUpdate{usersWhoLeft=" + this.a.toString() + ", usersWhoJoined=" + ekgbVar.toString() + "}";
    }
}
