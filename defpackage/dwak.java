package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwak extends dwbl {
    public dwpk a;
    private String b;
    private dwpx c;
    private int d;
    private long e;
    private long f;
    private byte g;

    @Override // defpackage.dwbl
    public final dwbm a() {
        String str;
        dwpx dwpxVar;
        dwpk dwpkVar;
        if (this.g == 7 && (str = this.b) != null && (dwpxVar = this.c) != null && (dwpkVar = this.a) != null) {
            return new dwal(str, dwpxVar, dwpkVar, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" typingIndicatorId");
        }
        if (this.c == null) {
            sb.append(" conversationId");
        }
        if (this.a == null) {
            sb.append(" sender");
        }
        if ((this.g & 1) == 0) {
            sb.append(" typingIndicatorStatus");
        }
        if ((this.g & 2) == 0) {
            sb.append(" refreshIntervalUSec");
        }
        if ((this.g & 4) == 0) {
            sb.append(" serverTimestampUSec");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwbl
    public final void b(dwpx dwpxVar) {
        if (dwpxVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.c = dwpxVar;
    }

    @Override // defpackage.dwbl
    public final void c(long j) {
        this.e = j;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.dwbl
    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 4);
    }

    @Override // defpackage.dwbl
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null typingIndicatorId");
        }
        this.b = str;
    }

    @Override // defpackage.dwbl
    public final void f(int i) {
        this.d = i;
        this.g = (byte) (this.g | 1);
    }
}
