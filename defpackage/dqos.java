package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqos extends dqtr {
    public dqpo a;
    public dqpo b;
    public String c;
    public dqyj d;
    public String e;
    private dqwl f;
    private boolean g;
    private byte h;

    @Override // defpackage.dqtr
    protected final dqts a() {
        dqwl dqwlVar;
        if (this.h == 1 && (dqwlVar = this.f) != null) {
            return new dqot(dqwlVar, this.a, this.b, this.c, this.d, this.e, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" query");
        }
        if (this.h == 0) {
            sb.append(" isExemptFromIndexRequirementOnJoinedColumn");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqtr
    public final dqwl b() {
        dqwl dqwlVar = this.f;
        if (dqwlVar != null) {
            return dqwlVar;
        }
        throw new IllegalStateException("Property \"query\" has not been set");
    }

    @Override // defpackage.dqtr
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dqtr
    public final void d(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }

    @Override // defpackage.dqtr
    public final void e(dqwl dqwlVar) {
        if (dqwlVar == null) {
            throw new NullPointerException("Null query");
        }
        this.f = dqwlVar;
    }

    @Override // defpackage.dqtr
    public final void f(String str) {
        this.e = str;
    }
}
