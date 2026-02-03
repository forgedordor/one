package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwg {
    public static final /* synthetic */ dbwf a(dbwe dbweVar) {
        evsn evsnVarBuild = dbweVar.build();
        evsnVarBuild.getClass();
        return (dbwf) evsnVarBuild;
    }

    public static final void b(String str, dbwe dbweVar) {
        str.getClass();
        dbweVar.copyOnWrite();
        dbwf dbwfVar = (dbwf) dbweVar.instance;
        dbwf dbwfVar2 = dbwf.a;
        dbwfVar.b |= 1;
        dbwfVar.e = str;
    }

    public static final void c(dbxg dbxgVar, dbwe dbweVar) {
        dbweVar.copyOnWrite();
        dbwf dbwfVar = (dbwf) dbweVar.instance;
        dbwf dbwfVar2 = dbwf.a;
        dbwfVar.d = dbxgVar;
        dbwfVar.c = 3;
    }

    public static final void d(int i, dbwe dbweVar) {
        dbweVar.copyOnWrite();
        dbwf dbwfVar = (dbwf) dbweVar.instance;
        dbwf dbwfVar2 = dbwf.a;
        dbwfVar.b |= 2;
        dbwfVar.f = i;
    }
}
