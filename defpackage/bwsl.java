package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsl extends bwtg {
    private final MessageCoreData a;

    public bwsl(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.bwtg
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.bwtg
    public final bwsn b() {
        return this.a.cB() ? bwsn.d : bwsn.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwsl) && fdbq.f(this.a, ((bwsl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupRenameTombstone(message=" + this.a + ")";
    }
}
