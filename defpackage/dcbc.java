package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbc {
    private static volatile dcbc a;
    private final Context b;
    private int d = 0;
    private final Queue c = new ArrayDeque();

    private dcbc(Context context) {
        this.b = context;
    }

    static dcbc c(Context context) {
        if (a == null) {
            synchronized (dcbc.class) {
                if (a == null) {
                    a = new dcbc(context);
                }
            }
        }
        return a;
    }

    final synchronized dcbb a() {
        return (dcbb) this.c.peek();
    }

    final synchronized dcbb b() {
        Queue queue = this.c;
        dcbb dcbbVar = (dcbb) queue.peek();
        if (dcbbVar != null) {
            int i = dcbbVar.c + 1;
            dcbbVar.c = i;
            if (i >= fbab.a.get().b(this.b)) {
                return (dcbb) queue.poll();
            }
        }
        return null;
    }

    final synchronized boolean d(LogEventParcelable logEventParcelable) {
        byte[] bArr = logEventParcelable.b;
        bArr.getClass();
        int length = bArr.length;
        Queue queue = this.c;
        long size = queue.size();
        fbab fbabVar = fbab.a;
        fbac fbacVar = fbabVar.get();
        Context context = this.b;
        if (size < fbacVar.c(context)) {
            if (this.d + length < fbabVar.get().a(context)) {
                this.d += length;
                queue.add(new dcbb(logEventParcelable));
                return true;
            }
        }
        return false;
    }

    final synchronized void e() {
        dcbb dcbbVar = (dcbb) this.c.poll();
        if (dcbbVar != null) {
            byte[] bArr = dcbbVar.a.b;
            bArr.getClass();
            this.d -= bArr.length;
        }
    }
}
