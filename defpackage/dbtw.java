package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtw implements dcfa {
    public final String a;
    private final String b = null;
    private final String c = null;
    private final String d = null;
    private final int e = 0;
    private final String g = null;
    private final boolean f = false;

    public dbtw(dbtv dbtvVar) {
        this.a = dbtvVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbtw)) {
            return false;
        }
        dbtw dbtwVar = (dbtw) obj;
        if (dclc.a(this.a, dbtwVar.a)) {
            String str = dbtwVar.b;
            if (dclc.a(null, null)) {
                String str2 = dbtwVar.c;
                if (dclc.a(null, null)) {
                    String str3 = dbtwVar.d;
                    if (dclc.a(null, null)) {
                        int i = dbtwVar.e;
                        if (dclc.a(0, 0)) {
                            String str4 = dbtwVar.g;
                            if (dclc.a(null, null)) {
                                boolean z = dbtwVar.f;
                                if (dclc.a(false, false)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, null, null, 0, null, false});
    }
}
