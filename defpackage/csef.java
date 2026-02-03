package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csef {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final alqm i;

    public csef(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, alqm alqmVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = i2;
        this.i = alqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csef)) {
            return false;
        }
        csef csefVar = (csef) obj;
        return this.a == csefVar.a && this.b == csefVar.b && this.c == csefVar.c && this.d == csefVar.d && this.e == csefVar.e && this.f == csefVar.f && this.g == csefVar.g && this.h == csefVar.h && fdbq.f(this.i, csefVar.i);
    }

    public final int hashCode() {
        return (((((((((((((((csee.a(this.a) * 31) + csee.a(this.b)) * 31) + csee.a(this.c)) * 31) + csee.a(this.d)) * 31) + csee.a(this.e)) * 31) + csee.a(this.f)) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "SpamPrechecksResult(isSpamProtectionOn=" + this.a + ", isSenderInContacts=" + this.b + ", wasSenderMarkedAsNotSpamByUser=" + this.c + ", isConversationStartedByUser=" + this.d + ", isEarliestMessageOrTombstone=" + this.e + ", isSenderRbmBot=" + this.f + ", userMessagesCount=" + this.g + ", conversationAgeInDays=" + this.h + ", senderMessagingIdentity=" + this.i + ")";
    }
}
