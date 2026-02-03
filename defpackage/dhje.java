package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhje extends dhjh {
    public FileHandler a;
    private final int b;
    private final int c;
    private final String d;
    private Logger e;
    private final ExecutorService f = Executors.newSingleThreadExecutor();
    private Context g;

    public dhje(Context context, int i, int i2) throws SecurityException {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.g = context;
        if (i <= 0) {
            dhja.u("setSize <= 0", new Object[0]);
        }
        if (i2 <= 0) {
            dhja.u("fileLimitBytes <= 0", new Object[0]);
        }
        if (TextUtils.isEmpty("carrier_services")) {
            dhja.u("fileNamePrefix is empty", new Object[0]);
        }
        this.b = i;
        this.c = i2;
        this.d = "carrier_services";
        Logger logger = Logger.getLogger("LogSaver");
        this.e = logger;
        if (logger == null) {
            dhja.u("logger is null", new Object[0]);
        }
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        this.e.setUseParentHandlers(false);
        try {
            this.a = new FileHandler(String.valueOf(this.g.getDir("logs", 0)) + "/" + this.d + "%g.log", this.c, this.b, true);
            this.a.setFormatter(new dhjd());
            this.a.setLevel(Level.ALL);
            Logger logger2 = this.e;
            logger2.getClass();
            logger2.addHandler(this.a);
        } catch (Exception e) {
            Log.e("LogSaver", "LogSaver: fail to init disk logger", e);
        }
    }

    @Override // defpackage.dhjh
    public final void a(PrintWriter printWriter) throws Throwable {
        File file;
        int i = this.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            String str = String.valueOf(this.g.getDir("logs", 0)) + "/carrier_services" + i + ".log";
            BufferedReader bufferedReader = null;
            try {
                try {
                    file = new File(str);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException unused) {
            } catch (IOException e) {
                e = e;
            }
            if (file.exists()) {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        } else {
                            printWriter.println(line.trim());
                        }
                    } catch (FileNotFoundException unused2) {
                        bufferedReader = bufferedReader2;
                        Log.w("LogSaver", a.v(str, "LogSaver: can not find log file "));
                        dhji.a(bufferedReader);
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        Log.w("LogSaver", "LogSaver: can not read log file", e);
                        dhji.a(bufferedReader);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        dhji.a(bufferedReader);
                        throw th;
                    }
                }
                dhji.a(bufferedReader2);
            } else {
                dhji.a(bufferedReader);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = new Runnable() { // from class: dhjc
            @Override // java.lang.Runnable
            public final void run() throws SecurityException {
                FileHandler fileHandler = this.a.a;
                if (fileHandler != null) {
                    fileHandler.close();
                }
            }
        };
        ExecutorService executorService = this.f;
        executorService.execute(runnable);
        executorService.shutdown();
    }
}
