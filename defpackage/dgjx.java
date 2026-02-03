package defpackage;

import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgjx {
    public static dgjw i() {
        dgjr dgjrVar = new dgjr();
        dgjrVar.d = "";
        dgjrVar.c("");
        dgjrVar.d("");
        dgjrVar.a = "";
        dgjrVar.b = "";
        dgjrVar.b("");
        dgjrVar.e = Optional.empty();
        String string = UUID.randomUUID().toString();
        if (string == null) {
            throw new NullPointerException("Null salt");
        }
        dgjrVar.c = string;
        return dgjrVar;
    }

    public static String j(String str, String str2) {
        return epic.a.c(String.valueOf(str).concat(str2), StandardCharsets.UTF_8).toString();
    }

    public abstract Optional a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();
}
