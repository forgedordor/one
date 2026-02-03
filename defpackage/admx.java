package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admx extends afcz {
    public final long a;
    public final ConversationIdType b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final crku f;

    public admx(long j, ConversationIdType conversationIdType, boolean z, boolean z2, int i, crku crkuVar) {
        this.a = j;
        this.b = conversationIdType;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = crkuVar;
    }

    @Override // defpackage.afcz
    public final int a() {
        return this.e;
    }

    @Override // defpackage.afcz
    public final long b() {
        return this.a;
    }

    @Override // defpackage.afcz
    public final ConversationIdType c() {
        return this.b;
    }

    @Override // defpackage.afcz
    public final crku d() {
        return this.f;
    }

    @Override // defpackage.afcz
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afcz) {
            afcz afczVar = (afcz) obj;
            if (this.a == afczVar.b() && this.b.equals(afczVar.c()) && this.c == afczVar.e() && this.d == afczVar.f() && this.e == afczVar.a() && this.f.equals(afczVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afcz
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        crku crkuVar = this.f;
        return "QueryParams{sortTimestamp=" + this.a + ", conversationId=" + this.b.toString() + ", conversationIsPinned=" + this.c + ", isWear=" + this.d + ", limit=" + this.e + ", nudgeSettingsData=" + crkuVar.toString() + "}";
    }
}
