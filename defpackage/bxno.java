package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxno {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2");
    public final Context b;
    public final bxng c;
    public final bxoj d;
    public final fcsu e;
    final Map f = new HashMap();
    private final bxnr g;
    private final cqtc h;
    private final eosc i;

    public bxno(Context context, bxng bxngVar, bxoj bxojVar, fcsu fcsuVar, bxnr bxnrVar, cqtc cqtcVar, eosc eoscVar) {
        this.b = context;
        this.c = bxngVar;
        this.d = bxojVar;
        this.e = fcsuVar;
        this.g = bxnrVar;
        this.h = cqtcVar;
        this.i = eoscVar;
    }

    public static boolean d(ContentType contentType) {
        return le.n(contentType.f(), false);
    }

    public static boolean e(ContentType contentType) {
        return le.z(contentType.f());
    }

    public final eiju a(Uri uri, long j, ContentType contentType) {
        return b(uri, j, contentType, null);
    }

    public final eiju b(Uri uri, long j, ContentType contentType, String str) {
        int i;
        ContentType contentType2;
        try {
            long jA = this.h.a(j);
            if (contentType == null) {
                String strJ = cqmz.j(this.b, uri);
                if (strJ == null) {
                    contentType2 = null;
                    i = 4;
                } else {
                    ContentType contentTypeF = auby.f(strJ);
                    ekrw ekrwVarH = a.h();
                    ekrwVarH.X(eksq.a, "BugleResizing");
                    i = 4;
                    try {
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resolveContentType", 205, "ResizingManagerV2.java")).D("Original content type: %s. Resolved content type: %s", strJ, contentTypeF);
                        contentType2 = contentTypeF;
                    } catch (evtj e) {
                        e = e;
                        ekrw ekrwVarJ = a.j();
                        ekrwVarJ.X(eksq.a, "BugleResizing");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resize", 118, "ResizingManagerV2.java")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
                        bxnv bxnvVar = (bxnv) bxnx.a.createBuilder();
                        bxnvVar.copyOnWrite();
                        ((bxnx) bxnvVar.instance).c = bxnw.a(i);
                        return eijx.e((bxnx) bxnvVar.build());
                    }
                }
            } else {
                i = 4;
                contentType2 = contentType;
            }
            if (contentType2 == null || !(d(contentType2) || e(contentType2))) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleResizing");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resize", 134, "ResizingManagerV2.java")).t("Input uri %s is not resizable", uri);
                ((ains) this.e.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
                bxnv bxnvVar2 = (bxnv) bxnx.a.createBuilder();
                bxnvVar2.copyOnWrite();
                ((bxnx) bxnvVar2.instance).c = bxnw.a(i);
                return eijx.e((bxnx) bxnvVar2.build());
            }
            bxns bxnsVar = (bxns) bxnt.a.createBuilder();
            String string = uri.toString();
            bxnsVar.copyOnWrite();
            bxnt bxntVar = (bxnt) bxnsVar.instance;
            string.getClass();
            bxntVar.b |= 1;
            bxntVar.c = string;
            bxnsVar.copyOnWrite();
            bxnt bxntVar2 = (bxnt) bxnsVar.instance;
            bxntVar2.b |= 2;
            bxntVar2.d = j;
            bxnsVar.copyOnWrite();
            bxnt bxntVar3 = (bxnt) bxnsVar.instance;
            bxntVar3.b |= 4;
            bxntVar3.e = jA;
            if (str != null) {
                bxnsVar.copyOnWrite();
                bxnt bxntVar4 = (bxnt) bxnsVar.instance;
                bxntVar4.b |= 8;
                bxntVar4.f = str;
            }
            bxnt bxntVar5 = (bxnt) bxnsVar.build();
            Map map = this.f;
            if (map.containsKey(bxntVar5)) {
                ((ains) this.e.b()).c("Bugle.Media.Attachment.ResizeV2.Retrieved.Count");
            } else {
                ((ains) this.e.b()).c("Bugle.Media.Attachment.ResizeV2.Started.Count");
                bxnr bxnrVar = this.g;
                bxnp bxnpVar = (bxnp) bxnq.a.createBuilder();
                bxnpVar.copyOnWrite();
                bxnq bxnqVar = (bxnq) bxnpVar.instance;
                bxntVar5.getClass();
                bxnqVar.c = bxntVar5;
                bxnqVar.b |= 1;
                aubx aubxVarA = auby.a(contentType2);
                bxnpVar.copyOnWrite();
                bxnq bxnqVar2 = (bxnq) bxnpVar.instance;
                bxnqVar2.d = aubxVarA;
                bxnqVar2.b |= 2;
                map.put(bxntVar5, ((cazj) bxnrVar.a.b()).a(cbcu.f("resizing", (bxnq) bxnpVar.build())).a().h(new ejvr() { // from class: bxnn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Bundle bundleA;
                        cbcw cbcwVar = (cbcw) obj;
                        int i2 = 4;
                        if (!cbcwVar.e() || (bundleA = cbcwVar.a()) == null) {
                            bxnv bxnvVar3 = (bxnv) bxnx.a.createBuilder();
                            bxnvVar3.copyOnWrite();
                            ((bxnx) bxnvVar3.instance).c = bxnw.a(4);
                            return (bxnx) bxnvVar3.build();
                        }
                        char[] charArray = bundleA.getCharArray("output_uri");
                        char[] charArray2 = bundleA.getCharArray("content_type");
                        aubx aubxVarC = charArray2 != null ? auby.c(String.valueOf(charArray2)) : auby.c("*/*");
                        ekrw ekrwVarH2 = bxno.a.h();
                        ekrwVarH2.X(eksq.a, "BugleResizing");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "queueAndGetResizingResultFuture", 263, "ResizingManagerV2.java")).D("Original content type: %s. Resolved content type: %s", charArray2, aubxVarC);
                        bxnv bxnvVar4 = (bxnv) bxnx.a.createBuilder();
                        String strValueOf = charArray != null ? String.valueOf(charArray) : "";
                        bxnvVar4.copyOnWrite();
                        bxnx bxnxVar = (bxnx) bxnvVar4.instance;
                        strValueOf.getClass();
                        bxnxVar.d = strValueOf;
                        int i3 = bundleA.getInt("status");
                        if (i3 == 1) {
                            i2 = 3;
                        } else if (i3 != 2) {
                            i2 = i3 != 3 ? i3 != 4 ? 2 : 6 : 5;
                        }
                        bxnvVar4.copyOnWrite();
                        ((bxnx) bxnvVar4.instance).c = bxnw.a(i2);
                        bxnvVar4.copyOnWrite();
                        bxnx bxnxVar2 = (bxnx) bxnvVar4.instance;
                        bxnxVar2.e = aubxVarC;
                        bxnxVar2.b |= 1;
                        return (bxnx) bxnvVar4.build();
                    }
                }, eoqg.a));
            }
            return (eiju) map.get(bxntVar5);
        } catch (evtj e2) {
            e = e2;
            i = 4;
        }
    }

    public final void c(Uri uri, long j) {
        try {
            long jA = this.h.a(j);
            bxns bxnsVar = (bxns) bxnt.a.createBuilder();
            String string = uri.toString();
            bxnsVar.copyOnWrite();
            bxnt bxntVar = (bxnt) bxnsVar.instance;
            string.getClass();
            bxntVar.b |= 1;
            bxntVar.c = string;
            bxnsVar.copyOnWrite();
            bxnt bxntVar2 = (bxnt) bxnsVar.instance;
            bxntVar2.b |= 2;
            bxntVar2.d = j;
            bxnsVar.copyOnWrite();
            bxnt bxntVar3 = (bxnt) bxnsVar.instance;
            bxntVar3.b |= 4;
            bxntVar3.e = jA;
            bxnt bxntVar4 = (bxnt) bxnsVar.build();
            Map map = this.f;
            if (map.containsKey(bxntVar4)) {
                ((ains) this.e.b()).c("Bugle.Media.Attachment.ResizeV2.Cancelled.Count");
                eiju eijuVar = (eiju) map.remove(bxntVar4);
                if (eijuVar == null || eijuVar.cancel(false)) {
                    return;
                }
                eijuVar.i(new eooz() { // from class: bxnm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        bxnx bxnxVar = (bxnx) obj;
                        int iB = bxnw.b(bxnxVar.c);
                        if (iB != 0 && iB == 3) {
                            bxno bxnoVar = this.a;
                            bxlf.i(bxnoVar.b, Uri.parse(bxnxVar.d));
                        }
                        return eorv.a;
                    }
                }, this.i);
            }
        } catch (evtj e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "cancel", 163, "ResizingManagerV2.java")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
        }
    }
}
