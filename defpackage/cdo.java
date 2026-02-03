package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cdo {
    public abstract cdp a();

    public final cdp b() {
        cdp cdpVarA = a();
        cds cdsVar = (cds) cdpVarA;
        if (Objects.equals(cdsVar.a, "audio/mp4a-latm") && cdsVar.b == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return cdpVarA;
    }

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e(int i);

    public abstract void f(int i);

    public abstract void g(String str);

    public abstract void h(int i);

    public abstract void i();
}
