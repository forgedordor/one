package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvud extends dvue {
    private final Object a;

    public dvud(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.dvun
    public final int b() {
        return 2;
    }

    @Override // defpackage.dvue, defpackage.dvun
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvun) {
            dvun dvunVar = (dvun) obj;
            if (dvunVar.b() == 2 && this.a.equals(dvunVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Either{result=" + this.a.toString() + "}";
    }
}
