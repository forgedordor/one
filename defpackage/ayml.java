package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ayml {
    public final Object b = new Object();
    protected int c = 1;
    public aymj d;
    private final String g;
    private static final cqce e = cqce.g("BugleDataModel", "ActionMonitor");
    private static final Handler f = new Handler(Looper.getMainLooper());
    public static final cvw a = new cvw();

    protected ayml(String str) {
        this.g = str;
    }

    public static void a(Action action, Object obj) {
        int i;
        boolean zD = action.D();
        ayml aymlVarE = e(action.u);
        if (aymlVarE != null) {
            i = aymlVarE.c;
            synchronized (aymlVarE.b) {
                if (zD) {
                    d(action, 3, 4);
                }
            }
        } else {
            i = 3;
        }
        cqce cqceVar = e;
        if (cqceVar.t(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            cqbd cqbdVarD = cqceVar.d();
            cqbdVarD.I("Operation-");
            cqbdVarD.v(action.u);
            cqbdVarD.v(": @");
            cqbdVarD.v(simpleDateFormat.format(new Date()));
            cqbdVarD.v("UTC.");
            cqbdVarD.A("oldMonitorState", f(i));
            cqbdVarD.A("newMonitorState", "EXECUTED");
            cqbdVarD.r();
        }
        if (action.D()) {
            return;
        }
        c(action, 3, obj, true);
    }

    public static void b(String str, ayml aymlVar) {
        String str2 = aymlVar.g;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !str.equals(str2)) {
            throw new IllegalArgumentException(a.n(str, str2, "Monitor key ", " not compatible with action key "));
        }
        cvw cvwVar = a;
        synchronized (cvwVar) {
            cvwVar.put(str, aymlVar);
        }
    }

    public static void c(final Action action, int i, final Object obj, final boolean z) {
        aymj aymjVar;
        int i2;
        final ayml aymlVarE = e(action.u);
        if (aymlVarE != null) {
            int i3 = aymlVarE.c;
            synchronized (aymlVarE.b) {
                d(action, i, 8);
                aymjVar = aymlVarE.d;
            }
            if (aymjVar != null) {
                f.post(eiid.k(new Runnable() { // from class: aymi
                    @Override // java.lang.Runnable
                    public final void run() {
                        aymj aymjVar2;
                        ayml aymlVar = this.a;
                        synchronized (aymlVar.b) {
                            aymjVar2 = aymlVar.d;
                            if (aymjVar2 == null) {
                                aymjVar2 = null;
                            }
                            aymlVar.d = null;
                        }
                        if (aymjVar2 != null) {
                            Object obj2 = obj;
                            Action action2 = action;
                            if (z) {
                                aymjVar2.b(action2, obj2);
                            } else {
                                aymjVar2.a(obj2);
                            }
                        }
                    }
                }));
            }
            String str = action.u;
            synchronized (aymlVarE.b) {
                i2 = aymlVarE.c;
            }
            if (i2 == 8) {
                cvw cvwVar = a;
                synchronized (cvwVar) {
                    cvwVar.remove(str);
                }
            }
            i = i3;
        }
        cqce cqceVar = e;
        if (cqceVar.t(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            cqbd cqbdVarD = cqceVar.d();
            cqbdVarD.I("Operation-");
            cqbdVarD.v(action.u);
            cqbdVarD.v(": @");
            cqbdVarD.v(simpleDateFormat.format(new Date()));
            cqbdVarD.v("UTC.");
            cqbdVarD.A("oldMonitorState", f(i));
            cqbdVarD.A("newMonitorState", f(8));
            cqbdVarD.r();
        }
    }

    public static void d(Action action, int i, int i2) {
        String str = action.u;
        ayml aymlVarE = e(str);
        if (aymlVarE != null) {
            int i3 = aymlVarE.c;
            synchronized (aymlVarE.b) {
                if (i != 0) {
                    int i4 = aymlVarE.c;
                    if (i4 != i) {
                        throw new IllegalStateException("On updateState to " + i2 + " was " + f(i4) + ". expecting " + f(i));
                    }
                }
                if (i2 != aymlVarE.c) {
                    aymlVarE.c = i2;
                }
            }
            i2 = aymlVarE.c;
            i = i3;
        }
        cqce cqceVar = e;
        if (cqceVar.t(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            cqbd cqbdVarD = cqceVar.d();
            cqbdVarD.I("Operation-");
            cqbdVarD.v(str);
            cqbdVarD.v(": @");
            cqbdVarD.v(simpleDateFormat.format(new Date()));
            cqbdVarD.v("UTC.");
            cqbdVarD.A("oldMonitorState", f(i));
            cqbdVarD.A("newMonitorState", f(i2));
            cqbdVarD.r();
        }
    }

    private static ayml e(String str) {
        ayml aymlVar;
        cvw cvwVar = a;
        synchronized (cvwVar) {
            aymlVar = (ayml) cvwVar.get(str);
        }
        return aymlVar;
    }

    private static String f(int i) {
        switch (i) {
            case 0:
                return "STATE_UNDEFINED";
            case 1:
                return "STATE_CREATED";
            case 2:
                return "STATE_QUEUED";
            case 3:
                return "STATE_EXECUTING";
            case 4:
                return "STATE_BACKGROUND_ACTIONS_QUEUED";
            case 5:
                return "STATE_EXECUTING_BACKGROUND_ACTION";
            case 6:
                return "STATE_BACKGROUND_COMPLETION_QUEUED";
            case 7:
                return "STATE_PROCESSING_BACKGROUND_RESPONSE";
            default:
                return "STATE_COMPLETE";
        }
    }
}
