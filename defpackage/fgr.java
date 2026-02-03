package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgr implements hqt {
    public final long a;
    public final flr b;
    public final long c;
    public fgu d;
    public fii e;
    public final ics f;

    public /* synthetic */ fgr(long j, flr flrVar, long j2) {
        fgu fguVar = fgu.a;
        this.a = j;
        this.b = flrVar;
        this.c = j2;
        this.d = fguVar;
        fdae fdaeVar = new fdae() { // from class: fgq
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.d.b;
            }
        };
        fgs fgsVar = new fgs(fdaeVar, flrVar, j);
        this.f = fjw.a(ics.e, new fgt(fdaeVar, flrVar, j), fgsVar).a(new PointerHoverIconModifierElement(irz.b));
    }

    @Override // defpackage.hqt
    public final void g() {
        fii fiiVar = this.e;
        if (fiiVar != null) {
            this.b.g(fiiVar);
            this.e = null;
        }
    }

    @Override // defpackage.hqt
    public final void h() {
        fii fiiVar = this.e;
        if (fiiVar != null) {
            this.b.g(fiiVar);
            this.e = null;
        }
    }

    @Override // defpackage.hqt
    public final void i() {
        fif fifVar = new fif(this.a, new fdae() { // from class: fgo
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.d.b;
            }
        }, new fdae() { // from class: fgp
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.d.c;
            }
        });
        this.b.i(fifVar);
        this.e = fifVar;
    }
}
