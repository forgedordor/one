package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahpa extends ahpl {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final ConversationIdType f;
    private final String g;
    private final boolean h;
    private final boolean i;

    public ahpa(String str, String str2, String str3, String str4, long j, ConversationIdType conversationIdType, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null reminderId");
        }
        this.d = str4;
        this.e = j;
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.f = conversationIdType;
        this.g = str5;
        this.h = z;
        this.i = z2;
    }

    @Override // defpackage.ahpl
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ahpl
    public final ConversationIdType b() {
        return this.f;
    }

    @Override // defpackage.ahpl
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ahpl
    public final String d() {
        return this.g;
    }

    @Override // defpackage.ahpl
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahpl) {
            ahpl ahplVar = (ahpl) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(ahplVar.f()) : ahplVar.f() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(ahplVar.g()) : ahplVar.g() == null) {
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(ahplVar.c()) : ahplVar.c() == null) {
                        if (this.d.equals(ahplVar.e()) && this.e == ahplVar.a() && this.f.equals(ahplVar.b()) && ((str = this.g) != null ? str.equals(ahplVar.d()) : ahplVar.d() == null) && this.h == ahplVar.h() && this.i == ahplVar.i()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ahpl
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ahpl
    public final String g() {
        return this.b;
    }

    @Override // defpackage.ahpl
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.c;
        int iHashCode3 = ((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        int iHashCode4 = (((iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str4 = this.g;
        return ((((iHashCode4 ^ (str4 != null ? str4.hashCode() : 0)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    @Override // defpackage.ahpl
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        return "ReminderNotificationInfo{sender=" + this.a + ", text=" + this.b + ", attachmentType=" + this.c + ", reminderId=" + this.d + ", reminderTriggerTime=" + this.e + ", conversationId=" + this.f.toString() + ", chatName=" + this.g + ", isGroupChat=" + this.h + ", isSenderSelf=" + this.i + "}";
    }
}
