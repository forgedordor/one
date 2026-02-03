package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahl {
    private final int a;
    private final String b;

    public ahl(int i, String str) {
        lcg.f(i, 0, 2, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahl)) {
            return false;
        }
        ahl ahlVar = (ahl) obj;
        return this.a == ahlVar.a && this.b.equals(ahlVar.b);
    }

    public final int hashCode() {
        return (this.a + this.b).hashCode();
    }
}
