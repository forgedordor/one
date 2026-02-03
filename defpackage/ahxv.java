package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxv extends fcyz implements fdat {
    final /* synthetic */ UUID a;
    final /* synthetic */ ahxy b;
    final /* synthetic */ File c;
    final /* synthetic */ szu d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxv(fcxy fcxyVar, UUID uuid, ahxy ahxyVar, File file, szu szuVar) {
        super(2, fcxyVar);
        this.a = uuid;
        this.b = ahxyVar;
        this.c = file;
        this.d = szuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = ahxy.a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$requestBugleDbRestore$lambda$3$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 118, "BasicRestoreWorkflowSteps.kt");
        UUID uuid = this.a;
        ekrdVar.t("Requested DB restore [%s]", uuid);
        aiac aiacVar = (aiac) aiad.a.createBuilder();
        aiacVar.getClass();
        String absolutePath = this.c.getAbsolutePath();
        absolutePath.getClass();
        aiae.d(absolutePath, aiacVar);
        ahzz ahzzVar = (ahzz) aiaa.a.createBuilder();
        ahzzVar.getClass();
        szu szuVar = this.d;
        aiab.b(szuVar.b, ahzzVar);
        aiab.f(szuVar.a, ahzzVar);
        aiab.c(evxd.b(szuVar.c), ahzzVar);
        aiab.d(szuVar.d, ahzzVar);
        aiab.e(szuVar.e, ahzzVar);
        aiae.c(aiab.a(ahzzVar), aiacVar);
        aiad aiadVarA = aiae.a(aiacVar);
        ahxy ahxyVar = this.b;
        ((byeq) ahxyVar.f.b()).b("requestBugleDbRestore", new ahxu(ahxyVar, uuid, aiadVarA, szuVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxv ahxvVar = new ahxv(fcxyVar, this.a, this.b, this.c, this.d);
        ahxvVar.e = obj;
        return ahxvVar;
    }
}
