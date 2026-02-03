package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euje implements eujf {
    public final ejvr a;
    private final ejxr b;
    private final ejxr c;

    public euje(ejvr ejvrVar, ejxr ejxrVar, ejxr ejxrVar2) {
        this.a = ejvrVar;
        this.b = ejxrVar;
        this.c = ejxrVar2;
    }

    @Override // defpackage.eujf
    public final ejwi a() {
        return (ejwi) this.c.get();
    }

    @Override // defpackage.eujf
    public final String b(final CharSequence charSequence) {
        return (String) ((ejwi) this.b.get()).b(new ejvr() { // from class: eujd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Float f = (Float) obj;
                if (f.floatValue() < 0.0f || f.floatValue() > 1.0f) {
                    Objects.toString(f);
                    Log.w("LangIdLanguageDetector", "[detectLanguageTagsFromText] unexpected threshold is found: ".concat(String.valueOf(f)));
                    return "";
                }
                CharSequence charSequence2 = charSequence;
                euje eujeVar = this.a;
                Object objApply = eujeVar.a.apply(new euhg(charSequence2));
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    ekgb ekgbVar = ((euhe) objApply).a;
                    int i2 = ((ekoe) ekgbVar).c;
                    if (i >= i2) {
                        break;
                    }
                    ejwl.v(i, i2);
                    if (((eulh) ekgbVar.get(i)).a() < f.floatValue()) {
                        break;
                    }
                    ejwl.v(i, i2);
                    arrayList.add(((eulh) ekgbVar.get(i)).b().getLanguage());
                    i++;
                }
                return TextUtils.join(",", arrayList);
            }
        }).e("");
    }
}
