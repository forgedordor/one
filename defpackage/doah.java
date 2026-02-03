package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doah extends vo {
    public final dngc a;
    public final fdap d;
    public List e;

    public doah(dngc dngcVar, fdap fdapVar) {
        this.a = dngcVar;
        this.d = fdapVar;
    }

    @Override // defpackage.vo
    public final int a() {
        List list = this.e;
        if (list == null) {
            fdbq.c("categories");
            list = null;
        }
        return list.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_category_item_layout, viewGroup, false);
        viewInflate.getClass();
        return new doag(this, viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        doag doagVar = (doag) wvVar;
        doagVar.getClass();
        List list = this.e;
        if (list == null) {
            fdbq.c("categories");
            list = null;
        }
        final doan doanVar = (doan) list.get(i);
        doanVar.getClass();
        ImageView imageView = doagVar.t;
        rbv rbvVarE = raw.e(imageView);
        rbvVarE.k(imageView);
        rbvVarE.i(doanVar.c).v(imageView);
        TextView textView = doagVar.u;
        String str = doanVar.b;
        textView.setText(fcva.aF(fdgn.S(str, new String[]{" "}, 0, 6), " ", null, null, new fdap() { // from class: doae
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                int i2 = doag.w;
                str2.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                if (str2.length() <= 0) {
                    return str2;
                }
                char cCharAt = str2.charAt(0);
                if (!Character.isLowerCase(cCharAt)) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(cCharAt);
                if (titleCase != Character.toUpperCase(cCharAt)) {
                    sb.append(titleCase);
                } else {
                    String strSubstring = str2.substring(0, 1);
                    strSubstring.getClass();
                    String upperCase = strSubstring.toUpperCase(locale);
                    upperCase.getClass();
                    sb.append(upperCase);
                }
                String strSubstring2 = str2.substring(1);
                strSubstring2.getClass();
                sb.append(strSubstring2);
                return sb.toString();
            }
        }, 30));
        View view = doagVar.s;
        final doah doahVar = doagVar.v;
        view.setContentDescription(str);
        view.setOnClickListener(doahVar.a.a("GifCategoriesAdapter.ViewHolder#onClick", new View.OnClickListener() { // from class: doaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = doag.w;
                this.a.d.invoke(doanVar);
            }
        }));
    }
}
