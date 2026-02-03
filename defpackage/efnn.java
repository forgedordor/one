package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnn {
    public static final ekrg a = ekrg.c("com/google/android/rcs/client/messaging/serializers/ProtoMessageSerializer");
    public final Set b;
    private final dfli c;

    public efnn(Set set, dfli dfliVar) {
        set.getClass();
        this.b = set;
        this.c = dfliVar;
    }

    public final int a() {
        return ((eoth) ((dfja) this.c).a.b()).a("cslib.enable_base64_no_wrap_for_protos") ? 2 : 0;
    }

    public final efol b(fddy fddyVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fdbq.f(((efol) next).a, fdab.a(fddyVar))) {
                break;
            }
        }
        efol efolVar = (efol) next;
        if (efolVar != null) {
            return efolVar;
        }
        throw new IllegalArgumentException(a.h(fddyVar, "Unknown proto: ", ", please register it."));
    }
}
