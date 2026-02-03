package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipg extends eipi {
    public final List a;

    public eipg(List list) {
        if (list == null) {
            throw new NullPointerException("Null actions");
        }
        this.a = list;
    }

    @Override // defpackage.eipi
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eipi) {
            eipi eipiVar = (eipi) obj;
            if (this.a.equals(eipiVar.a())) {
                eipiVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "DescribeActionsResponse{actions=" + this.a.toString() + ", loading=false}";
    }

    @Override // defpackage.eipi
    public final void b() {
    }
}
