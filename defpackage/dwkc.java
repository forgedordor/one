package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkc extends dwkf {
    private final String a;

    public dwkc(String str) {
        this.a = str;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.TOMBSTONE_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.TOMBSTONE_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.j())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "ActionPayload{tombstoneAction=" + this.a + "}";
    }
}
