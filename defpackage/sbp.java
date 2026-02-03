package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbp {
    private final sbm a;

    public sbp(sbm sbmVar) {
        this.a = sbmVar;
    }

    public final /* synthetic */ sbn a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (sbn) evsnVarBuild;
    }

    public final void b(sdf sdfVar) {
        sbm sbmVar = this.a;
        sbmVar.copyOnWrite();
        sbn sbnVar = (sbn) sbmVar.instance;
        sbn sbnVar2 = sbn.a;
        sbnVar.f = sdfVar;
        sbnVar.b |= 8;
    }

    public final void c(sdi sdiVar) {
        sbm sbmVar = this.a;
        sbmVar.copyOnWrite();
        sbn sbnVar = (sbn) sbmVar.instance;
        sbn sbnVar2 = sbn.a;
        sbnVar.c = sdiVar;
        sbnVar.b |= 1;
    }

    public final void d(sdl sdlVar) {
        sbm sbmVar = this.a;
        sbmVar.copyOnWrite();
        sbn sbnVar = (sbn) sbmVar.instance;
        sbn sbnVar2 = sbn.a;
        sbnVar.d = sdlVar;
        sbnVar.b |= 2;
    }

    public final void e(sdo sdoVar) {
        sbm sbmVar = this.a;
        sbmVar.copyOnWrite();
        sbn sbnVar = (sbn) sbmVar.instance;
        sbn sbnVar2 = sbn.a;
        sbnVar.e = sdoVar;
        sbnVar.b |= 4;
    }
}
