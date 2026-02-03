package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfd extends chfg {
    public final evuh a;
    public final fddy b;
    private final ContentType c;

    public chfd(evuh evuhVar, fddy fddyVar, ContentType contentType) {
        evuhVar.getClass();
        this.a = evuhVar;
        this.b = fddyVar;
        this.c = contentType;
    }

    @Override // defpackage.chfg
    public final ContentType a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chfd)) {
            return false;
        }
        chfd chfdVar = (chfd) obj;
        return fdbq.f(this.a, chfdVar.a) && fdbq.f(this.b, chfdVar.b) && fdbq.f(this.c, chfdVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ProtoMessage(payload=" + this.a + ", clazz=" + this.b + ", contentType=" + this.c + ")";
    }
}
