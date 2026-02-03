package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class efeu {
    public abstract efes a();

    public abstract effi b();

    public abstract ekgb c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final String toString() {
        String str = String.format("id=%s", f());
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        return String.format("Message {%s}", TextUtils.join(",", Arrays.asList(str, String.format("sender=%s", dhizVar.c(b())), String.format("contents=%s", dhiz.MESSAGE_CONTENT.c(a())), String.format("sentTime=%s", e()), String.format("receiver=%s", dhizVar.c(d())), String.format("extensionHeaders=%s", c()))));
    }
}
