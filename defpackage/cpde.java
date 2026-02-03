package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpde implements cpdm {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy MM dd HH:mm:ss.SSS", Locale.US);
    private final crqv b;
    private final dhes c;
    private final cmlb d;
    private final fcsu e;

    public cpde(crqv crqvVar, dhes dhesVar, cmlb cmlbVar, fcsu fcsuVar) {
        this.b = crqvVar;
        this.c = dhesVar;
        this.d = cmlbVar;
        this.e = fcsuVar;
    }

    private final void g() {
        String strL = ((aqsu) this.e.b()).a() ? (String) this.d.h(cmla.a).map(new Function() { // from class: cpdd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmmh) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("") : this.c.l();
        crqv crqvVar = this.b;
        if (strL.equals(crqvVar.f("UPSELL_PROMPT_SIM_ID", ""))) {
            return;
        }
        crqvVar.n("PROMPT_COUNT");
        crqvVar.n("LAST_UPSELL_PROMPT_TIME");
        crqvVar.n("USER_ACCEPTED_UPSELL");
        crqvVar.l("UPSELL_PROMPT_SIM_ID", strL);
    }

    @Override // defpackage.cpdm
    public final int a() {
        g();
        return this.b.d("PROMPT_COUNT", 0);
    }

    @Override // defpackage.cpdm
    public final Optional b() {
        g();
        crqv crqvVar = this.b;
        if (!crqvVar.p("LAST_UPSELL_PROMPT_TIME")) {
            return Optional.empty();
        }
        try {
            return Optional.of(a.parse(crqvVar.f("LAST_UPSELL_PROMPT_TIME", "")));
        } catch (ParseException unused) {
            return Optional.empty();
        }
    }

    @Override // defpackage.cpdm
    public final void c() {
        g();
        this.b.j("PROMPT_COUNT", a() + 1);
    }

    @Override // defpackage.cpdm
    public final void d(Date date) {
        g();
        this.b.l("LAST_UPSELL_PROMPT_TIME", a.format(date));
    }

    @Override // defpackage.cpdm
    public final void e(boolean z) {
        g();
        this.b.h("USER_ACCEPTED_UPSELL", z);
    }

    @Override // defpackage.cpdm
    public final boolean f() {
        g();
        return this.b.q("USER_ACCEPTED_UPSELL", false);
    }
}
