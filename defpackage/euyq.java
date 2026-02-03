package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyq extends euyw {
    private int e;
    private final Optional d = Optional.empty();
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();

    @Override // defpackage.euyw
    public final euza a() {
        if (this.e != 0) {
            return new euyr(this.d, this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: delegate");
    }

    @Override // defpackage.euyw
    public final void b() {
        this.e = 1;
    }
}
