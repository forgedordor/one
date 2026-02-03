package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alfm implements cmyk {
    private final cmxz a;
    private final ewto b;

    public alfm(cmxz cmxzVar, ewto ewtoVar) {
        cmxzVar.getClass();
        this.a = cmxzVar;
        this.b = ewtoVar;
    }

    @Override // defpackage.cmyk
    public final Object a(List list, cmxw cmxwVar, int i, fcxy fcxyVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.b.b.contains(((SuggestionData) obj).e())) {
                arrayList.add(obj);
            }
        }
        return this.a.a(arrayList, cmxwVar, 1, fcxyVar);
    }
}
