package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqm extends dvra {
    private final ejwi a;

    public dvqm(ejwi ejwiVar) {
        this.a = ejwiVar;
    }

    @Override // defpackage.dvra
    public final ejwi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvra) {
            dvra dvraVar = (dvra) obj;
            dvraVar.b();
            if (this.a.equals(dvraVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-723379965);
    }

    public final String toString() {
        return "SendMessageResult{status=SUCCESS, serverTimestamp=" + String.valueOf(this.a) + "}";
    }

    @Override // defpackage.dvra
    public final void b() {
    }
}
