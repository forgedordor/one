package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrk {
    public static final /* synthetic */ ahrj a(ahri ahriVar) {
        evsn evsnVarBuild = ahriVar.build();
        evsnVarBuild.getClass();
        return (ahrj) evsnVarBuild;
    }

    public static final void b(String str, ahri ahriVar) {
        ahriVar.copyOnWrite();
        ahrj ahrjVar = (ahrj) ahriVar.instance;
        ahrj ahrjVar2 = ahrj.a;
        ahrjVar.b = 1;
        ahrjVar.c = str;
    }

    public static final void c(int i, ahri ahriVar) {
        ahriVar.copyOnWrite();
        ahrj ahrjVar = (ahrj) ahriVar.instance;
        ahrj ahrjVar2 = ahrj.a;
        ahrjVar.c = Integer.valueOf(i - 2);
        ahrjVar.b = 2;
    }
}
