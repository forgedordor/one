package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsu extends drsx {
    public final String a;

    public drsu(String str) {
        this.a = str;
    }

    @Override // defpackage.drsx, defpackage.drto
    public final String a() {
        return this.a;
    }

    @Override // defpackage.drto
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof drto) {
            drto drtoVar = (drto) obj;
            if (drtoVar.b() == 1 && this.a.equals(drtoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item{emoji=" + this.a + "}";
    }
}
