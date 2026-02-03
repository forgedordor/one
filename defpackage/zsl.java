package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsl extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ aaab c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsl(ztv ztvVar, aaab aaabVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = aaabVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.h.i().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ztv ztvVar = this.b;
        aaab aaabVar = this.c;
        ekgb ekgbVar = (ekgb) obj;
        aspz aspzVar = (aspz) ztvVar.D.b();
        ekgbVar.getClass();
        String str = ((aubq) ((ResolvedRecipient) fcva.N(ekgbVar)).g().e().get()).d;
        Object obj2 = ztv.c.get(aaabVar);
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        enfg enfgVar = (enfg) enfq.a.createBuilder();
        enfgVar.copyOnWrite();
        enfq enfqVar = (enfq) enfgVar.instance;
        enfqVar.e = 1;
        enfqVar.b |= 1;
        enfh enfhVar = (enfh) enfk.a.createBuilder();
        enfhVar.copyOnWrite();
        enfk enfkVar = (enfk) enfhVar.instance;
        enfkVar.c = ((enfj) obj2).e;
        enfkVar.b |= 1;
        enfgVar.copyOnWrite();
        enfq enfqVar2 = (enfq) enfgVar.instance;
        enfk enfkVar2 = (enfk) enfhVar.build();
        enfkVar2.getClass();
        enfqVar2.d = enfkVar2;
        enfqVar2.c = 2;
        aspzVar.g((enfq) enfgVar.build(), str);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsl(this.b, this.c, fcxyVar);
    }
}
