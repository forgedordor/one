package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajnc extends ajno {
    public Optional a = Optional.empty();
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();

    @Override // defpackage.ajno
    public final ajnp a() {
        return new ajnd(this.a, this.b, this.c);
    }

    @Override // defpackage.ajno
    public final void b(ajnr ajnrVar) {
        this.b = Optional.of(ajnrVar);
    }

    @Override // defpackage.ajno
    public final void c(ajns ajnsVar) {
        this.c = Optional.of(ajnsVar);
    }
}
