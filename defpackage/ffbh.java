package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ffbh implements ffgb {
    public boolean a;
    final /* synthetic */ ffbn b;
    private final fffg c;

    public ffbh(ffbn ffbnVar) {
        this.b = ffbnVar;
        this.c = new fffg(ffbnVar.c.a());
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.c;
    }

    @Override // defpackage.ffgb
    public long b(ffez ffezVar, long j) throws IOException {
        try {
            return this.b.c.b(ffezVar, j);
        } catch (IOException e) {
            this.b.b.e();
            c();
            throw e;
        }
    }

    public final void c() {
        ffbn ffbnVar = this.b;
        int i = ffbnVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(a.g(i, "state: "));
        }
        ffbn.l(this.c);
        ffbnVar.e = 6;
    }

    protected final void d() {
        this.a = true;
    }
}
