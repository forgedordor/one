package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.IClearcutLoggerService;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcau extends dcgp {
    final /* synthetic */ dcav a;
    private final dbyd h;
    private final dbzy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcau(dcav dcavVar, dbyd dbydVar, dcfq dcfqVar, dbzy dbzyVar) {
        super(dbyl.c, dcfqVar);
        this.a = dcavVar;
        this.h = dbydVar;
        this.i = dbzyVar;
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        List<eyex> list;
        ArrayList arrayList;
        int i;
        LogEventParcelable logEventParcelableB;
        dbzz dbzzVar;
        long jLongValue;
        long jA;
        dcaw dcawVar = (dcaw) dcevVar;
        try {
            dbyd dbydVarA = this.h.a();
            if (dbydVarA == null) {
                m(Status.a);
                return;
            }
            eyeh eyehVar = dbydVarA.b;
            String str = dbydVarA.k;
            int i2 = ((eyei) eyehVar.instance).e;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            dbzv dbzvVar = dbydVarA.a.d;
            if (str == null) {
                arrayList = new ArrayList();
            } else {
                if (((dcbe) dbzvVar).e == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = dcbe.b;
                    dzzh dzzhVarK = (dzzh) concurrentHashMap.get(str);
                    if (dzzhVarK == null) {
                        dzzhVarK = dcbe.a.k(str, eyey.a, new dzze() { // from class: dcbd
                            @Override // defpackage.dzze
                            public final Object a(byte[] bArr) {
                                return (eyey) evsn.parseFrom(eyey.a, bArr);
                            }
                        });
                        dzzh dzzhVar = (dzzh) concurrentHashMap.putIfAbsent(str, dzzhVarK);
                        if (dzzhVar != null) {
                            dzzhVarK = dzzhVar;
                        }
                    }
                    list = ((eyey) dzzhVarK.b()).b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (eyex eyexVar : list) {
                    if ((eyexVar.b & 1) == 0 || (i = eyexVar.c) == 0 || i == i2) {
                        arrayList2.add(eyexVar);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dbzy dbzyVar = this.i;
                    if (!dbzyVar.d()) {
                        m(new Status(0, "The event was not logged due to sampling."));
                        LogErrorParcelable logErrorParcelable = new LogErrorParcelable(dbydVarA.k, 1006, 1);
                        dcav dcavVar = this.a;
                        if (fazy.b(dcavVar.c)) {
                            dcaz.b().c(logErrorParcelable);
                            return;
                        } else {
                            dcavVar.f(new BatchedLogErrorParcelable(Arrays.asList(logErrorParcelable)));
                            return;
                        }
                    }
                    boolean z = dbydVarA instanceof dbyk;
                    if (z && dbzyVar.a() != 0.0d) {
                        double dA = dbzyVar.a();
                        eyeh eyehVar2 = ((dbyk) dbydVarA).b;
                        eyehVar2.copyOnWrite();
                        eyei eyeiVar = (eyei) eyehVar2.instance;
                        eyeiVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                        eyeiVar.k = dA;
                    }
                    try {
                        logEventParcelableB = dbydVarA.b();
                        if (z && (dbzzVar = ((dbyk) dbydVarA).p) != null) {
                            eyei eyeiVar2 = logEventParcelableB.l;
                            eyeiVar2.getClass();
                            dbzzVar.a(eyeiVar2.f);
                            logEventParcelableB.i = new LogVerifierResultParcelable(true);
                        }
                    } catch (RuntimeException e) {
                        Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e);
                        logEventParcelableB = null;
                    }
                    if (logEventParcelableB == null) {
                        j(new Status(10, "MessageProducer"));
                        return;
                    }
                    try {
                        ((IClearcutLoggerService) dcawVar.w()).logEvent(new dcas(this), logEventParcelableB);
                        dcav dcavVar2 = this.a;
                        Context context = dcavVar2.c;
                        if (fazy.b(context)) {
                            dcavVar2.f(dcaz.b().a());
                        }
                        if (!fbab.b(context) || dcav.a.getAndSet(true)) {
                            return;
                        }
                        d();
                        return;
                    } catch (RemoteException | RuntimeException e2) {
                        if (e2 instanceof TransactionTooLargeException) {
                            Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e2);
                            LogErrorParcelable logErrorParcelable2 = new LogErrorParcelable(logEventParcelableB.a.f, 31004, 1);
                            dcav dcavVar3 = this.a;
                            if (fazy.b(dcavVar3.c)) {
                                dcaz.b().c(logErrorParcelable2);
                            } else {
                                dcavVar3.f(new BatchedLogErrorParcelable(Arrays.asList(logErrorParcelable2)));
                            }
                        } else {
                            Log.w("ClearcutLoggerApiImpl", "logEvent exception", e2);
                            Context context2 = this.a.c;
                            if ((!fbab.b(context2) || !dcbc.c(context2).d(logEventParcelableB)) && fazy.b(context2)) {
                                dcaz.b().c(new LogErrorParcelable(logEventParcelableB.a.f, 1003, 1));
                            }
                        }
                        throw e2;
                    }
                }
                eyex eyexVar2 = (eyex) it.next();
                String str2 = eyexVar2.d;
                Context context3 = ((dcbe) dbzvVar).e;
                if (dqyw.g(context3)) {
                    jLongValue = 0;
                } else {
                    if (dcbe.d == null) {
                        if (context3 != null) {
                            if (dcbe.c == null) {
                                dcbe.c = Boolean.valueOf(dcnv.b(context3).a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                            }
                            if (dcbe.c.booleanValue()) {
                                dcbe.d = Long.valueOf(devd.b(context3.getContentResolver(), "android_id", 0L));
                            } else {
                                dcbe.d = 0L;
                            }
                        }
                        jLongValue = 0;
                    }
                    jLongValue = dcbe.d.longValue();
                }
                if (str2 == null || str2.isEmpty()) {
                    jA = dcay.a(ByteBuffer.allocate(8).putLong(jLongValue).array());
                } else {
                    byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    jA = dcay.a(byteBufferAllocate.array());
                }
                long j = eyexVar2.e;
                long j2 = eyexVar2.f;
                if (j >= 0 && j2 > 0) {
                    if ((jA >= 0 ? jA % j2 : (((Long.MAX_VALUE % j2) + 1) + ((jA & Long.MAX_VALUE) % j2)) % j2) >= j) {
                        m(Status.a);
                        return;
                    }
                }
            }
        } catch (RuntimeException e3) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e3);
            j(new Status(10, "EventModifier"));
        }
    }

    @Override // defpackage.dcgp, defpackage.dcgq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.m((dcfx) obj);
    }

    public final void d() {
        dcav dcavVar = this.a;
        final dcbb dcbbVarA = dcbc.c(dcavVar.c).a();
        if (dcbbVarA == null) {
            dcav.a.set(false);
            return;
        }
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dcar
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) throws Exception {
                dcau dcauVar = this.a;
                dcbb dcbbVar = dcbbVarA;
                try {
                    ((IClearcutLoggerService) ((dcaw) obj).w()).logEvent(new dcat(dcauVar, dcbbVar), dcbbVar.a);
                } catch (Exception e) {
                    try {
                        if (dcbc.c(dcauVar.a.c).b() != null) {
                            dcaz.b().c(new LogErrorParcelable(dcbbVar.a.a.f, 1003, 1));
                        }
                        throw e;
                    } finally {
                        dcav.a.set(false);
                    }
                }
            }
        };
        dcavVar.i(dcizVar.a());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ dcfx a(Status status) {
        return status;
    }
}
