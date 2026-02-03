package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqh extends fcyz implements fdat {
    int a;
    final /* synthetic */ xqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqh(xqi xqiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xqiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xqi xqiVar = this.b;
            this.a = 1;
            obj = fdtc.a(xqiVar.d, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.Y((List) obj);
        if (resolvedRecipient == null) {
            return fctx.a;
        }
        if (crbf.a().booleanValue() && resolvedRecipient.H().d()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        xqi xqiVar2 = this.b;
        ((tlj) xqiVar2.f.b()).a(new tlk(resolvedRecipient, xqiVar2.c, true == crbf.a().booleanValue() ? 2 : 1, 9));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xqh(this.b, fcxyVar);
    }
}
