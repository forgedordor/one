package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwil extends dwjb {
    private long a;
    private dwjh b;
    private evqs c;
    private dwjd d;
    private byte e;

    @Override // defpackage.dwjb
    public final dwje a() {
        dwjh dwjhVar;
        evqs evqsVar;
        dwjd dwjdVar;
        if (this.e == 1 && (dwjhVar = this.b) != null && (evqsVar = this.c) != null && (dwjdVar = this.d) != null) {
            return new dwmc(this.a, dwjhVar, evqsVar, dwjdVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" registrationId");
        }
        if (this.b == null) {
            sb.append(" accountUsers");
        }
        if (this.c == null) {
            sb.append(" serverRegistrationId");
        }
        if (this.d == null) {
            sb.append(" serverRegistrationStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwjb
    public final void b(dwjh dwjhVar) {
        this.b = dwjhVar;
    }

    @Override // defpackage.dwjb
    public final void c(long j) {
        this.a = j;
        this.e = (byte) 1;
    }

    @Override // defpackage.dwjb
    public final void d(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null serverRegistrationId");
        }
        this.c = evqsVar;
    }

    @Override // defpackage.dwjb
    public final void e(dwjd dwjdVar) {
        if (dwjdVar == null) {
            throw new NullPointerException("Null serverRegistrationStatus");
        }
        this.d = dwjdVar;
    }
}
