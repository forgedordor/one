package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bwkb {
    public static bwkb d(eyfx eyfxVar, ChatMessage chatMessage) {
        return new bwaw(eyfxVar, chatMessage, Optional.empty());
    }

    public static bwkb e(bwbw bwbwVar) {
        return new bwaw(null, null, Optional.of(bwbwVar));
    }

    public abstract ChatMessage a();

    public abstract eyfx b();

    public abstract Optional c();
}
