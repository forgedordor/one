package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaun extends eavn {
    private final Boolean a;

    public eaun(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.eavn
    public final Boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eavn)) {
            return false;
        }
        eavn eavnVar = (eavn) obj;
        Boolean bool = this.a;
        return bool == null ? eavnVar.a() == null : bool.equals(eavnVar.a());
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "IsOpenResponse{isOpen=" + this.a + "}";
    }
}
