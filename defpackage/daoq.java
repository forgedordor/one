package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daoq {
    private static final eksp a = eksp.c("BugleVideoTrimmer");

    public static Intent a(Uri uri, long j, int i, int i2) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.samsung.app.newtrim/com.samsung.app.newtrim.trimactivity.TrimActivity"));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(131);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.putExtra("VIDEO_OUTPUT_SIZE", j);
        cczv cczvVar = daor.d;
        if (i > ((Integer) cczvVar.e()).intValue() || i2 > ((Integer) cczvVar.e()).intValue()) {
            double dIntValue = ((Integer) cczvVar.e()).intValue() / Math.max(i, i2);
            i2 = (int) (i2 * dIntValue);
            i = (int) (i * dIntValue);
        }
        cczv cczvVar2 = daor.b;
        int iMax = ((Integer) cczvVar2.e()).intValue() == -1 ? Math.max(i, i2) : ((Integer) cczvVar2.e()).intValue();
        intent.putExtra("VIDEO_OUTPUT_WIDTH", iMax);
        cczv cczvVar3 = daor.c;
        int iMin = ((Integer) cczvVar3.e()).intValue() == -1 ? Math.min(i, i2) : ((Integer) cczvVar3.e()).intValue();
        intent.putExtra("VIDEO_OUTPUT_HEIGHT", iMin);
        intent.setDataAndType(uri, "video/*");
        if (((Boolean) daor.e.e()).booleanValue()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerIntents", "getVideoTrimmerIntent", 71, "VideoTrimmerIntents.java")).J("Intent extras: Width:%s, Height:%s, OutputFileSize:%s, Uri:%s", Integer.valueOf(iMax), Integer.valueOf(iMin), Long.valueOf(j), uri);
        }
        return intent;
    }
}
