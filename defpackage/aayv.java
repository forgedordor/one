package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayv implements abag {
    private static final cqce a = cqce.f("BugleDiagnostics", abag.class);
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
    private final Context c;
    private final cqpz d;
    private final cogw e;
    private cqbz f;
    private String g;

    public aayv(Context context, cqpz cqpzVar, cogw cogwVar) {
        this.c = context;
        this.d = cqpzVar;
        this.e = cogwVar;
    }

    @Override // defpackage.abag
    public final Uri a() {
        String str = this.g;
        if (str == null) {
            a.p("no recent diagnostics logs");
            return null;
        }
        File fileE = cbpu.e(this.c, str);
        if (!fileE.exists()) {
            try {
                PrintWriter printWriter = new PrintWriter(fileE);
                try {
                    this.f.a(printWriter, cqcb.DIAGNOSTICS);
                    printWriter.close();
                } finally {
                }
            } catch (FileNotFoundException e) {
                a.o("destination file not found", e);
                return null;
            }
        }
        return cbpu.d(this.c, this.g);
    }

    @Override // defpackage.abag
    public final cqbz b() {
        return this.f;
    }

    @Override // defpackage.abag
    public final void c() {
        String strConcat = "AMDiagnostics".concat(String.valueOf(this.b.format(Long.valueOf(this.e.f().toEpochMilli()))));
        this.g = strConcat;
        this.f = cqbz.c(this.c, this.d, strConcat, "BugleDiagnostics");
    }

    @Override // defpackage.abag
    public final boolean d() {
        return this.g != null;
    }
}
