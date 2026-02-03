package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajtk extends ajze {
    private final ConversationId a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final int f;
    private final Uri g;
    private final ajlo h;
    private final Instant i;

    public ajtk(ConversationId conversationId, String str, boolean z, boolean z2, String str2, int i, Uri uri, ajlo ajloVar, Instant instant) {
        this.a = conversationId;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = i;
        this.g = uri;
        this.h = ajloVar;
        this.i = instant;
    }

    @Override // defpackage.ajze, defpackage.ajlp
    public final int a() {
        return this.f;
    }

    @Override // defpackage.ajze, defpackage.ajlp
    public final Uri b() {
        return this.g;
    }

    @Override // defpackage.ajlp
    public final ConversationId c() {
        return this.a;
    }

    @Override // defpackage.ajze, defpackage.ajlp
    public final String d() {
        return this.e;
    }

    @Override // defpackage.ajze, defpackage.ajlp
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajze) {
            ajze ajzeVar = (ajze) obj;
            if (this.a.equals(ajzeVar.c()) && this.b.equals(ajzeVar.e()) && this.c == ajzeVar.f() && this.d == ajzeVar.i() && this.e.equals(ajzeVar.d()) && this.f == ajzeVar.a() && ((uri = this.g) != null ? uri.equals(ajzeVar.b()) : ajzeVar.b() == null)) {
                ajzeVar.j();
                ajlo ajloVar = this.h;
                if (ajloVar != null ? ajloVar.equals(ajzeVar.g()) : ajzeVar.g() == null) {
                    if (this.i.equals(ajzeVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajze, defpackage.ajlp
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.ajze
    public final ajlo g() {
        return this.h;
    }

    @Override // defpackage.ajze
    public final Instant h() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode();
        Uri uri = this.g;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = ((iHashCode * 1000003) ^ this.f) * 1000003;
        ajlo ajloVar = this.h;
        return ((((i ^ iHashCode2) * (-721379959)) ^ (ajloVar != null ? ajloVar.hashCode() : 0)) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.ajze
    public final boolean i() {
        return this.d;
    }

    public final String toString() {
        Instant instant = this.i;
        ajlo ajloVar = this.h;
        Uri uri = this.g;
        return "DefaultConversationSummary{conversationId=" + this.a.toString() + ", name=" + this.b + ", isGroupRich=" + this.c + ", isUnread=" + this.d + ", latestMessageSnippet=" + this.e + ", recipientCount=" + this.f + ", conversationAvatarUri=" + String.valueOf(uri) + ", messageSnippet=null, draftSnippet=" + String.valueOf(ajloVar) + ", sortTime=" + instant.toString() + "}";
    }

    @Override // defpackage.ajze
    public final void j() {
    }
}
