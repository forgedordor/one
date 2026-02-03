package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgn {
    public final Map a = new csq();
    private final Executor b;

    public esgn(Executor executor) {
        this.b = executor;
    }

    final synchronized defn a(String str, String str2, esgb esgbVar) {
        final Pair pair = new Pair(str, str2);
        Map map = this.a;
        defn defnVar = (defn) map.get(pair);
        if (defnVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Joining ongoing request for: ".concat(pair.toString()));
            }
            return defnVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Making new request for: ".concat(pair.toString()));
        }
        final FirebaseInstanceId firebaseInstanceId = esgbVar.a;
        String str3 = esgbVar.b;
        final String str4 = esgbVar.c;
        final String str5 = esgbVar.d;
        final esgp esgpVar = esgbVar.e;
        defn defnVarG = esgf.b(firebaseInstanceId.f.a(str3, str4, str5, new Bundle())).g(firebaseInstanceId.c, new defm() { // from class: esgc
            @Override // defpackage.defm
            public final defn a(Object obj) {
                String str6 = (String) obj;
                esgq esgqVar = FirebaseInstanceId.a;
                FirebaseInstanceId firebaseInstanceId2 = firebaseInstanceId;
                esgqVar.d(firebaseInstanceId2.g(), str4, str5, str6, firebaseInstanceId2.e.c());
                return degc.c(new esgg(str6));
            }
        });
        defnVarG.q(new esfz(), new defh() { // from class: esgd
            @Override // defpackage.defh
            public final void e(Object obj) {
                String str6 = ((esgg) obj).a;
                esgp esgpVar2 = esgpVar;
                if (esgpVar2 == null || !str6.equals(esgpVar2.b)) {
                    Iterator it = firebaseInstanceId.h.iterator();
                    while (it.hasNext()) {
                        ((esja) it.next()).a.e(str6);
                    }
                }
            }
        });
        defn defnVarE = defnVarG.e(this.b, new deeq() { // from class: esgm
            @Override // defpackage.deeq
            public final Object a(defn defnVar2) {
                esgn esgnVar = this.a;
                Pair pair2 = pair;
                synchronized (esgnVar) {
                    esgnVar.a.remove(pair2);
                }
                return defnVar2;
            }
        });
        map.put(pair, defnVarE);
        return defnVarE;
    }
}
