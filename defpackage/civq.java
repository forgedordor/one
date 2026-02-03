package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class civq extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ civx c;
    final /* synthetic */ chxo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civq(civx civxVar, chxo chxoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = civxVar;
        this.d = chxoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((civq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                fctl.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r0, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            civx civxVar = this.c;
            chxo chxoVar = this.d;
            if (!eicg.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            eieu eieuVarH = eiiy.h("IncomingRcsMessageProcessor.process");
            try {
                this.a = eieuVarH;
                this.b = 1;
                obj = civxVar.e(chxoVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                r0 = eieuVarH;
            } catch (Throwable th3) {
                th = th3;
                r0 = eieuVarH;
                throw th;
            }
        }
        MessageCoreData messageCoreData = (MessageCoreData) obj;
        fczl.a(r0, null);
        return messageCoreData;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new civq(this.c, this.d, fcxyVar);
    }
}
