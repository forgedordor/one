package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhhx {
    private final Context a;
    private final dhes b;

    public dhhx(Context context, dhes dhesVar) {
        this.a = context;
        this.b = dhesVar;
    }

    private static String c(String str) {
        return str == null ? "" : str.replace(' ', '_');
    }

    public final String a() {
        if (!craf.d) {
            return "";
        }
        dhes dhesVar = this.b;
        cmmh cmmhVarD = dhesVar.d();
        StringBuilder sb = new StringBuilder(cmmhVarD == null ? (String) dhesVar.i.d() : cmmhVarD.i);
        sb.append(" ");
        sb.append(c(Build.ID));
        sb.append(" ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        sb.append(simpleDateFormat.format(DesugarDate.from(Instant.now())));
        sb.append(" Android ");
        sb.append(c(Build.VERSION.RELEASE_OR_CODENAME));
        sb.append(" ");
        sb.append(c(Build.DEVICE));
        sb.append(" 3gpp-gba");
        return sb.toString();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder("IM-client/OMA1.0 ");
        sb.append(c(Build.MANUFACTURER));
        sb.append("/");
        sb.append(c(Build.MODEL));
        sb.append("-");
        sb.append(c(Build.VERSION.RELEASE));
        sb.append(" ");
        sb.append(c("Goog"));
        sb.append("/");
        Context context = this.a;
        sb.append(c(dhla.e(context, dhla.a(context), 2)));
        return sb.toString();
    }
}
