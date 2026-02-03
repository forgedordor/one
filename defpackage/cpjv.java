package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpjv extends cpkj {
    private final Boolean a;
    private final Boolean b;
    private final csdl c;
    private final ConversationId d;
    private final String e;
    private final boolean f;
    private final elka g;
    private final int h;
    private final int i;
    private final int j;

    public cpjv(Boolean bool, Boolean bool2, csdl csdlVar, ConversationId conversationId, String str, boolean z, elka elkaVar, int i, int i2, int i3) {
        this.a = bool;
        this.b = bool2;
        this.c = csdlVar;
        this.d = conversationId;
        this.e = str;
        this.f = z;
        this.g = elkaVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.cpkj
    public final ConversationId a() {
        return this.d;
    }

    @Override // defpackage.cpkj
    public final csdl b() {
        return this.c;
    }

    @Override // defpackage.cpkj
    public final elka c() {
        return this.g;
    }

    @Override // defpackage.cpkj
    public final Boolean d() {
        return this.a;
    }

    @Override // defpackage.cpkj
    public final Boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        elka elkaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpkj) {
            cpkj cpkjVar = (cpkj) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(cpkjVar.d()) : cpkjVar.d() == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(cpkjVar.e()) : cpkjVar.e() == null) {
                    csdl csdlVar = this.c;
                    if (csdlVar != null ? csdlVar.equals(cpkjVar.b()) : cpkjVar.b() == null) {
                        cpkjVar.l();
                        ConversationId conversationId = this.d;
                        if (conversationId != null ? conversationId.equals(cpkjVar.a()) : cpkjVar.a() == null) {
                            cpkjVar.k();
                            String str = this.e;
                            if (str != null ? str.equals(cpkjVar.f()) : cpkjVar.f() == null) {
                                cpkjVar.o();
                                cpkjVar.n();
                                if (this.f == cpkjVar.g() && ((elkaVar = this.g) != null ? elkaVar.equals(cpkjVar.c()) : cpkjVar.c() == null) && this.h == cpkjVar.j() && this.i == cpkjVar.i() && this.j == cpkjVar.h()) {
                                    cpkjVar.m();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cpkj
    public final String f() {
        return this.e;
    }

    @Override // defpackage.cpkj
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.cpkj
    public final int h() {
        return this.j;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        int i = iHashCode ^ 1000003;
        csdl csdlVar = this.c;
        int iHashCode3 = csdlVar == null ? 0 : csdlVar.hashCode();
        int i2 = ((i * 1000003) ^ iHashCode2) * 1000003;
        ConversationId conversationId = this.d;
        int iHashCode4 = conversationId == null ? 0 : conversationId.hashCode();
        int i3 = i2 ^ iHashCode3;
        String str = this.e;
        int iHashCode5 = ((((((i3 * (-721379959)) ^ iHashCode4) * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 583896283) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        elka elkaVar = this.g;
        int iHashCode6 = (((((iHashCode5 ^ (elkaVar != null ? elkaVar.hashCode() : 0)) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        int i4 = this.j;
        eofo.b(i4);
        return (iHashCode6 ^ i4) * 1000003;
    }

    @Override // defpackage.cpkj
    public final int i() {
        return this.i;
    }

    @Override // defpackage.cpkj
    public final int j() {
        return this.h;
    }

    public final String toString() {
        int i = this.j;
        int i2 = this.i;
        int i3 = this.h;
        elka elkaVar = this.g;
        ConversationId conversationId = this.d;
        return "BlockAndReportSpamRequestJava{blockStatus=" + this.a + ", spamStatus=" + this.b + ", classificationSource=" + String.valueOf(this.c) + ", conversationId=null, mapiConversationId=" + String.valueOf(conversationId) + ", conversation=null, targetParticipantId=" + this.e + ", targetRecipient=null, targetParticipant=null, allowExternalReporting=" + this.f + ", bugleConversationOrigin=" + String.valueOf(elkaVar) + ", scope=" + eofq.c(i3) + ", entryPoint=" + eofp.a(i2) + ", dialog=" + eofo.a(i) + ", spamUserActionType=null}";
    }

    @Override // defpackage.cpkj
    public final void k() {
    }

    @Override // defpackage.cpkj
    public final void l() {
    }

    @Override // defpackage.cpkj
    public final void m() {
    }

    @Override // defpackage.cpkj
    public final void n() {
    }

    @Override // defpackage.cpkj
    public final void o() {
    }
}
