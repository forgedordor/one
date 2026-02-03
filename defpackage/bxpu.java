package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxpu extends fcyz implements fdat {
    int a;
    final /* synthetic */ feav b;
    final /* synthetic */ bxqa c;
    final /* synthetic */ MessageId d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxpu(fcxy fcxyVar, feav feavVar, bxqa bxqaVar, MessageId messageId) {
        super(2, fcxyVar);
        this.b = feavVar;
        this.c = bxqaVar;
        this.d = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxpu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            feavVar = (feav) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            feav feavVar2 = this.b;
            feavVar2.getClass();
            this.e = feavVar2;
            this.a = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            feavVar = feavVar2;
        }
        try {
            return (coik) this.c.c.get(this.d);
        } finally {
            feavVar.d();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxpu bxpuVar = new bxpu(fcxyVar, this.b, this.c, this.d);
        bxpuVar.e = obj;
        return bxpuVar;
    }
}
