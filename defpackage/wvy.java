package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvy implements wvj, wvd {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/MentionsTrackerImpl");
    private static final wvi b = new wvi(fcvo.a, "", new dnjo(0, 0), null);
    private final wvg c;
    private final ains d;
    private final fduf e;

    public wvy(wvg wvgVar, ains ainsVar) {
        ainsVar.getClass();
        this.c = wvgVar;
        this.d = ainsVar;
        this.e = fdvf.a(b);
    }

    private final wvi c(CharSequence charSequence, dnjo dnjoVar) {
        String strZ;
        CharSequence charSequence2;
        String str = null;
        try {
            charSequence2 = true != (charSequence instanceof Spanned) ? null : charSequence;
        } catch (IllegalArgumentException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleMentions");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/MentionsTrackerImpl", "createState", 114, "MentionsTrackerImpl.kt")).q("Failed to extract draft mentions, clearing them");
            this.d.c("Bugle.RcsGroups.Mentions.OverlappingMention.Count");
        }
        cilq cilqVarA = charSequence2 != null ? wwa.a((Spanned) charSequence2) : null;
        String string = charSequence.toString();
        int i = dnjoVar.a;
        if (i == dnjoVar.b && (cilqVarA == null || cilqVarA.c(i))) {
            cilo ciloVarB = cilqVarA != null ? cilqVarA.b(i) : null;
            if (ciloVarB != null) {
                strZ = string.substring(ciloVarB.c, i);
                strZ.getClass();
            } else {
                strZ = fdgn.Z(string, i);
            }
            if (!fdgn.H(strZ)) {
                str = strZ;
            }
        }
        return new wvi(str != null ? this.c.a(str) : fcvo.a, charSequence, dnjoVar, cilqVarA);
    }

    private static final Set d(Spanned spanned) {
        Object[] spans = spanned.getSpans(0, spanned.length(), wvf.class);
        spans.getClass();
        return fcur.O(spans);
    }

    @Override // defpackage.wvj
    public final fdvc a(CharSequence charSequence, dnjo dnjoVar) {
        charSequence.getClass();
        fduf fdufVar = this.e;
        fdufVar.f(c(charSequence, dnjoVar));
        return fdufVar;
    }

    @Override // defpackage.dnjj
    public final void b(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(spanned.subSequence(0, i3)).append(charSequence.subSequence(i, i2));
        spannableStringBuilderAppend.getClass();
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append(spanned.subSequence(i4, spanned.length()));
        Set setAs = fcva.as(d(spannableStringBuilderAppend), d(spanned));
        ArrayList arrayList = new ArrayList();
        for (Object obj : setAs) {
            wvf wvfVar = (wvf) obj;
            if (!fdbq.f(spanned.subSequence(spanned.getSpanStart(wvfVar), spanned.getSpanEnd(wvfVar)).toString(), spannableStringBuilderAppend.subSequence(spannableStringBuilderAppend.getSpanStart(wvfVar), spannableStringBuilderAppend.getSpanEnd(wvfVar)).toString())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((wvf) it.next()).a = true;
        }
        if (spanned instanceof Spannable) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Spannable) spanned).removeSpan((wvf) it2.next());
            }
        }
        this.e.f(c(spannableStringBuilderAppend, new dnjo(length, length)));
    }
}
