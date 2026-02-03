package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgoq extends fgoo {
    public final fgms b;

    protected fgoq(fgms fgmsVar, fgmu fgmuVar) {
        super(fgmuVar);
        if (fgmsVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!fgmsVar.u()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.b = fgmsVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public int c() {
        throw null;
    }

    @Override // defpackage.fgms
    public int d() {
        throw null;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public fgna q() {
        return this.b.q();
    }

    @Override // defpackage.fgms
    public fgna s() {
        return this.b.s();
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
