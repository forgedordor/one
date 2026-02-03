package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzc {
    public static final /* synthetic */ exzo a(exzn exznVar) {
        evsn evsnVarBuild = exznVar.build();
        evsnVarBuild.getClass();
        return (exzo) evsnVarBuild;
    }

    public static final void b(exzg exzgVar, exzn exznVar) {
        exznVar.copyOnWrite();
        exzo exzoVar = (exzo) exznVar.instance;
        exzo exzoVar2 = exzo.a;
        exzoVar.d = exzgVar;
        exzoVar.c = 2;
    }

    public static final void c(String str, exzn exznVar) {
        exznVar.copyOnWrite();
        exzo exzoVar = (exzo) exznVar.instance;
        exzo exzoVar2 = exzo.a;
        exzoVar.e = str;
    }

    public static final void d(exzr exzrVar, exzn exznVar) {
        exznVar.copyOnWrite();
        exzo exzoVar = (exzo) exznVar.instance;
        exzo exzoVar2 = exzo.a;
        exzoVar.d = exzrVar;
        exzoVar.c = 1;
    }

    public static final void e(String str, exzn exznVar) {
        exznVar.copyOnWrite();
        exzo exzoVar = (exzo) exznVar.instance;
        exzo exzoVar2 = exzo.a;
        exzoVar.b |= 1;
        exzoVar.f = str;
    }
}
