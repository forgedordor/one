package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvuc extends dvue {
    private final dwhq a;

    public dvuc(dwhq dwhqVar) {
        this.a = dwhqVar;
    }

    @Override // defpackage.dvue, defpackage.dvun
    public final dwhq a() {
        return this.a;
    }

    @Override // defpackage.dvun
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvun) {
            dvun dvunVar = (dvun) obj;
            if (dvunVar.b() == 1 && this.a.equals(dvunVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Either{error=" + this.a.toString() + "}";
    }
}
