package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezi {
    public String a = "";
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public String d = "";
    public String e = "";
    public dfah f;
    public dfah g;
    public int h;
    public dezp i;

    public dezi() {
        dfae dfaeVar = dfae.NONE;
        this.f = new dfah(dfaeVar);
        this.g = new dfah(dfaeVar);
        this.i = new dezp();
    }

    public final void a(dezi deziVar) {
        if (this.b.isPresent()) {
            this.b.equals(deziVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dezi)) {
            return false;
        }
        dezi deziVar = (dezi) obj;
        return this.h == deziVar.h && TextUtils.equals(this.a, deziVar.a) && TextUtils.equals(this.d, deziVar.d) && TextUtils.equals(this.e, deziVar.e) && this.b.equals(deziVar.b) && this.i.equals(deziVar.i) && this.f.equals(deziVar.f) && this.g.equals(deziVar.g) && this.c.equals(deziVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.a, this.d, this.e, this.b, this.i, this.f, this.g, this.c});
    }

    public final String toString() {
        return "Subject: " + (this.b.isPresent() ? dhiz.MESSAGE_CONTENT.c(this.b.get()) : "Optional.empty()") + ", conference URIs: " + String.valueOf(this.f) + ", max user count: " + this.h + ", display text: " + this.a + ", free text: " + this.d + ", keywords: " + this.e + ", service URIs: " + String.valueOf(this.g) + ", available media: " + String.valueOf(this.i) + ", subject ext: " + String.valueOf(this.c);
    }
}
