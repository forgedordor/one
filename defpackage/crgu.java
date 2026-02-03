package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgu {
    public static final cczv a = cdag.h(cdag.b, "enable_parsing_emoji_suggestions", false);
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final cqce g;

    public crgu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, @apnu fcsu fcsuVar5) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = cqce.g("Bugle", "SuggestionMapper");
    }

    public final ezgi a(ezgi ezgiVar, ezan ezanVar) {
        ezgiVar.getClass();
        ezanVar.getClass();
        ezgg ezggVar = ezgiVar.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezgf ezgfVar = (ezgf) ezggVar.toBuilder();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVar.a();
        ezgh ezghVar = (ezgh) ezgiVar.toBuilder();
        ezghVar.copyOnWrite();
        ezgi ezgiVar2 = (ezgi) ezghVar.instance;
        ezgg ezggVar2 = (ezgg) ezgfVar.build();
        ezggVar2.getClass();
        ezgiVar2.e = ezggVar2;
        ezgiVar2.b |= 1;
        evsn evsnVarBuild = ezghVar.build();
        evsnVarBuild.getClass();
        return (ezgi) evsnVarBuild;
    }
}
