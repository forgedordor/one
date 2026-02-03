package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class albh extends fcyz implements fdat {
    int a;
    final /* synthetic */ albl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albh(albl alblVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = alblVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((albh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            albl alblVar = this.b;
            crjd crjdVar = (crjd) alblVar.c.b();
            ezan ezanVar = ezan.SCREEN_EFFECTS;
            ezaj ezajVar = ezaj.UNCONSUMED;
            this.a = 1;
            obj = crjdVar.a(alblVar.d.a, ezanVar, ezajVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgb<SuggestionData> ekgbVar = (ekgb) obj;
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        for (SuggestionData suggestionData : ekgbVar) {
            suggestionData.getClass();
            arrayList.add(suggestionData);
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new albh(this.b, fcxyVar);
    }
}
