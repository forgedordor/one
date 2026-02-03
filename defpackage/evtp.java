package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evtp {
    protected volatile evuh a;
    public volatile evqs b;
    private volatile boolean c;

    public final evqs a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = evqs.b;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public final evuh b(evuh evuhVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = evuhVar;
                        this.b = evqs.b;
                    } catch (evtj unused) {
                        this.c = true;
                        this.a = evuhVar;
                        this.b = evqs.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evtp)) {
            return false;
        }
        evtp evtpVar = (evtp) obj;
        evuh evuhVar = this.a;
        evuh evuhVar2 = evtpVar.a;
        return (evuhVar == null && evuhVar2 == null) ? a().equals(evtpVar.a()) : (evuhVar == null || evuhVar2 == null) ? evuhVar != null ? evuhVar.equals(evtpVar.b(evuhVar.getDefaultInstanceForType())) : b(evuhVar2.getDefaultInstanceForType()).equals(evuhVar2) : evuhVar.equals(evuhVar2);
    }

    public int hashCode() {
        return 1;
    }
}
