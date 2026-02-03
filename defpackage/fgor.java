package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgor extends fgop {
    private static final long serialVersionUID = 8019982251647420015L;
    public final fgna a;

    public fgor(fgna fgnaVar, fgnc fgncVar) {
        super(fgncVar);
        if (!fgnaVar.f()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.a = fgnaVar;
    }

    @Override // defpackage.fgna
    public long a(long j, int i) {
        return this.a.a(j, i);
    }

    @Override // defpackage.fgna
    public long b(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.fgna
    public long c() {
        return this.a.c();
    }

    @Override // defpackage.fgna
    public final boolean e() {
        return this.a.e();
    }
}
