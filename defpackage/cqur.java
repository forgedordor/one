package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqur extends cqut {
    private final String a;

    public cqur(String str) {
        this.a = str;
    }

    @Override // defpackage.cqut, defpackage.cqum
    public final String d() {
        return this.a;
    }

    @Override // defpackage.cqum
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqum) {
            cqum cqumVar = (cqum) obj;
            if (cqumVar.e() == 2 && this.a.equals(cqumVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{filePath=" + this.a + "}";
    }
}
