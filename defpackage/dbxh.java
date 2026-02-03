package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxh {
    public static final /* synthetic */ dbxg a(dbxf dbxfVar) {
        evsn evsnVarBuild = dbxfVar.build();
        evsnVarBuild.getClass();
        return (dbxg) evsnVarBuild;
    }

    public static final void b(evqs evqsVar, dbxf dbxfVar) {
        dbxfVar.copyOnWrite();
        dbxg dbxgVar = (dbxg) dbxfVar.instance;
        dbxg dbxgVar2 = dbxg.a;
        dbxgVar.b |= 1;
        dbxgVar.e = evqsVar;
    }
}
