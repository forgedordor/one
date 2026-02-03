package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwf {
    public static final /* synthetic */ cbwd a(cbwc cbwcVar) {
        evsn evsnVarBuild = cbwcVar.build();
        evsnVarBuild.getClass();
        return (cbwd) evsnVarBuild;
    }

    public static final void b(enao enaoVar, cbwc cbwcVar) {
        cbwcVar.copyOnWrite();
        cbwd cbwdVar = (cbwd) cbwcVar.instance;
        cbwd cbwdVar2 = cbwd.a;
        cbwdVar.f = enaoVar;
        cbwdVar.b |= 2;
    }

    public static final void c(aufh aufhVar, cbwc cbwcVar) {
        cbwcVar.copyOnWrite();
        cbwd cbwdVar = (cbwd) cbwcVar.instance;
        cbwd cbwdVar2 = cbwd.a;
        cbwdVar.d = aufhVar;
        cbwdVar.c = 2;
    }

    public static final void d(cbug cbugVar, cbwc cbwcVar) {
        cbwcVar.copyOnWrite();
        cbwd cbwdVar = (cbwd) cbwcVar.instance;
        cbwd cbwdVar2 = cbwd.a;
        cbwdVar.d = cbugVar;
        cbwdVar.c = 6;
    }

    public static final void e(String str, cbwc cbwcVar) {
        str.getClass();
        cbwcVar.copyOnWrite();
        cbwd cbwdVar = (cbwd) cbwcVar.instance;
        cbwd cbwdVar2 = cbwd.a;
        cbwdVar.b |= 1;
        cbwdVar.e = str;
    }

    public static final void f(enba enbaVar, cbwc cbwcVar) {
        enbaVar.getClass();
        cbwcVar.copyOnWrite();
        cbwd cbwdVar = (cbwd) cbwcVar.instance;
        cbwd cbwdVar2 = cbwd.a;
        cbwdVar.g = enbaVar.p;
        cbwdVar.b |= 4;
    }
}
