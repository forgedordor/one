package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fzd {
    public final fddq a;
    public final Locale b;
    public final hhr c;
    public final hox d;
    private final hox e;

    public fzd(Long l, fddq fddqVar, djll djllVar, Locale locale) {
        hhv hhvVarF;
        this.a = fddqVar;
        this.b = locale;
        hht hhtVar = new hht(locale);
        this.c = hhtVar;
        hsi hsiVar = hsi.a;
        this.d = new hpl(djllVar, hsiVar);
        if (l != null) {
            hhvVarF = hhtVar.e(l.longValue());
            if (!fddqVar.g(hhvVarF.a)) {
                hhvVarF = hhtVar.f(hhtVar.c());
            }
        } else {
            hhvVarF = hhtVar.f(hhtVar.c());
        }
        this.e = new hpl(hhvVarF, hsiVar);
    }

    public final long a() {
        return ((hhv) this.e.a()).e;
    }

    public final void b(long j) {
        hhv hhvVarE = this.c.e(j);
        if (this.a.g(hhvVarE.a)) {
            this.e.b(hhvVarE);
        }
    }
}
