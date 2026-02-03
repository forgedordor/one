package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsd extends bwtg {
    private final MessageCoreData a;

    public bwsd(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.bwtg
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.bwtg
    public final bwsn b() {
        return bwsn.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwsd) && fdbq.f(this.a, ((bwsd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericTombstone(message=" + this.a + ")";
    }
}
