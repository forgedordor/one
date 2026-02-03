package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejmm {
    public static ejml h() {
        ejmh ejmhVar = new ejmh();
        ejmhVar.f("");
        ejmhVar.d("");
        ejmhVar.e("");
        ejmhVar.g("");
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        if (ekgbVar == null) {
            throw new NullPointerException("Null contactAnnotations");
        }
        if (ejmhVar.a != null) {
            throw new IllegalStateException("Cannot set contactAnnotations after calling contactAnnotationsBuilder()");
        }
        ejmhVar.b = ekgbVar;
        if (ejmhVar.c != null) {
            throw new IllegalStateException("Cannot set annotations after calling annotationsBuilder()");
        }
        ejmhVar.d = ekgbVar;
        ejmhVar.c(ezor.a);
        return ejmhVar;
    }

    public abstract ekgb a();

    public abstract ekgb b();

    public abstract ezor c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();
}
