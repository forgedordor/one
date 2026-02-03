package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszz implements bajc {
    public final denz a = new denz();

    static {
        eksp.c("BugleWearable");
    }

    @Override // defpackage.bajc
    public final String D() {
        return cszr.b(this.a, "24");
    }

    public final void a(String str) {
        this.a.n("24", str);
    }

    @Override // defpackage.bajc
    public final int b() {
        return this.a.p("36");
    }

    public final void c(String str) {
        this.a.n("12", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cszz) {
            return this.a.equals(((cszz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bajc
    public final ConversationIdType q() {
        return barn.b(cszr.a(this.a, "1"));
    }
}
