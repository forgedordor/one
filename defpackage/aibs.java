package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibs extends fcyz implements fdat {
    int a;
    final /* synthetic */ aice b;
    final /* synthetic */ fcsf c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibs(aice aiceVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiceVar;
        this.c = fcsfVar;
        this.d = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aice aiceVar = this.b;
            fcsf fcsfVar = this.c;
            Duration duration = this.d;
            ayrq ayrqVar = ayrq.a;
            aibr aibrVar = new aibr(aiceVar, fcsfVar, duration, null);
            this.a = 1;
            obj = ayrqVar.a("CustomD2DTargetServiceImpl#handshake", aibrVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aice aiceVar2 = this.b;
        aiceVar2.j.h("CustomD2DTargetServiceImpl#handshake time: [%s]ms", new Long(fdhi.g(((fdhi) obj).c)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aibs(this.b, this.c, this.d, fcxyVar);
    }
}
