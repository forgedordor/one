package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssj extends dssk {
    @Override // defpackage.dsss
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dsss)) {
            return false;
        }
        dsss dsssVar = (dsss) obj;
        if (dsssVar.b() != 3) {
            return false;
        }
        dsssVar.c();
        return true;
    }

    public final int hashCode() {
        return -1;
    }

    public final String toString() {
        return "AppStateValue{invalid=-1}";
    }

    @Override // defpackage.dssk, defpackage.dsss
    public final void c() {
    }
}
