package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvy {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/replies/ReplyMessageExtensionsKt");
    private static final IllegalArgumentException c = new IllegalArgumentException("Unsupported reply snippet content type");

    public static final dkzp a(ajlt ajltVar, Context context) {
        dkzp dkzpVarC;
        ajltVar.getClass();
        amvr amvrVarG = ajltVar.g();
        if (amvrVarG instanceof amwf) {
            ajmb ajmbVarC = ajltVar.c();
            if (ajmbVarC != null) {
                dkzp dkzpVarC2 = fdbq.f(ajmbVarC.b().toString(), ((amwf) amvrVarG).c()) ? c(ajmbVarC, b(ajltVar.d(), context)) : null;
                if (dkzpVarC2 != null) {
                    return dkzpVarC2;
                }
            }
            String strB = b(ajltVar.d(), context);
            String strC = ((amwf) amvrVarG).c();
            strC.getClass();
            return new dkzn(strB, strC);
        }
        if (amvrVarG instanceof amwm) {
            amwm amwmVar = (amwm) amvrVarG;
            ajmb ajmbVarC2 = ajltVar.c();
            String strB2 = b(ajltVar.d(), context);
            if (amwmVar instanceof amwa) {
                return (ajmbVarC2 == null || (dkzpVarC = c(ajmbVarC2, strB2)) == null) ? new dkzn(strB2, ((amwa) amwmVar).m()) : dkzpVarC;
            }
            if (le.m(amwmVar.b())) {
                String string = context.getString(R.string.reply_snippet_image_attachment_text);
                string.getClass();
                return new dkzn(strB2, string, new dkzt(amwmVar.e()));
            }
            if (!le.z(amwmVar.b())) {
                throw c;
            }
            String string2 = context.getString(R.string.reply_snippet_video_attachment_text);
            string2.getClass();
            return new dkzn(strB2, string2, new dkzv(amwmVar.e()));
        }
        if (amvrVarG instanceof amsy) {
            String elapsedTime = DateUtils.formatElapsedTime(((amsy) amvrVarG).h().getSeconds());
            elapsedTime.getClass();
            String string3 = context.getString(R.string.reply_snippet_audio_attachment_text);
            string3.getClass();
            return new dkzn(elapsedTime, string3, new dkzs(djrr.df));
        }
        if (amvrVarG instanceof amvp) {
            amvp amvpVar = (amvp) amvrVarG;
            String strB3 = b(ajltVar.d(), context);
            String strG = amvpVar.g();
            int iA = ynn.a(amvpVar.b()) - 1;
            return new dkzn(strB3, strG, new dkzs(iA != 0 ? iA != 1 ? djrr.aQ : djrr.S : djrr.aR));
        }
        if (amvrVarG instanceof uin) {
            String strB4 = b(ajltVar.d(), context);
            String string4 = context.getString(R.string.reply_snippet_file_attachment_text);
            string4.getClass();
            return new dkzn(strB4, string4, new dkzs(djrr.aQ));
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "BugleReplies");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.V(1, TimeUnit.MINUTES);
        ((ekrd) ekrdVar.g(c).h("com/google/android/apps/messaging/conversation2/replies/ReplyMessageExtensionsKt", "toReplyContent", 57, "ReplyMessageExtensions.kt")).q("Unsupported Content Type for reply");
        String strB5 = b(ajltVar.d(), context);
        String string5 = context.getString(R.string.reply_snippet_unsupported_content_type_description);
        string5.getClass();
        return new dkzn(strB5, string5);
    }

    public static final String b(ajmc ajmcVar, Context context) {
        if (ajmcVar instanceof ajlr) {
            String strX = ((ajlr) ajmcVar).a().x(true);
            strX.getClass();
            return strX;
        }
        if (ajmcVar instanceof ajmq) {
            String string = context.getString(R.string.reply_snippet_self_participant_header);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.reply_snippet_unknown_sender_header);
        string2.getClass();
        return string2;
    }

    private static final dkzp c(ajmb ajmbVar, String str) {
        Uri uriA;
        if (ajmbVar.i() || ajmbVar.h() || (uriA = ajmbVar.a()) == null) {
            return null;
        }
        String strF = ajmbVar.f();
        strF.getClass();
        return new dkzn(str, strF, new dkzt(uriA));
    }
}
