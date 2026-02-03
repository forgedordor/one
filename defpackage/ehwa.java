package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwa {
    private long b;
    private final long c = TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES);
    private final List d = new ArrayList();
    public boolean a = false;

    public final ehwb a() {
        ejwl.m(this.b != 0, "You must specify a minimum sync interval for all syncs.");
        ekgi ekgiVar = new ekgi();
        for (ehwd ehwdVar : this.d) {
            ekgiVar.i(ehwdVar.b(), ehwdVar);
        }
        return new ehvx(this.b, this.c, ekgiVar.c(), this.a);
    }

    public final void b(ehwd ehwdVar) {
        this.d.add(ehwdVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
