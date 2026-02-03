package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pro extends prp {
    private final Object a;
    private final String b;
    private final String c;
    private final prt d;
    private final int e;

    public pro(Object obj, String str, String str2, int i) {
        Collection collectionB;
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.e = i;
        prt prtVar = new prt(c(obj, str2));
        StackTraceElement[] stackTrace = prtVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int iF = fddu.f(length - 2, 0);
        if (iF < 0) {
            throw new IllegalArgumentException(a.e(iF, "Requested element count ", " is less than zero."));
        }
        if (iF == 0) {
            collectionB = fcvo.a;
        } else if (iF >= length) {
            collectionB = fcur.M(stackTrace);
        } else if (iF == 1) {
            collectionB = fcva.b(stackTrace[length - 1]);
        } else {
            ArrayList arrayList = new ArrayList(iF);
            for (int i2 = length - iF; i2 < length; i2++) {
                arrayList.add(stackTrace[i2]);
            }
            collectionB = arrayList;
        }
        prtVar.setStackTrace((StackTraceElement[]) collectionB.toArray(new StackTraceElement[0]));
        this.d = prtVar;
    }

    @Override // defpackage.prp
    public final Object b() throws prt {
        int i = this.e - 1;
        if (i == 0) {
            throw this.d;
        }
        if (i != 1) {
            return null;
        }
        Log.d(this.b, c(this.a, this.c));
        return null;
    }

    @Override // defpackage.prp
    public final prp a(String str, fdap fdapVar) {
        return this;
    }
}
