package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cphv {
    private final cpch a;
    private final cogv b;
    private final fcsu c;
    private final cogt d;

    public cphv(cpch cpchVar, cogv cogvVar, fcsu fcsuVar, cogt cogtVar) {
        cpchVar.getClass();
        cogvVar.getClass();
        fcsuVar.getClass();
        cogtVar.getClass();
        this.a = cpchVar;
        this.b = cogvVar;
        this.c = fcsuVar;
        this.d = cogtVar;
    }

    public final String a(boolean z) {
        String string;
        cogv cogvVar = this.b;
        string = "";
        if (!cogvVar.b()) {
            if (((aqis) this.c.b()).a()) {
                return z ? "night" : "day";
            }
            LocalDate localDateNow = LocalDate.now(ZoneId.systemDefault());
            string = true == z ? "-night" : "";
            Objects.toString(localDateNow);
            return String.valueOf(localDateNow).concat(string);
        }
        cogt cogtVar = this.d;
        fcsu fcsuVar = this.c;
        Context contextA = cogtVar.a();
        if (!((aqis) fcsuVar.b()).a()) {
            string = LocalDate.now(ZoneId.systemDefault()).toString();
            string.getClass();
        }
        return string + cogvVar.a().name() + eehg.d(contextA, R.attr.colorSurface, "AvatarKeyGenerator");
    }
}
