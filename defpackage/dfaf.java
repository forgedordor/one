package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfaf {
    public final String a;
    public final Optional b;

    public dfaf(String str) {
        this.a = str;
        this.b = Optional.empty();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfaf)) {
            return false;
        }
        dfaf dfafVar = (dfaf) obj;
        return TextUtils.equals(this.a, dfafVar.a) && this.b.equals(dfafVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "Participant: " + dhiz.URI_TEL.c(this.a) + ", timestamp: " + this.b.toString();
    }

    public dfaf(String str, dhie dhieVar) {
        this.a = str;
        this.b = Optional.of(dhieVar);
    }
}
