package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duak extends duam {
    private final dtqy a;

    public duak(dtqy dtqyVar) {
        this.a = dtqyVar;
    }

    @Override // defpackage.duan
    public final int b() {
        return 1;
    }

    @Override // defpackage.duam, defpackage.duan
    public final dtqy d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duan) {
            duan duanVar = (duan) obj;
            if (duanVar.b() == 1 && this.a.equals(duanVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
