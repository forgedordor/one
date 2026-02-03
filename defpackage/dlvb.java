package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvb implements dlvp {
    public static final dlvb a = new dlvb();
    private final /* synthetic */ dlvt b;

    private dlvb() {
        dlvm dlvmVar = dlvm.a;
        this.b = new dlvt(ekfv.f(fcwm.g(fcwm.b(dlvmVar), dlvq.a)), ekfv.f(fcwm.g(fcwm.g(fcwm.b(dlvmVar), dlvu.b.e), dlvu.c.e)));
    }

    @Override // defpackage.dlvp
    public final String[] a(dlvo dlvoVar) {
        dlvoVar.getClass();
        return this.b.a(dlvoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -318043789;
    }

    public final String toString() {
        return "GalleryStrategy";
    }
}
