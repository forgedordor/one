package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gib extends fzd implements ghy {
    public final hox e;
    public final hox f;

    public gib(Long l, Long l2, fddq fddqVar, int i, djll djllVar, Locale locale) {
        super(l2, fddqVar, djllVar, locale);
        hhq hhqVar = null;
        if (l != null) {
            hhq hhqVarB = this.c.b(l.longValue());
            if (fddqVar.g(hhqVarB.a)) {
                hhqVar = hhqVarB;
            }
        }
        hsi hsiVar = hsi.a;
        this.e = new hpl(hhqVar, hsiVar);
        this.f = new hpl(new giy(i), hsiVar);
    }

    @Override // defpackage.ghy
    public final int c() {
        return ((giy) this.f.a()).a;
    }

    @Override // defpackage.ghy
    public final Long d() {
        hhq hhqVar = (hhq) this.e.a();
        if (hhqVar != null) {
            return Long.valueOf(hhqVar.c);
        }
        return null;
    }
}
