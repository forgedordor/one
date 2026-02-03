package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeup {
    final WeakReference a;
    public int b;
    boolean c;

    public eeup(int i, eeud eeudVar) {
        this.a = new WeakReference(eeudVar);
        this.b = i;
    }

    final boolean a(eeud eeudVar) {
        return eeudVar != null && this.a.get() == eeudVar;
    }
}
