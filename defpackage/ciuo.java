package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciuo extends cius {
    public Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.cius
    public final ciuu a() {
        return new ciup(this.a, this.b);
    }

    @Override // defpackage.cius
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.cius
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.cius
    public final void d(ciut ciutVar) {
        this.b = Optional.of(ciutVar);
    }
}
