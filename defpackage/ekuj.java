package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import android.text.format.DateFormat;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekuj extends ekuc {
    public final Context a;
    private final ekuq b;

    public ekuj(Context context, eosc eoscVar, ahzw ahzwVar) {
        super("FileLoggerBackend");
        this.a = context;
        ejxr ejxrVar = new ejxr() { // from class: ekui
            @Override // defpackage.ejxr
            public final Object get() {
                return new File(this.a.a.getDir("logs", 0), "bugle_restore_logs.txt");
            }
        };
        int i = (int) ahzwVar.a;
        this.b = new ekuq(ejxrVar, i * 1048576, new eoss(eoscVar));
    }

    @Override // defpackage.ekta
    public final void b(eksx eksxVar) throws IOException {
        ektv ektvVarG = ektv.g(ekty.f(), eksxVar.i());
        ekte ekteVarI = eksxVar.i();
        ekrz ekrzVar = eksq.a;
        String strL = (String) ekteVarI.d(ekrzVar);
        int iIntValue = eksxVar.m().intValue();
        String str = iIntValue >= 1000 ? "E " : iIntValue >= 900 ? "W " : iIntValue >= 800 ? "I " : "D ";
        if (strL == null) {
            strL = eksxVar.l();
        }
        String strA = ekua.a(ekrzVar).a(eksxVar, ektvVarG);
        Throwable th = (Throwable) eksxVar.i().d(ekrl.a);
        long millis = TimeUnit.NANOSECONDS.toMillis(eksxVar.d());
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                stringWriter.append((CharSequence) str).append((CharSequence) strL).append((CharSequence) ": ").append((CharSequence) strA);
                if (th != null) {
                    stringWriter.append((CharSequence) " ").append((CharSequence) th.toString());
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        th.printStackTrace(printWriter);
                        printWriter.close();
                    } finally {
                    }
                }
                final ekuq ekuqVar = this.b;
                String string = stringWriter.toString();
                int iMyPid = Process.myPid();
                int iMyTid = Process.myTid();
                if (string != null) {
                    final String str2 = String.format(Locale.US, "%s.%03d %d %d %s", DateFormat.format("MM-dd HH:mm:ss", millis), Long.valueOf(millis % 1000), Integer.valueOf(iMyPid), Integer.valueOf(iMyTid), string);
                    ekuqVar.d.execute(new Runnable() { // from class: ekup
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekuq.c();
                            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
                            ekuq ekuqVar2 = ekuqVar;
                            String str3 = str2;
                            try {
                                try {
                                    long length = str3.getBytes().length;
                                    long j = ekuqVar2.e;
                                    if (length <= j) {
                                        ekuq.c();
                                        File file = (File) ekuqVar2.c.get();
                                        if (ekuqVar2.f == null) {
                                            if (file.exists() && file.length() + length >= j) {
                                                ekuqVar2.d();
                                            }
                                            ekuqVar2.f = ekuqVar2.b();
                                        }
                                        if (file.length() + length >= j) {
                                            PrintWriter printWriter2 = ekuqVar2.f;
                                            if (printWriter2 != null) {
                                                try {
                                                    printWriter2.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            ekuqVar2.d();
                                            ekuqVar2.f = ekuqVar2.b();
                                        }
                                        ekuqVar2.f.println(str3);
                                        ekuqVar2.f.flush();
                                    } else {
                                        Log.w(ekuq.a, "The message is too large to log internally.");
                                    }
                                } finally {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                }
                            } catch (IOException e) {
                                Log.e(ekuq.a, "Unable to write to file log.", e);
                            }
                        }
                    });
                }
                stringWriter.close();
            } finally {
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ekta
    public final boolean c(Level level) {
        return true;
    }
}
