package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drue {
    public Executor a;
    public final ekfw b;
    private final lvb c = lvb.d;
    private final ekfw d;
    private final ekfw e;

    public drue() {
        if (!drxl.a) {
            boolean z = drxx.a;
        }
        int i = ekgb.d;
        this.b = new ekfw();
        this.d = new ekfw();
        this.e = new ekfw();
    }

    public final druc a() {
        Executor executor = this.a;
        if (executor == null) {
            throw new IllegalStateException("callback executor was not provided");
        }
        return new druc(executor, this.c, new drud(this.b.g(), this.d.g(), this.e.g()));
    }
}
