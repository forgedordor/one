package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akah extends fcyz implements fdat {
    int a;
    final /* synthetic */ akaj b;
    final /* synthetic */ List c;
    final /* synthetic */ ajts d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akah(akaj akajVar, List list, ajts ajtsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akajVar;
        this.c = list;
        this.d = ajtsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akah) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            akaj akajVar = this.b;
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.X(this.c);
            ajts ajtsVar = this.d;
            this.a = 1;
            if (akajVar.a(resolvedRecipient, ajtsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akah(this.b, this.c, this.d, fcxyVar);
    }
}
