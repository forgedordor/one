package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtzl {
    public static final dtzl a;
    public static final dtzl b;
    public static final dtzl c;

    static {
        dtzj dtzjVarC = c();
        dtzjVarC.c(EnumSet.noneOf(dtzk.class));
        dtzjVarC.b(false);
        a = dtzjVarC.a();
        dtzj dtzjVarC2 = c();
        dtzjVarC2.c(EnumSet.of(dtzk.ANY));
        dtzjVarC2.b(true);
        b = dtzjVarC2.a();
        dtzj dtzjVarC3 = c();
        dtzjVarC3.c(EnumSet.of(dtzk.ANY));
        dtzjVarC3.b(false);
        c = dtzjVarC3.a();
    }

    public static dtzj c() {
        dtzb dtzbVar = new dtzb();
        dtzbVar.b(false);
        return dtzbVar;
    }

    public abstract ekhx a();

    public abstract boolean b();
}
