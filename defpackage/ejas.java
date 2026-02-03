package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejas implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b;
    private final List c;

    public ejas(String str, Date date) {
        this.a = str;
        this.b = date == null ? null : Long.valueOf(date.getTime());
        this.c = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ejas)) {
            return false;
        }
        ejas ejasVar = (ejas) obj;
        return Objects.equals(this.a, ejasVar.a) && Objects.equals(this.b, ejasVar.b) && Objects.equals(this.c, ejasVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("tokenValue", this.a);
        ejwfVarB.b("expirationTimeMillis", this.b);
        ejwfVarB.b("scopes", this.c);
        return ejwfVarB.toString();
    }
}
