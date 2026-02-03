package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujt implements eujf {
    private final ekgb a;

    public eujt(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.eujf
    public final ejwi a() {
        return ejud.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eujf
    public final String b(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return TextUtils.join(",", arrayList);
            }
            arrayList.add(((Locale) ekgbVar.get(i)).getLanguage());
            i++;
        }
    }
}
