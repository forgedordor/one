package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audp {
    public static final /* synthetic */ audo a(audn audnVar) {
        evsn evsnVarBuild = audnVar.build();
        evsnVarBuild.getClass();
        return (audo) evsnVarBuild;
    }

    public static final void b(String str, audn audnVar) {
        audnVar.copyOnWrite();
        audo audoVar = (audo) audnVar.instance;
        audo audoVar2 = audo.a;
        audoVar.b |= 1;
        audoVar.c = str;
    }
}
