package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfaa {
    public final String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public dfab f = dfab.NONE;

    public dfaa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfaa)) {
            return false;
        }
        dfaa dfaaVar = (dfaa) obj;
        return this.f == dfaaVar.f && TextUtils.equals(this.a, dfaaVar.a) && TextUtils.equals(this.e, dfaaVar.e) && TextUtils.equals(this.c, dfaaVar.c) && TextUtils.equals(this.d, dfaaVar.d) && TextUtils.equals(this.b, dfaaVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.a, this.e, this.c, this.d, this.b});
    }

    public final String toString() {
        return "Media ID: " + this.a + ", type: " + this.c + ", display text: " + this.b + ", status: " + String.valueOf(this.f);
    }
}
