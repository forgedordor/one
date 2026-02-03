package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmj {
    public final cmmg a;

    public cmmj(cmmg cmmgVar) {
        this.a = cmmgVar;
    }

    public final /* synthetic */ cmmh a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (cmmh) evsnVarBuild;
    }

    public final void b(String str) {
        cmmg cmmgVar = this.a;
        cmmgVar.copyOnWrite();
        cmmh cmmhVar = (cmmh) cmmgVar.instance;
        cmmh cmmhVar2 = cmmh.a;
        cmmhVar.b |= 2048;
        cmmhVar.n = str;
    }

    public final void c(String str) {
        str.getClass();
        cmmg cmmgVar = this.a;
        cmmgVar.copyOnWrite();
        cmmh cmmhVar = (cmmh) cmmgVar.instance;
        cmmh cmmhVar2 = cmmh.a;
        cmmhVar.b |= 1;
        cmmhVar.c = str;
    }

    public final void d(int i) {
        cmmg cmmgVar = this.a;
        cmmgVar.copyOnWrite();
        cmmh cmmhVar = (cmmh) cmmgVar.instance;
        cmmh cmmhVar2 = cmmh.a;
        cmmhVar.b |= 2;
        cmmhVar.d = i;
    }
}
