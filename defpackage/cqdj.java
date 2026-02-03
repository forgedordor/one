package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.cqdd;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class cqdj extends AsyncTask implements cqdd {
    public static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask");
    private final ejvr a;
    private final ejvr b;
    public final String g;
    public final long h;
    public final boolean i;
    public boolean j;

    public cqdj(String str) {
        this(str, e, false);
    }

    protected abstract Object a(Object... objArr);

    protected abstract void d(Object obj);

    @Override // android.os.AsyncTask
    protected final Object doInBackground(Object... objArr) {
        return this.a.apply(objArr);
    }

    public final void e(Object... objArr) {
        cqaz.g();
        this.j = true;
        try {
            Map map = f;
            synchronized (map) {
                map.put(this, Long.valueOf(System.currentTimeMillis()));
            }
            executeOnExecutor(cqda.a(), objArr);
        } catch (RejectedExecutionException e) {
            cqda.b(this, e);
            throw e;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
    }

    public final String toString() {
        String str = this.g;
        String string = super.toString();
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        return string + " (" + str + ")";
    }

    public cqdj(String str, byte[] bArr) {
        this(str, 2147483647L, false);
    }

    public cqdj(String str, long j, boolean z) {
        cqaz.g();
        this.g = str;
        this.h = j;
        this.i = z;
        this.a = eiid.a(new ejvr() { // from class: cqdg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqdb cqdbVarCE;
                cqdb cqdbVarCE2;
                cqdj cqdjVar = this.a;
                Object[] objArr = (Object[]) obj;
                cqaz.k(cqdjVar.j);
                if (cqdjVar.i) {
                    cqdq.a.postDelayed(new cqdi(cqdjVar), cqdjVar.h);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Object objA = cqdjVar.a(objArr);
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Map map = cqdj.f;
                    synchronized (map) {
                        map.remove(cqdjVar);
                    }
                    String str2 = cqdjVar.g;
                    if (str2 != null && str2.startsWith("Bugle.") && (cqdbVarCE2 = ((cqdd.a) cqtf.a(cqdd.a.class)).cE()) != null) {
                        cqdbVarCE2.h(str2, jElapsedRealtime2, cqdjVar.h);
                    }
                    if (jElapsedRealtime2 > cqdjVar.h) {
                        ekrw ekrwVarJ = cqdj.d.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask", "doInternal", 122, "SafeAsyncTask.java")).C("%s took %dms", cqdjVar, jElapsedRealtime2);
                    }
                    return objA;
                } catch (Throwable th) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Map map2 = cqdj.f;
                    synchronized (map2) {
                        map2.remove(cqdjVar);
                        String str3 = cqdjVar.g;
                        if (str3 != null && str3.startsWith("Bugle.") && (cqdbVarCE = ((cqdd.a) cqtf.a(cqdd.a.class)).cE()) != null) {
                            cqdbVarCE.h(str3, jElapsedRealtime3, cqdjVar.h);
                        }
                        if (jElapsedRealtime3 <= cqdjVar.h) {
                            throw th;
                        }
                        ekrw ekrwVarJ2 = cqdj.d.j();
                        ekrwVarJ2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask", "doInternal", 122, "SafeAsyncTask.java")).C("%s took %dms", cqdjVar, jElapsedRealtime3);
                        throw th;
                    }
                }
            }
        });
        this.b = eiid.a(new ejvr() { // from class: cqdh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.d(obj);
                return null;
            }
        });
    }
}
