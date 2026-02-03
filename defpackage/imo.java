package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class imo {
    public static /* synthetic */ int a(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
