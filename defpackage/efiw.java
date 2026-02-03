package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efiw {
    public abstract efiv a();

    public abstract RcsDestinationId b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final String toString() {
        String str = String.format("id=%s", f());
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        return String.format("FileMessage {%s}", TextUtils.join(",", Arrays.asList(str, String.format("sender=%s", dhizVar.c(b())), String.format("receiver=%s", dhizVar.c(d())), String.format("contents=%s", a()), String.format("sentTime=%s", e()), String.format("dispositionNotifications=%s", c()))));
    }
}
