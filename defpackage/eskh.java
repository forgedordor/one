package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eskh {
    private static WeakReference a;
    private final SharedPreferences b;
    private eskb c;
    private final Executor d;

    private eskh(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    public static synchronized eskh b(Context context, Executor executor) {
        WeakReference weakReference = a;
        eskh eskhVar = weakReference != null ? (eskh) weakReference.get() : null;
        if (eskhVar != null) {
            return eskhVar;
        }
        eskh eskhVar2 = new eskh(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        eskhVar2.d();
        a = new WeakReference(eskhVar2);
        return eskhVar2;
    }

    private final synchronized void d() {
        eskb eskbVar = new eskb(this.b, this.d);
        ArrayDeque arrayDeque = eskbVar.d;
        synchronized (arrayDeque) {
            arrayDeque.clear();
            String string = eskbVar.a.getString(eskbVar.b, "");
            if (!TextUtils.isEmpty(string)) {
                String str = eskbVar.c;
                if (string.contains(str)) {
                    String[] strArrSplit = string.split(str, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str2 : strArrSplit) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayDeque.add(str2);
                        }
                    }
                }
            }
        }
        this.c = eskbVar;
    }

    final synchronized eskg a() {
        String str;
        ArrayDeque arrayDeque = this.c.d;
        synchronized (arrayDeque) {
            str = (String) arrayDeque.peek();
        }
        int i = eskg.d;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                return new eskg(strArrSplit[0], strArrSplit[1]);
            }
        }
        return null;
    }

    final synchronized void c(eskg eskgVar) {
        final eskb eskbVar = this.c;
        ArrayDeque arrayDeque = eskbVar.d;
        String str = eskgVar.c;
        synchronized (arrayDeque) {
            if (arrayDeque.remove(str)) {
                eskbVar.e.execute(new Runnable() { // from class: eska
                    @Override // java.lang.Runnable
                    public final void run() {
                        eskb eskbVar2 = eskbVar;
                        ArrayDeque arrayDeque2 = eskbVar2.d;
                        synchronized (arrayDeque2) {
                            SharedPreferences.Editor editorEdit = eskbVar2.a.edit();
                            String str2 = eskbVar2.b;
                            StringBuilder sb = new StringBuilder();
                            Iterator it = arrayDeque2.iterator();
                            while (it.hasNext()) {
                                sb.append((String) it.next());
                                sb.append(eskbVar2.c);
                            }
                            editorEdit.putString(str2, sb.toString()).commit();
                        }
                    }
                });
            }
        }
    }
}
