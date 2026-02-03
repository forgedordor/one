package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wto extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wtx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wto(fcxy fcxyVar, wtx wtxVar) {
        super(3, fcxyVar);
        this.c = wtxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wto wtoVar = new wto((fcxy) obj3, this.c);
        wtoVar.d = (fdpm) obj;
        wtoVar.b = obj2;
        return wtoVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdpuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            MessageId messageId = (MessageId) this.b;
            if (messageId != null) {
                wtx wtxVar = this.c;
                fdpuVar = new wtv(anov.a(wtxVar.c.i(messageId)), wtxVar);
            } else {
                fdpuVar = new fdpu(null);
            }
            this.a = 1;
            if (fdpy.c(r5, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
