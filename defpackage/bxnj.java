package defpackage;

import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnj extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler");
    private final bxno b;
    private final eosc c;
    private final eosc d;

    public bxnj(bxno bxnoVar, eosc eoscVar, eosc eoscVar2) {
        this.b = bxnoVar;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ResizingHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bxnq.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final bxnl bxnlVarA;
        bxnq bxnqVar = (bxnq) evuhVar;
        aubx aubxVar = bxnqVar.d;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        ContentType contentTypeE = auby.e(aubxVar);
        ekrw ekrwVarH = a.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleResizing");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler", "processPendingWorkItemAsync", 60, "ResizingHandler.java");
        aubx aubxVar2 = bxnqVar.d;
        if (aubxVar2 == null) {
            aubxVar2 = aubx.a;
        }
        ekrdVar.D("Original content type: %s. Resolved content type: %s", aubxVar2, contentTypeE);
        bxno bxnoVar = this.b;
        bxnt bxntVar = bxnqVar.c;
        if (bxntVar == null) {
            bxntVar = bxnt.a;
        }
        if (bxno.d(contentTypeE)) {
            bxnlVarA = bxnoVar.c.a(bxntVar, contentTypeE);
        } else {
            if (!bxno.e(contentTypeE)) {
                ekrw ekrwVarJ = bxno.a.j();
                ekrwVarJ.X(ekrzVar, "BugleResizing");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "createResizingJob", 95, "ResizingManagerV2.java")).t("Unsupported type for input Uri: %s", bxntVar.c);
                ((ains) bxnoVar.e.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
                throw new IllegalArgumentException("Unsupported input uri: ".concat(String.valueOf(bxntVar.c)));
            }
            bxnlVarA = bxnoVar.d.a(bxntVar, contentTypeE);
        }
        return bxnlVarA.c().h(new ejvr() { // from class: bxnh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Bundle bundle = new Bundle();
                bxnl bxnlVar = bxnlVarA;
                bundle.putCharArray("output_uri", bxnlVar.b.toString().toCharArray());
                bundle.putInt("status", bxnw.a(bxnlVar.d()));
                ContentType contentType = bxnlVar.e;
                bundle.putCharArray("content_type", (contentType != null ? contentType.toString() : "*/*").toCharArray());
                cbcv cbcvVarH = cbcw.h();
                cbcvVarH.b(true);
                cbcvVarH.c(false);
                cbcvVarH.d(false);
                ((caxp) cbcvVarH).c = bundle;
                return cbcvVarH.a();
            }
        }, this.c).e(Exception.class, new ejvr() { // from class: bxni
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ2 = bxnj.a.j();
                ekrwVarJ2.X(eksq.a, "BugleResizing");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler", "processPendingWorkItemAsync", 94, "ResizingHandler.java")).q("ResizingHandler failed.");
                return cbcw.k();
            }
        }, this.d);
    }
}
