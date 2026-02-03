package defpackage;

import android.location.Location;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cguj extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ Location b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cguj(Location location, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = location;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cguj) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        cgsw cgswVar = (cgsw) cgsx.a.createBuilder();
        cgswVar.getClass();
        Location location = this.b;
        double latitude = location.getLatitude();
        cgswVar.copyOnWrite();
        cgsx cgsxVar = (cgsx) cgswVar.instance;
        cgsxVar.b |= 1;
        cgsxVar.c = latitude;
        double longitude = location.getLongitude();
        cgswVar.copyOnWrite();
        cgsx cgsxVar2 = (cgsx) cgswVar.instance;
        cgsxVar2.b |= 2;
        cgsxVar2.d = longitude;
        float accuracy = location.getAccuracy();
        cgswVar.copyOnWrite();
        cgsx cgsxVar3 = (cgsx) cgswVar.instance;
        cgsxVar3.b |= 4;
        cgsxVar3.e = accuracy;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(location.getTime());
        instantOfEpochMilli.getClass();
        evvp evvpVarB = evxd.b(instantOfEpochMilli);
        cgswVar.copyOnWrite();
        cgsx cgsxVar4 = (cgsx) cgswVar.instance;
        cgsxVar4.f = evvpVarB;
        cgsxVar4.b |= 8;
        evsn evsnVarBuild = cgswVar.build();
        evsnVarBuild.getClass();
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtdVar.f = (cgsx) evsnVarBuild;
        cgtdVar.b |= 4;
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cguj cgujVar = new cguj(this.b, fcxyVar);
        cgujVar.a = obj;
        return cgujVar;
    }
}
