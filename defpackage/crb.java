package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crb implements AutoCloseable {
    public final ArrayDeque a;
    private String[] b;

    private crb(Object obj, String str, ArrayDeque arrayDeque) {
        this.a = arrayDeque;
        if (obj != null) {
            cra craVar = new cra(obj, str);
            arrayDeque.addFirst(craVar);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int size = arrayDeque.size();
                int i = 11;
                int iMin = Math.min(size, 11);
                if (this.b == null) {
                    this.b = new String[12];
                }
                String strConcat = this.b[iMin];
                if (strConcat == null) {
                    char[] cArr = new char[iMin];
                    Arrays.fill(cArr, ' ');
                    String str2 = new String(cArr);
                    if (iMin == 11) {
                        strConcat = str2.concat("...");
                    } else {
                        i = iMin;
                        strConcat = str2;
                    }
                    this.b[i] = strConcat;
                }
                Log.v("CarApp.Bun", strConcat.concat(crd.e(craVar.a.getClass()) + " " + craVar.b));
            }
        }
    }

    static crb a() {
        return new crb(null, "", new ArrayDeque());
    }

    static crb b(Object obj, String str, crb crbVar) {
        return new crb(obj, str, crbVar.a);
    }

    final String c() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.a;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((cra) itDescendingIterator.next()).a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.removeFirst();
    }
}
