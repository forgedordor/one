package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caiz {
    public static final /* synthetic */ cand a(camy camyVar) {
        evsn evsnVarBuild = camyVar.build();
        evsnVarBuild.getClass();
        return (cand) evsnVarBuild;
    }

    public static final void b(int i, camy camyVar) {
        camyVar.copyOnWrite();
        cand candVar = (cand) camyVar.instance;
        cand candVar2 = cand.a;
        candVar.b |= 1;
        candVar.c = i;
    }

    public static final void c(String str, camy camyVar) {
        str.getClass();
        camyVar.copyOnWrite();
        cand candVar = (cand) camyVar.instance;
        cand candVar2 = cand.a;
        candVar.b |= 2;
        candVar.d = str;
    }
}
