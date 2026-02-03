package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyy {
    public static final /* synthetic */ enzm a(enzj enzjVar) {
        evsn evsnVarBuild = enzjVar.build();
        evsnVarBuild.getClass();
        return (enzm) evsnVarBuild;
    }

    public static final void b(enzh enzhVar, enzj enzjVar) {
        enzjVar.copyOnWrite();
        enzm enzmVar = (enzm) enzjVar.instance;
        enzm enzmVar2 = enzm.a;
        enzmVar.g = enzhVar;
        enzmVar.b |= 16;
    }

    public static final void c(int i, enzj enzjVar) {
        enzjVar.copyOnWrite();
        enzm enzmVar = (enzm) enzjVar.instance;
        enzm enzmVar2 = enzm.a;
        enzmVar.f = i - 1;
        enzmVar.b |= 8;
    }
}
