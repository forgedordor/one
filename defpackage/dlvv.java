package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvv implements dlvp {
    public static final dlvv a = new dlvv();
    private final /* synthetic */ dlvt b;

    private dlvv() {
        ekph ekphVar = new ekph(dlvm.c);
        this.b = new dlvt(ekphVar, ekphVar);
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
        if (!(obj instanceof dlvv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 125327243;
    }

    public final String toString() {
        return "SizeBytesStrategy";
    }
}
