package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnql extends dnqo {
    public static final /* synthetic */ int y = 0;
    public final View s;
    public final SingleEmojiViewWithVariantIndicator t;
    public fdlr u;
    public dnmj v;
    public dnkf w;
    final /* synthetic */ dnqr x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnql(dnqr dnqrVar, View view) {
        super(view);
        this.x = dnqrVar;
        this.s = view;
        View viewB = ley.b(view, R.id.emoji);
        viewB.getClass();
        this.t = (SingleEmojiViewWithVariantIndicator) viewB;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    @Override // defpackage.dnqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.dnqu r8) {
        /*
            r7 = this;
            r8.getClass()
            fdlr r0 = r7.u
            if (r0 == 0) goto La
            defpackage.fdlp.a(r0)
        La:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r7.t
            dnqr r1 = r7.x
            int r2 = r0.getWidth()
            int r3 = r1.j
            if (r2 != r3) goto L1e
            int r2 = r0.getHeight()
            int r3 = r1.j
            if (r2 == r3) goto L2d
        L1e:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r3 = r1.j
            r2.<init>(r3, r3)
            r0.setLayoutParams(r2)
            int r2 = r1.k
            r0.setPadding(r2, r2, r2, r2)
        L2d:
            dnqs r8 = (defpackage.dnqs) r8
            dnmj r2 = r8.a
            r7.v = r2
            r3 = 0
            if (r2 != 0) goto L3c
            java.lang.String r2 = "emojiSet"
            defpackage.fdbq.c(r2)
            r2 = r3
        L3c:
            dnjs r4 = r2.a()
            dnov r5 = r1.F()
            dnkf r5 = r5.d
            boolean r4 = defpackage.fdbq.f(r4, r5)
            if (r4 != 0) goto La1
            java.util.Set r2 = r2.i()
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L5b
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L5b
            goto L84
        L5b:
            java.util.Iterator r2 = r2.iterator()
        L5f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L84
            java.lang.Object r4 = r2.next()
            dnke r4 = (defpackage.dnke) r4
            java.lang.CharSequence r4 = r4.a()
            dnov r5 = r1.F()
            dnkf r5 = r5.d
            if (r5 == 0) goto L7c
            dnjr r5 = (defpackage.dnjr) r5
            java.lang.CharSequence r5 = r5.a
            goto L7d
        L7c:
            r5 = r3
        L7d:
            boolean r4 = defpackage.fdbq.f(r4, r5)
            if (r4 == 0) goto L5f
            goto La1
        L84:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 16843868(0x101045c, float:2.3696686E-38)
            r6 = 1
            boolean r4 = r4.resolveAttribute(r5, r2, r6)
            if (r4 == 0) goto Lb0
            int r2 = r2.resourceId
            r0.setBackgroundResource(r2)
            goto Lb0
        La1:
            dnov r2 = r1.F()
            java.lang.Integer r2 = r2.e
            if (r2 == 0) goto Lb0
            int r2 = r2.intValue()
            r0.setBackgroundResource(r2)
        Lb0:
            dnug r2 = com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator.j
            r0.f(r2)
            fdjx r0 = r1.e
            dnqj r2 = new dnqj
            r2.<init>(r7, r1, r8, r3)
            r8 = 3
            fdlr r8 = defpackage.fdil.d(r0, r3, r3, r2, r8)
            r7.u = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnql.C(dnqu):void");
    }

    public final void D() {
        dnkf dnkfVar = this.w;
        dnmj dnmjVar = null;
        if (dnkfVar == null) {
            fdbq.c("emoji");
            dnkfVar = null;
        }
        dnmj dnmjVar2 = this.v;
        if (dnmjVar2 == null) {
            fdbq.c("emojiSet");
        } else {
            dnmjVar = dnmjVar2;
        }
        SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator = this.t;
        singleEmojiViewWithVariantIndicator.f(new dnug(dnkfVar, dnmjVar));
        final dnqr dnqrVar = this.x;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dnqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dnql dnqlVar = this;
                dnmj dnmjVar3 = dnqlVar.v;
                if (dnmjVar3 == null) {
                    fdbq.c("emojiSet");
                    dnmjVar3 = null;
                }
                dnqrVar.l.a(dnqlVar, dnmjVar3);
            }
        };
        dngc dngcVar = dnqrVar.d;
        singleEmojiViewWithVariantIndicator.setOnClickListener(dngcVar.a("EmojiAdapter.EmojiViewHolder#onClick", onClickListener));
        singleEmojiViewWithVariantIndicator.setOnLongClickListener(dngcVar.b("EmojiAdapter.EmojiViewHolder#onLongClick", new View.OnLongClickListener() { // from class: dnqi
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                dnql dnqlVar = this;
                dnmj dnmjVar3 = dnqlVar.v;
                if (dnmjVar3 == null) {
                    fdbq.c("emojiSet");
                    dnmjVar3 = null;
                }
                ((Boolean) dnqrVar.m.a(dnqlVar, dnmjVar3)).booleanValue();
                return true;
            }
        }));
    }
}
