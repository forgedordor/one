package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpa {
    public final String a;
    public final MessageIdType b;
    public final evxw c;
    public final String d;

    public zpa() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpa)) {
            return false;
        }
        zpa zpaVar = (zpa) obj;
        return fdbq.f(this.a, zpaVar.a) && fdbq.f(this.b, zpaVar.b) && fdbq.f(this.c, zpaVar.c) && fdbq.f(this.d, zpaVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        MessageIdType messageIdType = this.b;
        int iHashCode2 = messageIdType == null ? 0 : messageIdType.hashCode();
        int i = iHashCode * 31;
        evxw evxwVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (evxwVar == null ? 0 : evxwVar.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "EffectInfo(suggestionId=" + this.a + ", messageId=" + this.b + ", effect=" + this.c + ", effectLabel=" + this.d + ")";
    }

    public zpa(String str, MessageIdType messageIdType, evxw evxwVar, String str2) {
        this.a = str;
        this.b = messageIdType;
        this.c = evxwVar;
        this.d = str2;
    }

    public /* synthetic */ zpa(byte[] bArr) {
        this(null, null, null, null);
    }
}
