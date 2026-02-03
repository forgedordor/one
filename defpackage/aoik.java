package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoik implements aoip {
    public final dgiq a;
    private final fctc b;
    private final fctc c;
    private final fctc d;
    private final fctc e;
    private final boolean f;

    public aoik(cqmp cqmpVar, fcsu fcsuVar, cqej cqejVar, dgiq dgiqVar) {
        cqmpVar.getClass();
        fcsuVar.getClass();
        cqejVar.getClass();
        this.a = dgiqVar;
        this.b = fctd.a(new fdae() { // from class: aoif
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(aoij.a(cqej.d(Optional.of(this.a.a))));
            }
        });
        this.c = fctd.a(new fdae() { // from class: aoig
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(aoij.a(cqej.e(Optional.of(this.a.a))));
            }
        });
        this.d = fctd.a(new fdae() { // from class: aoih
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(aoij.a(cqej.c(Optional.of(this.a.a))));
            }
        });
        this.e = fctd.a(new fdae() { // from class: aoii
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(cqmp.c(this.a.a));
            }
        });
        this.f = true;
    }

    @Override // defpackage.aoip
    public final int a() {
        return ((Number) this.b.a()).intValue();
    }

    @Override // defpackage.aoip
    public final int b() {
        return ((Number) this.d.a()).intValue();
    }

    @Override // defpackage.aoip
    public final int c() {
        return ((Number) this.e.a()).intValue();
    }

    @Override // defpackage.aoip
    public final int d() {
        return ((Number) this.c.a()).intValue();
    }

    @Override // defpackage.aoip
    public final boolean e() {
        return this.f;
    }
}
