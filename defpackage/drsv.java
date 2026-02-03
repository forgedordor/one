package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsv extends drsx {
    private final String a;

    public drsv(String str) {
        this.a = str;
    }

    @Override // defpackage.drto
    public final int b() {
        return 4;
    }

    @Override // defpackage.drsx, defpackage.drto
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof drto) {
            drto drtoVar = (drto) obj;
            if (drtoVar.b() == 4 && this.a.equals(drtoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item{emptyCategoryDesc=" + this.a + "}";
    }
}
