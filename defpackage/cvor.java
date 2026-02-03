package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvor extends fcyz implements fdat {
    int a;
    final /* synthetic */ ResolvedRecipient b;
    final /* synthetic */ cvou c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvor(ResolvedRecipient resolvedRecipient, cvou cvouVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = resolvedRecipient;
        this.c = cvouVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvor) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            antq antqVarJ = this.b.j();
            if (antqVarJ != null) {
                this.a = 1;
                obj = antqVarJ.b(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                list = (List) obj;
                if (list == null) {
                }
            }
            list = fcvo.a;
        } else {
            list = (List) obj;
            if (list == null) {
                list = fcvo.a;
            }
        }
        cvou cvouVar = this.c;
        cvouVar.f.h(new agbo(null, this.b.g(), 8, list));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvor(this.b, this.c, fcxyVar);
    }
}
