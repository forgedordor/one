package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmi extends Exception {
    public final ekgb a;

    private dtmi(String str, Throwable th, ekgb ekgbVar) {
        super(str, th);
        this.a = ekgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dtmi a(ekgb ekgbVar, String str, Object... objArr) {
        String strConcat = String.format(Locale.US, str, objArr);
        int i = ((ekoe) ekgbVar).c;
        if (i > 1) {
            String str2 = strConcat + "\n" + i + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        printWriter.println(str2);
                        int i2 = 0;
                        while (i2 < i) {
                            Throwable th = (Throwable) ekgbVar.get(i2);
                            i2++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                            printWriter.println(f(th, 1));
                        }
                        printWriter.println("-------------------------------------------");
                        strConcat = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                strConcat = "Failed to build string from throwables: ".concat(th2.toString());
            }
        }
        return new dtmi(strConcat, (Throwable) ekgbVar.get(0), ekgbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture b(Collection collection, String str, Object... objArr) {
        try {
            d(collection, str, objArr);
            return eorv.a;
        } catch (dtmi e) {
            ekgb ekgbVar = e.a;
            return ((ekoe) ekgbVar).c == 1 ? eork.h((Throwable) ekgbVar.get(0)) : eork.h(e);
        }
    }

    static Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? c(cause) : th;
    }

    public static void d(Collection collection, String str, Object... objArr) throws dtmi {
        e(collection, ejud.a, str, objArr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eora, java.lang.Object] */
    public static void e(Collection collection, ejwi ejwiVar, String str, Object... objArr) throws dtmi {
        Iterator it = collection.iterator();
        ekfw ekfwVar = null;
        while (it.hasNext()) {
            try {
                Object objQ = eork.q((ListenableFuture) it.next());
                if (ejwiVar.g()) {
                    ejwiVar.c();
                }
            } catch (CancellationException | ExecutionException e) {
                if (ekfwVar == null) {
                    int i = ekgb.d;
                    ekfwVar = new ekfw();
                }
                Throwable thC = c(e);
                ekfwVar.h(thC);
                if (ejwiVar.g()) {
                    ejwiVar.c().hi(thC);
                }
            }
        }
        if (ekfwVar != null) {
            throw a(ekfwVar.g(), str, objArr);
        }
    }

    private static String f(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + f(cause, i + 1);
    }
}
