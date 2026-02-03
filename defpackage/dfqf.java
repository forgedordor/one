package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfqf extends dfta {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.dfta
    public final dftb a() {
        return new dfqg(this.a, this.b);
    }

    @Override // defpackage.dfta
    public final void b(dgyx dgyxVar) {
        this.a = Optional.of(dgyxVar);
    }

    @Override // defpackage.dfta
    public final void c(dgzn dgznVar) {
        this.b = Optional.of(dgznVar);
    }
}
