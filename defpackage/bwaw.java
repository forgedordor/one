package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwaw extends bwkb {
    public final ChatMessage a;
    private final eyfx b;
    private final Optional c;

    public bwaw(eyfx eyfxVar, ChatMessage chatMessage, Optional optional) {
        this.b = eyfxVar;
        this.a = chatMessage;
        this.c = optional;
    }

    @Override // defpackage.bwkb
    public final ChatMessage a() {
        return this.a;
    }

    @Override // defpackage.bwkb
    public final eyfx b() {
        return this.b;
    }

    @Override // defpackage.bwkb
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwkb) {
            bwkb bwkbVar = (bwkb) obj;
            eyfx eyfxVar = this.b;
            if (eyfxVar != null ? eyfxVar.equals(bwkbVar.b()) : bwkbVar.b() == null) {
                ChatMessage chatMessage = this.a;
                if (chatMessage != null ? chatMessage.equals(bwkbVar.a()) : bwkbVar.a() == null) {
                    if (this.c.equals(bwkbVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eyfx eyfxVar = this.b;
        int iHashCode = eyfxVar == null ? 0 : eyfxVar.hashCode();
        ChatMessage chatMessage = this.a;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (chatMessage != null ? chatMessage.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        ChatMessage chatMessage = this.a;
        return "SecretMessageAndReceipt{decryptedSecretMessage=" + String.valueOf(this.b) + ", receiptToSend=" + String.valueOf(chatMessage) + ", reasonForAborting=" + optional.toString() + "}";
    }
}
