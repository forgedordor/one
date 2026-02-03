package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aysk extends fcyz implements fdat {
    int a;
    final /* synthetic */ aysl b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ azva e;
    final /* synthetic */ long f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aysk(aysl ayslVar, UUID uuid, Duration duration, azva azvaVar, long j, int i, int i2, int i3, int i4, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ayslVar;
        this.c = uuid;
        this.d = duration;
        this.e = azvaVar;
        this.f = j;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aysk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objA = obj;
        } else {
            aysl ayslVar = this.b;
            this.a = 1;
            objA = fdin.a(eicg.a(ayslVar.c), new aysj(null), this);
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        int iIntValue = ((Number) objA).intValue();
        aysl ayslVar2 = this.b;
        UUID uuid = this.c;
        Duration duration = this.d;
        azva azvaVar = this.e;
        long j = this.f;
        int i2 = this.g;
        int i3 = this.h;
        int i4 = this.i;
        int i5 = this.j;
        ayss ayssVar = ayslVar2.a;
        auvw.k(ayssVar.b, null, null, new aysp(ayssVar, duration, uuid, iIntValue, j, i2, i3, i4, i5, azvaVar, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aysk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, fcxyVar);
    }
}
