package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qox {
    private final List a = new ArrayList();

    final void a(qpp qppVar) {
        this.a.add(qppVar);
    }

    public final void b(Path path) {
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qpp qppVar = (qpp) list.get(size);
            ThreadLocal threadLocal = qwz.a;
            if (qppVar != null && !qppVar.a) {
                qwz.e(path, ((qpz) qppVar.b).k() / 100.0f, ((qpz) qppVar.c).k() / 100.0f, ((qpz) qppVar.d).k() / 360.0f);
            }
        }
    }
}
