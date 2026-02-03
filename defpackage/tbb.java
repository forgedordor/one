package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tbb extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ dbww c;
    final /* synthetic */ UUID d;
    final /* synthetic */ fcsf e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbb(tbe tbeVar, dbww dbwwVar, UUID uuid, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tbeVar;
        this.c = dbwwVar;
        this.d = uuid;
        this.e = fcsfVar;
        this.f = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            tbe tbeVar = this.b;
            dbww dbwwVar = this.c;
            UUID uuid = this.d;
            fcsf fcsfVar = this.e;
            Duration duration = this.f;
            ayrq ayrqVar = ayrq.a;
            tba tbaVar = new tba(tbeVar, dbwwVar, uuid, fcsfVar, duration, null);
            this.a = 1;
            obj = ayrqVar.a("CustomD2DSourceServiceImpl#handshake", tbaVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        tbe tbeVar2 = this.b;
        tbeVar2.l.h("CustomD2DSourceServiceImpl#handshake time: [%s]ms", new Long(fdhi.g(((fdhi) obj).c)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tbb(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
