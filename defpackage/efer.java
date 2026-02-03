package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class efer {
    public abstract double a();

    public abstract double b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    public final String toString() {
        String str = String.format("id=%s", i());
        String str2 = String.format("timestamp=%s", h());
        dhiz dhizVar = dhiz.LOCATION;
        return String.format("LocationInformation {%s}", TextUtils.join(",", Arrays.asList(str, str2, String.format("label=%s", dhizVar.c(e())), String.format("location=%s", dhizVar.c(f())), String.format("longitude=%s", dhizVar.c(Double.valueOf(b()))), String.format("latitude=%s", dhizVar.c(Double.valueOf(a()))), String.format("radius=%s", dhizVar.c(g())), String.format("entity=%s", dhizVar.c(c())))));
    }
}
