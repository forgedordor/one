package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcqn {
    public final List a = new ArrayList();
    private final Context b;

    public dcqn(Context context) {
        this.b = context;
    }

    public static void f(File file, File file2) throws dcqm {
        if (file.renameTo(file2)) {
            return;
        }
        throw new dcqm("Failed to rename " + file.toString() + " -> " + file2.toString() + ".");
    }

    public static final void g(dcqo dcqoVar) {
        dcrc.a(dcqoVar.d());
    }

    public static final void h(dcqo dcqoVar) throws dcqm {
        File file = ((dcqk) dcqoVar).c;
        try {
            if (!file.exists() && !file.createNewFile()) {
                throw new dcqm(a.b(dcqoVar, "Failed to touch last-used file for ", "."));
            }
            if (!file.setLastModified(System.currentTimeMillis())) {
                throw new dcqm(a.b(dcqoVar, "Failed to update last-used timestamp for ", "."));
            }
        } catch (IOException e) {
            throw new dcqm(a.c(e, dcqoVar, "Failed to touch last-used file for ", ": "), e);
        }
    }

    public final dcqo a() {
        return b("tmp_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public final dcqo b(String str) {
        ddlm ddlmVar = ddlk.a;
        File file = new File(ddll.a(d(), str));
        ddlm ddlmVar2 = ddlk.a;
        File file2 = new File(ddll.a(file, "the.apk"));
        ddlm ddlmVar3 = ddlk.a;
        File file3 = new File(ddll.a(file, "opt"));
        ddlm ddlmVar4 = ddlk.a;
        return new dcqk(file2, file3, new File(ddll.a(file, "t")));
    }

    public final dcqo c(dcqu dcquVar) throws dcqm {
        dcqo dcqoVarB = b(((dcql) dcquVar).a);
        if (!dcqoVarB.e()) {
            return null;
        }
        h(dcqoVarB);
        return dcqoVarB;
    }

    public final File d() {
        return this.b.getDir("dg_cache", 0);
    }

    public final void e() {
        List<File> list = this.a;
        for (File file : list) {
            if (!dcrc.a(file)) {
                Log.e("DG", a.I(file, "Failed to clean up temporary file ", "."));
            }
        }
        list.clear();
    }
}
