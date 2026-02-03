package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csbv extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ csby c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csbv(csby csbyVar, ConversationIdType conversationIdType, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = csbyVar;
        this.d = conversationIdType;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csbv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        eieu eieuVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                fctl.b(obj);
                eieuVar = r0;
                fczl.a(eieuVar, null);
                return fctx.a;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r0, th);
                    throw th2;
                }
            }
        }
        fctl.b(obj);
        csby csbyVar = this.c;
        ConversationIdType conversationIdType = this.d;
        String str = this.e;
        eieu eieuVarA = eiiy.a("CarrierSpamReporter#reportSpam-conversationId");
        try {
            baxe baxeVar = (baxe) csbyVar.f.b();
            Object objE = crtr.h.e();
            objE.getClass();
            ekgb ekgbVarH = baxeVar.H(conversationIdType, ((Number) objE).intValue());
            if (ekgbVarH != null && !ekgbVarH.isEmpty()) {
                ekgb ekgbVarA = ekgbVarH.a();
                ekgbVarA.getClass();
                this.a = eieuVarA;
                this.b = 1;
                if (csbyVar.d(str, ekgbVarA, this) == fcylVar) {
                    return fcylVar;
                }
                eieuVar = eieuVarA;
                fczl.a(eieuVar, null);
                return fctx.a;
            }
            fctx fctxVar = fctx.a;
            fczl.a(eieuVarA, null);
            return fctxVar;
        } catch (Throwable th3) {
            th = th3;
            r0 = eieuVarA;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csbv(this.c, this.d, this.e, fcxyVar);
    }
}
