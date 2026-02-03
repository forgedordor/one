package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejmo implements Comparable {
    public static ejmn f() {
        ejmj ejmjVar = new ejmj();
        ejmjVar.f("");
        ejmjVar.d(0.0f);
        int i = ekgb.d;
        ejmjVar.b(ekoe.a);
        return ejmjVar;
    }

    public abstract float a();

    public abstract ekgb b();

    public abstract ezal c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ejmo ejmoVar = (ejmo) obj;
        return ekdr.b.c(d(), ejmoVar.d()).d(Float.valueOf(a()), Float.valueOf(ejmoVar.a()), ekop.a).a();
    }

    public abstract String d();

    public abstract String e();
}
