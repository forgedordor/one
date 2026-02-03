package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dbod implements dcfa {
    public static final dbod a = new dbod(new dboc());
    public final String b = null;
    public final boolean c;
    public final String d;

    public dbod(dboc dbocVar) {
        this.c = dbocVar.a.booleanValue();
        this.d = dbocVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dbod)) {
            return false;
        }
        dbod dbodVar = (dbod) obj;
        String str = dbodVar.b;
        return dclc.a(null, null) && this.c == dbodVar.c && dclc.a(this.d, dbodVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.c), this.d});
    }
}
