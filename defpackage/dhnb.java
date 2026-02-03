package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnb extends dhmw {
    public List a;

    public final List a() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhnb)) {
            return false;
        }
        dhnb dhnbVar = (dhnb) obj;
        if (this.a.size() != dhnbVar.a().size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((dhna) this.a.get(i)).equals(dhnbVar.a.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
