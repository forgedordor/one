package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibr extends fcyz implements fdap {
    int a;
    final /* synthetic */ aice b;
    final /* synthetic */ fcsf c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibr(aice aiceVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = aiceVar;
        this.c = fcsfVar;
        this.d = duration;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aice aiceVar = this.b;
            this.a = 1;
            obj = aiceVar.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aibk aibkVar = (aibk) obj;
        if (!aibkVar.a() && aibkVar.c.b == null) {
            throw new IllegalStateException("Failed handshakeResult without exception set");
        }
        aice aiceVar2 = this.b;
        aice.j(this.c, aibkVar.c);
        aicf aicfVar = (aicf) aiceVar2.f.b();
        Duration duration = this.d;
        duration.getClass();
        aibkVar.getClass();
        if (aibkVar.a()) {
            tcd.e((tcd) aicfVar.a.b(), 3, aicfVar.a(duration), 0, 0, 0, aibkVar.b, null, 92);
        } else {
            tcd tcdVar = (tcd) aicfVar.a.b();
            enoq enoqVar = aibkVar.a;
            enoqVar.getClass();
            tcd.d(tcdVar, 3, enoqVar, aibkVar.b, null, 120);
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aibr(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
