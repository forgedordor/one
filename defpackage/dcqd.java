package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcqd implements dcpo {
    public final dcqg a;
    public volatile IDroidGuardHandle b;
    public dcqw c;
    public volatile byte[] d;
    private final Context e;
    private final long f;
    private final dcrf g;

    public dcqd(Context context, dcqg dcqgVar, IDroidGuardHandle iDroidGuardHandle, dcqw dcqwVar, long j, dcrf dcrfVar) {
        this.e = context;
        this.a = dcqgVar;
        this.b = iDroidGuardHandle;
        this.c = dcqwVar;
        this.f = j;
        this.g = dcrfVar;
    }

    @Override // defpackage.dcpo
    public final String a(final Map map) {
        byte[] bArrC;
        dcrf dcrfVarA = this.g.clone();
        dcrfVarA.c(14, dcre.COARSE);
        if (this.d != null) {
            bArrC = this.d;
        } else {
            final dcqy dcqyVar = new dcqy();
            this.a.d(new Runnable() { // from class: dcqa
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArrSnapshot;
                    dcqd dcqdVar = this.a;
                    try {
                        bArrSnapshot = dcqdVar.b != null ? dcqdVar.b.snapshot(map) : null;
                        if (bArrSnapshot == null) {
                            dcqdVar.d = dcrd.b("Received null");
                            bArrSnapshot = dcqdVar.d;
                        }
                    } catch (Exception e) {
                        dcqdVar.d = dcrd.c("Snapshot failed: ".concat(e.toString()), e);
                        bArrSnapshot = dcqdVar.d;
                        dcqdVar.close();
                    }
                    dcqyVar.b(bArrSnapshot);
                }
            });
            try {
                long j = this.f;
                bArrC = (byte[]) dcqyVar.a(j);
                if (bArrC == null) {
                    bArrC = dcrd.b(a.A(j, "Snapshot timeout: ", " ms"));
                }
            } catch (InterruptedException e) {
                bArrC = dcrd.c("Results transfer failed: ".concat(e.toString()), e);
            }
        }
        dcrfVarA.c(15, dcre.COARSE);
        return dcrd.a(dcrb.b(dcrb.a(this.e, bArrC, dcrfVarA.b())));
    }

    @Override // defpackage.dcpo
    public final void b(final Map map) {
        if (fbaz.a.get().a()) {
            this.a.d(new Runnable() { // from class: dcqb
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, dcqt, InvocationTargetException {
                    Map map2 = map;
                    dcqw dcqwVar = this.a.c;
                    if (dcqwVar == null) {
                        return;
                    }
                    try {
                        Object obj = dcqwVar.a;
                        obj.getClass().getDeclaredMethod("he2", Map.class).invoke(obj, map2);
                    } catch (Exception e) {
                        try {
                            throw new dcqt(e);
                        } catch (dcqt unused) {
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.dcpo
    public final boolean c() {
        return this.b != null && this.d == null && this.b.asBinder().pingBinder();
    }

    @Override // defpackage.dcpo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(new Runnable() { // from class: dcqc
            @Override // java.lang.Runnable
            public final void run() {
                dcqd dcqdVar = this.a;
                if (dcqdVar.b == null) {
                    return;
                }
                try {
                    dcqdVar.b.close();
                } catch (Exception unused) {
                    Log.e("DGHandleImpl", "Error while closing handle.");
                }
                dcqdVar.c = null;
                dcqdVar.b = null;
                r0.a--;
                dcqdVar.a.c();
            }
        });
    }

    public dcqd(Context context, dcqg dcqgVar, String str, dcrf dcrfVar) {
        this.e = context;
        this.a = dcqgVar;
        this.g = dcrfVar;
        this.d = dcrd.b(str);
        this.f = 0L;
    }

    public dcqd(Context context, dcqg dcqgVar, String str, dcrf dcrfVar, Throwable th) {
        this.e = context;
        this.a = dcqgVar;
        this.g = dcrfVar;
        this.d = dcrd.c(str, th);
        this.f = 0L;
    }
}
