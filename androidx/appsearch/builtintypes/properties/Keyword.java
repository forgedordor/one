package androidx.appsearch.builtintypes.properties;

import defpackage.lcg;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Keyword {
    String a = "";
    String b = "";
    final String c;

    public Keyword(String str) {
        lcg.i(str);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.c, ((Keyword) obj).c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.c);
    }
}
