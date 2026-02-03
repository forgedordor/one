package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbuh {
    public static final /* synthetic */ cbug a(cbuf cbufVar) {
        evsn evsnVarBuild = cbufVar.build();
        evsnVarBuild.getClass();
        return (cbug) evsnVarBuild;
    }

    public static final void b(ezol ezolVar, cbuf cbufVar) {
        cbufVar.copyOnWrite();
        cbug cbugVar = (cbug) cbufVar.instance;
        cbug cbugVar2 = cbug.a;
        cbugVar.d = ezolVar;
        cbugVar.b |= 2;
    }

    public static final void c(ccps ccpsVar, cbuf cbufVar) {
        cbufVar.copyOnWrite();
        cbug cbugVar = (cbug) cbufVar.instance;
        cbug cbugVar2 = cbug.a;
        cbugVar.c = ccpsVar;
        cbugVar.b |= 1;
    }
}
