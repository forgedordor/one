package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyha implements eygo, eyhv {
    public final Set a = new HashSet();
    private boolean b = false;

    @Override // defpackage.eyhv
    public final void a(eyhu eyhuVar) {
        eygt.a();
        c();
        this.a.add(eyhuVar);
    }

    public final void b() {
        eygt.a();
        this.b = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eyhu) it.next()).g();
        }
    }

    public final void c() {
        if (this.b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }
}
