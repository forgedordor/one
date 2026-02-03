package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhd {
    public static final /* synthetic */ ejhc a(ejhb ejhbVar) {
        evsn evsnVarBuild = ejhbVar.build();
        evsnVarBuild.getClass();
        return (ejhc) evsnVarBuild;
    }

    public static final void b(String str, ejhb ejhbVar) {
        ejhbVar.copyOnWrite();
        ejhc ejhcVar = (ejhc) ejhbVar.instance;
        ejhc ejhcVar2 = ejhc.a;
        ejhcVar.b |= 2;
        ejhcVar.d = str;
    }

    public static final void c(String str, ejhb ejhbVar) {
        str.getClass();
        ejhbVar.copyOnWrite();
        ejhc ejhcVar = (ejhc) ejhbVar.instance;
        ejhc ejhcVar2 = ejhc.a;
        ejhcVar.b |= 1;
        ejhcVar.c = str;
    }
}
