package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpp {
    private final fcsu a;

    public cvpp(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(int i) {
        emqv emqvVar = (emqv) emqw.a.createBuilder();
        emqvVar.copyOnWrite();
        emqw emqwVar = (emqw) emqvVar.instance;
        emqwVar.e = 1;
        emqwVar.b |= 1;
        emqz emqzVar = (emqz) emrb.a.createBuilder();
        emqzVar.copyOnWrite();
        emrb emrbVar = (emrb) emqzVar.instance;
        emrbVar.c = i - 1;
        emrbVar.b |= 1;
        emqvVar.copyOnWrite();
        emqw emqwVar2 = (emqw) emqvVar.instance;
        emrb emrbVar2 = (emrb) emqzVar.build();
        emrbVar2.getClass();
        emqwVar2.d = emrbVar2;
        emqwVar2.c = 2;
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BANNER_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b = 1 | ellhVar.b;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emqw emqwVar3 = (emqw) emqvVar.build();
        emqwVar3.getClass();
        ellhVar2.aY = emqwVar3;
        ellhVar2.e |= 1073741824;
        aillVar.j(ellgVar);
    }
}
