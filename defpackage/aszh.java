package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszh implements asxy {
    public final asxy a;
    private final asxy b;
    private final ScheduledExecutorService c;
    private final asse d;

    public aszh(asxy asxyVar, asxy asxyVar2, asse asseVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = asxyVar;
        this.a = asxyVar2;
        this.d = asseVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.asxy
    public final eiju a(final Iterable iterable) {
        return cqnx.b(this.b.a(iterable), new ejxr() { // from class: aszg
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.a.a(iterable);
            }
        }, this.c, this.d.a());
    }

    @Override // defpackage.asxy
    public final eiju b(final aubq aubqVar) {
        return cqnx.b(this.b.b(aubqVar), new ejxr() { // from class: aszf
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.a.b(aubqVar);
            }
        }, this.c, this.d.a());
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
