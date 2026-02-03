package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvyx b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvyw(cvyx cvyxVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvyxVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvyw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvyx cvyxVar = this.b;
            this.a = 1;
            obj = fdtc.a(cvyxVar.c, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aoer aoerVarH = ((ajlk) obj).h();
        if (aoerVarH == null) {
            throw new IllegalArgumentException("Conversation self identity is missing");
        }
        ((afzc) this.b.f.b()).h(new aggf(this.c, aoerVarH));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvyw(this.b, this.c, fcxyVar);
    }
}
