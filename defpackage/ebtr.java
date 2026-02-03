package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebtr {
    public ebtq a;

    public final void a(ebtq ebtqVar) {
        if (this.a == ebtqVar) {
            this.a = null;
        }
        notifyAll();
    }

    public final synchronized void b(ebtq ebtqVar) {
        ebtqVar.a = true;
        if (this.a == ebtqVar) {
            this.a = null;
        }
        notifyAll();
    }
}
