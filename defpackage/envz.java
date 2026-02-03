package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envz {
    public static final /* synthetic */ encw a(encu encuVar) {
        evsn evsnVarBuild = encuVar.build();
        evsnVarBuild.getClass();
        return (encw) evsnVarBuild;
    }

    public static final void b(int i, encu encuVar) {
        encuVar.copyOnWrite();
        encw encwVar = (encw) encuVar.instance;
        encw encwVar2 = encw.a;
        encwVar.c = i - 1;
        encwVar.b |= 1;
    }
}
