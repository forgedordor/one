package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxg extends dwxh {
    private final dwpk a;

    public dwxg(dwpk dwpkVar) {
        this.a = dwpkVar;
    }

    @Override // defpackage.dwxj
    public final dwpu b() {
        return dwpu.ONE_TO_ONE;
    }

    @Override // defpackage.dwxh, defpackage.dwxj
    public final dwpk c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwxj) {
            dwxj dwxjVar = (dwxj) obj;
            if (dwpu.ONE_TO_ONE == dwxjVar.b() && this.a.equals(dwxjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockId{oneToOne=" + this.a.toString() + "}";
    }
}
