package defpackage;

import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class annn implements annz {
    public final fdjx a;
    public final bydb b;
    public final anpj c;
    public final anpj d;
    public final anpj e;
    private final fdjx g;
    private final fcsu h;
    private cquc j;
    public final AtomicBoolean f = new AtomicBoolean(false);
    private final Object i = new Object();

    public annn(fdjx fdjxVar, fdjx fdjxVar2, bydb bydbVar, fcsu fcsuVar, anpj anpjVar, anpj anpjVar2, anpj anpjVar3) {
        this.a = fdjxVar;
        this.g = fdjxVar2;
        this.b = bydbVar;
        this.h = fcsuVar;
        this.c = anpjVar;
        this.d = anpjVar2;
        this.e = anpjVar3;
    }

    @Override // defpackage.annz
    public final eiju a(Instant instant) {
        instant.getClass();
        return auvw.c(this.g, fcyi.a, fdjz.a, new annl(this, instant, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j$.time.Instant r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.annn.b(j$.time.Instant, fcxy):java.lang.Object");
    }

    @Override // defpackage.annz
    public final void c() {
        synchronized (this.i) {
            if (this.j != null) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.f.compareAndSet(false, true)) {
                throw new IllegalStateException("Check failed.");
            }
            this.j = this.e.a(new anpi() { // from class: anni
                @Override // defpackage.anpi
                public final eiju a() {
                    annn annnVar = this.a;
                    return auvw.c(annnVar.a, fcyi.a, fdjz.a, new annk(annnVar, null));
                }
            });
        }
    }

    @Override // defpackage.annz
    public final void d() {
        cquc cqucVar;
        synchronized (this.i) {
            this.f.set(false);
            cqucVar = this.j;
            this.j = null;
        }
        if (cqucVar != null) {
            cqucVar.a();
        }
    }
}
