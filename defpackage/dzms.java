package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzms {
    public abstract dzmt a();

    public abstract dzms b(int i);

    public final dzms c(boolean z) {
        return b(true != z ? 2 : 3);
    }

    public final dzmt d() {
        dzmt dzmtVarA = a();
        float f = ((dzmr) dzmtVarA).a;
        boolean z = false;
        if (f > 0.0f && f <= 100.0f) {
            z = true;
        }
        ejwl.b(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return dzmtVarA;
    }
}
