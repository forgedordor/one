package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhc implements dzgw {
    final /* synthetic */ dzhd a;

    public dzhc(dzhd dzhdVar) {
        this.a = dzhdVar;
    }

    @Override // defpackage.dzgw
    public final boolean a(dzgh dzghVar) {
        dzgi dzgiVar = (dzgi) dzgj.a.createBuilder();
        dzgk dzgkVar = (dzgk) dzgl.a.createBuilder();
        dzhd dzhdVar = this.a;
        diep diepVar = dzhdVar.a;
        evvp evvpVarC = evxc.c(diepVar.f().toEpochMilli() - (diepVar.a() - Process.getStartElapsedRealtime()));
        dzgkVar.copyOnWrite();
        dzgl dzglVar = (dzgl) dzgkVar.instance;
        evvpVarC.getClass();
        dzglVar.c = evvpVarC;
        dzglVar.b |= 1;
        dzgiVar.copyOnWrite();
        dzgj dzgjVar = (dzgj) dzgiVar.instance;
        dzgl dzglVar2 = (dzgl) dzgkVar.build();
        dzglVar2.getClass();
        dzgjVar.c = dzglVar2;
        dzgjVar.b = 2;
        dzghVar.a(dzgiVar);
        if (!((Boolean) dzhdVar.b.b()).booleanValue()) {
            long jMyPid = Process.myPid();
            dzghVar.copyOnWrite();
            dzgs dzgsVar = (dzgs) dzghVar.instance;
            dzgs dzgsVar2 = dzgs.a;
            dzgsVar.b |= 1;
            dzgsVar.c = jMyPid;
            evvp evvpVarC2 = evxc.c(diepVar.f().toEpochMilli());
            dzghVar.copyOnWrite();
            dzgs dzgsVar3 = (dzgs) dzghVar.instance;
            evvpVarC2.getClass();
            dzgsVar3.d = evvpVarC2;
            dzgsVar3.b |= 2;
        }
        return true;
    }
}
