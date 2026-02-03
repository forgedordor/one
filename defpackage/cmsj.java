package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsj {
    public static final Uri a = Uri.parse("content://mms-sms/threadID");
    public static final Pattern b = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    public final cmvy c;

    public cmsj(cmvy cmvyVar) {
        this.c = cmvyVar;
    }
}
