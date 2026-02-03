package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gep {
    public Long a;
    private final fddq b;
    private final hid c;
    private final String d;
    private final String e;
    private final String f;
    private final gfd g;
    private final djll h;

    public gep(fddq fddqVar, djll djllVar, hid hidVar, gfd gfdVar, String str, String str2, String str3) {
        this.b = fddqVar;
        this.h = djllVar;
        this.c = hidVar;
        this.g = gfdVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a(hhq hhqVar, Locale locale) {
        if (hhqVar == null) {
            String str = this.d;
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return hjw.a(str, upperCase);
        }
        fddq fddqVar = this.b;
        int i = hhqVar.a;
        if (!fddqVar.g(i)) {
            return hjw.a(this.e, gaz.a(fddqVar.a, 0, 7), gaz.a(fddqVar.b, 0, 7));
        }
        djll djllVar = this.h;
        return (djllVar.b(i) && djllVar.a(hhqVar.c)) ? "" : hjw.a(this.f, this.g.a(Long.valueOf(hhqVar.c), locale, false));
    }
}
