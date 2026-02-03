package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajft {
    private final cvw a = new cvw();
    private final cvw b = new cvw();
    private final fcsu c;
    private final fcsu d;

    public ajft(fcsu fcsuVar, fcsu fcsuVar2) {
        new cvw();
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    private static int e(long j) {
        int i = (int) j;
        return i >= 0 ? i : Alert.DURATION_SHOW_INDEFINITELY;
    }

    private final cvw f(int i) {
        return i != 0 ? this.b : this.a;
    }

    public final void a(int i, Uri uri, int i2) {
        if (uri != null) {
            fcsu fcsuVar = this.d;
            String string = uri.toString();
            if (!((ajfv) fcsuVar.b()).b() || TextUtils.isEmpty(string)) {
                return;
            }
            cvw cvwVarF = f(i);
            synchronized (cvwVarF) {
                if (cvwVarF.containsKey(string)) {
                    dzrm dzrmVar = (dzrm) cvwVarF.get(string);
                    if (dzrmVar == null) {
                        return;
                    }
                    if (i2 >= 0) {
                        dzrmVar.j = i2;
                    }
                    ((ajfo) this.c.b()).c(dzrmVar);
                    cvwVarF.remove(string);
                }
            }
        }
    }

    public final void b(int i, Uri uri, long j, long j2, String str) {
        if (uri != null) {
            fcsu fcsuVar = this.d;
            String string = uri.toString();
            if (!((ajfv) fcsuVar.b()).b() || TextUtils.isEmpty(string)) {
                return;
            }
            cvw cvwVarF = f(i);
            synchronized (cvwVarF) {
                if (cvwVarF.containsKey(string)) {
                    dzrm dzrmVar = (dzrm) cvwVarF.get(string);
                    if (dzrmVar == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        dzrmVar.c(str);
                    }
                    dzrmVar.b(e(j), e(j2));
                    ((ajfo) this.c.b()).c(dzrmVar);
                    cvwVarF.remove(string);
                }
            }
        }
    }

    public final void c(int i, Uri uri) {
        if (((ajfv) this.d.b()).a()) {
            cvw cvwVarF = f(i);
            synchronized (cvwVarF) {
                String string = uri.toString();
                cvwVarF.put(string, new dzrm(string));
            }
        }
    }

    public final void d(Uri uri) {
        if (uri != null) {
            String string = uri.toString();
            cvw cvwVarF = f(1);
            synchronized (cvwVarF) {
                if (cvwVarF.containsKey(string)) {
                    cvwVarF.remove(string);
                }
            }
        }
    }
}
