package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqbz implements Closeable {
    protected cqbz() {
    }

    public static cqbz c(Context context, cqpz cqpzVar, String str, String str2) {
        return new cqby(context, cqpzVar.b("bugle_persistent_logsaver_rotation_set_size", 8), cqpzVar.b("bugle_persistent_logsaver_file_limit", 262144), str, str2);
    }

    public abstract void a(PrintWriter printWriter, cqcb cqcbVar);

    public abstract void b(int i, String str, String str2);
}
