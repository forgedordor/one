package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowg extends wv {
    public static final /* synthetic */ int v = 0;
    public final View s;
    public final fctc t;
    final /* synthetic */ dowh u;
    private final fctc w;
    private final fctc x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dowg(dowh dowhVar, View view) {
        super(view);
        this.u = dowhVar;
        this.s = view;
        this.w = fctd.a(new fdae() { // from class: dowb
            @Override // defpackage.fdae
            public final Object invoke() {
                return (TextView) this.a.s.findViewById(R.id.proxy_screen_search_row_text);
            }
        });
        this.t = fctd.a(new fdae() { // from class: dowc
            @Override // defpackage.fdae
            public final Object invoke() {
                return (ImageView) this.a.s.findViewById(R.id.proxy_screen_search_row_start_icon);
            }
        });
        this.x = fctd.a(new fdae() { // from class: dowd
            @Override // defpackage.fdae
            public final Object invoke() {
                return (ImageView) this.a.s.findViewById(R.id.proxy_screen_search_row_end_icon);
            }
        });
    }

    private final ImageView D() {
        Object objA = this.x.a();
        objA.getClass();
        return (ImageView) objA;
    }

    public final void C(String str, final dovz dovzVar) {
        str.getClass();
        dovzVar.getClass();
        Object objA = this.w.a();
        objA.getClass();
        TextView textView = (TextView) objA;
        SpannableString spannableString = new SpannableString(dovzVar.b());
        int iO = fdgn.O(spannableString, str, 0, false, 6);
        final dowh dowhVar = this.u;
        dpzn dpznVar = dowhVar.a;
        if (iO > 0) {
            spannableString.setSpan(dpznVar.a(), 0, iO, 33);
        }
        if (iO >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(((Number) dpznVar.a.a()).intValue()), iO, str.length() + iO, 33);
            if (spannableString.length() > str.length() + iO) {
                spannableString.setSpan(dpznVar.a(), iO + str.length(), spannableString.length(), 33);
            }
        } else {
            spannableString.setSpan(dpznVar.a(), 0, spannableString.length(), 33);
        }
        textView.setText(spannableString);
        ImageView imageViewD = D();
        imageViewD.setContentDescription(D().getContext().getString(R.string.search_end_icon_content_description_with_search_term, dovzVar.b()));
        imageViewD.setOnClickListener(dowhVar.d.a("SearchRowsAdapter.ViewHolder#onEndIconClick", new View.OnClickListener() { // from class: dowf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = dowg.v;
                dowhVar.f.invoke(dovzVar.b());
            }
        }));
        imageViewD.setRotation(true != dphw.g(imageViewD) ? -45.0f : 45.0f);
    }
}
