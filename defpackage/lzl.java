package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzl extends lzg {
    public final lzk a;
    private final lvj b;

    public lzl(lvj lvjVar, lxp lxpVar) {
        this.b = lvjVar;
        this.a = (lzk) new lxo(lxpVar, lzk.a).a(lzk.class);
    }

    public static boolean e(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Override // defpackage.lzg
    public final void b(int i) {
        lzk lzkVar = this.a;
        if (lzkVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (e(2)) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        lzh lzhVarA = lzkVar.a(i);
        if (lzhVarA != null) {
            lzhVarA.c();
            cvx cvxVar = lzkVar.b;
            int iA = cwe.a(cvxVar.b, cvxVar.d, i);
            if (iA >= 0) {
                Object[] objArr = cvxVar.c;
                Object obj = objArr[iA];
                Object obj2 = cvy.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    cvxVar.a = true;
                }
            }
        }
    }

    @Override // defpackage.lzg
    public final void c(int i, Bundle bundle, lzf lzfVar) {
        lzk lzkVar = this.a;
        if (lzkVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        lzh lzhVarA = lzkVar.a(i);
        if (e(2)) {
            Log.v("LoaderManager", a.i(bundle, this, "initLoader in ", ": args="));
        }
        if (lzhVarA != null) {
            if (e(3)) {
                Objects.toString(lzhVarA);
                Log.d("LoaderManager", "  Re-using existing loader ".concat(lzhVarA.toString()));
            }
            lzhVarA.p(this.b, lzfVar);
            return;
        }
        try {
            lzkVar.c = true;
            lzp lzpVarA = lzfVar.a(i, bundle);
            if (lzpVarA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (lzpVarA.getClass().isMemberClass() && !Modifier.isStatic(lzpVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException(a.l(lzpVarA, "Object returned from onCreateLoader must not be a non-static inner member class: "));
            }
            lzh lzhVar = new lzh(i, bundle, lzpVarA);
            if (e(3)) {
                Log.d("LoaderManager", a.l(lzhVar, "  Created new loader "));
            }
            lzkVar.b.f(i, lzhVar);
            lzkVar.b();
            lzhVar.p(this.b, lzfVar);
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
    }

    @Override // defpackage.lzg
    @Deprecated
    public final void d(String str, PrintWriter printWriter) {
        cvx cvxVar = this.a.b;
        if (cvxVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < cvxVar.c(); i++) {
                String strConcat = str.concat("    ");
                lzh lzhVar = (lzh) cvxVar.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cvxVar.b(i));
                printWriter.print(": ");
                printWriter.println(lzhVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(lzhVar.a);
                printWriter.print(" mArgs=");
                printWriter.println(lzhVar.h);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                lzp lzpVar = lzhVar.i;
                printWriter.println(lzpVar);
                lzpVar.g(strConcat.concat("  "), printWriter);
                if (lzhVar.j != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(lzhVar.j);
                    lzi lziVar = lzhVar.j;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(lziVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                printWriter.println(lzp.r(lzhVar.a()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(lzhVar.n());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        lvj lvjVar = this.b;
        sb.append(lvjVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(lvjVar)));
        sb.append("}}");
        return sb.toString();
    }
}
