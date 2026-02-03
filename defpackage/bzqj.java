package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import io.grpc.Status;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqj implements bzqf {
    public static final cqce a = cqce.g("BugleCms", "CmsMediaDeletionHandlerImpl");
    private final cpmc b;
    private final eosc c;

    public bzqj(cpmc cpmcVar, eosc eoscVar) {
        this.b = cpmcVar;
        this.c = eoscVar;
    }

    @Override // defpackage.bzqf
    public final eiju a(final MessageIdType messageIdType) {
        HashSet hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        String[] strArr = bmop.a;
        bmom bmomVar = new bmom(bmop.a);
        bmomVar.A("deleteBlobsForMessage");
        bmomVar.k(new bmon((bmoo) new Function() { // from class: bzqh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmoo bmooVar = (bmoo) obj;
                bmooVar.b(messageIdType.b());
                return bmooVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bmoo())));
        bmob bmobVar = (bmob) bmomVar.b().p();
        while (bmobVar.moveToNext()) {
            try {
                String strC = bmobVar.c();
                if (!TextUtils.isEmpty(strC)) {
                    cqbd cqbdVarC = a.c();
                    cqbdVarC.I("Schedule deletion of blob");
                    cqbdVarC.A("Blob id", strC);
                    cqbdVarC.A("Message id", messageIdType);
                    cqbdVarC.r();
                    hashSet.add(strC);
                }
            } catch (Throwable th) {
                try {
                    bmobVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bmobVar.close();
        if (hashSet.isEmpty()) {
            return eijx.e(null);
        }
        arrayList.addAll(hashSet);
        return this.b.ac(arrayList).h(new ejvr() { // from class: bzqi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final MessageIdType messageIdType2;
                List list;
                evtg evtgVar = ((eqio) obj).b;
                int i = 0;
                boolean z = false;
                while (true) {
                    messageIdType2 = messageIdType;
                    list = arrayList;
                    if (i >= evtgVar.size()) {
                        break;
                    }
                    exmy exmyVar = (exmy) evtgVar.get(i);
                    final String str = (String) list.get(i);
                    int i2 = exmyVar.b;
                    if (i2 == Status.Code.OK.value() || i2 == Status.Code.NOT_FOUND.value()) {
                        try {
                            String[] strArr2 = bmop.a;
                            bmoh bmohVar = new bmoh();
                            bmohVar.f("processDeleteFileResponse");
                            bmohVar.b = new bmon((bmoo) new Function() { // from class: bzqg
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bmoo bmooVar = (bmoo) obj2;
                                    bmooVar.b(messageIdType2.b());
                                    bmooVar.ap(new dqpj("cms_blobs_pending_delete.blob_id", 1, String.valueOf(str)));
                                    return bmooVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new bmoo()));
                            bmohVar.d();
                            cqbd cqbdVarC2 = bzqj.a.c();
                            cqbdVarC2.I("Blob is deleted successfully");
                            cqbdVarC2.A("message id", messageIdType2);
                            cqbdVarC2.A("blob id", str);
                            cqbdVarC2.r();
                        } catch (Exception unused) {
                        }
                        i++;
                    } else {
                        cqbd cqbdVarE = bzqj.a.e();
                        cqbdVarE.I("Blob deletion failed, will retry");
                        cqbdVarE.A("message id", messageIdType2);
                        cqbdVarE.A("blob id", str);
                        cqbdVarE.r();
                    }
                    z = true;
                    i++;
                }
                if (list.size() > evtgVar.size()) {
                    cqbd cqbdVarC3 = bzqj.a.c();
                    cqbdVarC3.I("Files in batch request exceed server batch size. More files need to be deleted.");
                    cqbdVarC3.A("message_id", messageIdType2);
                    cqbdVarC3.r();
                } else if (!z) {
                    return null;
                }
                throw new bzqe();
            }
        }, this.c);
    }
}
