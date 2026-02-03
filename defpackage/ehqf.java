package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.format.DateFormat;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqf extends ekuc implements ebcd {
    public final ehqr a;
    public final ehqi b;
    public final Context c;

    public ehqf(Context context, eosc eoscVar, ehqi ehqiVar) {
        super("FileLoggerBackend");
        this.c = context;
        this.b = ehqiVar;
        this.a = new ehqr(new ejxr() { // from class: ehqe
            @Override // defpackage.ejxr
            public final Object get() {
                ehqf ehqfVar = this.a;
                Context context2 = ehqfVar.c;
                ehqi ehqiVar2 = ehqfVar.b;
                return new File(context2.getDir(ehqiVar2.f(), 0), ehqiVar2.g());
            }
        }, ehqiVar.e(), ehqiVar.d(), new eoss(eoscVar));
    }

    @Override // defpackage.ebcd
    public final ListenableFuture a() {
        final ehqr ehqrVar = this.a;
        return eork.n(new eooy() { // from class: ehqn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ehqr.b();
                PrintWriter printWriter = ehqrVar.h;
                if (printWriter != null) {
                    printWriter.flush();
                }
                return eork.i(null);
            }
        }, ehqrVar.e);
    }

    @Override // defpackage.ekta
    public final void b(eksx eksxVar) throws IOException {
        ektv ektvVarG = ektv.g(ekty.f(), this.b.h() ? eksxVar.i() : ektd.a);
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
                final ehqr ehqrVar = this.a;
                String string = stringWriter.toString();
                int iMyPid = Process.myPid();
                int iMyTid = Process.myTid();
                if (string != null) {
                    final String str2 = String.format(Locale.US, "%s.%03d %d %d %s", DateFormat.format("MM-dd HH:mm:ss", millis), Long.valueOf(millis % 1000), Integer.valueOf(iMyPid), Integer.valueOf(iMyTid), string);
                    ehqrVar.e.execute(new Runnable() { // from class: ehqm
                        @Override // java.lang.Runnable
                        public final void run() {
                            ehqr.b();
                            ehqr ehqrVar2 = ehqrVar;
                            String str3 = str2;
                            try {
                                long length = str3.getBytes().length;
                                long j = ehqrVar2.f;
                                if (length > j) {
                                    Log.w(ehqr.a, "The message is too large to log internally.");
                                    return;
                                }
                                ehqr.b();
                                if (ehqrVar2.h == null) {
                                    File file = (File) ehqrVar2.d.get();
                                    if (file.exists() && file.length() + length >= j) {
                                        ehqrVar2.d();
                                    }
                                    ehqrVar2.c();
                                }
                                if (ehqrVar2.i.a + length >= j) {
                                    ehqrVar2.h.flush();
                                    eceh.a(ehqrVar2.h);
                                    ehqrVar2.h = null;
                                    ehqrVar2.d();
                                    ehqrVar2.c();
                                }
                                ehqrVar2.h.println(str3);
                            } catch (IOException e) {
                                Log.e(ehqr.a, "Unable to write to file log.", e);
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
        return this.b.i(level);
    }
}
