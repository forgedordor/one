package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfvl extends dfvv {
    public int a;
    public String b;
    public byte c;
    private Optional d = Optional.empty();
    private final Optional e = Optional.empty();
    private Optional f = Optional.empty();

    @Override // defpackage.dfvv
    public final dfvw a() {
        String str;
        if (this.c == 1 && (str = this.b) != null) {
            return new dfvm(this.d, this.a, str, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" responseCode");
        }
        if (this.b == null) {
            sb.append(" reason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dfvv
    public final void b(dgza dgzaVar) {
        this.f = Optional.of(dgzaVar);
    }

    @Override // defpackage.dfvv
    public final void c(dgzn dgznVar) {
        this.d = Optional.of(dgznVar);
    }
}
