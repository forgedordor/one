package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnso extends vo {
    public Integer a;
    final /* synthetic */ dnst d;
    private int e;
    private int f;

    public dnso(dnst dnstVar) {
        this.d = dnstVar;
        this.e = dnstVar.b;
        this.f = dnstVar.a();
    }

    private final int G() {
        return fddu.g(((dnua) this.d).h.b, a());
    }

    public final void F() {
        dnst dnstVar = this.d;
        Context context = dnstVar.getContext();
        context.getClass();
        int i = dpgx.c(context).x;
        int iA = dnstVar.a();
        int i2 = i - (iA + iA);
        int iF = fddu.f(G(), 1);
        int i3 = dnstVar.b;
        float fMin = Math.min(fddu.e(i2 / (iF * (dnstVar.a() + i3)), 0.5f, 2.0f), fddu.e((((Number) dnstVar.f.c(dnst.a[2])).intValue() - dnstVar.a()) / (((float) Math.ceil(a() / G())) * (dnstVar.a() + i3)), 0.5f, 2.0f));
        this.e = (int) (i3 * fMin);
        this.f = (int) (dnstVar.a() * fMin);
        p();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = this.d.e.inflate(R.layout.emoji_item, viewGroup, false);
        viewInflate.getClass();
        return new dnsp(viewInflate);
    }

    @Override // defpackage.vo
    public final /* synthetic */ void g(wv wvVar, int i) {
        Integer num;
        dnkf dnkfVar;
        dnsp dnspVar = (dnsp) wvVar;
        dnspVar.getClass();
        final dnkf dnkfVarL = l(i);
        CharSequence charSequence = null;
        CharSequence charSequenceA = dnkfVarL != null ? dnkfVarL.a() : null;
        final dnst dnstVar = this.d;
        dnov dnovVarC = dnstVar.c();
        if (dnovVarC != null && (dnkfVar = dnovVarC.d) != null) {
            charSequence = ((dnjr) dnkfVar).a;
        }
        SingleEmojiView singleEmojiView = dnspVar.s;
        if (fdbq.f(charSequenceA, charSequence)) {
            dnov dnovVarC2 = dnstVar.c();
            if (dnovVarC2 != null && (num = dnovVarC2.e) != null) {
                singleEmojiView.setBackgroundResource(num.intValue());
            }
            this.a = Integer.valueOf(i);
        } else {
            TypedValue typedValue = new TypedValue();
            if (singleEmojiView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true)) {
                singleEmojiView.setBackgroundResource(typedValue.resourceId);
            }
        }
        ViewGroup.LayoutParams layoutParams = singleEmojiView.getLayoutParams();
        int i2 = this.e;
        layoutParams.width = i2;
        layoutParams.height = i2;
        int i3 = this.f;
        singleEmojiView.setPadding(i3, i3, i3, i3);
        if (dnkfVarL != null) {
            singleEmojiView.f(dnkfVarL);
        }
        singleEmojiView.setOnClickListener(new View.OnClickListener() { // from class: dnsn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dnkf dnkfVar2 = dnkfVarL;
                if (dnkfVar2 != null) {
                    dnstVar.c.invoke(dnkfVar2);
                }
            }
        });
    }

    public abstract dnkf l(int i);
}
