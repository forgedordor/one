package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyv extends fcyz implements fdat {
    final /* synthetic */ cvyx a;
    final /* synthetic */ ResolvedRecipient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvyv(cvyx cvyxVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cvyxVar;
        this.b = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvyv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((afzc) this.a.f.b()).h(new agfu(this.b));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvyv(this.a, this.b, fcxyVar);
    }
}
