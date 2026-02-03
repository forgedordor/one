package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyke {
    public static final /* synthetic */ eznv a(eznt ezntVar) {
        evsn evsnVarBuild = ezntVar.build();
        evsnVarBuild.getClass();
        return (eznv) evsnVarBuild;
    }

    public static final void b(eznx eznxVar, eznt ezntVar) {
        ezntVar.copyOnWrite();
        eznv eznvVar = (eznv) ezntVar.instance;
        eznv eznvVar2 = eznv.a;
        eznvVar.c = eznxVar;
        eznvVar.b |= 1;
    }

    public static final void c(eznx eznxVar, eznt ezntVar) {
        ezntVar.copyOnWrite();
        eznv eznvVar = (eznv) ezntVar.instance;
        eznv eznvVar2 = eznv.a;
        eznvVar.d = eznxVar;
        eznvVar.b |= 2;
    }

    public static final void d(int i, eznt ezntVar) {
        ezntVar.copyOnWrite();
        eznv eznvVar = (eznv) ezntVar.instance;
        eznv eznvVar2 = eznv.a;
        eznvVar.e = eznu.a(i);
    }
}
