package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiby extends fcyz implements fdap {
    int a;
    final /* synthetic */ aice b;
    final /* synthetic */ dbxr c;
    final /* synthetic */ fbog d;
    final /* synthetic */ fcsf e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiby(aice aiceVar, dbxr dbxrVar, fbog fbogVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = aiceVar;
        this.c = dbxrVar;
        this.d = fbogVar;
        this.e = fcsfVar;
        this.f = duration;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aice aiceVar = this.b;
            dbxr dbxrVar = this.c;
            fbog fbogVar = this.d;
            fbogVar.getClass();
            this.a = 1;
            obj = aiceVar.f(dbxrVar, fbogVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aice aiceVar2 = this.b;
        aibm aibmVar = (aibm) obj;
        aice.j(this.e, aibmVar.e);
        aicf aicfVar = (aicf) aiceVar2.f.b();
        Duration duration = this.f;
        duration.getClass();
        aibmVar.getClass();
        if (!aibmVar.a) {
            tcd tcdVar = (tcd) aicfVar.a.b();
            enoq enoqVar = aibmVar.c;
            if (enoqVar == null) {
                enoqVar = enoq.UNKNOWN;
            }
            tcd.d(tcdVar, 10, enoqVar, aibmVar.d, aibmVar.f, 184);
        } else if (aibmVar.b) {
            tcd.e((tcd) aicfVar.a.b(), 10, aicfVar.a(duration), 0, 0, 0, aibmVar.d, aibmVar.f, 156);
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aiby(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
