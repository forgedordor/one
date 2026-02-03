package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnd {
    public static final dxww a(dxvi dxviVar) {
        dxviVar.getClass();
        dxwl dxwlVar = (dxwl) dxww.a.createBuilder();
        dxwlVar.getClass();
        if (dxviVar instanceof dxvp) {
            dxwq dxwqVar = (dxwq) dxwr.a.createBuilder();
            dxwqVar.getClass();
            String str = ((dxvp) dxviVar).a;
            dxwqVar.copyOnWrite();
            ((dxwr) dxwqVar.instance).b = str;
            evsn evsnVarBuild = dxwqVar.build();
            evsnVarBuild.getClass();
            dxwlVar.copyOnWrite();
            dxww dxwwVar = (dxww) dxwlVar.instance;
            dxwwVar.c = (dxwr) evsnVarBuild;
            dxwwVar.b = 1;
        } else if (dxviVar instanceof dxvl) {
            dxwm dxwmVar = (dxwm) dxwn.a.createBuilder();
            dxwmVar.getClass();
            String str2 = ((dxvl) dxviVar).a;
            dxwmVar.copyOnWrite();
            ((dxwn) dxwmVar.instance).b = str2;
            evsn evsnVarBuild2 = dxwmVar.build();
            evsnVarBuild2.getClass();
            dxwlVar.copyOnWrite();
            dxww dxwwVar2 = (dxww) dxwlVar.instance;
            dxwwVar2.c = (dxwn) evsnVarBuild2;
            dxwwVar2.b = 4;
        } else if (dxviVar instanceof dxvn) {
            dxwo dxwoVar = (dxwo) dxwp.a.createBuilder();
            dxwoVar.getClass();
            dxvn dxvnVar = (dxvn) dxviVar;
            String str3 = dxvnVar.a;
            dxwoVar.copyOnWrite();
            ((dxwp) dxwoVar.instance).b = str3;
            long j = dxvnVar.b;
            dxwoVar.copyOnWrite();
            ((dxwp) dxwoVar.instance).c = j;
            evsn evsnVarBuild3 = dxwoVar.build();
            evsnVarBuild3.getClass();
            dxwlVar.copyOnWrite();
            dxww dxwwVar3 = (dxww) dxwlVar.instance;
            dxwwVar3.c = (dxwp) evsnVarBuild3;
            dxwwVar3.b = 5;
        } else if (dxviVar instanceof dxwh) {
            dxwu dxwuVar = (dxwu) dxwv.a.createBuilder();
            dxwuVar.getClass();
            evsn evsnVarBuild4 = dxwuVar.build();
            evsnVarBuild4.getClass();
            dxwlVar.copyOnWrite();
            dxww dxwwVar4 = (dxww) dxwlVar.instance;
            dxwwVar4.c = (dxwv) evsnVarBuild4;
            dxwwVar4.b = 2;
        } else {
            if (!(dxviVar instanceof dxwf)) {
                throw new fctg();
            }
            dxws dxwsVar = (dxws) dxwt.a.createBuilder();
            dxwsVar.getClass();
            evsn evsnVarBuild5 = dxwsVar.build();
            evsnVarBuild5.getClass();
            dxwlVar.copyOnWrite();
            dxww dxwwVar5 = (dxww) dxwlVar.instance;
            dxwwVar5.c = (dxwt) evsnVarBuild5;
            dxwwVar5.b = 3;
        }
        evsn evsnVarBuild6 = dxwlVar.build();
        evsnVarBuild6.getClass();
        return (dxww) evsnVarBuild6;
    }
}
