package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsum extends dsuo {
    public emky a;
    public Integer b;
    public int[] c;
    public int[] d;
    public dbyw e;
    private String f;
    private evuh g;
    private eyek h;

    @Override // defpackage.dsuo
    public final dsup a() {
        evuh evuhVar;
        eyek eyekVar;
        String str = this.f;
        if (str != null && (evuhVar = this.g) != null && (eyekVar = this.h) != null) {
            return new dsun(str, evuhVar, this.a, this.b, eyekVar, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" logSource");
        }
        if (this.g == null) {
            sb.append(" message");
        }
        if (this.h == null) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dsuo
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null logSource");
        }
        this.f = str;
    }

    @Override // defpackage.dsuo
    public final void c(evuh evuhVar) {
        if (evuhVar == null) {
            throw new NullPointerException("Null message");
        }
        this.g = evuhVar;
    }

    @Override // defpackage.dsuo
    public final void d(eyek eyekVar) {
        if (eyekVar == null) {
            throw new NullPointerException("Null qosTier");
        }
        this.h = eyekVar;
    }
}
