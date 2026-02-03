package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqys implements dqxq {
    private boolean a;
    private boolean b;
    private final dqsz c = new dqsz();
    private final AtomicReference d;

    public dqys(dqsy dqsyVar, dqsb dqsbVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        atomicReference.set(dqsyVar.N(dqsbVar));
    }

    @Override // defpackage.dqxq
    public final /* synthetic */ dqrs a() {
        return null;
    }

    @Override // defpackage.dqxq
    public final dqsz b() {
        return this.c;
    }

    @Override // defpackage.dqxq
    public final void c(boolean z) {
        this.b = z;
    }

    @Override // defpackage.dqxq
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dqxq
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.dqxq
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.dqxq
    public final void g() {
        this.a = true;
    }

    @Override // defpackage.dqxq
    public final void h() {
        Context context = dqru.b;
        ((dqsc) this.d.getAndSet(new dqsc() { // from class: dqyr
            @Override // defpackage.dqsc
            public final void a() {
            }
        })).a();
    }
}
