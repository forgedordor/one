package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpvu {
    private final fcsu a;

    public cpvu(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    private final void c(elir elirVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CMS_DATA_PROVIDER_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elim elimVar = (elim) elin.a.createBuilder();
        elvg elvgVar = cqbe.a;
        elimVar.copyOnWrite();
        elin elinVar = (elin) elimVar.instance;
        elinVar.d = elvgVar.x;
        elinVar.b |= 64;
        elin elinVar2 = (elin) elimVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elinVar2.getClass();
        ellhVar2.k = elinVar2;
        ellhVar2.b |= 2;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        ellhVar3.bN = elirVar;
        ellhVar3.g |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ((aill) this.a.b()).q(ellgVar, 1.0d);
    }

    public final void a(int i, epjl epjlVar) {
        epjlVar.getClass();
        eliq eliqVar = (eliq) elir.a.createBuilder();
        eliqVar.getClass();
        enmt enmtVar = (enmt) enmu.a.createBuilder();
        enmtVar.getClass();
        enmtVar.copyOnWrite();
        ((enmu) enmtVar.instance).b = i - 2;
        enmtVar.copyOnWrite();
        ((enmu) enmtVar.instance).c = epjlVar.a();
        evsn evsnVarBuild = enmtVar.build();
        evsnVarBuild.getClass();
        eliqVar.copyOnWrite();
        elir elirVar = (elir) eliqVar.instance;
        elirVar.c = (enmu) evsnVarBuild;
        elirVar.b = 1;
        c(elgo.a(eliqVar));
    }

    public final void b(int i, epjl epjlVar) {
        epjlVar.getClass();
        eliq eliqVar = (eliq) elir.a.createBuilder();
        eliqVar.getClass();
        enmv enmvVar = (enmv) enmw.a.createBuilder();
        enmvVar.getClass();
        enmvVar.copyOnWrite();
        ((enmw) enmvVar.instance).b = i - 2;
        enmvVar.copyOnWrite();
        ((enmw) enmvVar.instance).c = epjlVar.a();
        evsn evsnVarBuild = enmvVar.build();
        evsnVarBuild.getClass();
        eliqVar.copyOnWrite();
        elir elirVar = (elir) eliqVar.instance;
        elirVar.c = (enmw) evsnVarBuild;
        elirVar.b = 2;
        c(elgo.a(eliqVar));
    }
}
