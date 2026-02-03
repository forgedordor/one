package defpackage;

import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efnl implements efkl {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    private final efof c;

    public efnl(efof efofVar) {
        this.c = efofVar;
    }

    private final void h(eflb eflbVar, Class cls) {
        boolean z = false;
        if (this.a.isEmpty() && this.b.isEmpty()) {
            z = true;
        }
        ejwl.m(z, "This visitor has already been used. Please create another one.");
        try {
            this.a = Optional.of(this.c.b(cls).b(eflbVar));
        } catch (efoc e) {
            this.b = Optional.of(e);
        }
    }

    final boolean a() {
        return this.a.isPresent();
    }

    @Override // defpackage.efkl
    public final void b(BasicTextMessage basicTextMessage) {
        h(basicTextMessage, BasicTextMessage.class);
    }

    @Override // defpackage.efkl
    public final void c(ChatMessage chatMessage) {
        h(chatMessage, ChatMessage.class);
    }

    @Override // defpackage.efkl
    public final void d(FileTransferInformation fileTransferInformation) {
        h(fileTransferInformation, FileTransferInformation.class);
    }

    @Override // defpackage.efkl
    public final void e(IsComposingMessage isComposingMessage) {
        h(isComposingMessage, IsComposingMessage.class);
    }

    @Override // defpackage.efkl
    public final void f(LocationInformation locationInformation) {
        h(locationInformation, LocationInformation.class);
    }

    @Override // defpackage.efkl
    public final void g(MessageReceipt messageReceipt) {
        h(messageReceipt, MessageReceipt.class);
    }
}
