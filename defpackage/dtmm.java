package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmm extends dtoy {
    public ejwi a;
    public boolean b;
    public byte c;
    public int d;
    private String e;
    private final ejwi f;
    private final ejwi g;
    private final ejwi h;
    private final ejwi i;
    private ejwi j;
    private final ejwi k;

    public dtmm() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.f = ejudVar;
        this.g = ejudVar;
        this.h = ejudVar;
        this.i = ejudVar;
        this.j = ejudVar;
        this.k = ejudVar;
    }

    @Override // defpackage.dtoy
    public final dtoz a() {
        String str;
        int i;
        if (this.c == 15 && (str = this.e) != null && (i = this.d) != 0) {
            return new dtmn(str, this.a, this.f, this.g, this.h, this.i, this.j, this.k, i, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" groupName");
        }
        if ((this.c & 1) == 0) {
            sb.append(" groupSizeBytes");
        }
        if ((this.c & 2) == 0) {
            sb.append(" groupSizeBytesLong");
        }
        if (this.d == 0) {
            sb.append(" showNotifications");
        }
        if ((this.c & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.c & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtoy
    public final void b(ejwi ejwiVar) {
        if (ejwiVar == null) {
            throw new NullPointerException("Null downloadConditionsOptional");
        }
        this.j = ejwiVar;
    }

    @Override // defpackage.dtoy
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        this.e = str;
    }
}
