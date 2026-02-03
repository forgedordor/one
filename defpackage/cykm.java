package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykm implements caxw {
    public int a = 0;
    private final Context b;
    private final cyfv c;
    private final Consumer d;
    private final BufferedWriter e;
    private final String f;

    public cykm(cogw cogwVar, Context context, cyfv cyfvVar, Consumer consumer) {
        this.b = context;
        this.c = cyfvVar;
        this.d = consumer;
        String str = "pwq_state_" + cogwVar.f().toEpochMilli() + ".log";
        this.f = str;
        this.e = new BufferedWriter(new FileWriter(cbpu.e(context, str)));
    }

    @Override // defpackage.caxw
    public final caxv a() {
        this.a += 3;
        return new caxv() { // from class: cykl
            @Override // defpackage.caxv, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cykm cykmVar = this.a;
                cykmVar.a -= 3;
            }
        };
    }

    @Override // defpackage.caxw
    public final void b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = this.a; i > 0; i--) {
            sb.append(' ');
        }
        try {
            this.e.write(sb.toString() + str + "\n");
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.caxw
    public final void c() {
        try {
            this.e.close();
            Activity activity = this.c.a;
            Context context = this.b;
            kxc kxcVar = new kxc(context);
            kxcVar.c("Share pwq state log");
            kxcVar.d("application/text");
            kxcVar.b(cbpu.d(context, this.f));
            Intent intentA = kxcVar.a();
            intentA.setFlags(1);
            eiid.o(activity, intentA);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    @Override // defpackage.caxw
    public final void d(String str) {
        this.d.z(str);
    }
}
