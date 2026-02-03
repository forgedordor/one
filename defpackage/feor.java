package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feor implements Serializable {
    private static final long serialVersionUID = -1913059830016450169L;
    public final List a;

    public feor() {
        this(false);
    }

    public final void a(feno fenoVar) {
        this.a.remove(fenoVar);
    }

    public final void b(feno fenoVar) {
        String str = fenoVar.a;
        feor feorVar = new feor();
        for (feno fenoVar2 : this.a) {
            if (fenoVar2.a.equalsIgnoreCase(str)) {
                feorVar.c(fenoVar2);
            }
        }
        Iterator it = feorVar.a.iterator();
        while (it.hasNext()) {
            a((feno) it.next());
        }
        c(fenoVar);
    }

    public final void c(feno fenoVar) {
        if (fenoVar == null) {
            throw new IllegalArgumentException("Trying to add null Parameter");
        }
        this.a.add(fenoVar);
    }

    public final boolean equals(Object obj) {
        return obj instanceof feor ? ffhd.a(this.a, ((feor) obj).a) : super.equals(obj);
    }

    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a);
        return ffhgVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(';');
            stringBuffer.append(it.next().toString());
        }
        return stringBuffer.toString();
    }

    public feor(boolean z) {
        if (z) {
            this.a = DesugarCollections.unmodifiableList(new ArrayList());
        } else {
            this.a = new CopyOnWriteArrayList();
        }
    }
}
