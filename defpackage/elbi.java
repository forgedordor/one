package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbi {
    public final elbh a;
    private final Comparator b;

    public elbi(elbh elbhVar) {
        elbhVar.getClass();
        this.a = elbhVar;
        this.b = null;
        ejwl.l(elbhVar != elbh.SORTED);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof elbi)) {
            return false;
        }
        elbi elbiVar = (elbi) obj;
        if (this.a == elbiVar.a) {
            Comparator comparator = elbiVar.b;
            if (ejwh.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        return ejwfVarB.toString();
    }
}
