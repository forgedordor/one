package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfag {
    public final String a;
    public final String b;
    public final String c;
    public final dezx d;

    public dfag(String str, String str2, String str3, dezx dezxVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dezxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfag)) {
            return false;
        }
        dfag dfagVar = (dfag) obj;
        if (!TextUtils.equals(this.a, dfagVar.a) || !TextUtils.equals(this.c, dfagVar.c) || !TextUtils.equals(this.b, dfagVar.b)) {
            return false;
        }
        dezx dezxVar = this.d;
        if (dezxVar != null || dfagVar.d == null) {
            return dezxVar == null || dezxVar.equals(dfagVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d});
    }

    public final String toString() {
        return "Uri: " + dhiz.URI.c(this.a) + ", purpose: " + this.c + ". display text: " + dhiz.USER_ID.c(this.b) + ", modified: " + String.valueOf(this.d);
    }
}
