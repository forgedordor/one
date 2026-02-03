package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coml {
    public static final egyj a = new egyb("file_transfer_data_service");
    private static final cczi f = cdag.e(cdag.b, "file_transfer_progress_timeout_sec", 300);
    public final Map b = new HashMap();
    public final Executor c;
    public final egzh d;
    public final cqtq e;
    private final eosd g;

    public coml(eosd eosdVar, egzh egzhVar, cqtp cqtpVar) {
        this.c = new eoss(eosdVar);
        this.d = egzhVar;
        this.g = eosdVar;
        this.e = cqtpVar.a(new comk());
    }

    public final eiju a(final MessageIdType messageIdType, final coik coikVar) {
        eiju eijuVarF = eijx.f(new Runnable() { // from class: comh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.put(messageIdType, coikVar);
            }
        }, this.c);
        this.d.a(eijuVarF, a);
        this.e.c(new Supplier() { // from class: comi
            @Override // java.util.function.Supplier
            public final Object get() {
                egyj egyjVar = coml.a;
                return messageIdType;
            }
        }, "FileTransferDataService::Notify");
        eiju.g(this.g.schedule(eiid.k(new Runnable() { // from class: comj
            @Override // java.lang.Runnable
            public final void run() {
                final coml comlVar = this.a;
                final MessageIdType messageIdType2 = messageIdType;
                final coik coikVar2 = coikVar;
                comlVar.d.a(eijx.f(new Runnable() { // from class: come
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map = comlVar.b;
                        MessageIdType messageIdType3 = messageIdType2;
                        if (coikVar2.equals((coik) map.get(messageIdType3))) {
                            map.remove(messageIdType3);
                        }
                    }
                }, comlVar.c), coml.a);
                comlVar.e.c(new Supplier() { // from class: comg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        egyj egyjVar = coml.a;
                        return messageIdType2;
                    }
                }, "FileTransferDataService::Notify");
            }
        }), Duration.ofSeconds(((Integer) f.e()).intValue()).getSeconds(), TimeUnit.SECONDS)).k(auvh.b(), eoqg.a);
        return eijuVarF;
    }
}
