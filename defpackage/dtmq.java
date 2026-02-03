package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmq extends dtqb {
    public boolean a;
    public byte b;
    private boolean c;
    private final ejwi d;
    private final ejwi e;
    private final ejwi f;
    private final ejwi g;

    public dtmq() {
        ejud ejudVar = ejud.a;
        this.d = ejudVar;
        this.e = ejudVar;
        this.f = ejudVar;
        this.g = ejudVar;
    }

    @Override // defpackage.dtqb
    public final dtqc a() {
        if (this.b == 15) {
            return new dtmr(this.c, this.d, this.e, this.f, this.g, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" includeAllGroups");
        }
        if ((this.b & 2) == 0) {
            sb.append(" groupWithNoAccountOnly");
        }
        if ((this.b & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.b & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtqb
    public final void b(boolean z) {
        this.c = z;
        this.b = (byte) (this.b | 1);
    }
}
