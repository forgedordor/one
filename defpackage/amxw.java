package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxw implements cqto {
    final /* synthetic */ amxx a;

    public amxw(amxx amxxVar) {
        this.a = amxxVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amxx amxxVar = this.a;
        amxxVar.e = cqty.b(amxxVar.a.e.a(new cqtk() { // from class: amxv
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                final amxx amxxVar2 = amxxVar;
                return !((MessageIdType) obj).equals(amxxVar2.d) ? eijx.e(null) : eijx.f(new Runnable() { // from class: amxs
                    @Override // java.lang.Runnable
                    public final void run() {
                        amxxVar2.b.c(new Supplier() { // from class: amxt
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return null;
                            }
                        }, "DownloadingSupplier::Notify");
                    }
                }, amxxVar2.c);
            }
        }, "FileTransferDataService::Register", "FileTransferDataService::Callback", "FileTransferDataService::Unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        amxx amxxVar = this.a;
        cquc cqucVar = amxxVar.e;
        cqucVar.getClass();
        cqucVar.a();
        amxxVar.e = null;
    }
}
