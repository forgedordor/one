package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrp implements mbs {
    public final List a;

    public nrp(List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((nro) list.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((nro) list.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((nro) list.get(i)).b;
                    i++;
                }
            }
        }
        mee.a(!z);
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((nrp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    @Override // defpackage.mbs
    public final /* synthetic */ void b(mbq mbqVar) {
    }
}
