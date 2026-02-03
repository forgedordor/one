package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czep extends czeo {
    private final emss c;

    public czep(emss emssVar) {
        if (emssVar == null) {
            throw new NullPointerException("Null screen");
        }
        this.c = emssVar;
    }

    @Override // defpackage.czeo
    public final emss b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czeo) {
            return this.c.equals(((czeo) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AttachmentScreenOrigin{screen=" + this.c.toString() + "}";
    }
}
