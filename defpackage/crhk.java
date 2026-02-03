package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crhk {
    public static final ekgb a(List list, cogw cogwVar) {
        cogwVar.getClass();
        if (((Boolean) creq.a.e()).booleanValue() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuggestionData suggestionData = (SuggestionData) it.next();
                suggestionData.getClass();
                SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
                ezgi ezgiVar = smartSuggestionItemSuggestionData.c;
                if ((ezgiVar.b & 1) != 0) {
                    ezgg ezggVar = ezgiVar.e;
                    if (ezggVar == null) {
                        ezggVar = ezgg.b;
                    }
                    if (ezggVar.p == 0) {
                        continue;
                    } else {
                        ezgg ezggVar2 = smartSuggestionItemSuggestionData.c.e;
                        if (ezggVar2 == null) {
                            ezggVar2 = ezgg.b;
                        }
                        long j = ezggVar2.p;
                        if (j > 0 && cogwVar.f().toEpochMilli() >= j) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String strB = ((SuggestionData) it2.next()).b();
                                if (strB != null) {
                                    arrayList.add(strB);
                                }
                            }
                            return ekfv.a(arrayList);
                        }
                    }
                }
            }
        }
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        return ekgbVar;
    }
}
