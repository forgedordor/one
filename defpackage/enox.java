package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enox {
    public static final /* synthetic */ enbx a(enbv enbvVar) {
        evsn evsnVarBuild = enbvVar.build();
        evsnVarBuild.getClass();
        return (enbx) evsnVarBuild;
    }

    public static final void b(long j, enbv enbvVar) {
        enbvVar.copyOnWrite();
        enbx enbxVar = (enbx) enbvVar.instance;
        enbx enbxVar2 = enbx.a;
        enbxVar.b |= 1;
        enbxVar.c = j;
    }

    public static final void c(int i, enbv enbvVar) {
        if (i == 0) {
            throw null;
        }
        enbvVar.copyOnWrite();
        enbx enbxVar = (enbx) enbvVar.instance;
        enbx enbxVar2 = enbx.a;
        enbxVar.d = i - 1;
        enbxVar.b |= 2;
    }
}
