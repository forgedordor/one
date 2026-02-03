package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrs extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvrt b;
    final /* synthetic */ ResolvedRecipient c;
    final /* synthetic */ eofr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvrs(cvrt cvrtVar, ResolvedRecipient resolvedRecipient, eofr eofrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvrtVar;
        this.c = resolvedRecipient;
        this.d = eofrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvrs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvrt cvrtVar = this.b;
            ResolvedRecipient resolvedRecipient = this.c;
            eofr eofrVar = this.d;
            this.a = 1;
            cvry cvryVar = cvrtVar.d;
            Object objC = ((cpjw) cvryVar.e.b()).c(cpkg.a(1 == (9069 & 1) ? null : null, (9069 & 2) != 0 ? null : false, (9069 & 4) != 0 ? csdl.b : null, (9069 & 16) != 0 ? null : cvryVar.a, null, (9069 & 128) != 0 ? null : resolvedRecipient, (!((9069 & 512) == 0)) | (eofrVar != eofr.DISMISSED_WARNING_BANNER), (9069 & 1024) != 0 ? null : elka.CONVERSATION_FROM_UNSPAM_ACTION, 3, 11, (9069 & 8192) != 0 ? 2 : 0, (9069 & 16384) != 0 ? null : eofrVar), this);
            if (objC != fcylVar) {
                objC = fctx.a;
            }
            if (objC == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvrs(this.b, this.c, this.d, fcxyVar);
    }
}
