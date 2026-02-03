package defpackage;

import android.app.Activity;
import defpackage.ehmx;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehna {
    public final Object a = new Object();
    public final Map b = new HashMap();
    private final boolean c;
    private final ehnu d;
    private final ehnb e;

    /* compiled from: PG */
    public interface a {
        ahha b();
    }

    public ehna(ehnu ehnuVar, ehnb ehnbVar) {
        this.d = ehnuVar;
        this.e = ehnbVar;
        ejwi ejwiVar = ehnbVar.a;
        boolean z = false;
        if (ejwiVar.g() && (ejwiVar.c() instanceof ehlb)) {
            z = true;
        }
        this.c = z;
    }

    public final Object a(efwo efwoVar) {
        Set setC = c();
        boolean z = true;
        if (!this.c && !setC.isEmpty() && (setC.size() != 1 || !setC.contains(efwoVar))) {
            z = false;
        }
        ejwl.r(z, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", setC, efwoVar);
        eg egVar = this.d.a;
        ejwl.p(egVar.getApplicationContext() instanceof eyhx, "Sting Activity must be attached to an @Sting Application. Found: %s", egVar.getApplicationContext());
        ehnb ehnbVar = this.e;
        ejwi ejwiVar = ehnbVar.a;
        if (ejwiVar.g()) {
            ahha ahhaVarB = ((a) eygm.a(ehnbVar.b.b(efwoVar), a.class)).b();
            ahhaVarB.a = (Activity) ejwiVar.c();
            return ahhaVarB.a();
        }
        ahha ahhaVarB2 = ((a) eygm.a(ehnbVar.b.b(efwoVar), a.class)).b();
        ahhaVarB2.b = ehnbVar.c;
        return ahhaVarB2.a();
    }

    public final void b(efwo efwoVar) {
        eyha eyhaVarC;
        Object obj = this.a;
        synchronized (obj) {
            Set setC = c();
            if (!setC.isEmpty()) {
                efwo efwoVar2 = (efwo) ekis.l(setC);
                synchronized (obj) {
                    Map map = this.b;
                    ejwl.l(map.containsKey(efwoVar2));
                    map.remove(efwoVar2);
                    ehmz ehmzVarA = this.e.b.a(efwoVar2);
                    synchronized (ehmzVarA.d) {
                        lwn lwnVar = ehmzVarA.a;
                        lyl lylVar = lwnVar.b;
                        Set setKeySet = lylVar.a.keySet();
                        Map map2 = lylVar.b;
                        for (String str : fcwm.g(fcwm.g(setKeySet, map2.keySet()), lwnVar.a.keySet())) {
                            lwnVar.c(str);
                            str.getClass();
                            map2.remove(str);
                        }
                        eyhaVarC = ehmzVarA.e != null ? ((ehmx.b) eygm.a(ehmzVarA.e, ehmx.b.class)).c() : null;
                        ehmzVarA.e = null;
                    }
                    if (eyhaVarC != null) {
                        eyhaVarC.b();
                    }
                }
            }
            this.b.put(efwoVar, a(efwoVar));
        }
    }

    public final Set c() {
        Set setUnmodifiableSet;
        synchronized (this.a) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.b.keySet());
        }
        return setUnmodifiableSet;
    }
}
