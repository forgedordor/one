package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class efdd {
    public abstract efdf a();

    public abstract evqs b();

    public final String toString() {
        return String.format("ChatMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("content=%s", dhiz.MESSAGE_CONTENT.c(b())), String.format("contentType=%s", a()))));
    }
}
