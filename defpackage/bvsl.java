package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvsl {
    public static final cqce a = cqce.g("BugleDataModel", "AttachmentToBlobstoreUploader");
    public static final cczv b = cdag.q(164486593, "enable_attachment_to_blobstore_uploader");
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final eosc g;

    public bvsl(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.c = fcsuVar3;
        this.g = eoscVar;
        this.d = fcsuVar4;
    }

    public static ArrayList b(List list, String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (MessagePartCoreData messagePartCoreData : ((bazb) it.next()).M()) {
                    if (f(messagePartCoreData)) {
                        arrayList.add(messagePartCoreData);
                    }
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((bazb) it2.next()).M().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it3.next();
                        if (TextUtils.equals(messagePartCoreData2.W(), str) && f(messagePartCoreData2)) {
                            arrayList.add(messagePartCoreData2);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean d(MessagePartCoreData messagePartCoreData) {
        return (TextUtils.isEmpty(messagePartCoreData.N()) || messagePartCoreData.ba()) && !messagePartCoreData.aT();
    }

    private static boolean e(MessagePartCoreData messagePartCoreData) {
        return (TextUtils.isEmpty(messagePartCoreData.Q()) || messagePartCoreData.bb()) && !messagePartCoreData.aU();
    }

    private static boolean f(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.t() == null) {
            return false;
        }
        if (d(messagePartCoreData)) {
            return true;
        }
        return messagePartCoreData.bj() && e(messagePartCoreData);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju a(java.util.List r18, boolean r19, java.lang.String r20, defpackage.cedp r21, j$.util.Optional r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvsl.a(java.util.List, boolean, java.lang.String, cedp, j$.util.Optional):eiju");
    }

    public final void c(MessagePartCoreData messagePartCoreData, bsjh bsjhVar) {
        eieu eieuVarK = eiiy.k("AttachmentToBlobstoreUploader#updatePartRowIfExists");
        try {
            ((bbae) this.d.b()).f(messagePartCoreData.A(), messagePartCoreData.B(), messagePartCoreData.W(), bsjhVar);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
