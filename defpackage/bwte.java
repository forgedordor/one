package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwte extends bwtg {
    public final MessageCoreData a;
    private final bwtu b;

    public bwte(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        fctc fctcVar = bwtu.a;
        int iK = messageCoreData.k();
        bwtu bwtuVar = (bwtu) ((Map) bwtu.a.a()).get(Integer.valueOf(iK));
        if (bwtuVar == null) {
            throw new IllegalArgumentException(a.g(iK, "Invalid protocol change tombstone status code "));
        }
        this.b = bwtuVar;
    }

    @Override // defpackage.bwtg
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.bwtg
    public final bwsn b() {
        return this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwte) && fdbq.f(this.a, ((bwte) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProtocolSwitchTombstone(message=" + this.a + ")";
    }
}
