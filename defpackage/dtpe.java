package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpe extends dtpf {
    private final evqs a;

    public dtpe(evqs evqsVar) {
        this.a = evqsVar;
    }

    @Override // defpackage.dtpf, defpackage.dtpg
    public final evqs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dtpg) {
            dtpg dtpgVar = (dtpg) obj;
            dtpgVar.b();
            if (this.a.equals(dtpgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dtpg
    public final void b() {
    }
}
