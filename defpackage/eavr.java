package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eavr implements eanv {
    public static eavq s(String str, List list) {
        eauo eauoVar = new eauo();
        eauoVar.c = (byte) (eauoVar.c | 1);
        eauoVar.d(list);
        eauoVar.e(new ArrayList());
        if (str == null) {
            throw new NullPointerException("Null textQuery");
        }
        eauoVar.b = str;
        eauoVar.c = (byte) (eauoVar.c | 14);
        return eauoVar;
    }

    public abstract String b();

    public abstract List c();

    public abstract List d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();
}
