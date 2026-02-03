package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class comx {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final eosc c;
    public final Context d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public comx(fcsu fcsuVar, eosc eoscVar, Context context) {
        this.b = fcsuVar;
        this.c = eoscVar;
        this.d = context;
    }

    public final void a(String str, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.close();
        this.e.remove(str);
    }
}
