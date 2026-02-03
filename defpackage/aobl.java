package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobl extends fcyz implements fdat {
    int a;
    final /* synthetic */ aobn b;
    final /* synthetic */ anty c;
    final /* synthetic */ efwo d;
    final /* synthetic */ ekgb e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aobl(fcxy fcxyVar, aobn aobnVar, anty antyVar, efwo efwoVar, ekgb ekgbVar, boolean z) {
        super(2, fcxyVar);
        this.b = aobnVar;
        this.c = antyVar;
        this.d = efwoVar;
        this.e = ekgbVar;
        this.f = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aobl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [fcsu, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aobn aobnVar = this.b;
            anty antyVar = this.c;
            efwo efwoVar = this.d;
            ekgb ekgbVar = this.e;
            boolean z = this.f;
            this.a = 1;
            Optional optionalGr = ((anzu) ehlh.a(aobnVar.b, anzu.class, efwoVar)).gr();
            if (optionalGr.isEmpty()) {
                obj = ekoj.a;
            } else {
                Object objB = optionalGr.get().b();
                objB.getClass();
                obj = aobnVar.d(antyVar, (ajmu) objB, ekgbVar, z, this);
            }
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ekfv.e((Map) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aobl aoblVar = new aobl(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        aoblVar.g = obj;
        return aoblVar;
    }
}
