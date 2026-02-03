package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhca implements fhbk {
    final Executor a;
    final fhbk b;

    public fhca(Executor executor, fhbk fhbkVar) {
        this.a = executor;
        this.b = fhbkVar;
    }

    @Override // defpackage.fhbk
    public final fezb a() {
        return this.b.a();
    }

    @Override // defpackage.fhbk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fhbk clone() {
        return new fhca(this.a, this.b.clone());
    }

    @Override // defpackage.fhbk
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.fhbk
    public final void d(fhbn fhbnVar) {
        this.b.d(new fhbz(this, fhbnVar));
    }

    @Override // defpackage.fhbk
    public final boolean e() {
        return this.b.e();
    }
}
