package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxs implements dqxq {
    private final dqrs a;
    private boolean b;
    private boolean c;
    private final dqsz d = new dqsz();
    private final dqsc e;
    private final AtomicReference f;

    public dqxs(dqsy dqsyVar, dqrs dqrsVar, dqsb dqsbVar) {
        dqsc dqscVar = new dqsc() { // from class: dqxr
            @Override // defpackage.dqsc
            public final void a() {
                throw new IllegalStateException("reentrant lock release callback not set or already completed");
            }
        };
        this.e = dqscVar;
        AtomicReference atomicReference = new AtomicReference(dqscVar);
        this.f = atomicReference;
        this.a = dqrsVar;
        atomicReference.set(dqsyVar.N(dqsbVar));
    }

    @Override // defpackage.dqxq
    public final dqrs a() {
        return this.a;
    }

    @Override // defpackage.dqxq
    public final dqsz b() {
        return this.d;
    }

    @Override // defpackage.dqxq
    public final void c(boolean z) {
        this.c = z;
    }

    @Override // defpackage.dqxq
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.dqxq
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.dqxq
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.dqxq
    public final void g() {
        this.b = true;
    }

    @Override // defpackage.dqxq
    public final void h() {
        ((dqsc) this.f.getAndSet(this.e)).a();
    }
}
