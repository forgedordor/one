package defpackage;

import android.content.Context;
import android.text.Annotation;
import android.text.Spanned;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgk implements wfo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/disabled/DisabledComposeRowUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final ahax d;
    public final fcsu e;
    public final xmg f;
    public final aqbh g;
    public final fcsu h;
    private final fdpl i;
    private final fduj j;
    private final fdpl k;

    public wgk(Context context, fdjx fdjxVar, ahax ahaxVar, fcsu fcsuVar, fdpl fdplVar, fduj fdujVar, fdpl fdplVar2, xmg xmgVar, aqbh aqbhVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        ahaxVar.getClass();
        fdplVar.getClass();
        fdujVar.getClass();
        fdplVar2.getClass();
        xmgVar.getClass();
        aqbhVar.getClass();
        fcsuVar2.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = ahaxVar;
        this.e = fcsuVar;
        this.i = fdplVar;
        this.j = fdujVar;
        this.k = fdplVar2;
        this.f = xmgVar;
        this.g = aqbhVar;
        this.h = fcsuVar2;
    }

    @Override // defpackage.wfo
    public final fdvc a() {
        fdpl fdplVarA = fdqq.a(new wgc(new wfz(this.j)));
        fdat fdatVar = new fdat() { // from class: wfs
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                ajlk ajlkVar = (ajlk) obj;
                ajlk ajlkVar2 = (ajlk) obj2;
                ajlkVar.getClass();
                ajlkVar2.getClass();
                return Boolean.valueOf(fdbq.f(ajlkVar.m(), ajlkVar2.m()));
            }
        };
        fdap fdapVar = fdqq.a;
        fdcm.e(fdatVar, 2);
        return fdtg.b(fdud.a(fdplVarA, fdqq.c(this.k, fdapVar, fdatVar), fdqq.a(new wgf(this.i)), new wgg(this)), this.c, fdur.b, null);
    }

    public final wgl b(int i) {
        String string = this.b.getString(i);
        string.getClass();
        return new wgl(new diju(string, (List) null, 6));
    }

    public final wgl c(String str, int i, final fdae fdaeVar) {
        CharSequence text = this.b.getText(i);
        text.getClass();
        Spanned spanned = (Spanned) text;
        Iterator itA = fdbd.a(spanned.getSpans(0, spanned.length(), Annotation.class));
        Annotation annotation = null;
        Annotation annotation2 = null;
        while (itA.hasNext()) {
            Annotation annotation3 = (Annotation) itA.next();
            String value = annotation3.getValue();
            if (fdbq.f(value, "conversationName")) {
                annotation2 = annotation3;
            } else if (fdbq.f(value, "link")) {
                annotation = annotation3;
            }
        }
        if (annotation == null) {
            throw new IllegalStateException("supplied resource had no annotation with id=\"link\"");
        }
        int spanStart = spanned.getSpanStart(annotation);
        int spanEnd = spanned.getSpanEnd(annotation);
        int length = annotation2 == null ? spanned.length() : spanned.getSpanStart(annotation2);
        if (str != null) {
            lcg.d(annotation2 != null, "supplied resource had no annotation with id=-\"conversationName\"");
            if (length < spanStart) {
                int length2 = str.length();
                spanEnd += str.length();
                spanStart += length2;
            }
        } else if (annotation2 != null) {
            throw new IllegalStateException("no value to fill for annotation with id=\"conversationName\"");
        }
        int i2 = spanStart;
        int i3 = spanEnd;
        StringBuilder sb = new StringBuilder();
        sb.append(spanned.subSequence(0, length));
        if (str != null) {
            sb.append(str);
        }
        sb.append(spanned.subSequence(length, spanned.length()));
        String string = sb.toString();
        dijs dijsVar = dijs.h;
        String strSubstring = string.substring(i2, i3);
        strSubstring.getClass();
        return new wgl(new diju(string, fcva.b(new diin(dijsVar, i2, i3, strSubstring, new fdap() { // from class: wft
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdaeVar.invoke();
                return true;
            }
        })), 4));
    }
}
