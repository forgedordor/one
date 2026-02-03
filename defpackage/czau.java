package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czau extends cqdj {
    private final czav a;
    private final Uri b;
    private final czat c;

    public czau(czav czavVar, Uri uri, czat czatVar) {
        super("Bugle.Async.ImageAndVideoPicker.prepareDocumentForAttachment.Duration", 60000L, false);
        this.a = czavVar;
        this.b = uri;
        this.c = czatVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String path;
        Uri uri = this.b;
        String str = null;
        if (cqmz.o(uri) && (path = uri.getPath()) != null && this.a.d.f(new File(path))) {
            this.a.c.c("Bugle.Share.InternalDataFile.AttachAborted");
            return null;
        }
        if (cqmz.s(uri)) {
            this.a.c.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
            return null;
        }
        czav czavVar = this.a;
        Context context = czavVar.a;
        String strJ = cqmz.j(context, uri);
        if (strJ == null) {
            if (!cqca.q("Bugle", 6)) {
                return null;
            }
            cqca.f("Bugle", a.I(uri, "Failed to resolve content type of attachment (", ")"));
            return null;
        }
        Uri uriC = czavVar.f.c(uri);
        if (uriC == null) {
            cqca.n("Bugle", a.I(uri, "Failed to persist attachment to scratch space (", ")"));
            return null;
        }
        czas czasVar = new czas();
        czasVar.a = strJ;
        czasVar.b = uriC;
        long jC = -1;
        try {
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                try {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    if (strArrSplit.length == 2 && "image".equals(strArrSplit[0])) {
                        str = strArrSplit[1];
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (str != null) {
                jC = cqmz.c(context, "_id = ?", str);
            } else if (DocumentsContract.isDocumentUri(context, uri)) {
                Long l = (Long) cqmz.g(context, uri, "last_modified", new cqmv());
                if (l != null) {
                    jC = l.longValue();
                }
            } else {
                String strI = cqmz.i(context, uri);
                if (strI != null) {
                    jC = cqmz.c(context, "_data = ?", strI);
                }
            }
        } catch (Exception e) {
            ekrw ekrwVarI = cqmz.a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getLastModifiedTimestamp", 729, "UriUtil.java")).t("getLastModifiedTimestamp failed on: %s", cqcv.b(uri.toString()));
        }
        czasVar.c = jC;
        if (!le.m(strJ)) {
            return czasVar;
        }
        Rect rectG = this.a.e.g(czasVar.b, strJ);
        czasVar.d = rectG.width();
        czasVar.e = rectG.height();
        return czasVar;
    }

    @Override // defpackage.cqdj
    protected final /* synthetic */ void d(Object obj) {
        czas czasVar = (czas) obj;
        if (czasVar == null) {
            return;
        }
        GalleryBrowserActivity galleryBrowserActivity = ((cyye) this.c).k;
        Uri uri = czasVar.b;
        String str = czasVar.a;
        long j = czasVar.c;
        int i = czasVar.d;
        int i2 = czasVar.e;
        if (galleryBrowserActivity.isDestroyed() || uri == null || str == null) {
            return;
        }
        if (!((Boolean) ccze.m.e()).booleanValue()) {
            if (((cyvb) galleryBrowserActivity).n.m(new GalleryContentItem(uri, str, i, i2, elha.GALLERY_LIBRARY, j))) {
                galleryBrowserActivity.H().e();
                return;
            }
            return;
        }
        uii uiiVarO = GalleryContent.o();
        uiiVarO.k(uri);
        uiiVarO.f(str);
        ((uhu) uiiVarO).a = new Size(i, i2);
        uiiVarO.e(elha.GALLERY_LIBRARY);
        uiiVarO.i(j);
        if (((cyvb) galleryBrowserActivity).n.n(uiiVarO.l())) {
            galleryBrowserActivity.H().e();
        }
    }
}
