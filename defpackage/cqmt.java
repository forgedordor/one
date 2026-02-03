package defpackage;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmt {
    private final Context a;
    private final cogw b;

    public cqmt(Context context, cogw cogwVar) {
        this.a = context;
        this.b = cogwVar;
    }

    static String a(Context context, String str) {
        return le.m(str) ? context.getString(R.string.new_image_file_name_format) : le.z(str) ? context.getString(R.string.new_video_file_name_format) : context.getString(R.string.new_file_name_format);
    }

    public static String c(String str) {
        return "3gpp".equals(str) ? "3gp" : "3gpp2".equals(str) ? "3g2" : str;
    }

    public final String b(String str) {
        String extensionFromMimeType = str == null ? null : MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        Context context = this.a;
        String strB = ejwk.b(c(extensionFromMimeType));
        String str2 = new SimpleDateFormat(a(context, str), Locale.US).format(new Date(this.b.f().toEpochMilli()));
        str2.getClass();
        return str2 + "." + strB;
    }
}
