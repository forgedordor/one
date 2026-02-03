package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcpx {
    public final Context a;
    public final dcpo b;
    public final Handler c;
    public final Map d;
    public final DroidGuardResultsRequest e;
    public final dcqg f;
    public final dcrf g;
    public final csrg h;
    private boolean i = false;

    public dcpx(Context context, dcpo dcpoVar, Handler handler, Map map, DroidGuardResultsRequest droidGuardResultsRequest, dcrf dcrfVar, dcqg dcqgVar, csrg csrgVar) {
        this.a = context;
        this.b = dcpoVar;
        this.c = handler;
        this.d = map;
        this.e = droidGuardResultsRequest;
        this.g = dcrfVar;
        this.f = dcqgVar;
        this.h = csrgVar;
    }

    final void a(final String str) {
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            try {
                this.c.post(new Runnable() { // from class: dcpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h.a(str);
                    }
                });
            } catch (RuntimeException unused) {
            }
        }
    }
}
