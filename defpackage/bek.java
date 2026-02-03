package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bek extends bfz {
    private final bgb a;
    private final bbm b;

    public bek(bgb bgbVar, bbm bbmVar) {
        if (bgbVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.a = bgbVar;
        this.b = bbmVar;
    }

    @Override // defpackage.bfz
    public final bbm a() {
        return this.b;
    }

    @Override // defpackage.bfz
    public final bgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfz) {
            bfz bfzVar = (bfz) obj;
            if (this.a.equals(bfzVar.b()) && this.b.equals(bfzVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
