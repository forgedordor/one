package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuv {
    public static final /* synthetic */ encs a(enco encoVar) {
        evsn evsnVarBuild = encoVar.build();
        evsnVarBuild.getClass();
        return (encs) evsnVarBuild;
    }

    public static final void b(int i, enco encoVar) {
        encoVar.copyOnWrite();
        encs encsVar = (encs) encoVar.instance;
        encs encsVar2 = encs.a;
        encsVar.c = i - 1;
        encsVar.b |= 1;
    }

    public static final void c(int i, enco encoVar) {
        encoVar.copyOnWrite();
        encs encsVar = (encs) encoVar.instance;
        encs encsVar2 = encs.a;
        encsVar.d = i - 1;
        encsVar.b |= 2;
    }
}
