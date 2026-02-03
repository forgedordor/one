package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cmpp {
    public static auhk a(int i) {
        if (i == 1) {
            return auhk.DELIVERY;
        }
        if (i == 3) {
            return auhk.DELIVERY_FAILED;
        }
        throw new IllegalArgumentException(a.g(i, "Unsupported report type: "));
    }
}
