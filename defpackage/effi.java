package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class effi {
    public static effi c(String str) {
        if (str.startsWith("sip:")) {
            efcn efcnVar = new efcn();
            efcnVar.b(str);
            efcnVar.c(2);
            return efcnVar.a();
        }
        if (!str.startsWith("tel:")) {
            throw new IllegalArgumentException("URI format not supported");
        }
        efcn efcnVar2 = new efcn();
        efcnVar2.b(str.substring(4));
        efcnVar2.c(1);
        return efcnVar2.a();
    }

    public abstract String a();

    public abstract int b();

    public final String toString() {
        return String.format("RcsDestinationId {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dhiz.PHONE_NUMBER.c(a())), String.format("type=%s", b() != 1 ? "SIP_URI" : "PHONE"))));
    }
}
