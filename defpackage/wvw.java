package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvw extends fcyz implements fdat {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvw(List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wvw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final List list = this.a;
        eieu eieuVarH = eiiy.h("MentionTrieFactory#buildMentionTrie");
        try {
            cimb cimbVar = cimb.a;
            cimb cimbVarA = cilx.a(new fdap() { // from class: wvv
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    cime cimeVar = (cime) obj2;
                    for (ResolvedRecipient resolvedRecipient : list) {
                        resolvedRecipient.getClass();
                        fdap fdapVar = cimeVar.a;
                        anue anueVarF = resolvedRecipient.F();
                        String strY = resolvedRecipient.y();
                        if (strY == null) {
                            strY = resolvedRecipient.x(true);
                        }
                        strY.getClass();
                        cilu ciluVar = new cilu(anueVarF, strY, (Integer) fdapVar.invoke(resolvedRecipient));
                        cimeVar.b.b(ciluVar);
                        Integer num = ciluVar.b;
                        if (num != null) {
                            cimeVar.c = Math.min(num.intValue(), cimeVar.c);
                        }
                    }
                    return fctx.a;
                }
            });
            fczl.a(eieuVarH, null);
            return cimbVarA;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wvw(this.a, fcxyVar);
    }
}
