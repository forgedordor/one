package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshm extends eshq {
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g;
    private int h;

    public eshm() {
    }

    @Override // defpackage.eshq
    public final eshr a() {
        if (this.g == 3 && this.h != 0) {
            return new eshn(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eshq
    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.eshq
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.h = i;
    }

    @Override // defpackage.eshq
    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }

    public eshm(eshr eshrVar) {
        eshn eshnVar = (eshn) eshrVar;
        this.a = eshnVar.a;
        this.h = eshnVar.g;
        this.b = eshnVar.b;
        this.c = eshnVar.c;
        this.e = eshnVar.d;
        this.f = eshnVar.e;
        this.d = eshnVar.f;
        this.g = (byte) 3;
    }
}
