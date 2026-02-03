package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrw {
    public static final /* synthetic */ wrv a(wru wruVar) {
        evsn evsnVarBuild = wruVar.build();
        evsnVarBuild.getClass();
        return (wrv) evsnVarBuild;
    }

    public static final void b(String str, wru wruVar) {
        wruVar.copyOnWrite();
        wrv wrvVar = (wrv) wruVar.instance;
        wrv wrvVar2 = wrv.a;
        wrvVar.b |= 2;
        wrvVar.d = str;
    }

    public static final void c(dlul dlulVar, wru wruVar) {
        wruVar.copyOnWrite();
        wrv wrvVar = (wrv) wruVar.instance;
        wrv wrvVar2 = wrv.a;
        wrvVar.c = dlulVar;
        wrvVar.b |= 1;
    }
}
