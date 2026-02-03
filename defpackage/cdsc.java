package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsc {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/linkify/LinkifyTextUtil");
    public static final String[] a = {"http://", "https://", "rtsp://"};

    public static Optional a(CharSequence charSequence) {
        if (charSequence == null) {
            return Optional.empty();
        }
        List listB = b(charSequence);
        return listB.size() != 1 ? Optional.empty() : Optional.of((String) listB.get(0));
    }

    public static List b(CharSequence charSequence) {
        return (List) Collection.EL.stream(c(charSequence)).map(new Function() { // from class: cdrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr = cdsc.a;
                return ((cdsb) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cdsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    public static List c(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            Linkify.addLinks(spannableStringBuilderValueOf, 1);
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), ClickableSpan.class)) {
                try {
                    cdsb cdsbVar = new cdsb();
                    cdsbVar.a = spannableStringBuilderValueOf.subSequence(spannableStringBuilderValueOf.getSpanStart(clickableSpan), spannableStringBuilderValueOf.getSpanEnd(clickableSpan)).toString();
                    cdsbVar.b = spannableStringBuilderValueOf.getSpanStart(clickableSpan);
                    cdsbVar.c = spannableStringBuilderValueOf.getSpanEnd(clickableSpan);
                    arrayList.add(cdsbVar);
                } catch (IndexOutOfBoundsException e) {
                    ekrw ekrwVarJ = b.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/linkify/LinkifyTextUtil", "extractWebUrlsWithPosition", 75, "LinkifyTextUtil.java")).t("TextUtil: Failed to extract url: %s", e);
                }
            }
        }
        return arrayList;
    }
}
