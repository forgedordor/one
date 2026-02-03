package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpf extends ejqf {
    public ekgi a;
    public ekgp b;
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    private boolean g;
    private byte h;

    @Override // defpackage.ejqf
    public final ejqg a() {
        ekgi ekgiVar = this.a;
        if (ekgiVar != null) {
            this.b = ekgiVar.c();
        } else if (this.b == null) {
            this.b = ekoj.a;
        }
        if (this.h == 1) {
            return new ejpg(this.g, this.b, this.c, this.d, this.e, this.f);
        }
        throw new IllegalStateException("Missing required properties: isMatch");
    }

    @Override // defpackage.ejqf
    public final void b(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }
}
