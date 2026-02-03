package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobr {
    public static final /* synthetic */ emqu a(emqt emqtVar) {
        evsn evsnVarBuild = emqtVar.build();
        evsnVarBuild.getClass();
        return (emqu) evsnVarBuild;
    }

    public static final void b(int i, emqt emqtVar) {
        emqtVar.copyOnWrite();
        emqu emquVar = (emqu) emqtVar.instance;
        emqu emquVar2 = emqu.a;
        emquVar.b |= 1;
        emquVar.c = i;
    }

    public static final void c(emqt emqtVar) {
        emqtVar.copyOnWrite();
        emqu emquVar = (emqu) emqtVar.instance;
        emqu emquVar2 = emqu.a;
        emquVar.b |= 2;
        emquVar.d = true;
    }
}
