package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezy {
    public final String a;
    public final String b;
    public final dfah c;

    public dezy(String str, String str2, dfah dfahVar) {
        this.a = str;
        this.b = str2;
        this.c = dfahVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dezy)) {
            return false;
        }
        dezy dezyVar = (dezy) obj;
        return TextUtils.equals(this.a, dezyVar.a) && TextUtils.equals(this.b, dezyVar.b) && this.c.equals(dezyVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "Display text: " + this.a + ", web page: " + this.b + ", uris: " + this.c.toString();
    }
}
