package defpackage;

import j$.util.Optional;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfoc {
    public static final Optional c = Optional.empty();
    private final String a;
    public final dzzf d;

    protected dfoc(String str) {
        this.a = str;
        this.d = new dzzf(dzyc.a("com.google.android.ims.library")).d(str).c().a();
    }

    public static void m() {
        dfnr.c();
        dfog.u();
        dfoi.c();
        dfok.c();
        dfom.c();
        dfoq.d();
        dfos.c();
        dfou.c();
        dfow.c();
        dfoy.c();
        dfpa.a();
        dfpc.c();
        dfpe.d();
        dfpg.c();
        dfpi.y();
        dfpk.d();
        dfpo.s();
        dfpq.c();
        dfps.d();
        dfpm.c();
        dfod.d();
        dfoo.c();
    }

    protected abstract ekgb b();

    protected final dfoa e(String str, double d) {
        return new dfoa(this.d.e(str, d));
    }

    protected final dfoa f(String str, int i) {
        return new dfoa(this.d.f(str, i));
    }

    protected final dfoa g(String str, long j) {
        return new dfoa(this.d.g(str, j));
    }

    protected final dfoa h(String str, String str2) {
        return new dfoa(this.d.h(str, str2));
    }

    public final dfoa i(String str, boolean z) {
        return new dfoa(this.d.i(str, z));
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        ekgb ekgbVarB = b();
        int size = ekgbVarB.size();
        for (int i = 0; i < size; i++) {
            dfny dfnyVar = (dfny) ekgbVarB.get(i);
            sb.append(System.lineSeparator());
            sb.append(dfnyVar.b());
            sb.append("=");
            sb.append(dfnyVar.a());
        }
        return sb.toString();
    }

    public final void k(PrintWriter printWriter) {
        ekgb ekgbVarB = b();
        int size = ekgbVarB.size();
        for (int i = 0; i < size; i++) {
            printWriter.println((dfny) ekgbVarB.get(i));
        }
    }

    protected final void l() {
        if (dhja.v()) {
            StringBuilder sb = new StringBuilder("<<< ");
            sb.append(this.a);
            sb.append("com.google.android.ims.library >>>");
            ekgb ekgbVarB = b();
            int size = ekgbVarB.size();
            for (int i = 0; i < size; i++) {
                dfny dfnyVar = (dfny) ekgbVarB.get(i);
                sb.append(System.lineSeparator());
                sb.append(dfnyVar);
            }
            dhja.c("%s", sb.toString());
        }
    }
}
