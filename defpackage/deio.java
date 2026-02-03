package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deio {
    public static final deio a = new deio(new Object() { // from class: deii
    });
    public final Object b = new Object();
    public defn c;
    public int d;
    public final deii e;

    public deio(deii deiiVar) {
        this.e = deiiVar;
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = "ShareableTimeSignalSupplierManager{shareableSimpleClientInitializerFactory=" + toString() + ", createShareableTimeSignalSupplierAdapterTask=" + String.valueOf(this.c) + ", usageCount=" + this.d + "}";
        }
        return str;
    }
}
