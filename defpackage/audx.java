package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class audx {
    public static final /* synthetic */ audw a(audv audvVar) {
        evsn evsnVarBuild = audvVar.build();
        evsnVarBuild.getClass();
        return (audw) evsnVarBuild;
    }

    public static final void b(String str, audv audvVar) {
        audvVar.copyOnWrite();
        audw audwVar = (audw) audvVar.instance;
        audw audwVar2 = audw.a;
        audwVar.b |= 1;
        audwVar.c = str;
    }
}
