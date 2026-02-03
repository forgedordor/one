package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwm implements ixm {
    final /* synthetic */ fdat a;

    public gwm(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        final iyl iylVarE;
        if (this.a != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ixk ixkVar = (ixk) list.get(i);
                if (fdbq.f(iwa.b(ixkVar), ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)) {
                    iylVarE = ixkVar.e(kil.m(j, 0, 0, 0, 0, 11));
                }
            }
            kjw.a("Collection contains no element matching the predicate.");
            throw new fcta();
        }
        iylVarE = null;
        int iMax = Math.max(iylVarE != null ? iylVarE.a : 0, 0);
        final int iMax2 = Math.max(ixpVar.ep(gwo.a), (iylVarE != null ? iylVarE.b : 0) + ixpVar.eo(gwo.c));
        if (iylVarE != null) {
            iylVarE.ei(iuc.a);
        }
        if (iylVarE != null) {
            iylVarE.ei(iuc.b);
        }
        return ixpVar.ej(iMax, iMax2, fcvp.a, new fdap() { // from class: gwl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iyl iylVar = iylVarE;
                if (iylVar != null) {
                    int i2 = iMax2;
                    float f = gwo.a;
                    iyk.A(iykVar, iylVar, 0, (i2 - iylVar.b) / 2);
                }
                return fctx.a;
            }
        });
    }
}
