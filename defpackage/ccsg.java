package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccsg extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ccsi c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ asrg e;
    final /* synthetic */ Optional f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccsg(ccsi ccsiVar, MessageCoreData messageCoreData, asrg asrgVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccsiVar;
        this.d = messageCoreData;
        this.e = asrgVar;
        this.f = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccsg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            ccsi ccsiVar = this.c;
            MessageCoreData messageCoreData = this.d;
            asrg asrgVar = this.e;
            Optional optional = this.f;
            if (!eicg.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            eieu eieuVarH = eiiy.h("MlsRcsFileSender#sendChatMessage");
            try {
                aucl auclVar = (aucl) optional.get();
                this.a = eieuVarH;
                this.b = 1;
                obj = ccsiVar.b(messageCoreData, asrgVar, auclVar, this);
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
        chvf chvfVar = (chvf) obj;
        fczl.a(r0, null);
        return chvfVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccsg(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
