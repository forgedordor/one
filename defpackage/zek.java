package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zek extends fcyz implements fdat {
    int a;
    final /* synthetic */ zen b;
    final /* synthetic */ MessageId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zek(zen zenVar, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zenVar;
        this.c = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zek) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarV = ((ajmh) this.b.c.b()).v(this.c);
            eijuVarV.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarV, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ajlt ajltVar = (ajlt) obj;
        if (ajltVar != null) {
            zen zenVar = this.b;
            if (zenVar.k.a()) {
                ((vhr) zenVar.i.b()).f(fcva.b(ajltVar), new fdae() { // from class: zei
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                });
            } else {
                ((vhr) zenVar.i.b()).e(fcva.b(ajltVar), false, new fdae() { // from class: zej
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                });
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zek(this.b, this.c, fcxyVar);
    }
}
