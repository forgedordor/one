package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jea {
    public final hum a;
    public final fdae b;

    public jea(hum humVar, fdae fdaeVar) {
        this.a = humVar;
        this.b = fdaeVar;
    }

    public final Object a(int i) {
        fdae fdaeVar = this.b;
        Object objC = this.a.c(i);
        fdaeVar.invoke();
        return objC;
    }

    public final void b(int i, Object obj) {
        this.a.f(i, obj);
        this.b.invoke();
    }
}
