package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsp extends bwtg {
    public final MessageCoreData a;

    public bwsp(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.bwtg
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.bwtg
    public final bwsn b() {
        return bwsm.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwsp) && fdbq.f(this.a, ((bwsp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NonTombstone(message=" + this.a + ")";
    }
}
