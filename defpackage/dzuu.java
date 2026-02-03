package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzuu {
    public abstract dzuv a();

    public abstract dzuu b(int i);

    public final dzuu c(boolean z) {
        return b(true != z ? 2 : 3);
    }

    public final dzuv d() {
        dzuv dzuvVarA = a();
        float f = ((dzum) dzuvVarA).a;
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        ejwl.m(z, "Probability shall be between 0 and 1.");
        return dzuvVarA;
    }
}
