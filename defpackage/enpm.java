package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpm {
    public static final /* synthetic */ enpl a(enpk enpkVar) {
        evsn evsnVarBuild = enpkVar.build();
        evsnVarBuild.getClass();
        return (enpl) evsnVarBuild;
    }

    public static final void b(boolean z, enpk enpkVar) {
        enpkVar.copyOnWrite();
        enpl enplVar = (enpl) enpkVar.instance;
        enpl enplVar2 = enpl.a;
        enplVar.b |= 2;
        enplVar.d = z;
    }

    public static final void c(boolean z, enpk enpkVar) {
        enpkVar.copyOnWrite();
        enpl enplVar = (enpl) enpkVar.instance;
        enpl enplVar2 = enpl.a;
        enplVar.b |= 8;
        enplVar.f = z;
    }

    public static final void d(boolean z, enpk enpkVar) {
        enpkVar.copyOnWrite();
        enpl enplVar = (enpl) enpkVar.instance;
        enpl enplVar2 = enpl.a;
        enplVar.b |= 4;
        enplVar.e = z;
    }

    public static final void e(String str, enpk enpkVar) {
        str.getClass();
        enpkVar.copyOnWrite();
        enpl enplVar = (enpl) enpkVar.instance;
        enpl enplVar2 = enpl.a;
        enplVar.b |= 1;
        enplVar.c = str;
    }
}
