package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class baig extends cqdj {
    final /* synthetic */ bagr a;
    final /* synthetic */ String b;
    final /* synthetic */ PendingAttachmentData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baig(PendingAttachmentData pendingAttachmentData, long j, bagr bagrVar, String str) {
        super("Bugle.Async.PendingAttachmentData.loadAttachmentForDraft.Duration", j, true);
        this.a = bagrVar;
        this.b = str;
        this.c = pendingAttachmentData;
    }

    @Override // defpackage.cqdj
    protected final /* synthetic */ Object a(Object[] objArr) throws IOException {
        Uri uri;
        Uri uriF;
        PendingAttachmentData pendingAttachmentData = this.c;
        Uri uriT = pendingAttachmentData.t();
        if (uriT == null) {
            return null;
        }
        try {
            if (pendingAttachmentData.bx()) {
                pendingAttachmentData.ag();
                if (pendingAttachmentData.m.a()) {
                    cmuo cmuoVar = pendingAttachmentData.p.d;
                    cmuoVar.b();
                    cmuoVar.b.lock();
                    try {
                        SparseArray sparseArray = cmuoVar.d;
                        int size = sparseArray.size();
                        int iB = 0;
                        for (int i = 0; i < size; i++) {
                            iB = Math.max(iB, ((cmuh) sparseArray.valueAt(i)).b());
                        }
                        if (iB <= 0) {
                            iB = cmuoVar.c.b();
                        }
                        cmuoVar.b.unlock();
                        long jA = pendingAttachmentData.q.a(uriT);
                        if (jA != -1) {
                            long j = iB;
                            if (jA > j) {
                                Uri uriV = pendingAttachmentData.v();
                                Context context = pendingAttachmentData.n;
                                if ("content".equals(uriT.getScheme())) {
                                    String authority = uriT.getAuthority();
                                    if (bxlg.a(context).equals(authority) || "mms".equals(authority)) {
                                        uri = uriV;
                                        uriF = uriT;
                                    }
                                    cqbd cqbdVarA = PendingAttachmentData.i.a();
                                    cqbdVarA.I("createVideoMessagePart:");
                                    cqbdVarA.A("contentType", pendingAttachmentData.R());
                                    cqbdVarA.A("contentUri", uriF);
                                    cqbdVarA.y("width", pendingAttachmentData.c());
                                    cqbdVarA.y("height", pendingAttachmentData.b());
                                    cqbdVarA.z("duration", pendingAttachmentData.k());
                                    cqbdVarA.y("targetFileSize", iB);
                                    cqbdVarA.A("sourceName", pendingAttachmentData.K().name());
                                    cqbdVarA.z("mediaModifiedTimestamp", pendingAttachmentData.m());
                                    cqbdVarA.r();
                                    bahv bahvVar = pendingAttachmentData.r;
                                    bahx bahxVarD = bahy.D();
                                    ((bacm) bahxVarD).c = pendingAttachmentData.R();
                                    ((bacm) bahxVarD).d = uriF;
                                    ((bacm) bahxVarD).e = uri;
                                    bahxVarD.p(pendingAttachmentData.c());
                                    bahxVarD.i(pendingAttachmentData.b());
                                    bahxVarD.g(pendingAttachmentData.k());
                                    bahxVarD.o(j);
                                    bahxVarD.n(pendingAttachmentData.K());
                                    bahxVarD.j(pendingAttachmentData.m());
                                    return bahvVar.c(bahxVarD.q());
                                }
                                uriF = bxlf.f(uriT, context);
                                if (uriF == null) {
                                    return null;
                                }
                                uri = uriT;
                                cqbd cqbdVarA2 = PendingAttachmentData.i.a();
                                cqbdVarA2.I("createVideoMessagePart:");
                                cqbdVarA2.A("contentType", pendingAttachmentData.R());
                                cqbdVarA2.A("contentUri", uriF);
                                cqbdVarA2.y("width", pendingAttachmentData.c());
                                cqbdVarA2.y("height", pendingAttachmentData.b());
                                cqbdVarA2.z("duration", pendingAttachmentData.k());
                                cqbdVarA2.y("targetFileSize", iB);
                                cqbdVarA2.A("sourceName", pendingAttachmentData.K().name());
                                cqbdVarA2.z("mediaModifiedTimestamp", pendingAttachmentData.m());
                                cqbdVarA2.r();
                                bahv bahvVar2 = pendingAttachmentData.r;
                                bahx bahxVarD2 = bahy.D();
                                ((bacm) bahxVarD2).c = pendingAttachmentData.R();
                                ((bacm) bahxVarD2).d = uriF;
                                ((bacm) bahxVarD2).e = uri;
                                bahxVarD2.p(pendingAttachmentData.c());
                                bahxVarD2.i(pendingAttachmentData.b());
                                bahxVarD2.g(pendingAttachmentData.k());
                                bahxVarD2.o(j);
                                bahxVarD2.n(pendingAttachmentData.K());
                                bahxVarD2.j(pendingAttachmentData.m());
                                return bahvVar2.c(bahxVarD2.q());
                            }
                        }
                    } catch (Throwable th) {
                        cmuoVar.b.unlock();
                        throw th;
                    }
                }
            } else if (pendingAttachmentData.bj() && (pendingAttachmentData.c() == -1 || pendingAttachmentData.b() == -1)) {
                pendingAttachmentData.af();
            } else if (pendingAttachmentData.aY() && pendingAttachmentData.k() == -1) {
                pendingAttachmentData.ad();
            }
            Uri uriF2 = bxlf.f(uriT, pendingAttachmentData.n);
            if (uriF2 == null) {
                return null;
            }
            bahx bahxVarD3 = bahy.D();
            ((bacm) bahxVarD3).b = pendingAttachmentData.ab();
            ((bacm) bahxVarD3).c = pendingAttachmentData.R();
            ((bacm) bahxVarD3).d = uriF2;
            ((bacm) bahxVarD3).e = uriT;
            bahxVarD3.p(pendingAttachmentData.c());
            bahxVarD3.i(pendingAttachmentData.b());
            bahxVarD3.n(pendingAttachmentData.K());
            ((bacm) bahxVarD3).f = pendingAttachmentData.aa();
            ((bacm) bahxVarD3).g = pendingAttachmentData.Z();
            bahxVarD3.j(pendingAttachmentData.m());
            ((bacm) bahxVarD3).h = pendingAttachmentData.I();
            ((bacm) bahxVarD3).i = pendingAttachmentData.T();
            bahxVarD3.g(pendingAttachmentData.k());
            return pendingAttachmentData.r.c(bahxVarD3.q());
        } catch (SecurityException unused) {
            cqbd cqbdVarE = PendingAttachmentData.i.e();
            cqbdVarE.I("Lost permissions to shared URI:");
            cqbdVarE.I(uriT);
            cqbdVarE.r();
            return null;
        }
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        List list;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        PendingAttachmentData pendingAttachmentData = this.c;
        if (pendingAttachmentData.l != this || isCancelled()) {
            return;
        }
        pendingAttachmentData.l = null;
        if (messagePartCoreData == null) {
            pendingAttachmentData.k = 3;
            bagr bagrVar = this.a;
            if (bagrVar.j(this.b)) {
                bagrVar.d.a();
                bagrVar.z(pendingAttachmentData);
                return;
            }
            return;
        }
        pendingAttachmentData.k = 2;
        messagePartCoreData.ak(pendingAttachmentData.h);
        bagr bagrVar2 = this.a;
        if (!bagrVar2.j(this.b)) {
            messagePartCoreData.ah();
            return;
        }
        List<PendingAttachmentData> list2 = bagrVar2.o;
        for (PendingAttachmentData pendingAttachmentData2 : list2) {
            if (pendingAttachmentData2.bB(pendingAttachmentData)) {
                Uri uriT = pendingAttachmentData2.t();
                int i = 0;
                while (true) {
                    list = bagrVar2.p;
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (((MessagePartCoreData) list.get(i)).bA(uriT)) {
                        break;
                    } else {
                        i++;
                    }
                }
                list2.remove(pendingAttachmentData);
                if (pendingAttachmentData.bg()) {
                    messagePartCoreData.aH(pendingAttachmentData.p());
                    messagePartCoreData.aw(pendingAttachmentData.U());
                }
                bagrVar2.m.add(messagePartCoreData);
                list.set(i, messagePartCoreData);
                bagr.A(messagePartCoreData);
                bagrVar2.r(1);
                return;
            }
        }
        messagePartCoreData.ah();
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        PendingAttachmentData pendingAttachmentData = this.c;
        if (pendingAttachmentData.l != this) {
            return;
        }
        pendingAttachmentData.l = null;
        PendingAttachmentData.i.r("Timeout while retrieving media.");
        pendingAttachmentData.k = 3;
        bagr bagrVar = this.a;
        if (bagrVar.j(this.b)) {
            bagrVar.z(pendingAttachmentData);
        }
    }
}
