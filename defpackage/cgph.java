package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgph {
    private final eygg a;
    private final eygg b;

    public cgph(eygg eyggVar, eygg eyggVar2) {
        this.a = eyggVar;
        this.b = eyggVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.text.SpannableStringBuilder] */
    final cgpe a(Context context, baea baeaVar, boolean z, String str) {
        String text;
        String strR;
        boolean z2 = baeaVar.ad() && (baeaVar.e() == 101 || baeaVar.e() == 115);
        if (crbf.c() && baeaVar.Y() && !baeaVar.K(new Predicate() { // from class: cgpf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MessagePartCoreData) obj).bc();
            }
        }).isEmpty()) {
            text = context.getText(R.string.im_notification_received_photomoji_reaction);
        } else {
            String string = z2 ? context.getResources().getString(R.string.im_notification_title_manual_download) : baeaVar.G(context);
            String strC = ((cmvy) this.a.b()).c(context.getResources(), baeaVar.w());
            if (!TextUtils.isEmpty(strC)) {
                String string2 = context.getString(R.string.subject_label);
                ?? spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(context.getString(R.string.im_notification_subject, string2, strC));
                if (!TextUtils.isEmpty(string)) {
                    spannableStringBuilder.append(System.lineSeparator()).append((CharSequence) string);
                }
                string = spannableStringBuilder;
            }
            if (baeaVar.ar()) {
                String string3 = context.getString(R.string.im_notification_urgent_message);
                ?? spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(string3);
                if (!TextUtils.isEmpty(string)) {
                    spannableStringBuilder2.append(" ").append((CharSequence) string);
                }
                text = spannableStringBuilder2;
            } else {
                text = string;
            }
        }
        String strA = baeaVar.A(true);
        String str2 = (z || strA != null) ? strA : str;
        Uri uriT = null;
        MessagePartCoreData messagePartCoreData = null;
        MessagePartCoreData messagePartCoreData2 = null;
        MessagePartCoreData messagePartCoreData3 = null;
        MessagePartCoreData messagePartCoreData4 = null;
        for (MessagePartCoreData messagePartCoreData5 : baeaVar.J()) {
            if (!messagePartCoreData5.bs()) {
                if (messagePartCoreData5.bj() && messagePartCoreData == null) {
                    messagePartCoreData = messagePartCoreData5;
                }
                if (messagePartCoreData5.bx() && messagePartCoreData2 == null) {
                    messagePartCoreData2 = messagePartCoreData5;
                }
                if (messagePartCoreData5.bw() && messagePartCoreData4 == null) {
                    messagePartCoreData4 = messagePartCoreData5;
                }
                if (messagePartCoreData5.aY() && messagePartCoreData3 == null) {
                    messagePartCoreData3 = messagePartCoreData5;
                }
            }
        }
        if (messagePartCoreData == null || (crtr.e() && ((csme) this.b.b()).b() && messagePartCoreData.F() != bvdq.NEGATIVE_VERDICT_DISPLAY_IMAGE)) {
            messagePartCoreData = messagePartCoreData2 != null ? messagePartCoreData2 : messagePartCoreData3 != null ? messagePartCoreData3 : messagePartCoreData4 != null ? messagePartCoreData4 : null;
        }
        if (messagePartCoreData != null) {
            uriT = messagePartCoreData.t();
            strR = messagePartCoreData.R();
            if (uriT == null && messagePartCoreData.x() != null) {
                uriT = messagePartCoreData.x();
            }
        } else {
            strR = null;
        }
        cgly cglyVar = new cgly(uriT, strR);
        return new cglx(str2, text, cglyVar.a, cglyVar.b, baeaVar.ad(), z2, baeaVar.W(), baeaVar.r());
    }
}
