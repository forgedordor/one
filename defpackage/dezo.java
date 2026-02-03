package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezo {
    public String a;
    public String b;
    public final dfab c;
    public final String d;

    public dezo(String str, String str2, String str3, dfab dfabVar) {
        this.a = "";
        this.b = "";
        dfab dfabVar2 = dfab.RECV_ONLY;
        this.d = str;
        this.b = str2;
        this.a = str3;
        this.c = dfabVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dezo)) {
            return false;
        }
        dezo dezoVar = (dezo) obj;
        return this.c == dezoVar.c && TextUtils.equals(this.a, dezoVar.a) && TextUtils.equals(this.d, dezoVar.d) && TextUtils.equals(this.b, dezoVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.d, this.b});
    }

    public final String toString() {
        return "Label: " + this.d + ", display text: " + this.a + ", type: " + this.b + ", status: " + String.valueOf(this.c);
    }
}
