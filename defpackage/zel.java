package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zel extends fcyz implements fdat {
    int a;
    final /* synthetic */ zen b;
    final /* synthetic */ MessageId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zel(zen zenVar, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zenVar;
        this.c = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zel) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            if (((Boolean) ((cczi) crtr.V.get()).e()).booleanValue()) {
                ((vjg) this.b.h.b()).c(ajltVar);
            } else {
                ((afzc) this.b.g.b()).h(new agcy(ajltVar));
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zel(this.b, this.c, fcxyVar);
    }
}
