package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwso extends bwtg {
    private static final cqce b = cqce.g("BugleE2eeEtouffee", "NewConversationTombstone");
    public final MessageCoreData a;
    private final bwtr c;

    public bwso(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        fctc fctcVar = bwtr.a;
        int iK = messageCoreData.k();
        bwtr bwtrVar = (bwtr) ((Map) bwtr.a.a()).get(Integer.valueOf(iK));
        if (bwtrVar == null) {
            throw new IllegalArgumentException(a.g(iK, "Invalid new conversation tombstone status code "));
        }
        this.c = bwtrVar;
    }

    @Override // defpackage.bwtg
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.bwtg
    public final bwsn b() {
        return this.c.a();
    }

    public final bwtr c(bwsn bwsnVar) {
        bwsnVar.getClass();
        int iOrdinal = bwsnVar.ordinal();
        if (iOrdinal == 0) {
            b.r("Unknown group tombstone protocol");
            return null;
        }
        if (iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            bwtr bwtrVar = this.c;
            int iOrdinal2 = bwtrVar.ordinal();
            return iOrdinal2 != 1 ? (iOrdinal2 == 3 || iOrdinal2 == 4) ? bwtr.d : bwtrVar : bwtr.b;
        }
        if (iOrdinal != 3) {
            throw new fctg();
        }
        bwtr bwtrVar2 = this.c;
        int iOrdinal3 = bwtrVar2.ordinal();
        return iOrdinal3 != 0 ? (iOrdinal3 == 2 || iOrdinal3 == 3) ? bwtr.f : bwtrVar2 : bwtr.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwso) && fdbq.f(this.a, ((bwso) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewConversationTombstone(message=" + this.a + ")";
    }
}
