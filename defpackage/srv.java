package defpackage;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srv extends cqdj {
    public final List a;
    private final Context b;
    private final cqmr c;
    private final dakl k;
    private final srx l;
    private Uri m;
    private Uri n;

    public srv(Context context, dakl daklVar, cqmr cqmrVar, srx srxVar, String str) {
        super(str);
        this.a = new ArrayList();
        this.k = daklVar;
        this.b = context;
        this.c = cqmrVar;
        this.l = srxVar;
    }

    private static boolean f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!le.t(((sru) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    private final boolean g() {
        return (this.m == null || this.n == null) ? false : true;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) throws IOException {
        Uri uri;
        Uri uri2 = this.m;
        if (uri2 != null && (uri = this.n) != null) {
            cqmz.k(this.b, uri2, uri);
            return null;
        }
        if (((Boolean) srs.a.e()).booleanValue()) {
            List list = this.a;
            if (!f(list)) {
                this.l.c(list);
                return null;
            }
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        Context context = this.b;
        File file = new File(externalStoragePublicDirectory, context.getResources().getString(R.string.app_name));
        File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        List<sru> list2 = this.a;
        ContentResolver contentResolver = context.getContentResolver();
        for (sru sruVar : list2) {
            String str = sruVar.b;
            if (TextUtils.isEmpty(le.d(str))) {
                String type = contentResolver.getType(sruVar.a);
                if (true != TextUtils.isEmpty(type)) {
                    str = type;
                }
            }
            boolean z = le.m(str) || le.z(str);
            String strD = sruVar.e;
            if (strD == null) {
                strD = cqmr.d(sruVar.d);
            }
            sruVar.c = cqmz.e(context, sruVar.a, true != z ? externalStoragePublicDirectory2 : file, str, strD, this.c);
        }
        return null;
    }

    public final void b(Uri uri, String str, Uri uri2, String str2) {
        this.a.add(new sru(uri, str, uri2, str2));
    }

    public final void c(Uri uri, Uri uri2, String str) {
        sru sruVar = new sru(uri, str, null, null);
        sruVar.c = uri2;
        this.a.add(sruVar);
        this.m = uri;
        this.n = uri2;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) throws Resources.NotFoundException {
        String quantityString;
        List<sru> list = this.a;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (sru sruVar : list) {
            Uri uri = sruVar.c;
            if (uri == null) {
                i++;
            } else {
                if (!g() && (!((Boolean) srs.a.e()).booleanValue() || f(list))) {
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(sruVar.c);
                    this.b.sendBroadcast(intent);
                }
                String str = sruVar.b;
                if (le.m(str)) {
                    i3++;
                } else if (le.z(str)) {
                    i4++;
                } else if (le.f(str)) {
                    i5++;
                } else {
                    i2++;
                    if (g()) {
                        continue;
                    } else {
                        Context context = this.b;
                        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
                        String path = uri.getPath();
                        if (path == null || downloadManager == null) {
                            return;
                        }
                        File file = new File(path);
                        if (file.exists()) {
                            downloadManager.addCompletedDownload(file.getName(), context.getString(R.string.attachment_file_description), true, str, file.getAbsolutePath(), file.length(), false);
                        }
                    }
                }
            }
        }
        if (i > 0) {
            quantityString = this.b.getResources().getQuantityString(R.plurals.attachment_save_error, i, Integer.valueOf(i));
        } else {
            int i6 = R.plurals.attachments_saved;
            if (i2 == 0) {
                if (i3 > 0) {
                    i6 = R.plurals.photos_saved_to_folder;
                } else if (i4 > 0) {
                    i6 = R.plurals.videos_saved_to_folder;
                } else if (i5 > 0) {
                    i6 = R.plurals.voice_messages_saved_to_folder;
                }
                i2 = 0;
            }
            Context context2 = this.b;
            int i7 = i3 + i4 + i2 + i5;
            quantityString = context2.getResources().getQuantityString(i6, i7, Integer.valueOf(i7), context2.getResources().getString(R.string.app_name));
        }
        this.k.j(quantityString);
    }
}
