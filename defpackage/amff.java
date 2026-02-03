package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amff implements anpj {
    public final MessageId a;
    private final ajmh b;

    public amff(ajmh ajmhVar, MessageId messageId) {
        messageId.getClass();
        this.b = ajmhVar;
        this.a = messageId;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.b.l(new amfe(this, anpiVar));
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return this.b.v(this.a);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
