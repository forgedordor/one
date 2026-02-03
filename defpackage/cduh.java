package defpackage;

import android.text.TextUtils;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cduh implements eyif {
    public static ekgb a(Set set, final dtpd dtpdVar, String str, dtpd dtpdVar2) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (!TextUtils.isEmpty(str)) {
            ekfwVar.h(new cdtb(new Supplier() { // from class: cduf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return dtpdVar;
                }
            }, new Supplier() { // from class: cdug
                @Override // java.util.function.Supplier
                public final Object get() {
                    return crbf.R;
                }
            }));
        }
        ekfwVar.h(dtpdVar2);
        ekfwVar.j(set);
        ekgb ekgbVarG = ekfwVar.g();
        ekgbVarG.getClass();
        return ekgbVarG;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
