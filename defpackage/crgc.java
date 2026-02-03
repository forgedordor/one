package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crgc extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ crgd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgc(crgd crgdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = crgdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj3 = this.a;
            fctl.b(obj);
            feavVar = obj3;
        } else {
            fctl.b(obj);
            crgd crgdVar = this.d;
            feav feavVar2 = crgdVar.s;
            this.a = feavVar2;
            this.b = crgdVar;
            this.c = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj2 = crgdVar;
            feavVar = feavVar2;
        }
        try {
            if (((crgd) obj2).p != null) {
                cogw cogwVar = ((crgd) obj2).h;
                long epochMilli = cogwVar.f().toEpochMilli() - ((crgd) obj2).q;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Object objE = crfg.c.e();
                objE.getClass();
                if (epochMilli > timeUnit.toMillis(((Number) objE).longValue())) {
                    ((crgd) obj2).q = cogwVar.f().toEpochMilli();
                    ejkp ejkpVar = ((crgd) obj2).p;
                    if (ejkpVar != null) {
                        ekgb ekgbVar = ejkpVar.g;
                        int i = ((ekoe) ekgbVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            ((ejop) ekgbVar.get(i2)).b();
                        }
                    }
                }
            }
            feavVar.d();
            return fctx.a;
        } catch (Throwable th) {
            feavVar.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crgc(this.d, fcxyVar);
    }
}
