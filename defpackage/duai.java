package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duai extends duam {
    private final dtma a;

    public duai(dtma dtmaVar) {
        this.a = dtmaVar;
    }

    @Override // defpackage.duam, defpackage.duan
    public final dtma a() {
        return this.a;
    }

    @Override // defpackage.duan
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duan) {
            duan duanVar = (duan) obj;
            if (duanVar.b() == 3 && this.a.equals(duanVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
