package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnzc {
    public final cnyj a;

    public cnzc(cnyj cnyjVar) {
        this.a = cnyjVar;
    }

    public final /* synthetic */ cnyk a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (cnyk) evsnVarBuild;
    }

    public final cnyz b() {
        cnyz cnyzVar = ((cnyk) this.a.instance).c;
        if (cnyzVar == null) {
            cnyzVar = cnyz.a;
        }
        cnyzVar.getClass();
        return cnyzVar;
    }

    public final void c(evvp evvpVar) {
        cnyj cnyjVar = this.a;
        cnyjVar.copyOnWrite();
        cnyk cnykVar = (cnyk) cnyjVar.instance;
        cnyk cnykVar2 = cnyk.a;
        cnykVar.i = evvpVar;
        cnykVar.b |= 16;
    }

    public final void d(int i) {
        cnyj cnyjVar = this.a;
        cnyjVar.copyOnWrite();
        cnyk cnykVar = (cnyk) cnyjVar.instance;
        cnyk cnykVar2 = cnyk.a;
        cnykVar.g = i;
    }

    public final void e(evvp evvpVar) {
        cnyj cnyjVar = this.a;
        cnyjVar.copyOnWrite();
        cnyk cnykVar = (cnyk) cnyjVar.instance;
        cnyk cnykVar2 = cnyk.a;
        cnykVar.d = evvpVar;
        cnykVar.b |= 2;
    }

    public final void f(cnyz cnyzVar) {
        cnyj cnyjVar = this.a;
        cnyjVar.copyOnWrite();
        cnyk cnykVar = (cnyk) cnyjVar.instance;
        cnyk cnykVar2 = cnyk.a;
        cnykVar.c = cnyzVar;
        cnykVar.b |= 1;
    }
}
