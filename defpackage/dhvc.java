package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvc {
    public static final /* synthetic */ dhvb a(dhva dhvaVar) {
        evsn evsnVarBuild = dhvaVar.build();
        evsnVarBuild.getClass();
        return (dhvb) evsnVarBuild;
    }

    public static final void b(boolean z, dhva dhvaVar) {
        dhvaVar.copyOnWrite();
        dhvb dhvbVar = (dhvb) dhvaVar.instance;
        dhvb dhvbVar2 = dhvb.a;
        dhvbVar.b |= 2;
        dhvbVar.d = z;
    }

    public static final void c(dhva dhvaVar) {
        dhvaVar.copyOnWrite();
        dhvb dhvbVar = (dhvb) dhvaVar.instance;
        dhvb dhvbVar2 = dhvb.a;
        dhvbVar.b |= 4;
        dhvbVar.e = false;
    }

    public static final void d(int i, dhva dhvaVar) {
        dhvaVar.copyOnWrite();
        dhvb dhvbVar = (dhvb) dhvaVar.instance;
        dhvb dhvbVar2 = dhvb.a;
        dhvbVar.c = i - 1;
        dhvbVar.b |= 1;
    }
}
