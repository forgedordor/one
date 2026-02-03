package defpackage;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edcb extends vo {
    public ekgb a;
    public final dsvh d;
    public String e;
    public final edbu f;
    private final dswb g;
    private final dsvx h;

    public edcb(edbu edbuVar, dswb dswbVar, dsvx dsvxVar, dsvh dsvhVar) {
        int i = ekgb.d;
        this.a = ekoe.a;
        this.e = "";
        this.f = edbuVar;
        this.g = dswbVar;
        this.h = dsvxVar;
        this.d = dsvhVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return new edca(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_suggestions_item, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void g(wv wvVar, final int i) {
        final edca edcaVar = (edca) wvVar;
        int i2 = edca.u;
        TextView textView = edcaVar.t;
        String str = (String) this.a.get(i);
        String str2 = this.e;
        if (!ejwk.c(str) && !ejwk.c(str2)) {
            SpannableString spannableString = new SpannableString(str);
            ejvf ejvfVar = ejus.a;
            Iterable<String> iterableG = ejxk.c(ejvfVar).g(str.toLowerCase(Locale.getDefault()));
            ekhx ekhxVarN = ekhx.n(ejxk.c(ejvfVar).f().a().g(str2.toLowerCase(Locale.getDefault())));
            int length = 0;
            for (String str3 : iterableG) {
                ekqg ekqgVarListIterator = ekhxVarN.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    String str4 = (String) ekqgVarListIterator.next();
                    if (str3.startsWith(str4)) {
                        spannableString.setSpan(new StyleSpan(1), length, str4.length() + length, 0);
                    }
                }
                length += str3.length() + 1;
            }
            str = spannableString;
        }
        textView.setText(str);
        View view = edcaVar.s;
        view.setOnClickListener(new View.OnClickListener() { // from class: edbz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dsvg dsvgVarE = dsvg.e();
                int i3 = edca.u;
                edcb edcbVar = this.a;
                edcbVar.d.a(dsvgVarE, edcaVar.s);
                edcbVar.f.a.a((String) edcbVar.a.get(i));
            }
        });
        dsvx dsvxVar = this.h;
        dsuy dsuyVarA = this.g.a(133698);
        dsuyVarA.f(dsvo.a(i));
        dsvxVar.e(view, dsuyVarA);
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        int i = edca.u;
        this.h.c(((edca) wvVar).s);
    }
}
