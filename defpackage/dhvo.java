package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvo {
    public static final /* synthetic */ dhvn a(dhvm dhvmVar) {
        evsn evsnVarBuild = dhvmVar.build();
        evsnVarBuild.getClass();
        return (dhvn) evsnVarBuild;
    }

    public static final void b(dhvb dhvbVar, dhvm dhvmVar) {
        dhvmVar.copyOnWrite();
        dhvn dhvnVar = (dhvn) dhvmVar.instance;
        dhvn dhvnVar2 = dhvn.a;
        dhvnVar.d = dhvbVar;
        dhvnVar.b |= 2;
    }

    public static final void c(evrj evrjVar, dhvm dhvmVar) {
        dhvmVar.copyOnWrite();
        dhvn dhvnVar = (dhvn) dhvmVar.instance;
        dhvn dhvnVar2 = dhvn.a;
        dhvnVar.c = evrjVar;
        dhvnVar.b |= 1;
    }
}
