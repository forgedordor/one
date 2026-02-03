package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvxh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvxj b;
    final /* synthetic */ aoer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxh(cvxj cvxjVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvxjVar;
        this.c = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvxh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvxj cvxjVar = this.b;
            this.a = 1;
            obj = fdtc.a(cvxjVar.d, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.X((List) obj);
        resolvedRecipient.getClass();
        ((afzc) this.b.f.b()).h(new aggf(resolvedRecipient, this.c));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvxh(this.b, this.c, fcxyVar);
    }
}
