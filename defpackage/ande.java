package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ande extends fcyz implements fdat {
    int a;
    final /* synthetic */ andf b;
    final /* synthetic */ MessageId c;
    long d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ande(fcxy fcxyVar, andf andfVar, MessageId messageId) {
        super(2, fcxyVar);
        this.b = andfVar;
        this.c = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ande) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long j;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            j = this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            andf andfVar = this.b;
            MessageId messageId = this.c;
            long jA = andfVar.e.a();
            eiju eijuVarH = andfVar.b.h(messageId);
            eijuVarH.getClass();
            this.d = jA;
            this.a = 1;
            obj = fdxs.c(eijuVarH, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            j = jA;
        }
        obj.getClass();
        return new aneb((ajly) obj, j);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ande andeVar = new ande(fcxyVar, this.b, this.c);
        andeVar.e = obj;
        return andeVar;
    }
}
