package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmo extends dtpz {
    public boolean a;
    public byte b;
    private String c;
    private final ejwi d;
    private final ejwi e;

    public dtmo() {
        ejud ejudVar = ejud.a;
        this.d = ejudVar;
        this.e = ejudVar;
    }

    @Override // defpackage.dtpz
    public final dtqa a() {
        String str;
        if (this.b == 3 && (str = this.c) != null) {
            return new dtmp(str, this.d, this.e, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" groupName");
        }
        if ((this.b & 1) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.b & 2) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtpz
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        this.c = str;
    }
}
