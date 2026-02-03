package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpp {
    public static final /* synthetic */ chpo a(chpn chpnVar) {
        evsn evsnVarBuild = chpnVar.build();
        evsnVarBuild.getClass();
        return (chpo) evsnVarBuild;
    }

    public static final void b(long j, chpn chpnVar) {
        chpnVar.copyOnWrite();
        chpo chpoVar = (chpo) chpnVar.instance;
        chpo chpoVar2 = chpo.a;
        chpoVar.b |= 1;
        chpoVar.d = j;
    }

    public static final void c(String str, chpn chpnVar) {
        chpnVar.copyOnWrite();
        chpo chpoVar = (chpo) chpnVar.instance;
        chpo chpoVar2 = chpo.a;
        chpoVar.c = str;
    }
}
