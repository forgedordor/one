package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzf extends fcyz implements fdat {
    final /* synthetic */ ahzi a;
    final /* synthetic */ UUID b;
    final /* synthetic */ File c;
    final /* synthetic */ szu d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzf(fcxy fcxyVar, ahzi ahziVar, UUID uuid, File file, szu szuVar) {
        super(2, fcxyVar);
        this.a = ahziVar;
        this.b = uuid;
        this.c = file;
        this.d = szuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahzf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Integer num = new Integer(5);
        ahzi ahziVar = this.a;
        ahzu ahzuVar = ahziVar.o;
        UUID uuid = this.b;
        ahzuVar.i("Requested DB restore: workflowVersion: [%s] sessionId: [%s]", num, uuid);
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
        ((byeq) ahziVar.f.b()).b("requestBugleDbRestore", new ahze(ahziVar, uuid, aiae.a(aiacVar), szuVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahzf ahzfVar = new ahzf(fcxyVar, this.a, this.b, this.c, this.d);
        ahzfVar.e = obj;
        return ahzfVar;
    }
}
