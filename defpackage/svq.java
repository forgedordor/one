package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svq extends fcyz implements fdat {
    int a;
    final /* synthetic */ svu b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svq(fcxy fcxyVar, svu svuVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.b = svuVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                svu svuVar = this.b;
                crav cravVar = (crav) svuVar.h.b();
                baxe baxeVar = (baxe) svuVar.g.b();
                ConversationIdType conversationIdType = this.c;
                Object objE = stt.d.e();
                objE.getClass();
                eiju eijuVarB = cravVar.b(baxeVar.M(conversationIdType, ((Number) objE).intValue()));
                eijuVarB.getClass();
                this.a = 1;
                obj = fdxs.c(eijuVarB, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (Locale) obj;
        } catch (Exception unused) {
            return craf.c(this.b.c);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        svq svqVar = new svq(fcxyVar, this.b, this.c);
        svqVar.d = obj;
        return svqVar;
    }
}
