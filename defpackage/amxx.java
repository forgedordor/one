package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxx implements anpj {
    public final coml a;
    public final cqtq b;
    public final ExecutorService c;
    public final MessageIdType d;
    public cquc e = null;

    public amxx(coml comlVar, cqtp cqtpVar, ExecutorService executorService, MessageIdType messageIdType) {
        this.a = comlVar;
        this.c = executorService;
        this.d = messageIdType;
        this.b = cqtpVar.a(new amxw(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.b.a(new cqtk() { // from class: amxu
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "DownloadingSupplier::Register", "DownloadingSupplier::Callback", "DownloadingSupplier::Unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        final coml comlVar = this.a;
        final MessageIdType messageIdType = this.d;
        return eijx.g(new Callable() { // from class: comf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = comlVar.b;
                MessageIdType messageIdType2 = messageIdType;
                return map.containsKey(messageIdType2) ? Optional.of((coik) map.get(messageIdType2)) : Optional.empty();
            }
        }, comlVar.c).h(new ejvr() { // from class: amxr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return Optional.empty();
                }
                amxn amxnVarD = amxo.d();
                amxnVarD.b(((coik) optional.get()).a());
                amxnVarD.d(((coik) optional.get()).b());
                amxnVarD.c(((coik) optional.get()).c());
                return Optional.of(amxnVarD.a());
            }
        }, this.c);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
