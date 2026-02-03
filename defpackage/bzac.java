package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzac {
    private final int a;
    private final bbml b;
    private final boolean c;

    public bzac(int i, bbml bbmlVar, boolean z) {
        this.a = i;
        this.b = bbmlVar;
        this.c = z;
    }

    public final bbmm a(int i, String str) {
        return b(i, str, cpyi.b());
    }

    public final bbmm b(int i, String str, Integer[] numArr) {
        bbmm bbmmVar = new bbmm();
        bbml bbmlVar = this.b;
        bbmmVar.c = bbmlVar;
        bbmmVar.e = 32;
        bbmmVar.b = this.a;
        bbmmVar.i = str;
        bbmmVar.c();
        bbmmVar.h = this.c;
        bbmmVar.b(String.format(Locale.US, "%s NOT IN (%s)", String.format(Locale.US, "(SELECT cms_life_cycle FROM %s as parent WHERE %s = parent.%s)", bbmj.d(i), (true != bbmlVar.equals(bbml.DELETE) ? "NEW." : "OLD.").concat(str), "_id"), ejwc.d(',').f(numArr)));
        return bbmmVar;
    }
}
