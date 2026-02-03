package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgv implements dwgq {
    public final Context a;
    public final eosc b = dvie.b().a;
    public final dwgy c;
    private final dvrd d;

    public dwgv(Context context, dvrd dvrdVar, dwgy dwgyVar) {
        this.a = context;
        this.d = dvrdVar;
        this.c = dwgyVar;
    }

    public static List a(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            Linkify.addLinks(spannableStringBuilderValueOf, 1);
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), ClickableSpan.class)) {
                try {
                    arrayList.add(spannableStringBuilderValueOf.subSequence(spannableStringBuilderValueOf.getSpanStart(clickableSpan), spannableStringBuilderValueOf.getSpanEnd(clickableSpan)).toString());
                } catch (IndexOutOfBoundsException e) {
                    dvhv.c("LighterLinkPreviewController", "TextUtil: Failed to extract url: ".concat(e.toString()));
                }
            }
        }
        return arrayList;
    }

    final void b(dwje dwjeVar, dwhf dwhfVar, dwqw dwqwVar) {
        byte[] bArrI;
        dwns dwnsVar = new dwns();
        dwnsVar.a = "link_preview";
        try {
            HashMap map = new HashMap();
            map.put("MESSAGE_TEXT", dwhfVar.g());
            map.put(VCardConstants.PROPERTY_TITLE, dwhfVar.h());
            map.put("DESCRIPTION", dwhfVar.d());
            map.put("IMAGE_URL", dwhfVar.f());
            if (dwhfVar.b().g()) {
                map.put("IMAGE", dvhy.j((Bitmap) dwhfVar.b().c()));
            }
            map.put("DOMAIN", dwhfVar.e());
            map.put("CANONICAL_URL", dwhfVar.c());
            if (dwhfVar.a().g()) {
                map.put("EXPIRATION_TIME_MS", dwhfVar.a().c());
            }
            bArrI = dvhy.i(map);
        } catch (IOException e) {
            dvhv.d("LinkPreviewUtils", "Failed to serialize Link Preview", e);
            bArrI = new byte[0];
        }
        dwnsVar.b(bArrI);
        dwqk dwqkVarG = dwqwVar.g();
        dwqkVarG.o(dwhfVar.g());
        dwqkVarG.f(dwhfVar.g());
        dwqkVarG.s(dwnsVar.a());
        this.d.b(dwjeVar).aa(ekgb.r(dwqkVarG.a()));
    }
}
