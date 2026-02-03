package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggh extends cghf {
    public cgkt b;
    public cgkm c;
    private boolean f;
    private byte g;
    public Optional a = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();

    @Override // defpackage.cghf
    public final cghg a() {
        cgkt cgktVar;
        cgkm cgkmVar;
        if (this.g == 1 && (cgktVar = this.b) != null && (cgkmVar = this.c) != null) {
            return new cggi(this.a, cgktVar, cgkmVar, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" notificationStyleInfo");
        }
        if (this.c == null) {
            sb.append(" clickInteractionInfo");
        }
        if (this.g == 0) {
            sb.append(" shouldAlert");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cghf
    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) 1;
    }
}
