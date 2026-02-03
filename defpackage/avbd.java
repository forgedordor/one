package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avbd extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ Duration c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avbd(fdpl fdplVar, fcxy fcxyVar, Duration duration) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avbd) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.d;
            fdpl fdplVar = this.b;
            avbc avbcVar = new avbc(fdpmVar, this.c);
            this.a = 1;
            if (fdplVar.a(avbcVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avbd avbdVar = new avbd(this.b, fcxyVar, this.c);
        avbdVar.d = obj;
        return avbdVar;
    }
}
