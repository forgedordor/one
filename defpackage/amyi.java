package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyi implements anpj {
    public final fdjx a;
    public final bxqa b;
    public final MessageId c;
    public cquc d;
    public final cqtq e;

    public amyi(fdjx fdjxVar, bxqa bxqaVar, cqtp cqtpVar, MessageId messageId) {
        this.a = fdjxVar;
        this.b = bxqaVar;
        this.c = messageId;
        this.e = cqtpVar.a(new amyf(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: amyc
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "RichCardFileTransferProgressSupplier:register", "RichCardFileTransferProgressSupplier:callback", "RichCardFileTransferProgressSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new amyd(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
