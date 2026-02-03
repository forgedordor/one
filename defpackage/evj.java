package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evj implements ikp {
    private final fdau a;

    public evj(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.ikp
    public final ijz a(long j, kji kjiVar, kio kioVar) {
        iik iikVar = new iik((byte[]) null);
        this.a.a(iikVar, new ihz(j), kjiVar);
        iikVar.c();
        return new ijw(iikVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        evj evjVar = obj instanceof evj ? (evj) obj : null;
        return (evjVar != null ? evjVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
