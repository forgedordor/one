package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlo extends fcyz implements fdat {
    int a;
    final /* synthetic */ zlz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlo(zlz zlzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zlzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zlz zlzVar = this.b;
            this.a = 1;
            obj = fdtc.a(zlzVar.d, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.Y((List) obj);
        if (resolvedRecipient == null) {
            return fctx.a;
        }
        final zlz zlzVar2 = this.b;
        zlzVar2.g.b(new fdap() { // from class: zln
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                zlz zlzVar3 = zlzVar2;
                return ((ctez) zlzVar3.j.b()).a((ahat) obj2, resolvedRecipient, zlzVar3.e, crvz.c);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zlo(this.b, fcxyVar);
    }
}
