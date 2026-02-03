package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alaa extends fcyz implements fdat {
    final /* synthetic */ alae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alaa(alae alaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = alaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alaa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVarZ = alae.d(this.a.c.a).z();
        bbew bbewVar = new bbew();
        bbewVar.d(ekgbVarZ);
        List<SuggestionData> listC = bbewVar.c();
        ArrayList arrayList = new ArrayList();
        for (SuggestionData suggestionData : listC) {
            akzz akzzVar = null;
            if ((suggestionData instanceof SmartSuggestionItemSuggestionData) && ((SmartSuggestionItemSuggestionData) suggestionData).l() == ezan.COPY_OTP) {
                akzzVar = new akzz(suggestionData);
            }
            if (akzzVar != null) {
                arrayList.add(akzzVar);
            }
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alaa(this.a, fcxyVar);
    }
}
