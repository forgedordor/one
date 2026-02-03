package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvqc extends fcyz implements fdat {
    final /* synthetic */ ResolvedRecipient a;
    final /* synthetic */ cvqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvqc(ResolvedRecipient resolvedRecipient, cvqd cvqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = resolvedRecipient;
        this.b = cvqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvqc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ResolvedRecipient resolvedRecipient = this.a;
        if (resolvedRecipient != null) {
            cvqd cvqdVar = this.b;
            cvqdVar.e.h(new agbo(resolvedRecipient.e(), resolvedRecipient.g(), 9, fcvo.a));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvqc(this.a, this.b, fcxyVar);
    }
}
