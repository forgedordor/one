package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwse extends bwtg {
    private final MessageCoreData a;
    private final bwtp b;

    public bwse(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        fctc fctcVar = bwtp.a;
        int iK = messageCoreData.k();
        bwtp bwtpVar = (bwtp) ((Map) bwtp.a.a()).get(Integer.valueOf(iK));
        if (bwtpVar == null) {
            throw new IllegalArgumentException(a.g(iK, "Invalid group membership change tombstone status code "));
        }
        this.b = bwtpVar;
    }

    @Override // defpackage.bwtg
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.bwtg
    public final bwsn b() {
        int iOrdinal = this.b.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? bwsn.c : bwsn.d : bwsn.d : bwsn.d : bwsn.d : bwsn.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwse) && fdbq.f(this.a, ((bwse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupMembershipChangeTombstone(message=" + this.a + ")";
    }
}
