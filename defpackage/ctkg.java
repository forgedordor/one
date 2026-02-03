package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctkg extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ ctku b;
    final /* synthetic */ Map c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cudx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkg(ctku ctkuVar, cudx cudxVar, Map map, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctkuVar;
        this.e = cudxVar;
        this.c = map;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkg) c((ctnv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ctnv ctnvVar = (ctnv) this.a;
        final ctku ctkuVar = this.b;
        final boolean z = this.d;
        final Map map = this.c;
        return ctkuVar.a.a(ctnvVar, this.e, new fdap() { // from class: ctjy
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ajpk ajpkVar = (ajpk) obj2;
                ajpkVar.getClass();
                if (!ctkuVar.i.a() || !z) {
                    return false;
                }
                ctmo ctmoVar = (ctmo) map.get(ajpkVar.a);
                int i = ctmoVar != null ? ctmoVar.a : 0;
                if (i == 0) {
                    return null;
                }
                int i2 = i - 1;
                if (i2 != 1) {
                    return i2 != 2 ? null : false;
                }
                return true;
            }
        });
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctkg ctkgVar = new ctkg(this.b, this.e, this.c, this.d, fcxyVar);
        ctkgVar.a = obj;
        return ctkgVar;
    }
}
