package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cgau extends cgdw {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private emgm d;

    @Override // defpackage.cgdw
    public final cgdx a() {
        emgm emgmVar = this.d;
        if (emgmVar != null) {
            return new cgav(emgmVar, this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: issueType");
    }

    @Override // defpackage.cgdw
    public final void b(emgm emgmVar) {
        if (emgmVar == null) {
            throw new NullPointerException("Null issueType");
        }
        this.d = emgmVar;
    }
}
