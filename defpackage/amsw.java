package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsw {
    private static final eksp a = eksp.c("BugleMapi");
    private final crma b;
    private final Context c;

    public amsw(Context context, crma crmaVar) {
        this.c = context;
        this.b = crmaVar;
    }

    public final Uri a(Uri uri, Uri uri2) throws IOException {
        if (uri2 != null && Objects.equals(uri2.getScheme(), "file") && this.b.q()) {
            String path = uri2.getPath();
            if (path != null) {
                File file = new File(path);
                if (file.exists()) {
                    try {
                        Context context = this.c;
                        uri = FileProvider.a(context, amsx.a(context), file);
                    } catch (RuntimeException e) {
                        ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 73, "AttachmentContentUriProvider.java")).D("Can't convert file uri to content uri %s %s.", uri2, e.getMessage());
                    }
                } else {
                    ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 77, "AttachmentContentUriProvider.java")).t("File does not exist, original uri file path: %s, fallback to content uri", file);
                }
            } else {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 81, "AttachmentContentUriProvider.java")).q("originalUri.getPath() is null, fallback to content uri");
            }
        } else if (uri2 == null) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 51, "AttachmentContentUriProvider.java")).q("Original uri is null, fallback to content uri");
        } else if (Objects.equals(uri2.getScheme(), "file")) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 57, "AttachmentContentUriProvider.java")).q("Does not have storage permission to resolve original file uri, fallback to content uri");
        } else {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/message/content/AttachmentContentUriProvider", "getAccessibleUri", 53, "AttachmentContentUriProvider.java")).D("Original uri scheme %s is not %s, fallback to content uri", uri2.getScheme(), "file");
        }
        return uri != null ? uri : Uri.EMPTY;
    }
}
