package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaas {
    public static final /* synthetic */ aaar a(aaap aaapVar) {
        evsn evsnVarBuild = aaapVar.build();
        evsnVarBuild.getClass();
        return (aaar) evsnVarBuild;
    }

    public static final void b(String str, aaap aaapVar) {
        aaapVar.copyOnWrite();
        aaar aaarVar = (aaar) aaapVar.instance;
        aaar aaarVar2 = aaar.a;
        aaarVar.b |= 4;
        aaarVar.e = str;
    }

    public static final void c(String str, aaap aaapVar) {
        aaapVar.copyOnWrite();
        aaar aaarVar = (aaar) aaapVar.instance;
        aaar aaarVar2 = aaar.a;
        aaarVar.b |= 2;
        aaarVar.d = str;
    }

    public static final void d(int i, aaap aaapVar) {
        aaapVar.copyOnWrite();
        aaar aaarVar = (aaar) aaapVar.instance;
        aaar aaarVar2 = aaar.a;
        aaarVar.c = i - 2;
        aaarVar.b |= 1;
    }
}
