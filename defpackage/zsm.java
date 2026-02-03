package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsm extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ztv c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsm(ztv ztvVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ztvVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ztv ztvVar = this.c;
            aspz aspzVar = (aspz) ztvVar.D.b();
            this.a = aspzVar;
            this.b = 1;
            obj = fdtc.a(ztvVar.k, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = aspzVar;
        }
        String str = ((aubq) ((ResolvedRecipient) fcva.N((List) obj)).g().e().get()).d;
        Object obj3 = ztv.d.get(new Integer(this.d));
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        enfg enfgVar = (enfg) enfq.a.createBuilder();
        enfgVar.copyOnWrite();
        enfq enfqVar = (enfq) enfgVar.instance;
        enfqVar.e = 1;
        enfqVar.b |= 1;
        enfm enfmVar = (enfm) enfp.a.createBuilder();
        enfmVar.copyOnWrite();
        enfp enfpVar = (enfp) enfmVar.instance;
        enfpVar.c = ((enfo) obj3).d;
        enfpVar.b |= 1;
        enfgVar.copyOnWrite();
        enfq enfqVar2 = (enfq) enfgVar.instance;
        enfp enfpVar2 = (enfp) enfmVar.build();
        enfpVar2.getClass();
        enfqVar2.d = enfpVar2;
        enfqVar2.c = 3;
        ((aspz) obj2).g((enfq) enfgVar.build(), str);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsm(this.c, this.d, fcxyVar);
    }
}
