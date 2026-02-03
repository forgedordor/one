package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irn {
    public final ctz a;
    public final ish b;
    public boolean c;

    public irn(ctz ctzVar, ish ishVar) {
        this.a = ctzVar;
        this.b = ishVar;
    }

    public final boolean a(long j) {
        Object obj;
        List list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (isd.b(((isj) obj).a, j)) {
                break;
            }
            i++;
        }
        isj isjVar = (isj) obj;
        if (isjVar != null) {
            return isjVar.h;
        }
        return false;
    }
}
