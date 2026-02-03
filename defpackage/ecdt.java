package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecdt extends ecbw {
    public final void R() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecdq) {
                ((ecdq) ecdjVar).a();
            }
            i++;
        }
    }
}
