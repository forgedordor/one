package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssi extends dssk {
    private final int a;

    public dssi(int i) {
        this.a = i;
    }

    @Override // defpackage.dssk, defpackage.dsss
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dsss
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dsss) {
            dsss dsssVar = (dsss) obj;
            if (dsssVar.b() == 2 && this.a == dsssVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AppStateValue{integer=" + this.a + "}";
    }
}
