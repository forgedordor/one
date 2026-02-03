package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qbx {
    public abstract qaq a(Context context, String str, WorkerParameters workerParameters);

    public final qaq b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        qaq qaqVarA = a(context, str, workerParameters);
        if (qaqVarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(qaq.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    qaqVarA = (qaq) objNewInstance;
                } catch (Throwable th) {
                    String strConcat = "Could not instantiate ".concat(str);
                    qas.c();
                    Log.e(qby.a, strConcat, th);
                    throw th;
                }
            } catch (Throwable th2) {
                String strConcat2 = "Invalid class: ".concat(str);
                qas.c();
                Log.e(qby.a, strConcat2, th2);
                throw th2;
            }
        }
        if (!qaqVarA.d) {
            return qaqVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
