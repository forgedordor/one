package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpp implements atsk {
    private final cogw a;

    public atpp(cogw cogwVar) {
        this.a = cogwVar;
    }

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        auex auexVar = (auex) auey.a.createBuilder();
        String str = ((audk) obj).d;
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        str.getClass();
        aueyVar.b |= 1;
        aueyVar.c = str;
        audy audyVar = (audy) audz.a.createBuilder();
        evvp evvpVarC = evxc.c(this.a.f().toEpochMilli());
        audyVar.copyOnWrite();
        audz audzVar = (audz) audyVar.instance;
        evvpVarC.getClass();
        audzVar.c = evvpVarC;
        audzVar.b |= 1;
        auexVar.copyOnWrite();
        auey aueyVar2 = (auey) auexVar.instance;
        audz audzVar2 = (audz) audyVar.build();
        audzVar2.getClass();
        aueyVar2.k = audzVar2;
        aueyVar2.b |= 256;
        return (auey) auexVar.build();
    }
}
