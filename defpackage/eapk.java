package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eapk extends eatv {
    public final easi a;
    public final eary b;
    public final easj c;
    public final boolean d;

    public eapk(easi easiVar, eary earyVar, easj easjVar, boolean z) {
        this.a = easiVar;
        if (earyVar == null) {
            throw new NullPointerException("Null day");
        }
        this.b = earyVar;
        if (easjVar == null) {
            throw new NullPointerException("Null time");
        }
        this.c = easjVar;
        this.d = z;
    }

    @Override // defpackage.eatv
    public final eary a() {
        return this.b;
    }

    @Override // defpackage.eatv
    public final easi b() {
        return this.a;
    }

    @Override // defpackage.eatv
    public final easj c() {
        return this.c;
    }

    @Override // defpackage.eatv
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatv) {
            eatv eatvVar = (eatv) obj;
            easi easiVar = this.a;
            if (easiVar != null ? easiVar.equals(eatvVar.b()) : eatvVar.b() == null) {
                if (this.b.equals(eatvVar.a()) && this.c.equals(eatvVar.c()) && this.d == eatvVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        easi easiVar = this.a;
        return (((((((easiVar == null ? 0 : easiVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        easj easjVar = this.c;
        eary earyVar = this.b;
        return "TimeOfWeek{date=" + String.valueOf(this.a) + ", day=" + earyVar.toString() + ", time=" + easjVar.toString() + ", truncated=" + this.d + "}";
    }
}
