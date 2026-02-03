package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqdc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqdh b;
    final /* synthetic */ Duration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqdc(dqdh dqdhVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqdhVar;
        this.c = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqdc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Duration duration;
        dmaw dmawVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        do {
            dqdh dqdhVar = this.b;
            if (!dqdhVar.f()) {
                return fctx.a;
            }
            dqcw dqcwVar = dqdhVar.a;
            dlzk dlzkVar = dqdhVar.b;
            int i2 = 0;
            if (dlzkVar != null && (dmawVar = dlzkVar.g) != null) {
                int i3 = dmawVar.h;
                dmawVar.h = 0;
                i2 = i3;
            }
            dqcwVar.a.h(new dqcd(dqcc.a(i2)));
            duration = this.c;
            this.a = 1;
        } while (eooa.a(duration, this) != fcylVar);
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqdc(this.b, this.c, fcxyVar);
    }
}
