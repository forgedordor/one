package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dltx implements dlty {
    private doig a;
    private String b;
    private long c;
    private String d;
    private Instant e;
    private dltc f;
    private byte g;

    @Override // defpackage.dlvw
    public final dltc a() {
        throw null;
    }

    @Override // defpackage.dlwe
    public final /* bridge */ /* synthetic */ dltd b() {
        doig doigVar;
        String str;
        Instant instant;
        dltc dltcVar;
        if (this.g == 1 && (doigVar = this.a) != null && (str = this.b) != null && (instant = this.e) != null && (dltcVar = this.f) != null) {
            return new dlto(doigVar, str, this.c, this.d, instant, dltcVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaType");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        if (this.g == 0) {
            sb.append(" sizeBytes");
        }
        if (this.e == null) {
            sb.append(" dateModified");
        }
        if (this.f == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dlty
    public final /* synthetic */ void c(Instant instant) {
        this.e = instant;
    }

    @Override // defpackage.dlty
    public final /* synthetic */ void d(String str) {
        this.d = str;
    }

    @Override // defpackage.dlty
    public final /* synthetic */ void e(doig doigVar) {
        this.a = doigVar;
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void f(long j) {
        this.c = j;
        this.g = (byte) 1;
    }

    @Override // defpackage.dlvw
    public final /* bridge */ /* synthetic */ void g(dltc dltcVar) {
        this.f = dltcVar;
    }

    @Override // defpackage.dlty
    public final /* synthetic */ void h(String str) {
        this.b = str;
    }
}
