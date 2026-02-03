package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxxu {
    public static dxxu b(Object obj, dxxk dxxkVar) {
        if (obj == null) {
            return null;
        }
        egbe egbeVar = (egbe) obj;
        return new dxxv(obj, dxxkVar.c(obj), dxxkVar.e(obj), dxxkVar.f(obj), (egbeVar.b().b & 8) != 0 ? egbeVar.b().f : null, dxxkVar.d(obj), dxxkVar.a(obj));
    }

    public abstract dxxo a();

    public abstract Object c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract void i();
}
