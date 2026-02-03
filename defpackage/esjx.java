package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjx {
    public final Map a = new csq();
    private final Executor b;

    public esjx(Executor executor) {
        this.b = executor;
    }

    public final synchronized defn a(final String str, esje esjeVar) {
        Map map = this.a;
        defn defnVar = (defn) map.get(str);
        if (defnVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: ".concat(String.valueOf(str)));
            }
            return defnVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: ".concat(String.valueOf(str)));
        }
        final FirebaseMessaging firebaseMessaging = esjeVar.a;
        final String str2 = esjeVar.b;
        final eskc eskcVar = esjeVar.c;
        esjk esjkVar = firebaseMessaging.e;
        defn defnVarE = esjk.b(esjkVar.a(esjp.e(esjkVar.a), "*", new Bundle())).g(firebaseMessaging.f, new defm() { // from class: esiz
            @Override // defpackage.defm
            public final defn a(Object obj) {
                FirebaseMessaging firebaseMessaging2 = firebaseMessaging;
                String str3 = (String) obj;
                FirebaseMessaging.b(firebaseMessaging2.d).c(firebaseMessaging2.d(), str2, str3, firebaseMessaging2.g.c());
                eskc eskcVar2 = eskcVar;
                if (eskcVar2 == null || !str3.equals(eskcVar2.b)) {
                    firebaseMessaging2.e(str3);
                }
                return degc.c(str3);
            }
        }).e(this.b, new deeq() { // from class: esjw
            @Override // defpackage.deeq
            public final Object a(defn defnVar2) {
                esjx esjxVar = this.a;
                String str3 = str;
                synchronized (esjxVar) {
                    esjxVar.a.remove(str3);
                }
                return defnVar2;
            }
        });
        map.put(str, defnVarE);
        return defnVarE;
    }
}
