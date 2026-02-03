package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cojj extends coke {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.coke
    public final cokf a() {
        return new cojk(this.a, this.b);
    }

    @Override // defpackage.coke
    public final void b(cokk cokkVar) {
        this.b = Optional.of(cokkVar);
    }

    @Override // defpackage.coke
    public final void c(MessageCoreData messageCoreData) {
        this.a = Optional.of(messageCoreData);
    }
}
