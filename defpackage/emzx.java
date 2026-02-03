package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzx {
    public static final /* synthetic */ enbq a(enbd enbdVar) {
        evsn evsnVarBuild = enbdVar.build();
        evsnVarBuild.getClass();
        return (enbq) evsnVarBuild;
    }

    public static final void b(String str, enbd enbdVar) {
        enbdVar.copyOnWrite();
        enbq enbqVar = (enbq) enbdVar.instance;
        enbq enbqVar2 = enbq.a;
        enbqVar.b |= 2;
        enbqVar.f = str;
    }

    public static final void c(enbn enbnVar, enbd enbdVar) {
        enbnVar.getClass();
        enbdVar.copyOnWrite();
        enbq enbqVar = (enbq) enbdVar.instance;
        enbq enbqVar2 = enbq.a;
        enbqVar.e = enbnVar.m;
        enbqVar.b |= 1;
    }
}
