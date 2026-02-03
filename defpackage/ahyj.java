package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyj(ahzi ahziVar, UUID uuid, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
        this.d = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahzi ahziVar = this.b;
            UUID uuid = this.c;
            long j = this.d;
            this.a = 1;
            if (ahziVar.n(ahziVar, uuid, j, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahyj(this.b, this.c, this.d, fcxyVar);
    }
}
