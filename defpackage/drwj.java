package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwj implements SharedPreferences {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences");
    public ICrossProcessPreferenceServer d;
    private final Context e;
    private final String f;
    private final drwi g;
    private final ICrossProcessPreferenceClient h;
    public final Map b = new HashMap();
    public final Set c = new HashSet();
    private final IBinder.DeathRecipient i = new IBinder.DeathRecipient() { // from class: drwf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            drwj drwjVar = this.a;
            synchronized (drwjVar) {
                drwjVar.d = null;
            }
        }
    };

    public drwj(Context context) {
        this.e = context;
        int i = dryh.a;
        String strConcat = String.valueOf(context.getPackageName()).concat(".wdb");
        this.f = strConcat;
        this.g = new drwi(context, strConcat);
        this.h = new drwg(this);
    }

    public static dryn a(Context context, String str, dryj dryjVar) {
        int iA;
        try {
            dryn drynVarA = dryz.a(dryz.b(context, str, dryjVar));
            if (drynVarA != null && (iA = drym.a(drynVarA.b)) != 0 && iA == 201) {
                return drynVarA;
            }
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "sendRequest", 341, "CrossProcessSharedPreferences.java")).q("The response of the request is invalid");
            return null;
        } catch (Exception e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "sendRequest", (char) 334, "CrossProcessSharedPreferences.java")).q("Fail to send WDB request");
            return null;
        }
    }

    private final Object e(String str, Class cls, Object obj) {
        Object obj2;
        synchronized (this) {
            obj2 = this.b.get(str);
        }
        return cls.isInstance(obj2) ? cls.cast(obj2) : obj;
    }

    private final synchronized boolean f(IBinder iBinder) {
        ICrossProcessPreferenceServer iCrossProcessPreferenceServerAsInterface = ICrossProcessPreferenceServer.Stub.asInterface(iBinder);
        try {
            if (!iCrossProcessPreferenceServerAsInterface.register(this.h)) {
                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", 255, "CrossProcessSharedPreferences.java")).q("Failed to register to the server.");
                return false;
            }
            this.d = iCrossProcessPreferenceServerAsInterface;
            try {
                iBinder.linkToDeath(this.i, 0);
            } catch (Exception e) {
                ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", (char) 268, "CrossProcessSharedPreferences.java")).q("Failed to add deathRecipient.");
            }
            return true;
        } catch (Exception e2) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", (char) 259, "CrossProcessSharedPreferences.java")).q("Failed to register to the server.");
            return false;
        }
    }

    final synchronized void b() {
        ICrossProcessPreferenceServer iCrossProcessPreferenceServer = this.d;
        if (iCrossProcessPreferenceServer == null) {
            return;
        }
        try {
            try {
                iCrossProcessPreferenceServer.unregister(this.h);
            } finally {
                this.d = null;
            }
        } catch (Exception e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "disconnectServer", 282, "CrossProcessSharedPreferences.java")).q("Failed to unregister from the server.");
        }
        try {
            iCrossProcessPreferenceServer.asBinder().unlinkToDeath(this.i, 0);
        } catch (RuntimeException e2) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "disconnectServer", (char) 291, "CrossProcessSharedPreferences.java")).q("Failed to remove death recipient.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void c() {
        Bundle bundleB;
        int iA;
        synchronized (this) {
            if (this.d != null) {
                return;
            }
            ekgi ekgiVar = new ekgi();
            IBinder iBinder = null;
            try {
                Context context = this.e;
                String str = this.f;
                dryi dryiVar = (dryi) dryj.a.createBuilder();
                long millis = drjv.a.d().toMillis();
                dryiVar.copyOnWrite();
                dryj dryjVar = (dryj) dryiVar.instance;
                dryjVar.b |= 1;
                dryjVar.c = millis;
                evsl evslVar = dryv.b;
                dryo dryoVar = (dryo) dryv.a.createBuilder();
                dryq dryqVar = dryq.a;
                dryoVar.copyOnWrite();
                dryv dryvVar = (dryv) dryoVar.instance;
                dryqVar.getClass();
                dryvVar.d = dryqVar;
                dryvVar.c = 2;
                dryiVar.e(evslVar, (dryv) dryoVar.build());
                bundleB = dryz.b(context, str, (dryj) dryiVar.build());
            } catch (Exception e) {
                ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", (char) 212, "CrossProcessSharedPreferences.java")).q("Failed to send FETCH_PREFERENCES request");
                bundleB = null;
            }
            if (bundleB == null) {
                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 215, "CrossProcessSharedPreferences.java")).q("The result bundle of FETCH_PREFERENCES is null.");
            } else {
                IBinder binder = bundleB.getBinder("binder");
                if (binder == null) {
                    ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 222, "CrossProcessSharedPreferences.java")).q("The result bundle doesn't contain a binder");
                } else {
                    dryn drynVarA = dryz.a(bundleB);
                    if (drynVarA == null || (iA = drym.a(drynVarA.b)) == 0 || iA != 201) {
                        ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 229, "CrossProcessSharedPreferences.java")).q("The response of FETCH_PREFERENCES request is null.");
                    } else {
                        evsl evslVarCheckIsLite = evsn.checkIsLite(dryx.b);
                        drynVarA.d(evslVarCheckIsLite);
                        Object objL = drynVarA.r.l(evslVarCheckIsLite.d);
                        drwe drweVar = ((dryx) (objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL))).c;
                        if (drweVar == null) {
                            drweVar = drwe.a;
                        }
                        for (drwp drwpVar : drweVar.b) {
                            try {
                                ekgiVar.i(drwpVar.e, drwx.e(drwpVar));
                            } catch (IllegalArgumentException e2) {
                                ((ekrd) ((ekrd) ((ekrd) a.j()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 241, "CrossProcessSharedPreferences.java")).t("Failed to get preference elem value for %s", drwpVar.e);
                            }
                        }
                        iBinder = binder;
                    }
                }
            }
            if (iBinder == null) {
                return;
            }
            if (f(iBinder)) {
                ekgp ekgpVarB = ekgiVar.b();
                Map map = this.b;
                ekgp ekgpVarJ = ekgp.j(map);
                map.clear();
                map.putAll(ekgpVarB);
                ekhx ekhxVarO = ekhx.o(this.c);
                ekhv ekhvVar = new ekhv();
                Set[] setArr = {ekgpVarJ.keySet(), ekgpVarB.keySet()};
                ekhv ekhvVar2 = new ekhv();
                for (int i = 0; i < 2; i++) {
                    ekhvVar2.j(setArr[i]);
                }
                ekqg ekqgVarListIterator = ekhvVar2.g().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    String str2 = (String) ekqgVarListIterator.next();
                    Object obj = ekgpVarB.get(str2);
                    if (obj == null || !obj.equals(ekgpVarJ.get(str2))) {
                        ekhvVar.c(str2);
                    }
                }
                d(ekhxVarO, ekhvVar.g());
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.b.containsKey(str);
    }

    public final void d(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(this, str);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final /* synthetic */ SharedPreferences.Editor edit() {
        return this.g;
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        return this.b;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) e(str, Boolean.class, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return ((Float) e(str, Float.class, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return ((Integer) e(str, Integer.class, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return ((Long) e(str, Long.class, Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) e(str, String.class, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) e(str, Set.class, set);
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.c.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.c.remove(onSharedPreferenceChangeListener);
    }
}
