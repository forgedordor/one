package defpackage;

import android.accounts.Account;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drds {
    public static dqzt a(ejvr ejvrVar, String str) {
        dqzt dqztVar = (dqzt) ejvrVar.apply(str);
        if (dqztVar != null) {
            return dqztVar;
        }
        throw new IllegalArgumentException("GellerConfig is null");
    }

    public static String b(ejwi ejwiVar) {
        return ejwiVar.g() ? ((Account) ejwiVar.c()).name : "";
    }

    public static boolean c(String str, ewut ewutVar, Geller geller) {
        if (GellerDatabase.b.contains(ewutVar.name())) {
            return true;
        }
        Map mapB = geller.c.b(str).b();
        ejwi ejwiVarJ = mapB.containsKey(ewutVar.name()) ? ejwi.j((ewuu) mapB.get(ewutVar.name())) : ejud.a;
        if (ejwiVarJ.g()) {
            return ((ewuu) ejwiVarJ.c()).equals(ewuu.CUSTOM_STORAGE_TYPE_GDD);
        }
        return false;
    }
}
