package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciaf extends cici {
    public Optional a = Optional.empty();
    private boolean b;
    private byte c;

    @Override // defpackage.cici
    public final cicj a() {
        if (this.c == 1) {
            return new ciag(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: conversationExistsByThreadId");
    }

    @Override // defpackage.cici
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
