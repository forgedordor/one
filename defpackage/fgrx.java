package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgrx implements fguw {
    private final Appendable a;
    private final fgrl b;

    public fgrx(Appendable appendable, fgrl fgrlVar) {
        this.a = appendable;
        this.b = fgrlVar;
        fgrlVar.a();
    }

    @Override // defpackage.fguw
    public final void a(fgry fgryVar, int i) {
        try {
            fgryVar.e(this.a, i, this.b);
        } catch (IOException e) {
            throw new fgqv(e);
        }
    }

    @Override // defpackage.fguw
    public final void b(fgry fgryVar, int i) {
        if (fgryVar.a().equals("#text")) {
            return;
        }
        try {
            fgryVar.f(this.a, i, this.b);
        } catch (IOException e) {
            throw new fgqv(e);
        }
    }
}
