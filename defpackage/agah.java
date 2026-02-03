package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agah implements agaj {
    private final int a;
    private final afzw b = afzw.a;
    private final String c = "IdleState";

    public agah(int i) {
        this.a = i;
    }

    @Override // defpackage.afzu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.afzu
    public final /* synthetic */ afzy b() {
        return this.b;
    }

    @Override // defpackage.agaj
    public final String c() {
        return this.c;
    }

    @Override // defpackage.agaj
    public final void d(afzu afzuVar) {
        afzuVar.getClass();
        if (!(afzuVar instanceof agaa) && !(afzuVar instanceof agac)) {
            throw new agai(afzuVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agah) && this.a == ((agah) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "IdleState(requestId=" + this.a + ")";
    }
}
