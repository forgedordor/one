package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapg extends eatr {
    public easi a;
    private boolean b;
    private byte c;

    @Override // defpackage.eatr
    public final eats a() {
        easi easiVar;
        if (this.c == 1 && (easiVar = this.a) != null) {
            return new earq(easiVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" date");
        }
        if (this.c == 0) {
            sb.append(" exceptional");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eatr
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
