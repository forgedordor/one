package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class efev {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        String str = String.format("namespace=%s", b());
        dhiz dhizVar = dhiz.GENERIC;
        return String.format("MessageExtensionHeader {%s}", TextUtils.join(",", Arrays.asList(str, String.format("name=%s", dhizVar.c(a())), String.format("value=%s", dhizVar.c(c())))));
    }
}
