package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzju {
    public abstract ekgb a();

    public abstract boolean b();

    public final ekgb c() {
        if (b()) {
            return a();
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }
}
