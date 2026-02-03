package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class albp extends fcyz implements fdat {
    int a;
    final /* synthetic */ albu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albp(albu albuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = albuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((albp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            albu albuVar = this.b;
            crjd crjdVar = (crjd) albuVar.c.b();
            ezan ezanVar = ezan.SCREEN_EFFECTS;
            ezaj ezajVar = ezaj.UNCONSUMED;
            this.a = 1;
            obj = crjdVar.a(albuVar.d.a, ezanVar, ezajVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (SuggestionData suggestionData : (Iterable) obj) {
            suggestionData.getClass();
            albt albtVar = !(suggestionData instanceof SmartSuggestionItemSuggestionData) ? null : new albt(suggestionData);
            if (albtVar != null) {
                arrayList.add(albtVar);
            }
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new albp(this.b, fcxyVar);
    }
}
