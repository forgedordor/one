package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zph {
    public final MessageIdType a;
    public final String b;
    public final String c;

    public zph(MessageIdType messageIdType, String str, String str2) {
        str.getClass();
        this.a = messageIdType;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zph)) {
            return false;
        }
        zph zphVar = (zph) obj;
        return fdbq.f(this.a, zphVar.a) && fdbq.f(this.b, zphVar.b) && fdbq.f(this.c, zphVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ScreenEffectSuggestion(targetMessageId=" + this.a + ", id=" + this.b + ", label=" + this.c + ")";
    }
}
