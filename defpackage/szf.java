package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szf {
    public final long a;
    public final MessageIdType b;
    public final long c;
    private final String d;

    public szf(long j, MessageIdType messageIdType, long j2, String str) {
        this.a = j;
        this.b = messageIdType;
        this.c = j2;
        this.d = str;
    }

    public final ahzy a() {
        ahzx ahzxVar = (ahzx) ahzy.a.createBuilder();
        ahzxVar.getClass();
        ahzxVar.copyOnWrite();
        ahzy ahzyVar = (ahzy) ahzxVar.instance;
        ahzyVar.b |= 1;
        ahzyVar.c = this.a;
        ahzxVar.copyOnWrite();
        ahzy ahzyVar2 = (ahzy) ahzxVar.instance;
        ahzyVar2.b |= 2;
        ahzyVar2.d = this.b.a;
        ahzxVar.copyOnWrite();
        ahzy ahzyVar3 = (ahzy) ahzxVar.instance;
        ahzyVar3.b |= 4;
        ahzyVar3.e = this.c;
        evsn evsnVarBuild = ahzxVar.build();
        evsnVarBuild.getClass();
        return (ahzy) evsnVarBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szf)) {
            return false;
        }
        szf szfVar = (szf) obj;
        return this.a == szfVar.a && fdbq.f(this.b, szfVar.b) && this.c == szfVar.c && fdbq.f(this.d, szfVar.d);
    }

    public final int hashCode() {
        int iA = (sze.a(this.a) * 31) + this.b.hashCode();
        String str = this.d;
        return (((iA * 31) + sze.a(this.c)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BugleAttachmentBackupMetadata(id=" + this.a + ", messageId=" + this.b + ", sizeBytes=" + this.c + ", contentType=" + this.d + ")";
    }
}
