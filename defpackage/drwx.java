package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwx extends drwl implements drly {
    public static final drvl a;
    public static final Object b;
    public static final Object c;
    public static volatile drwx d;
    private static final eksp k = drua.a;
    public final boolean e;
    public final drwr g;
    public volatile drwm h;
    public volatile ekgp i;
    public volatile ekgp j;
    private volatile ekgp n;
    private volatile ekgp o;
    private volatile ekgp p;
    private final csq l = new csq();
    private final SharedPreferences.OnSharedPreferenceChangeListener m = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: drws
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str == null) {
                return;
            }
            drwx drwxVar = this.a;
            if (drwxVar.f.get()) {
                drwxVar.f(str, str);
                drwxVar.f("", str);
            }
        }
    };
    public final AtomicBoolean f = new AtomicBoolean(true);

    /* compiled from: PG */
    class a extends drvl {
    }

    static {
        a aVar = new a();
        a = aVar;
        b = new drwt();
        c = new drwu();
        drvp.c("Preferences_UserUnlocked", aVar);
        new csq();
    }

    public drwx(Context context) {
        drwm drwyVar;
        ekgp ekgpVar = ekoj.a;
        this.n = ekgpVar;
        this.o = ekgpVar;
        this.p = ekgpVar;
        this.i = ekgpVar;
        this.j = ekgpVar;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        this.e = !zIsEmpty;
        this.g = new drwr(context.getResources());
        boolean zA = dryc.a(context);
        if (!drxk.a || zA) {
            if (zIsEmpty) {
                final drxb drxbVar = new drxb(context.getApplicationContext());
                Context contextA = dryh.a(drxbVar.a);
                Context context2 = drxbVar.a;
                if (contextA == context2) {
                    drxbVar.b(PreferenceManager.getDefaultSharedPreferences(context2), false);
                    drxbVar.b = true;
                } else {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(contextA);
                    final boolean z = defaultSharedPreferences.getBoolean("has_migrated_to_de_storage", false);
                    drxbVar.b(defaultSharedPreferences, true);
                    final Runnable runnable = new Runnable() { // from class: drwz
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v3, types: [android.content.SharedPreferences, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            drxb drxbVar2 = drxbVar;
                            if (!z) {
                                Context context3 = drxbVar2.a;
                                Context contextA2 = dryh.a(context3);
                                contextA2.moveSharedPreferencesFrom(context3, PreferenceManager.getDefaultSharedPreferencesName(context3));
                                PreferenceManager.getDefaultSharedPreferences(contextA2).edit().putBoolean("has_migrated_to_de_storage", true).apply();
                                SharedPreferences sharedPreferencesB = drxbVar2.b(PreferenceManager.getDefaultSharedPreferences(contextA2), true);
                                drwv drwvVar = drxbVar2.d;
                                if (drwvVar != null) {
                                    drwx drwxVar = drwvVar.a;
                                    drwxVar.i(drwxVar.h.get(), sharedPreferencesB);
                                }
                            }
                            drxbVar2.b = true;
                            drxbVar2.c();
                        }
                    };
                    Runnable runnable2 = new Runnable() { // from class: drxa
                        @Override // java.lang.Runnable
                        public final void run() {
                            drxbVar.c = null;
                            runnable.run();
                        }
                    };
                    drvl drvlVar = drxw.a;
                    drvp.a(drvlVar);
                    drxbVar.c = new drvn(runnable2, drvlVar.getClass());
                    drxbVar.c.a(eoqg.a);
                }
                drwyVar = drxbVar;
            } else {
                drvl drvlVar2 = drxw.a;
                drxv drxvVar = drxv.a;
                if (!drxvVar.b) {
                    boolean z2 = drxvVar.c;
                    if (!drxx.a && !drjy.b) {
                        throw new IllegalStateException("This method should be called after startMonitor!");
                    }
                    drxvVar.b = true;
                    drvp.d(drxw.a);
                } else if (!drxvVar.b) {
                    throw new IllegalStateException("Private preferences should not be used before user unlocked");
                }
                drwyVar = new drwy(context.getApplicationContext());
            }
            this.h = drwyVar;
        } else {
            if (!zIsEmpty) {
                throw new IllegalStateException("Non-main process shouldn't access private preferences");
            }
            this.h = new drwk(context);
        }
        if (zIsEmpty) {
            drlx.a.a(this);
        }
    }

    static Object e(drwp drwpVar) {
        String str;
        int i = drwpVar.c;
        int iA = drwo.a(i);
        if (iA == 0) {
            throw null;
        }
        int i2 = iA - 1;
        if (i2 == 0) {
            return Boolean.valueOf(i == 2 ? ((Boolean) drwpVar.d).booleanValue() : false);
        }
        if (i2 == 1) {
            return Integer.valueOf(i == 3 ? ((Integer) drwpVar.d).intValue() : 0);
        }
        if (i2 == 2) {
            return Long.valueOf(i == 4 ? ((Long) drwpVar.d).longValue() : 0L);
        }
        if (i2 == 3) {
            return Float.valueOf(i == 5 ? ((Float) drwpVar.d).floatValue() : 0.0f);
        }
        if (i2 == 4) {
            return i == 6 ? (String) drwpVar.d : "";
        }
        if (i2 == 5) {
            return ekhx.o((i == 7 ? (drxd) drwpVar.d : drxd.a).b);
        }
        switch (drwo.a(i)) {
            case 1:
                str = "BOOL_VALUE";
                break;
            case 2:
                str = "INT_VALUE";
                break;
            case 3:
                str = "LONG_VALUE";
                break;
            case 4:
                str = "FLOAT_VALUE";
                break;
            case 5:
                str = "STRING_VALUE";
                break;
            case 6:
                str = "STRING_SET_VALUE";
                break;
            case 7:
                str = "VALUE_NOT_SET";
                break;
            default:
                str = "null";
                break;
        }
        throw new IllegalArgumentException("Unknown value type: ".concat(str));
    }

    private final synchronized void l(drww drwwVar, String str) {
        csq csqVar = this.l;
        if (!csqVar.isEmpty()) {
            if (str.equals("")) {
                for (int i = 0; i < csqVar.d; i++) {
                    String str2 = (String) csqVar.d(i);
                    if (!str2.equals("") && ((Set) csqVar.g(i)).contains(drwwVar)) {
                        throw new ejyc(String.format("The listener is already registered for key: %s", str2));
                    }
                }
            } else {
                Set set = (Set) csqVar.get("");
                if (set != null && set.contains(drwwVar)) {
                    throw new ejyc("The listener is already registered for all keys");
                }
            }
        }
    }

    private final synchronized void m(SharedPreferences sharedPreferences) {
        if (this.l.isEmpty()) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.m);
        }
    }

    @Override // defpackage.oze
    public final void a(String str) {
        ((Float) d(str, Float.class, Float.valueOf(-1.0f), null)).floatValue();
    }

    @Override // defpackage.drwl
    public final String b(int i) {
        return this.g.a(i);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.content.SharedPreferences, java.lang.Object] */
    public final Object d(String str, Class cls, Object obj, Object obj2) {
        Object obj3 = this.j.get(str);
        if (obj3 == c) {
            obj3 = this.p.get(str);
        } else if (obj3 == null && (obj3 = this.i.get(str)) == null) {
            obj3 = this.p.get(str);
        }
        if (obj3 != null && cls.isInstance(obj3)) {
            return cls.cast(obj3);
        }
        Object obj4 = this.o.get(str);
        if (obj4 == null) {
            obj4 = this.n.get(str);
        }
        if (obj4 instanceof ejxr) {
            obj = ((ejxr) obj4).get();
        } else if (obj4 != null) {
            obj = obj4;
        }
        if (obj3 != b) {
            try {
                ?? r0 = this.h.get();
                if (cls == Boolean.class) {
                    return cls.cast(Boolean.valueOf(r0.getBoolean(str, ((Boolean) obj).booleanValue())));
                }
                if (cls == Float.class) {
                    return cls.cast(Float.valueOf(r0.getFloat(str, ((Float) obj).floatValue())));
                }
                if (cls == Integer.class) {
                    return cls.cast(Integer.valueOf(r0.getInt(str, ((Integer) obj).intValue())));
                }
                if (cls == Long.class) {
                    return cls.cast(Long.valueOf(r0.getLong(str, ((Long) obj).longValue())));
                }
                if (cls == String.class) {
                    return cls.cast(r0.getString(str, (String) obj));
                }
                if (cls == Set.class) {
                    return cls.cast(r0.getStringSet(str, (Set) obj));
                }
                throw new IllegalArgumentException("Unsupported type ".concat(cls.toString()));
            } catch (ClassCastException e) {
                ((eksl) ((eksl) ((eksl) k.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/Preferences", "get", 956, "Preferences.java")).D("Preference %s is not %s", str, cls);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return obj;
    }

    public final void f(String str, String str2) {
        drww[] drwwVarArr;
        synchronized (this) {
            csq csqVar = this.l;
            Set set = (Set) csqVar.get(str);
            if (set == null) {
                drwwVarArr = null;
            } else {
                if (set.isEmpty()) {
                    csqVar.remove(str);
                    return;
                }
                drwwVarArr = (drww[]) set.toArray(new drww[0]);
            }
            if (drwwVarArr != null) {
                for (drww drwwVar : drwwVarArr) {
                    if (drwwVar != null) {
                        drwwVar.a(this, str2);
                    }
                }
            }
        }
    }

    public final synchronized void g(drww drwwVar, int i) {
        h(drwwVar, this.g.a(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void h(drww drwwVar, String str) {
        if (drxl.a) {
            l(drwwVar, str);
        }
        m(this.h.get());
        csq csqVar = this.l;
        Set setNewSetFromMap = (Set) csqVar.get(str);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
            csqVar.put(str, setNewSetFromMap);
        }
        setNewSetFromMap.add(drwwVar);
    }

    public final synchronized void i(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        if (sharedPreferences != sharedPreferences2) {
            if (!this.l.isEmpty()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.m;
                sharedPreferences2.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        }
    }

    public final boolean j(int i) {
        return k(b(i));
    }

    public final boolean k(String str) {
        return ((Boolean) d(str, Boolean.class, false, false)).booleanValue();
    }
}
