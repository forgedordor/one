package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgs extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdgt b;
    final /* synthetic */ eiju c;
    final /* synthetic */ fdae d;
    final /* synthetic */ Duration e;
    final /* synthetic */ Throwable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdgs(cdgt cdgtVar, eiju eijuVar, fdae fdaeVar, Duration duration, Throwable th, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdgtVar;
        this.c = eijuVar;
        this.d = fdaeVar;
        this.e = duration;
        this.f = th;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdgs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdgt cdgtVar = this.b;
            eiju eijuVar = this.c;
            fdae fdaeVar = this.d;
            Duration duration = this.e;
            Throwable th = this.f;
            this.a = 1;
            if (cdgtVar.a(eijuVar, fdaeVar, duration, th, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdgs(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
